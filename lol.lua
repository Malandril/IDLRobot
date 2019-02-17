function sysCall_init()
    robotHandle = sim.getObjectHandle("PolyRob")
    noseHandle = sim.getObjectHandle("PolyRobSensingNose")
end
previousRobotBanner = nil
previousNoseBanner = nil
noseTime = 0
function sysCall_actuation()
    data = sim.getStringSignal("display")
    time = simGetSimulationTime()
    if previousNoseBanner ~= nil and time - noseTime > 2 then
         sim.removeBanner(previousNoseBanner)
         previousNoseBanner = nil
    end
    if data ~= nil and data ~= nil then
        print("received")
        print(data)
        for i in string.gmatch(data, "[^,]+") do
            data_type = i[1]
            text = string.subs(i, 2)
            if data_type == "f" then
                previousRobotBanner = displayBanner("function: "..text, robotHandle, previousRobotBanner, {0,0,0.25})
            elseif data_type == "d" then
                previousNoseBanner = displayBanner(text, noseHandle, previousNoseBanner, {0,0.2,0.6})
                noseTime = sim.getSimulationTime()
            end
        end

        
        
        sim.clearStringSignal("display")
    end
end

function displayBanner(text, handle, banner_handle, pos)
    if banner_handle ~= nil then
        sim.removeBanner(banner_handle)
    end
    return sim.addBanner(text, 0.08, sim.banner_fullyfacingcamera, {pos[1], pos[2], pos[3], 0, 0, 0}, handle)
end
