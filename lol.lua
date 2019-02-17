debug = false
function sysCall_init()
    robotHandle = sim.getObjectHandle("PolyRob")
    noseHandle = sim.getObjectHandle("PolyRobSensingNose")
    debug = sim.getScriptSimulationParameter(sim.handle_self, "activateDebug") == "true"
end
previousRobotBanner = nil
previousNoseBanner = nil
posBanner = nil
orientationBanner = nil
noseTime = 0

function sysCall_actuation()
    if debug then
        data = sim.getStringSignal("display")
        parse(data)
        sim.clearStringSignal("display")
    end
end

function parseData(data)
    time = simGetSimulationTime()
    if previousNoseBanner ~= nil and time - noseTime > 3 then
        sim.removeBanner(previousNoseBanner)
        previousNoseBanner = nil
    end
    if data ~= nil and data ~= nil then
        for i in string.gmatch(data, "[^;]+") do
            data_type = string.sub(i, 1, 1)
            text = string.sub(i, 3)
            if data_type == "f" then
                functionText = text
                previousRobotBanner =
                    displayBanner("function: " .. functionText, robotHandle, previousRobotBanner, {0, 0, 0.5})
            elseif data_type == "d" then
                previousNoseBanner = displayBanner(text, noseHandle, previousNoseBanner, {0, 0.2, 0.6})
                noseTime = sim.getSimulationTime()
            elseif data_type == "p" then
                posBanner = displayBanner("pos: " .. text, robotHandle, posBanner, {0, 0, 0.4})
            elseif data_type == "o" then
                orientationBanner = displayBanner("orientation: " .. text, robotHandle, orientationBanner, {0, 0, 0.3})
            end
        end
    end
end

function displayBanner(text, handle, banner_handle, pos)
    if banner_handle ~= nil then
        sim.removeBanner(banner_handle)
    end
    return sim.addBanner(text, 0.06, sim.banner_fullyfacingcamera, {pos[1], pos[2], pos[3], 0, 0, 0}, handle)
end
