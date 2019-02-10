package fr.unice.polytech.robotproject.xtextdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.unice.polytech.robotproject.xtextdsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'cm'", "'deg'", "'ms'", "'s'", "'Robot'", "'{'", "'}'", "'Release'", "'Grab'", "'MoveStraight'", "'in'", "'Wait'", "'for'", "'Turn'", "'-'", "'NamedBlock'", "'GoTo'", "'if'", "'SensorActivated'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRobot"
    // InternalMyDsl.g:53:1: entryRuleRobot : ruleRobot EOF ;
    public final void entryRuleRobot() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleRobot EOF )
            // InternalMyDsl.g:55:1: ruleRobot EOF
            {
             before(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            ruleRobot();

            state._fsp--;

             after(grammarAccess.getRobotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalMyDsl.g:62:1: ruleRobot : ( ( rule__Robot__Group__0 ) ) ;
    public final void ruleRobot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Robot__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Robot__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Robot__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Robot__Group__0 )
            {
             before(grammarAccess.getRobotAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Robot__Group__0 )
            // InternalMyDsl.g:69:4: rule__Robot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleInstruction"
    // InternalMyDsl.g:78:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleInstruction EOF )
            // InternalMyDsl.g:80:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalMyDsl.g:87:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Instruction__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Instruction__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Instruction__Alternatives )
            // InternalMyDsl.g:94:4: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleRelease"
    // InternalMyDsl.g:103:1: entryRuleRelease : ruleRelease EOF ;
    public final void entryRuleRelease() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleRelease EOF )
            // InternalMyDsl.g:105:1: ruleRelease EOF
            {
             before(grammarAccess.getReleaseRule()); 
            pushFollow(FOLLOW_1);
            ruleRelease();

            state._fsp--;

             after(grammarAccess.getReleaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelease"


    // $ANTLR start "ruleRelease"
    // InternalMyDsl.g:112:1: ruleRelease : ( ( rule__Release__Group__0 ) ) ;
    public final void ruleRelease() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Release__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Release__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Release__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Release__Group__0 )
            {
             before(grammarAccess.getReleaseAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Release__Group__0 )
            // InternalMyDsl.g:119:4: rule__Release__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Release__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReleaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelease"


    // $ANTLR start "entryRuleGrab"
    // InternalMyDsl.g:128:1: entryRuleGrab : ruleGrab EOF ;
    public final void entryRuleGrab() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleGrab EOF )
            // InternalMyDsl.g:130:1: ruleGrab EOF
            {
             before(grammarAccess.getGrabRule()); 
            pushFollow(FOLLOW_1);
            ruleGrab();

            state._fsp--;

             after(grammarAccess.getGrabRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrab"


    // $ANTLR start "ruleGrab"
    // InternalMyDsl.g:137:1: ruleGrab : ( ( rule__Grab__Group__0 ) ) ;
    public final void ruleGrab() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Grab__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Grab__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Grab__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Grab__Group__0 )
            {
             before(grammarAccess.getGrabAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Grab__Group__0 )
            // InternalMyDsl.g:144:4: rule__Grab__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Grab__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGrabAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrab"


    // $ANTLR start "entryRuleTimedInstruction"
    // InternalMyDsl.g:153:1: entryRuleTimedInstruction : ruleTimedInstruction EOF ;
    public final void entryRuleTimedInstruction() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleTimedInstruction EOF )
            // InternalMyDsl.g:155:1: ruleTimedInstruction EOF
            {
             before(grammarAccess.getTimedInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleTimedInstruction();

            state._fsp--;

             after(grammarAccess.getTimedInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimedInstruction"


    // $ANTLR start "ruleTimedInstruction"
    // InternalMyDsl.g:162:1: ruleTimedInstruction : ( ( rule__TimedInstruction__Alternatives ) ) ;
    public final void ruleTimedInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__TimedInstruction__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__TimedInstruction__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__TimedInstruction__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__TimedInstruction__Alternatives )
            {
             before(grammarAccess.getTimedInstructionAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__TimedInstruction__Alternatives )
            // InternalMyDsl.g:169:4: rule__TimedInstruction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimedInstruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimedInstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimedInstruction"


    // $ANTLR start "entryRuleMoveStraight"
    // InternalMyDsl.g:178:1: entryRuleMoveStraight : ruleMoveStraight EOF ;
    public final void entryRuleMoveStraight() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleMoveStraight EOF )
            // InternalMyDsl.g:180:1: ruleMoveStraight EOF
            {
             before(grammarAccess.getMoveStraightRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveStraight();

            state._fsp--;

             after(grammarAccess.getMoveStraightRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoveStraight"


    // $ANTLR start "ruleMoveStraight"
    // InternalMyDsl.g:187:1: ruleMoveStraight : ( ( rule__MoveStraight__Group__0 ) ) ;
    public final void ruleMoveStraight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__MoveStraight__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__MoveStraight__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__MoveStraight__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__MoveStraight__Group__0 )
            {
             before(grammarAccess.getMoveStraightAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__MoveStraight__Group__0 )
            // InternalMyDsl.g:194:4: rule__MoveStraight__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveStraight__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveStraightAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoveStraight"


    // $ANTLR start "entryRuleWait"
    // InternalMyDsl.g:203:1: entryRuleWait : ruleWait EOF ;
    public final void entryRuleWait() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleWait EOF )
            // InternalMyDsl.g:205:1: ruleWait EOF
            {
             before(grammarAccess.getWaitRule()); 
            pushFollow(FOLLOW_1);
            ruleWait();

            state._fsp--;

             after(grammarAccess.getWaitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWait"


    // $ANTLR start "ruleWait"
    // InternalMyDsl.g:212:1: ruleWait : ( ( rule__Wait__Group__0 ) ) ;
    public final void ruleWait() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Wait__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Wait__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Wait__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Wait__Group__0 )
            {
             before(grammarAccess.getWaitAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Wait__Group__0 )
            // InternalMyDsl.g:219:4: rule__Wait__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Wait__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWaitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWait"


    // $ANTLR start "entryRuleTurn"
    // InternalMyDsl.g:228:1: entryRuleTurn : ruleTurn EOF ;
    public final void entryRuleTurn() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleTurn EOF )
            // InternalMyDsl.g:230:1: ruleTurn EOF
            {
             before(grammarAccess.getTurnRule()); 
            pushFollow(FOLLOW_1);
            ruleTurn();

            state._fsp--;

             after(grammarAccess.getTurnRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTurn"


    // $ANTLR start "ruleTurn"
    // InternalMyDsl.g:237:1: ruleTurn : ( ( rule__Turn__Group__0 ) ) ;
    public final void ruleTurn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Turn__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Turn__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Turn__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Turn__Group__0 )
            {
             before(grammarAccess.getTurnAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Turn__Group__0 )
            // InternalMyDsl.g:244:4: rule__Turn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Turn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurn"


    // $ANTLR start "entryRuleDistance"
    // InternalMyDsl.g:253:1: entryRuleDistance : ruleDistance EOF ;
    public final void entryRuleDistance() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleDistance EOF )
            // InternalMyDsl.g:255:1: ruleDistance EOF
            {
             before(grammarAccess.getDistanceRule()); 
            pushFollow(FOLLOW_1);
            ruleDistance();

            state._fsp--;

             after(grammarAccess.getDistanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDistance"


    // $ANTLR start "ruleDistance"
    // InternalMyDsl.g:262:1: ruleDistance : ( ( rule__Distance__Group__0 ) ) ;
    public final void ruleDistance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Distance__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Distance__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Distance__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Distance__Group__0 )
            {
             before(grammarAccess.getDistanceAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Distance__Group__0 )
            // InternalMyDsl.g:269:4: rule__Distance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Distance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDistanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDistance"


    // $ANTLR start "entryRuleAngle"
    // InternalMyDsl.g:278:1: entryRuleAngle : ruleAngle EOF ;
    public final void entryRuleAngle() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleAngle EOF )
            // InternalMyDsl.g:280:1: ruleAngle EOF
            {
             before(grammarAccess.getAngleRule()); 
            pushFollow(FOLLOW_1);
            ruleAngle();

            state._fsp--;

             after(grammarAccess.getAngleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAngle"


    // $ANTLR start "ruleAngle"
    // InternalMyDsl.g:287:1: ruleAngle : ( ( rule__Angle__Group__0 ) ) ;
    public final void ruleAngle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Angle__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Angle__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Angle__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Angle__Group__0 )
            {
             before(grammarAccess.getAngleAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Angle__Group__0 )
            // InternalMyDsl.g:294:4: rule__Angle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Angle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAngleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAngle"


    // $ANTLR start "entryRuleDuration"
    // InternalMyDsl.g:303:1: entryRuleDuration : ruleDuration EOF ;
    public final void entryRuleDuration() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleDuration EOF )
            // InternalMyDsl.g:305:1: ruleDuration EOF
            {
             before(grammarAccess.getDurationRule()); 
            pushFollow(FOLLOW_1);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getDurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // InternalMyDsl.g:312:1: ruleDuration : ( ( rule__Duration__Group__0 ) ) ;
    public final void ruleDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Duration__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Duration__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Duration__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Duration__Group__0 )
            {
             before(grammarAccess.getDurationAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Duration__Group__0 )
            // InternalMyDsl.g:319:4: rule__Duration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:328:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleEInt EOF )
            // InternalMyDsl.g:330:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:337:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:344:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleNamedBlock"
    // InternalMyDsl.g:353:1: entryRuleNamedBlock : ruleNamedBlock EOF ;
    public final void entryRuleNamedBlock() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleNamedBlock EOF )
            // InternalMyDsl.g:355:1: ruleNamedBlock EOF
            {
             before(grammarAccess.getNamedBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleNamedBlock();

            state._fsp--;

             after(grammarAccess.getNamedBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamedBlock"


    // $ANTLR start "ruleNamedBlock"
    // InternalMyDsl.g:362:1: ruleNamedBlock : ( ( rule__NamedBlock__Group__0 ) ) ;
    public final void ruleNamedBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__NamedBlock__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__NamedBlock__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__NamedBlock__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__NamedBlock__Group__0 )
            {
             before(grammarAccess.getNamedBlockAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__NamedBlock__Group__0 )
            // InternalMyDsl.g:369:4: rule__NamedBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NamedBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamedBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedBlock"


    // $ANTLR start "entryRuleGoTo"
    // InternalMyDsl.g:378:1: entryRuleGoTo : ruleGoTo EOF ;
    public final void entryRuleGoTo() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleGoTo EOF )
            // InternalMyDsl.g:380:1: ruleGoTo EOF
            {
             before(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_1);
            ruleGoTo();

            state._fsp--;

             after(grammarAccess.getGoToRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGoTo"


    // $ANTLR start "ruleGoTo"
    // InternalMyDsl.g:387:1: ruleGoTo : ( ( rule__GoTo__Group__0 ) ) ;
    public final void ruleGoTo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__GoTo__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__GoTo__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__GoTo__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__GoTo__Group__0 )
            {
             before(grammarAccess.getGoToAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__GoTo__Group__0 )
            // InternalMyDsl.g:394:4: rule__GoTo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoToAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoTo"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:403:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleCondition EOF )
            // InternalMyDsl.g:405:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyDsl.g:412:1: ruleCondition : ( ruleSensorActivation ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ruleSensorActivation ) )
            // InternalMyDsl.g:417:2: ( ruleSensorActivation )
            {
            // InternalMyDsl.g:417:2: ( ruleSensorActivation )
            // InternalMyDsl.g:418:3: ruleSensorActivation
            {
             before(grammarAccess.getConditionAccess().getSensorActivationParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleSensorActivation();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getSensorActivationParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleSensorActivation"
    // InternalMyDsl.g:428:1: entryRuleSensorActivation : ruleSensorActivation EOF ;
    public final void entryRuleSensorActivation() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleSensorActivation EOF )
            // InternalMyDsl.g:430:1: ruleSensorActivation EOF
            {
             before(grammarAccess.getSensorActivationRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorActivation();

            state._fsp--;

             after(grammarAccess.getSensorActivationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensorActivation"


    // $ANTLR start "ruleSensorActivation"
    // InternalMyDsl.g:437:1: ruleSensorActivation : ( ( rule__SensorActivation__Group__0 ) ) ;
    public final void ruleSensorActivation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__SensorActivation__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__SensorActivation__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__SensorActivation__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__SensorActivation__Group__0 )
            {
             before(grammarAccess.getSensorActivationAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__SensorActivation__Group__0 )
            // InternalMyDsl.g:444:4: rule__SensorActivation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorActivation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorActivationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorActivation"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:453:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleEString EOF )
            // InternalMyDsl.g:455:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:462:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:468:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:469:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:469:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleTimeUnit"
    // InternalMyDsl.g:478:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:482:1: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // InternalMyDsl.g:483:2: ( ( rule__TimeUnit__Alternatives ) )
            {
            // InternalMyDsl.g:483:2: ( ( rule__TimeUnit__Alternatives ) )
            // InternalMyDsl.g:484:3: ( rule__TimeUnit__Alternatives )
            {
             before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            // InternalMyDsl.g:485:3: ( rule__TimeUnit__Alternatives )
            // InternalMyDsl.g:485:4: rule__TimeUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "ruleDistanceUnit"
    // InternalMyDsl.g:494:1: ruleDistanceUnit : ( ( 'cm' ) ) ;
    public final void ruleDistanceUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:498:1: ( ( ( 'cm' ) ) )
            // InternalMyDsl.g:499:2: ( ( 'cm' ) )
            {
            // InternalMyDsl.g:499:2: ( ( 'cm' ) )
            // InternalMyDsl.g:500:3: ( 'cm' )
            {
             before(grammarAccess.getDistanceUnitAccess().getCENTIMETERSEnumLiteralDeclaration()); 
            // InternalMyDsl.g:501:3: ( 'cm' )
            // InternalMyDsl.g:501:4: 'cm'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getDistanceUnitAccess().getCENTIMETERSEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDistanceUnit"


    // $ANTLR start "ruleAngleUnit"
    // InternalMyDsl.g:510:1: ruleAngleUnit : ( ( 'deg' ) ) ;
    public final void ruleAngleUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:514:1: ( ( ( 'deg' ) ) )
            // InternalMyDsl.g:515:2: ( ( 'deg' ) )
            {
            // InternalMyDsl.g:515:2: ( ( 'deg' ) )
            // InternalMyDsl.g:516:3: ( 'deg' )
            {
             before(grammarAccess.getAngleUnitAccess().getDEGREESEnumLiteralDeclaration()); 
            // InternalMyDsl.g:517:3: ( 'deg' )
            // InternalMyDsl.g:517:4: 'deg'
            {
            match(input,12,FOLLOW_2); 

            }

             after(grammarAccess.getAngleUnitAccess().getDEGREESEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAngleUnit"


    // $ANTLR start "rule__Instruction__Alternatives"
    // InternalMyDsl.g:525:1: rule__Instruction__Alternatives : ( ( ruleTimedInstruction ) | ( ruleGrab ) | ( ruleRelease ) | ( ruleNamedBlock ) | ( ruleGoTo ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:529:1: ( ( ruleTimedInstruction ) | ( ruleGrab ) | ( ruleRelease ) | ( ruleNamedBlock ) | ( ruleGoTo ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 20:
            case 22:
            case 24:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            case 26:
                {
                alt1=4;
                }
                break;
            case 27:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:530:2: ( ruleTimedInstruction )
                    {
                    // InternalMyDsl.g:530:2: ( ruleTimedInstruction )
                    // InternalMyDsl.g:531:3: ruleTimedInstruction
                    {
                     before(grammarAccess.getInstructionAccess().getTimedInstructionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTimedInstruction();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getTimedInstructionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:536:2: ( ruleGrab )
                    {
                    // InternalMyDsl.g:536:2: ( ruleGrab )
                    // InternalMyDsl.g:537:3: ruleGrab
                    {
                     before(grammarAccess.getInstructionAccess().getGrabParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGrab();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getGrabParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:542:2: ( ruleRelease )
                    {
                    // InternalMyDsl.g:542:2: ( ruleRelease )
                    // InternalMyDsl.g:543:3: ruleRelease
                    {
                     before(grammarAccess.getInstructionAccess().getReleaseParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRelease();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getReleaseParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:548:2: ( ruleNamedBlock )
                    {
                    // InternalMyDsl.g:548:2: ( ruleNamedBlock )
                    // InternalMyDsl.g:549:3: ruleNamedBlock
                    {
                     before(grammarAccess.getInstructionAccess().getNamedBlockParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleNamedBlock();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getNamedBlockParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:554:2: ( ruleGoTo )
                    {
                    // InternalMyDsl.g:554:2: ( ruleGoTo )
                    // InternalMyDsl.g:555:3: ruleGoTo
                    {
                     before(grammarAccess.getInstructionAccess().getGoToParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleGoTo();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getGoToParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Alternatives"


    // $ANTLR start "rule__TimedInstruction__Alternatives"
    // InternalMyDsl.g:564:1: rule__TimedInstruction__Alternatives : ( ( ruleMoveStraight ) | ( ruleTurn ) | ( ruleWait ) );
    public final void rule__TimedInstruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:568:1: ( ( ruleMoveStraight ) | ( ruleTurn ) | ( ruleWait ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:569:2: ( ruleMoveStraight )
                    {
                    // InternalMyDsl.g:569:2: ( ruleMoveStraight )
                    // InternalMyDsl.g:570:3: ruleMoveStraight
                    {
                     before(grammarAccess.getTimedInstructionAccess().getMoveStraightParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveStraight();

                    state._fsp--;

                     after(grammarAccess.getTimedInstructionAccess().getMoveStraightParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:575:2: ( ruleTurn )
                    {
                    // InternalMyDsl.g:575:2: ( ruleTurn )
                    // InternalMyDsl.g:576:3: ruleTurn
                    {
                     before(grammarAccess.getTimedInstructionAccess().getTurnParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTurn();

                    state._fsp--;

                     after(grammarAccess.getTimedInstructionAccess().getTurnParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:581:2: ( ruleWait )
                    {
                    // InternalMyDsl.g:581:2: ( ruleWait )
                    // InternalMyDsl.g:582:3: ruleWait
                    {
                     before(grammarAccess.getTimedInstructionAccess().getWaitParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleWait();

                    state._fsp--;

                     after(grammarAccess.getTimedInstructionAccess().getWaitParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimedInstruction__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:591:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:595:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:596:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:596:2: ( RULE_STRING )
                    // InternalMyDsl.g:597:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:602:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:602:2: ( RULE_ID )
                    // InternalMyDsl.g:603:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__TimeUnit__Alternatives"
    // InternalMyDsl.g:612:1: rule__TimeUnit__Alternatives : ( ( ( 'ms' ) ) | ( ( 's' ) ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:1: ( ( ( 'ms' ) ) | ( ( 's' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:617:2: ( ( 'ms' ) )
                    {
                    // InternalMyDsl.g:617:2: ( ( 'ms' ) )
                    // InternalMyDsl.g:618:3: ( 'ms' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:619:3: ( 'ms' )
                    // InternalMyDsl.g:619:4: 'ms'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:623:2: ( ( 's' ) )
                    {
                    // InternalMyDsl.g:623:2: ( ( 's' ) )
                    // InternalMyDsl.g:624:3: ( 's' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getSECONDSEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:625:3: ( 's' )
                    // InternalMyDsl.g:625:4: 's'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getSECONDSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUnit__Alternatives"


    // $ANTLR start "rule__Robot__Group__0"
    // InternalMyDsl.g:633:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:637:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalMyDsl.g:638:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Robot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__0"


    // $ANTLR start "rule__Robot__Group__0__Impl"
    // InternalMyDsl.g:645:1: rule__Robot__Group__0__Impl : ( () ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:649:1: ( ( () ) )
            // InternalMyDsl.g:650:1: ( () )
            {
            // InternalMyDsl.g:650:1: ( () )
            // InternalMyDsl.g:651:2: ()
            {
             before(grammarAccess.getRobotAccess().getRobotAction_0()); 
            // InternalMyDsl.g:652:2: ()
            // InternalMyDsl.g:652:3: 
            {
            }

             after(grammarAccess.getRobotAccess().getRobotAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__0__Impl"


    // $ANTLR start "rule__Robot__Group__1"
    // InternalMyDsl.g:660:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:664:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalMyDsl.g:665:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Robot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__1"


    // $ANTLR start "rule__Robot__Group__1__Impl"
    // InternalMyDsl.g:672:1: rule__Robot__Group__1__Impl : ( 'Robot' ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:676:1: ( ( 'Robot' ) )
            // InternalMyDsl.g:677:1: ( 'Robot' )
            {
            // InternalMyDsl.g:677:1: ( 'Robot' )
            // InternalMyDsl.g:678:2: 'Robot'
            {
             before(grammarAccess.getRobotAccess().getRobotKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRobotKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__1__Impl"


    // $ANTLR start "rule__Robot__Group__2"
    // InternalMyDsl.g:687:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl rule__Robot__Group__3 ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:1: ( rule__Robot__Group__2__Impl rule__Robot__Group__3 )
            // InternalMyDsl.g:692:2: rule__Robot__Group__2__Impl rule__Robot__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Robot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__2"


    // $ANTLR start "rule__Robot__Group__2__Impl"
    // InternalMyDsl.g:699:1: rule__Robot__Group__2__Impl : ( '{' ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:703:1: ( ( '{' ) )
            // InternalMyDsl.g:704:1: ( '{' )
            {
            // InternalMyDsl.g:704:1: ( '{' )
            // InternalMyDsl.g:705:2: '{'
            {
             before(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__2__Impl"


    // $ANTLR start "rule__Robot__Group__3"
    // InternalMyDsl.g:714:1: rule__Robot__Group__3 : rule__Robot__Group__3__Impl rule__Robot__Group__4 ;
    public final void rule__Robot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:718:1: ( rule__Robot__Group__3__Impl rule__Robot__Group__4 )
            // InternalMyDsl.g:719:2: rule__Robot__Group__3__Impl rule__Robot__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Robot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__3"


    // $ANTLR start "rule__Robot__Group__3__Impl"
    // InternalMyDsl.g:726:1: rule__Robot__Group__3__Impl : ( ( rule__Robot__Group_3__0 )? ) ;
    public final void rule__Robot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:730:1: ( ( ( rule__Robot__Group_3__0 )? ) )
            // InternalMyDsl.g:731:1: ( ( rule__Robot__Group_3__0 )? )
            {
            // InternalMyDsl.g:731:1: ( ( rule__Robot__Group_3__0 )? )
            // InternalMyDsl.g:732:2: ( rule__Robot__Group_3__0 )?
            {
             before(grammarAccess.getRobotAccess().getGroup_3()); 
            // InternalMyDsl.g:733:2: ( rule__Robot__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=18 && LA5_0<=20)||LA5_0==22||LA5_0==24||(LA5_0>=26 && LA5_0<=27)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:733:3: rule__Robot__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Robot__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRobotAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__3__Impl"


    // $ANTLR start "rule__Robot__Group__4"
    // InternalMyDsl.g:741:1: rule__Robot__Group__4 : rule__Robot__Group__4__Impl ;
    public final void rule__Robot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:745:1: ( rule__Robot__Group__4__Impl )
            // InternalMyDsl.g:746:2: rule__Robot__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__4"


    // $ANTLR start "rule__Robot__Group__4__Impl"
    // InternalMyDsl.g:752:1: rule__Robot__Group__4__Impl : ( '}' ) ;
    public final void rule__Robot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:756:1: ( ( '}' ) )
            // InternalMyDsl.g:757:1: ( '}' )
            {
            // InternalMyDsl.g:757:1: ( '}' )
            // InternalMyDsl.g:758:2: '}'
            {
             before(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__4__Impl"


    // $ANTLR start "rule__Robot__Group_3__0"
    // InternalMyDsl.g:768:1: rule__Robot__Group_3__0 : rule__Robot__Group_3__0__Impl rule__Robot__Group_3__1 ;
    public final void rule__Robot__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:772:1: ( rule__Robot__Group_3__0__Impl rule__Robot__Group_3__1 )
            // InternalMyDsl.g:773:2: rule__Robot__Group_3__0__Impl rule__Robot__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Robot__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_3__0"


    // $ANTLR start "rule__Robot__Group_3__0__Impl"
    // InternalMyDsl.g:780:1: rule__Robot__Group_3__0__Impl : ( ( rule__Robot__InstructionsAssignment_3_0 ) ) ;
    public final void rule__Robot__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:784:1: ( ( ( rule__Robot__InstructionsAssignment_3_0 ) ) )
            // InternalMyDsl.g:785:1: ( ( rule__Robot__InstructionsAssignment_3_0 ) )
            {
            // InternalMyDsl.g:785:1: ( ( rule__Robot__InstructionsAssignment_3_0 ) )
            // InternalMyDsl.g:786:2: ( rule__Robot__InstructionsAssignment_3_0 )
            {
             before(grammarAccess.getRobotAccess().getInstructionsAssignment_3_0()); 
            // InternalMyDsl.g:787:2: ( rule__Robot__InstructionsAssignment_3_0 )
            // InternalMyDsl.g:787:3: rule__Robot__InstructionsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Robot__InstructionsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getInstructionsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_3__0__Impl"


    // $ANTLR start "rule__Robot__Group_3__1"
    // InternalMyDsl.g:795:1: rule__Robot__Group_3__1 : rule__Robot__Group_3__1__Impl ;
    public final void rule__Robot__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:799:1: ( rule__Robot__Group_3__1__Impl )
            // InternalMyDsl.g:800:2: rule__Robot__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_3__1"


    // $ANTLR start "rule__Robot__Group_3__1__Impl"
    // InternalMyDsl.g:806:1: rule__Robot__Group_3__1__Impl : ( ( rule__Robot__InstructionsAssignment_3_1 )* ) ;
    public final void rule__Robot__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:810:1: ( ( ( rule__Robot__InstructionsAssignment_3_1 )* ) )
            // InternalMyDsl.g:811:1: ( ( rule__Robot__InstructionsAssignment_3_1 )* )
            {
            // InternalMyDsl.g:811:1: ( ( rule__Robot__InstructionsAssignment_3_1 )* )
            // InternalMyDsl.g:812:2: ( rule__Robot__InstructionsAssignment_3_1 )*
            {
             before(grammarAccess.getRobotAccess().getInstructionsAssignment_3_1()); 
            // InternalMyDsl.g:813:2: ( rule__Robot__InstructionsAssignment_3_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=18 && LA6_0<=20)||LA6_0==22||LA6_0==24||(LA6_0>=26 && LA6_0<=27)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:813:3: rule__Robot__InstructionsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Robot__InstructionsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRobotAccess().getInstructionsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_3__1__Impl"


    // $ANTLR start "rule__Release__Group__0"
    // InternalMyDsl.g:822:1: rule__Release__Group__0 : rule__Release__Group__0__Impl rule__Release__Group__1 ;
    public final void rule__Release__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:826:1: ( rule__Release__Group__0__Impl rule__Release__Group__1 )
            // InternalMyDsl.g:827:2: rule__Release__Group__0__Impl rule__Release__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Release__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Release__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Release__Group__0"


    // $ANTLR start "rule__Release__Group__0__Impl"
    // InternalMyDsl.g:834:1: rule__Release__Group__0__Impl : ( () ) ;
    public final void rule__Release__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:838:1: ( ( () ) )
            // InternalMyDsl.g:839:1: ( () )
            {
            // InternalMyDsl.g:839:1: ( () )
            // InternalMyDsl.g:840:2: ()
            {
             before(grammarAccess.getReleaseAccess().getReleaseAction_0()); 
            // InternalMyDsl.g:841:2: ()
            // InternalMyDsl.g:841:3: 
            {
            }

             after(grammarAccess.getReleaseAccess().getReleaseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Release__Group__0__Impl"


    // $ANTLR start "rule__Release__Group__1"
    // InternalMyDsl.g:849:1: rule__Release__Group__1 : rule__Release__Group__1__Impl ;
    public final void rule__Release__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:853:1: ( rule__Release__Group__1__Impl )
            // InternalMyDsl.g:854:2: rule__Release__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Release__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Release__Group__1"


    // $ANTLR start "rule__Release__Group__1__Impl"
    // InternalMyDsl.g:860:1: rule__Release__Group__1__Impl : ( 'Release' ) ;
    public final void rule__Release__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:864:1: ( ( 'Release' ) )
            // InternalMyDsl.g:865:1: ( 'Release' )
            {
            // InternalMyDsl.g:865:1: ( 'Release' )
            // InternalMyDsl.g:866:2: 'Release'
            {
             before(grammarAccess.getReleaseAccess().getReleaseKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getReleaseAccess().getReleaseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Release__Group__1__Impl"


    // $ANTLR start "rule__Grab__Group__0"
    // InternalMyDsl.g:876:1: rule__Grab__Group__0 : rule__Grab__Group__0__Impl rule__Grab__Group__1 ;
    public final void rule__Grab__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:880:1: ( rule__Grab__Group__0__Impl rule__Grab__Group__1 )
            // InternalMyDsl.g:881:2: rule__Grab__Group__0__Impl rule__Grab__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Grab__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grab__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grab__Group__0"


    // $ANTLR start "rule__Grab__Group__0__Impl"
    // InternalMyDsl.g:888:1: rule__Grab__Group__0__Impl : ( () ) ;
    public final void rule__Grab__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:892:1: ( ( () ) )
            // InternalMyDsl.g:893:1: ( () )
            {
            // InternalMyDsl.g:893:1: ( () )
            // InternalMyDsl.g:894:2: ()
            {
             before(grammarAccess.getGrabAccess().getGrabAction_0()); 
            // InternalMyDsl.g:895:2: ()
            // InternalMyDsl.g:895:3: 
            {
            }

             after(grammarAccess.getGrabAccess().getGrabAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grab__Group__0__Impl"


    // $ANTLR start "rule__Grab__Group__1"
    // InternalMyDsl.g:903:1: rule__Grab__Group__1 : rule__Grab__Group__1__Impl ;
    public final void rule__Grab__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:907:1: ( rule__Grab__Group__1__Impl )
            // InternalMyDsl.g:908:2: rule__Grab__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Grab__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grab__Group__1"


    // $ANTLR start "rule__Grab__Group__1__Impl"
    // InternalMyDsl.g:914:1: rule__Grab__Group__1__Impl : ( 'Grab' ) ;
    public final void rule__Grab__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:918:1: ( ( 'Grab' ) )
            // InternalMyDsl.g:919:1: ( 'Grab' )
            {
            // InternalMyDsl.g:919:1: ( 'Grab' )
            // InternalMyDsl.g:920:2: 'Grab'
            {
             before(grammarAccess.getGrabAccess().getGrabKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGrabAccess().getGrabKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grab__Group__1__Impl"


    // $ANTLR start "rule__MoveStraight__Group__0"
    // InternalMyDsl.g:930:1: rule__MoveStraight__Group__0 : rule__MoveStraight__Group__0__Impl rule__MoveStraight__Group__1 ;
    public final void rule__MoveStraight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:934:1: ( rule__MoveStraight__Group__0__Impl rule__MoveStraight__Group__1 )
            // InternalMyDsl.g:935:2: rule__MoveStraight__Group__0__Impl rule__MoveStraight__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__MoveStraight__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveStraight__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStraight__Group__0"


    // $ANTLR start "rule__MoveStraight__Group__0__Impl"
    // InternalMyDsl.g:942:1: rule__MoveStraight__Group__0__Impl : ( 'MoveStraight' ) ;
    public final void rule__MoveStraight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:946:1: ( ( 'MoveStraight' ) )
            // InternalMyDsl.g:947:1: ( 'MoveStraight' )
            {
            // InternalMyDsl.g:947:1: ( 'MoveStraight' )
            // InternalMyDsl.g:948:2: 'MoveStraight'
            {
             before(grammarAccess.getMoveStraightAccess().getMoveStraightKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMoveStraightAccess().getMoveStraightKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStraight__Group__0__Impl"


    // $ANTLR start "rule__MoveStraight__Group__1"
    // InternalMyDsl.g:957:1: rule__MoveStraight__Group__1 : rule__MoveStraight__Group__1__Impl rule__MoveStraight__Group__2 ;
    public final void rule__MoveStraight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:961:1: ( rule__MoveStraight__Group__1__Impl rule__MoveStraight__Group__2 )
            // InternalMyDsl.g:962:2: rule__MoveStraight__Group__1__Impl rule__MoveStraight__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__MoveStraight__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveStraight__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStraight__Group__1"


    // $ANTLR start "rule__MoveStraight__Group__1__Impl"
    // InternalMyDsl.g:969:1: rule__MoveStraight__Group__1__Impl : ( ( rule__MoveStraight__DistanceAssignment_1 ) ) ;
    public final void rule__MoveStraight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:973:1: ( ( ( rule__MoveStraight__DistanceAssignment_1 ) ) )
            // InternalMyDsl.g:974:1: ( ( rule__MoveStraight__DistanceAssignment_1 ) )
            {
            // InternalMyDsl.g:974:1: ( ( rule__MoveStraight__DistanceAssignment_1 ) )
            // InternalMyDsl.g:975:2: ( rule__MoveStraight__DistanceAssignment_1 )
            {
             before(grammarAccess.getMoveStraightAccess().getDistanceAssignment_1()); 
            // InternalMyDsl.g:976:2: ( rule__MoveStraight__DistanceAssignment_1 )
            // InternalMyDsl.g:976:3: rule__MoveStraight__DistanceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveStraight__DistanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveStraightAccess().getDistanceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStraight__Group__1__Impl"


    // $ANTLR start "rule__MoveStraight__Group__2"
    // InternalMyDsl.g:984:1: rule__MoveStraight__Group__2 : rule__MoveStraight__Group__2__Impl rule__MoveStraight__Group__3 ;
    public final void rule__MoveStraight__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:988:1: ( rule__MoveStraight__Group__2__Impl rule__MoveStraight__Group__3 )
            // InternalMyDsl.g:989:2: rule__MoveStraight__Group__2__Impl rule__MoveStraight__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__MoveStraight__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveStraight__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStraight__Group__2"


    // $ANTLR start "rule__MoveStraight__Group__2__Impl"
    // InternalMyDsl.g:996:1: rule__MoveStraight__Group__2__Impl : ( 'in' ) ;
    public final void rule__MoveStraight__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1000:1: ( ( 'in' ) )
            // InternalMyDsl.g:1001:1: ( 'in' )
            {
            // InternalMyDsl.g:1001:1: ( 'in' )
            // InternalMyDsl.g:1002:2: 'in'
            {
             before(grammarAccess.getMoveStraightAccess().getInKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMoveStraightAccess().getInKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStraight__Group__2__Impl"


    // $ANTLR start "rule__MoveStraight__Group__3"
    // InternalMyDsl.g:1011:1: rule__MoveStraight__Group__3 : rule__MoveStraight__Group__3__Impl ;
    public final void rule__MoveStraight__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1015:1: ( rule__MoveStraight__Group__3__Impl )
            // InternalMyDsl.g:1016:2: rule__MoveStraight__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveStraight__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStraight__Group__3"


    // $ANTLR start "rule__MoveStraight__Group__3__Impl"
    // InternalMyDsl.g:1022:1: rule__MoveStraight__Group__3__Impl : ( ( rule__MoveStraight__DurationAssignment_3 )? ) ;
    public final void rule__MoveStraight__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1026:1: ( ( ( rule__MoveStraight__DurationAssignment_3 )? ) )
            // InternalMyDsl.g:1027:1: ( ( rule__MoveStraight__DurationAssignment_3 )? )
            {
            // InternalMyDsl.g:1027:1: ( ( rule__MoveStraight__DurationAssignment_3 )? )
            // InternalMyDsl.g:1028:2: ( rule__MoveStraight__DurationAssignment_3 )?
            {
             before(grammarAccess.getMoveStraightAccess().getDurationAssignment_3()); 
            // InternalMyDsl.g:1029:2: ( rule__MoveStraight__DurationAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT||LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1029:3: rule__MoveStraight__DurationAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__MoveStraight__DurationAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMoveStraightAccess().getDurationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStraight__Group__3__Impl"


    // $ANTLR start "rule__Wait__Group__0"
    // InternalMyDsl.g:1038:1: rule__Wait__Group__0 : rule__Wait__Group__0__Impl rule__Wait__Group__1 ;
    public final void rule__Wait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1042:1: ( rule__Wait__Group__0__Impl rule__Wait__Group__1 )
            // InternalMyDsl.g:1043:2: rule__Wait__Group__0__Impl rule__Wait__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Wait__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wait__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__0"


    // $ANTLR start "rule__Wait__Group__0__Impl"
    // InternalMyDsl.g:1050:1: rule__Wait__Group__0__Impl : ( () ) ;
    public final void rule__Wait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1054:1: ( ( () ) )
            // InternalMyDsl.g:1055:1: ( () )
            {
            // InternalMyDsl.g:1055:1: ( () )
            // InternalMyDsl.g:1056:2: ()
            {
             before(grammarAccess.getWaitAccess().getWaitAction_0()); 
            // InternalMyDsl.g:1057:2: ()
            // InternalMyDsl.g:1057:3: 
            {
            }

             after(grammarAccess.getWaitAccess().getWaitAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__0__Impl"


    // $ANTLR start "rule__Wait__Group__1"
    // InternalMyDsl.g:1065:1: rule__Wait__Group__1 : rule__Wait__Group__1__Impl rule__Wait__Group__2 ;
    public final void rule__Wait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1069:1: ( rule__Wait__Group__1__Impl rule__Wait__Group__2 )
            // InternalMyDsl.g:1070:2: rule__Wait__Group__1__Impl rule__Wait__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Wait__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wait__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__1"


    // $ANTLR start "rule__Wait__Group__1__Impl"
    // InternalMyDsl.g:1077:1: rule__Wait__Group__1__Impl : ( 'Wait' ) ;
    public final void rule__Wait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1081:1: ( ( 'Wait' ) )
            // InternalMyDsl.g:1082:1: ( 'Wait' )
            {
            // InternalMyDsl.g:1082:1: ( 'Wait' )
            // InternalMyDsl.g:1083:2: 'Wait'
            {
             before(grammarAccess.getWaitAccess().getWaitKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWaitAccess().getWaitKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__1__Impl"


    // $ANTLR start "rule__Wait__Group__2"
    // InternalMyDsl.g:1092:1: rule__Wait__Group__2 : rule__Wait__Group__2__Impl rule__Wait__Group__3 ;
    public final void rule__Wait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1096:1: ( rule__Wait__Group__2__Impl rule__Wait__Group__3 )
            // InternalMyDsl.g:1097:2: rule__Wait__Group__2__Impl rule__Wait__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Wait__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wait__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__2"


    // $ANTLR start "rule__Wait__Group__2__Impl"
    // InternalMyDsl.g:1104:1: rule__Wait__Group__2__Impl : ( 'for' ) ;
    public final void rule__Wait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1108:1: ( ( 'for' ) )
            // InternalMyDsl.g:1109:1: ( 'for' )
            {
            // InternalMyDsl.g:1109:1: ( 'for' )
            // InternalMyDsl.g:1110:2: 'for'
            {
             before(grammarAccess.getWaitAccess().getForKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getWaitAccess().getForKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__2__Impl"


    // $ANTLR start "rule__Wait__Group__3"
    // InternalMyDsl.g:1119:1: rule__Wait__Group__3 : rule__Wait__Group__3__Impl ;
    public final void rule__Wait__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1123:1: ( rule__Wait__Group__3__Impl )
            // InternalMyDsl.g:1124:2: rule__Wait__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Wait__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__3"


    // $ANTLR start "rule__Wait__Group__3__Impl"
    // InternalMyDsl.g:1130:1: rule__Wait__Group__3__Impl : ( ( rule__Wait__DurationAssignment_3 )? ) ;
    public final void rule__Wait__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1134:1: ( ( ( rule__Wait__DurationAssignment_3 )? ) )
            // InternalMyDsl.g:1135:1: ( ( rule__Wait__DurationAssignment_3 )? )
            {
            // InternalMyDsl.g:1135:1: ( ( rule__Wait__DurationAssignment_3 )? )
            // InternalMyDsl.g:1136:2: ( rule__Wait__DurationAssignment_3 )?
            {
             before(grammarAccess.getWaitAccess().getDurationAssignment_3()); 
            // InternalMyDsl.g:1137:2: ( rule__Wait__DurationAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT||LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1137:3: rule__Wait__DurationAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Wait__DurationAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWaitAccess().getDurationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__3__Impl"


    // $ANTLR start "rule__Turn__Group__0"
    // InternalMyDsl.g:1146:1: rule__Turn__Group__0 : rule__Turn__Group__0__Impl rule__Turn__Group__1 ;
    public final void rule__Turn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1150:1: ( rule__Turn__Group__0__Impl rule__Turn__Group__1 )
            // InternalMyDsl.g:1151:2: rule__Turn__Group__0__Impl rule__Turn__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Turn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Turn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__0"


    // $ANTLR start "rule__Turn__Group__0__Impl"
    // InternalMyDsl.g:1158:1: rule__Turn__Group__0__Impl : ( 'Turn' ) ;
    public final void rule__Turn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1162:1: ( ( 'Turn' ) )
            // InternalMyDsl.g:1163:1: ( 'Turn' )
            {
            // InternalMyDsl.g:1163:1: ( 'Turn' )
            // InternalMyDsl.g:1164:2: 'Turn'
            {
             before(grammarAccess.getTurnAccess().getTurnKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTurnAccess().getTurnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__0__Impl"


    // $ANTLR start "rule__Turn__Group__1"
    // InternalMyDsl.g:1173:1: rule__Turn__Group__1 : rule__Turn__Group__1__Impl rule__Turn__Group__2 ;
    public final void rule__Turn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1177:1: ( rule__Turn__Group__1__Impl rule__Turn__Group__2 )
            // InternalMyDsl.g:1178:2: rule__Turn__Group__1__Impl rule__Turn__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Turn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Turn__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__1"


    // $ANTLR start "rule__Turn__Group__1__Impl"
    // InternalMyDsl.g:1185:1: rule__Turn__Group__1__Impl : ( ( rule__Turn__AngleAssignment_1 ) ) ;
    public final void rule__Turn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1189:1: ( ( ( rule__Turn__AngleAssignment_1 ) ) )
            // InternalMyDsl.g:1190:1: ( ( rule__Turn__AngleAssignment_1 ) )
            {
            // InternalMyDsl.g:1190:1: ( ( rule__Turn__AngleAssignment_1 ) )
            // InternalMyDsl.g:1191:2: ( rule__Turn__AngleAssignment_1 )
            {
             before(grammarAccess.getTurnAccess().getAngleAssignment_1()); 
            // InternalMyDsl.g:1192:2: ( rule__Turn__AngleAssignment_1 )
            // InternalMyDsl.g:1192:3: rule__Turn__AngleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Turn__AngleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTurnAccess().getAngleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__1__Impl"


    // $ANTLR start "rule__Turn__Group__2"
    // InternalMyDsl.g:1200:1: rule__Turn__Group__2 : rule__Turn__Group__2__Impl rule__Turn__Group__3 ;
    public final void rule__Turn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1204:1: ( rule__Turn__Group__2__Impl rule__Turn__Group__3 )
            // InternalMyDsl.g:1205:2: rule__Turn__Group__2__Impl rule__Turn__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Turn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Turn__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__2"


    // $ANTLR start "rule__Turn__Group__2__Impl"
    // InternalMyDsl.g:1212:1: rule__Turn__Group__2__Impl : ( 'in' ) ;
    public final void rule__Turn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1216:1: ( ( 'in' ) )
            // InternalMyDsl.g:1217:1: ( 'in' )
            {
            // InternalMyDsl.g:1217:1: ( 'in' )
            // InternalMyDsl.g:1218:2: 'in'
            {
             before(grammarAccess.getTurnAccess().getInKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTurnAccess().getInKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__2__Impl"


    // $ANTLR start "rule__Turn__Group__3"
    // InternalMyDsl.g:1227:1: rule__Turn__Group__3 : rule__Turn__Group__3__Impl ;
    public final void rule__Turn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1231:1: ( rule__Turn__Group__3__Impl )
            // InternalMyDsl.g:1232:2: rule__Turn__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Turn__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__3"


    // $ANTLR start "rule__Turn__Group__3__Impl"
    // InternalMyDsl.g:1238:1: rule__Turn__Group__3__Impl : ( ( rule__Turn__DurationAssignment_3 )? ) ;
    public final void rule__Turn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1242:1: ( ( ( rule__Turn__DurationAssignment_3 )? ) )
            // InternalMyDsl.g:1243:1: ( ( rule__Turn__DurationAssignment_3 )? )
            {
            // InternalMyDsl.g:1243:1: ( ( rule__Turn__DurationAssignment_3 )? )
            // InternalMyDsl.g:1244:2: ( rule__Turn__DurationAssignment_3 )?
            {
             before(grammarAccess.getTurnAccess().getDurationAssignment_3()); 
            // InternalMyDsl.g:1245:2: ( rule__Turn__DurationAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1245:3: rule__Turn__DurationAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Turn__DurationAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTurnAccess().getDurationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__3__Impl"


    // $ANTLR start "rule__Distance__Group__0"
    // InternalMyDsl.g:1254:1: rule__Distance__Group__0 : rule__Distance__Group__0__Impl rule__Distance__Group__1 ;
    public final void rule__Distance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1258:1: ( rule__Distance__Group__0__Impl rule__Distance__Group__1 )
            // InternalMyDsl.g:1259:2: rule__Distance__Group__0__Impl rule__Distance__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Distance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Distance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__Group__0"


    // $ANTLR start "rule__Distance__Group__0__Impl"
    // InternalMyDsl.g:1266:1: rule__Distance__Group__0__Impl : ( ( rule__Distance__ValueAssignment_0 ) ) ;
    public final void rule__Distance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1270:1: ( ( ( rule__Distance__ValueAssignment_0 ) ) )
            // InternalMyDsl.g:1271:1: ( ( rule__Distance__ValueAssignment_0 ) )
            {
            // InternalMyDsl.g:1271:1: ( ( rule__Distance__ValueAssignment_0 ) )
            // InternalMyDsl.g:1272:2: ( rule__Distance__ValueAssignment_0 )
            {
             before(grammarAccess.getDistanceAccess().getValueAssignment_0()); 
            // InternalMyDsl.g:1273:2: ( rule__Distance__ValueAssignment_0 )
            // InternalMyDsl.g:1273:3: rule__Distance__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Distance__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDistanceAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__Group__0__Impl"


    // $ANTLR start "rule__Distance__Group__1"
    // InternalMyDsl.g:1281:1: rule__Distance__Group__1 : rule__Distance__Group__1__Impl ;
    public final void rule__Distance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1285:1: ( rule__Distance__Group__1__Impl )
            // InternalMyDsl.g:1286:2: rule__Distance__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Distance__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__Group__1"


    // $ANTLR start "rule__Distance__Group__1__Impl"
    // InternalMyDsl.g:1292:1: rule__Distance__Group__1__Impl : ( ( rule__Distance__DistanceUnitAssignment_1 ) ) ;
    public final void rule__Distance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1296:1: ( ( ( rule__Distance__DistanceUnitAssignment_1 ) ) )
            // InternalMyDsl.g:1297:1: ( ( rule__Distance__DistanceUnitAssignment_1 ) )
            {
            // InternalMyDsl.g:1297:1: ( ( rule__Distance__DistanceUnitAssignment_1 ) )
            // InternalMyDsl.g:1298:2: ( rule__Distance__DistanceUnitAssignment_1 )
            {
             before(grammarAccess.getDistanceAccess().getDistanceUnitAssignment_1()); 
            // InternalMyDsl.g:1299:2: ( rule__Distance__DistanceUnitAssignment_1 )
            // InternalMyDsl.g:1299:3: rule__Distance__DistanceUnitAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Distance__DistanceUnitAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDistanceAccess().getDistanceUnitAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__Group__1__Impl"


    // $ANTLR start "rule__Angle__Group__0"
    // InternalMyDsl.g:1308:1: rule__Angle__Group__0 : rule__Angle__Group__0__Impl rule__Angle__Group__1 ;
    public final void rule__Angle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1312:1: ( rule__Angle__Group__0__Impl rule__Angle__Group__1 )
            // InternalMyDsl.g:1313:2: rule__Angle__Group__0__Impl rule__Angle__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Angle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Angle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Angle__Group__0"


    // $ANTLR start "rule__Angle__Group__0__Impl"
    // InternalMyDsl.g:1320:1: rule__Angle__Group__0__Impl : ( ( rule__Angle__ValueAssignment_0 ) ) ;
    public final void rule__Angle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1324:1: ( ( ( rule__Angle__ValueAssignment_0 ) ) )
            // InternalMyDsl.g:1325:1: ( ( rule__Angle__ValueAssignment_0 ) )
            {
            // InternalMyDsl.g:1325:1: ( ( rule__Angle__ValueAssignment_0 ) )
            // InternalMyDsl.g:1326:2: ( rule__Angle__ValueAssignment_0 )
            {
             before(grammarAccess.getAngleAccess().getValueAssignment_0()); 
            // InternalMyDsl.g:1327:2: ( rule__Angle__ValueAssignment_0 )
            // InternalMyDsl.g:1327:3: rule__Angle__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Angle__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAngleAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Angle__Group__0__Impl"


    // $ANTLR start "rule__Angle__Group__1"
    // InternalMyDsl.g:1335:1: rule__Angle__Group__1 : rule__Angle__Group__1__Impl ;
    public final void rule__Angle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1339:1: ( rule__Angle__Group__1__Impl )
            // InternalMyDsl.g:1340:2: rule__Angle__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Angle__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Angle__Group__1"


    // $ANTLR start "rule__Angle__Group__1__Impl"
    // InternalMyDsl.g:1346:1: rule__Angle__Group__1__Impl : ( ( rule__Angle__AngleUnitAssignment_1 )? ) ;
    public final void rule__Angle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1350:1: ( ( ( rule__Angle__AngleUnitAssignment_1 )? ) )
            // InternalMyDsl.g:1351:1: ( ( rule__Angle__AngleUnitAssignment_1 )? )
            {
            // InternalMyDsl.g:1351:1: ( ( rule__Angle__AngleUnitAssignment_1 )? )
            // InternalMyDsl.g:1352:2: ( rule__Angle__AngleUnitAssignment_1 )?
            {
             before(grammarAccess.getAngleAccess().getAngleUnitAssignment_1()); 
            // InternalMyDsl.g:1353:2: ( rule__Angle__AngleUnitAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1353:3: rule__Angle__AngleUnitAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Angle__AngleUnitAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAngleAccess().getAngleUnitAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Angle__Group__1__Impl"


    // $ANTLR start "rule__Duration__Group__0"
    // InternalMyDsl.g:1362:1: rule__Duration__Group__0 : rule__Duration__Group__0__Impl rule__Duration__Group__1 ;
    public final void rule__Duration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1366:1: ( rule__Duration__Group__0__Impl rule__Duration__Group__1 )
            // InternalMyDsl.g:1367:2: rule__Duration__Group__0__Impl rule__Duration__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Duration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Duration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__0"


    // $ANTLR start "rule__Duration__Group__0__Impl"
    // InternalMyDsl.g:1374:1: rule__Duration__Group__0__Impl : ( ( rule__Duration__ValueAssignment_0 ) ) ;
    public final void rule__Duration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1378:1: ( ( ( rule__Duration__ValueAssignment_0 ) ) )
            // InternalMyDsl.g:1379:1: ( ( rule__Duration__ValueAssignment_0 ) )
            {
            // InternalMyDsl.g:1379:1: ( ( rule__Duration__ValueAssignment_0 ) )
            // InternalMyDsl.g:1380:2: ( rule__Duration__ValueAssignment_0 )
            {
             before(grammarAccess.getDurationAccess().getValueAssignment_0()); 
            // InternalMyDsl.g:1381:2: ( rule__Duration__ValueAssignment_0 )
            // InternalMyDsl.g:1381:3: rule__Duration__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Duration__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__0__Impl"


    // $ANTLR start "rule__Duration__Group__1"
    // InternalMyDsl.g:1389:1: rule__Duration__Group__1 : rule__Duration__Group__1__Impl ;
    public final void rule__Duration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1393:1: ( rule__Duration__Group__1__Impl )
            // InternalMyDsl.g:1394:2: rule__Duration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__1"


    // $ANTLR start "rule__Duration__Group__1__Impl"
    // InternalMyDsl.g:1400:1: rule__Duration__Group__1__Impl : ( ( rule__Duration__TimeUnitAssignment_1 ) ) ;
    public final void rule__Duration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1404:1: ( ( ( rule__Duration__TimeUnitAssignment_1 ) ) )
            // InternalMyDsl.g:1405:1: ( ( rule__Duration__TimeUnitAssignment_1 ) )
            {
            // InternalMyDsl.g:1405:1: ( ( rule__Duration__TimeUnitAssignment_1 ) )
            // InternalMyDsl.g:1406:2: ( rule__Duration__TimeUnitAssignment_1 )
            {
             before(grammarAccess.getDurationAccess().getTimeUnitAssignment_1()); 
            // InternalMyDsl.g:1407:2: ( rule__Duration__TimeUnitAssignment_1 )
            // InternalMyDsl.g:1407:3: rule__Duration__TimeUnitAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Duration__TimeUnitAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getTimeUnitAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:1416:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1420:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:1421:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMyDsl.g:1428:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1432:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:1433:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:1433:1: ( ( '-' )? )
            // InternalMyDsl.g:1434:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:1435:2: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1435:3: '-'
                    {
                    match(input,25,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMyDsl.g:1443:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1447:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:1448:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMyDsl.g:1454:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1458:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1459:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1459:1: ( RULE_INT )
            // InternalMyDsl.g:1460:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__NamedBlock__Group__0"
    // InternalMyDsl.g:1470:1: rule__NamedBlock__Group__0 : rule__NamedBlock__Group__0__Impl rule__NamedBlock__Group__1 ;
    public final void rule__NamedBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1474:1: ( rule__NamedBlock__Group__0__Impl rule__NamedBlock__Group__1 )
            // InternalMyDsl.g:1475:2: rule__NamedBlock__Group__0__Impl rule__NamedBlock__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__NamedBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedBlock__Group__0"


    // $ANTLR start "rule__NamedBlock__Group__0__Impl"
    // InternalMyDsl.g:1482:1: rule__NamedBlock__Group__0__Impl : ( 'NamedBlock' ) ;
    public final void rule__NamedBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1486:1: ( ( 'NamedBlock' ) )
            // InternalMyDsl.g:1487:1: ( 'NamedBlock' )
            {
            // InternalMyDsl.g:1487:1: ( 'NamedBlock' )
            // InternalMyDsl.g:1488:2: 'NamedBlock'
            {
             before(grammarAccess.getNamedBlockAccess().getNamedBlockKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getNamedBlockAccess().getNamedBlockKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedBlock__Group__0__Impl"


    // $ANTLR start "rule__NamedBlock__Group__1"
    // InternalMyDsl.g:1497:1: rule__NamedBlock__Group__1 : rule__NamedBlock__Group__1__Impl rule__NamedBlock__Group__2 ;
    public final void rule__NamedBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1501:1: ( rule__NamedBlock__Group__1__Impl rule__NamedBlock__Group__2 )
            // InternalMyDsl.g:1502:2: rule__NamedBlock__Group__1__Impl rule__NamedBlock__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__NamedBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedBlock__Group__1"


    // $ANTLR start "rule__NamedBlock__Group__1__Impl"
    // InternalMyDsl.g:1509:1: rule__NamedBlock__Group__1__Impl : ( ( rule__NamedBlock__NameAssignment_1 ) ) ;
    public final void rule__NamedBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1513:1: ( ( ( rule__NamedBlock__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1514:1: ( ( rule__NamedBlock__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1514:1: ( ( rule__NamedBlock__NameAssignment_1 ) )
            // InternalMyDsl.g:1515:2: ( rule__NamedBlock__NameAssignment_1 )
            {
             before(grammarAccess.getNamedBlockAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1516:2: ( rule__NamedBlock__NameAssignment_1 )
            // InternalMyDsl.g:1516:3: rule__NamedBlock__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NamedBlock__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedBlockAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedBlock__Group__1__Impl"


    // $ANTLR start "rule__NamedBlock__Group__2"
    // InternalMyDsl.g:1524:1: rule__NamedBlock__Group__2 : rule__NamedBlock__Group__2__Impl rule__NamedBlock__Group__3 ;
    public final void rule__NamedBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1528:1: ( rule__NamedBlock__Group__2__Impl rule__NamedBlock__Group__3 )
            // InternalMyDsl.g:1529:2: rule__NamedBlock__Group__2__Impl rule__NamedBlock__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__NamedBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedBlock__Group__2"


    // $ANTLR start "rule__NamedBlock__Group__2__Impl"
    // InternalMyDsl.g:1536:1: rule__NamedBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__NamedBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1540:1: ( ( '{' ) )
            // InternalMyDsl.g:1541:1: ( '{' )
            {
            // InternalMyDsl.g:1541:1: ( '{' )
            // InternalMyDsl.g:1542:2: '{'
            {
             before(grammarAccess.getNamedBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNamedBlockAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedBlock__Group__2__Impl"


    // $ANTLR start "rule__NamedBlock__Group__3"
    // InternalMyDsl.g:1551:1: rule__NamedBlock__Group__3 : rule__NamedBlock__Group__3__Impl rule__NamedBlock__Group__4 ;
    public final void rule__NamedBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1555:1: ( rule__NamedBlock__Group__3__Impl rule__NamedBlock__Group__4 )
            // InternalMyDsl.g:1556:2: rule__NamedBlock__Group__3__Impl rule__NamedBlock__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__NamedBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedBlock__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedBlock__Group__3"


    // $ANTLR start "rule__NamedBlock__Group__3__Impl"
    // InternalMyDsl.g:1563:1: rule__NamedBlock__Group__3__Impl : ( ( rule__NamedBlock__Group_3__0 )? ) ;
    public final void rule__NamedBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1567:1: ( ( ( rule__NamedBlock__Group_3__0 )? ) )
            // InternalMyDsl.g:1568:1: ( ( rule__NamedBlock__Group_3__0 )? )
            {
            // InternalMyDsl.g:1568:1: ( ( rule__NamedBlock__Group_3__0 )? )
            // InternalMyDsl.g:1569:2: ( rule__NamedBlock__Group_3__0 )?
            {
             before(grammarAccess.getNamedBlockAccess().getGroup_3()); 
            // InternalMyDsl.g:1570:2: ( rule__NamedBlock__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=18 && LA12_0<=20)||LA12_0==22||LA12_0==24||(LA12_0>=26 && LA12_0<=27)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1570:3: rule__NamedBlock__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedBlock__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamedBlockAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedBlock__Group__3__Impl"


    // $ANTLR start "rule__NamedBlock__Group__4"
    // InternalMyDsl.g:1578:1: rule__NamedBlock__Group__4 : rule__NamedBlock__Group__4__Impl ;
    public final void rule__NamedBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1582:1: ( rule__NamedBlock__Group__4__Impl )
            // InternalMyDsl.g:1583:2: rule__NamedBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedBlock__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedBlock__Group__4"


    // $ANTLR start "rule__NamedBlock__Group__4__Impl"
    // InternalMyDsl.g:1589:1: rule__NamedBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__NamedBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1593:1: ( ( '}' ) )
            // InternalMyDsl.g:1594:1: ( '}' )
            {
            // InternalMyDsl.g:1594:1: ( '}' )
            // InternalMyDsl.g:1595:2: '}'
            {
             before(grammarAccess.getNamedBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNamedBlockAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedBlock__Group__4__Impl"


    // $ANTLR start "rule__NamedBlock__Group_3__0"
    // InternalMyDsl.g:1605:1: rule__NamedBlock__Group_3__0 : rule__NamedBlock__Group_3__0__Impl rule__NamedBlock__Group_3__1 ;
    public final void rule__NamedBlock__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1609:1: ( rule__NamedBlock__Group_3__0__Impl rule__NamedBlock__Group_3__1 )
            // InternalMyDsl.g:1610:2: rule__NamedBlock__Group_3__0__Impl rule__NamedBlock__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__NamedBlock__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedBlock__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedBlock__Group_3__0"


    // $ANTLR start "rule__NamedBlock__Group_3__0__Impl"
    // InternalMyDsl.g:1617:1: rule__NamedBlock__Group_3__0__Impl : ( ( rule__NamedBlock__InstructionsAssignment_3_0 ) ) ;
    public final void rule__NamedBlock__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1621:1: ( ( ( rule__NamedBlock__InstructionsAssignment_3_0 ) ) )
            // InternalMyDsl.g:1622:1: ( ( rule__NamedBlock__InstructionsAssignment_3_0 ) )
            {
            // InternalMyDsl.g:1622:1: ( ( rule__NamedBlock__InstructionsAssignment_3_0 ) )
            // InternalMyDsl.g:1623:2: ( rule__NamedBlock__InstructionsAssignment_3_0 )
            {
             before(grammarAccess.getNamedBlockAccess().getInstructionsAssignment_3_0()); 
            // InternalMyDsl.g:1624:2: ( rule__NamedBlock__InstructionsAssignment_3_0 )
            // InternalMyDsl.g:1624:3: rule__NamedBlock__InstructionsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__NamedBlock__InstructionsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getNamedBlockAccess().getInstructionsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedBlock__Group_3__0__Impl"


    // $ANTLR start "rule__NamedBlock__Group_3__1"
    // InternalMyDsl.g:1632:1: rule__NamedBlock__Group_3__1 : rule__NamedBlock__Group_3__1__Impl ;
    public final void rule__NamedBlock__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1636:1: ( rule__NamedBlock__Group_3__1__Impl )
            // InternalMyDsl.g:1637:2: rule__NamedBlock__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedBlock__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedBlock__Group_3__1"


    // $ANTLR start "rule__NamedBlock__Group_3__1__Impl"
    // InternalMyDsl.g:1643:1: rule__NamedBlock__Group_3__1__Impl : ( ( rule__NamedBlock__InstructionsAssignment_3_1 )* ) ;
    public final void rule__NamedBlock__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1647:1: ( ( ( rule__NamedBlock__InstructionsAssignment_3_1 )* ) )
            // InternalMyDsl.g:1648:1: ( ( rule__NamedBlock__InstructionsAssignment_3_1 )* )
            {
            // InternalMyDsl.g:1648:1: ( ( rule__NamedBlock__InstructionsAssignment_3_1 )* )
            // InternalMyDsl.g:1649:2: ( rule__NamedBlock__InstructionsAssignment_3_1 )*
            {
             before(grammarAccess.getNamedBlockAccess().getInstructionsAssignment_3_1()); 
            // InternalMyDsl.g:1650:2: ( rule__NamedBlock__InstructionsAssignment_3_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=18 && LA13_0<=20)||LA13_0==22||LA13_0==24||(LA13_0>=26 && LA13_0<=27)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1650:3: rule__NamedBlock__InstructionsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__NamedBlock__InstructionsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getNamedBlockAccess().getInstructionsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedBlock__Group_3__1__Impl"


    // $ANTLR start "rule__GoTo__Group__0"
    // InternalMyDsl.g:1659:1: rule__GoTo__Group__0 : rule__GoTo__Group__0__Impl rule__GoTo__Group__1 ;
    public final void rule__GoTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1663:1: ( rule__GoTo__Group__0__Impl rule__GoTo__Group__1 )
            // InternalMyDsl.g:1664:2: rule__GoTo__Group__0__Impl rule__GoTo__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__GoTo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoTo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__0"


    // $ANTLR start "rule__GoTo__Group__0__Impl"
    // InternalMyDsl.g:1671:1: rule__GoTo__Group__0__Impl : ( 'GoTo' ) ;
    public final void rule__GoTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1675:1: ( ( 'GoTo' ) )
            // InternalMyDsl.g:1676:1: ( 'GoTo' )
            {
            // InternalMyDsl.g:1676:1: ( 'GoTo' )
            // InternalMyDsl.g:1677:2: 'GoTo'
            {
             before(grammarAccess.getGoToAccess().getGoToKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getGoToKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__0__Impl"


    // $ANTLR start "rule__GoTo__Group__1"
    // InternalMyDsl.g:1686:1: rule__GoTo__Group__1 : rule__GoTo__Group__1__Impl rule__GoTo__Group__2 ;
    public final void rule__GoTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1690:1: ( rule__GoTo__Group__1__Impl rule__GoTo__Group__2 )
            // InternalMyDsl.g:1691:2: rule__GoTo__Group__1__Impl rule__GoTo__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__GoTo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoTo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__1"


    // $ANTLR start "rule__GoTo__Group__1__Impl"
    // InternalMyDsl.g:1698:1: rule__GoTo__Group__1__Impl : ( ( rule__GoTo__DestinationAssignment_1 ) ) ;
    public final void rule__GoTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1702:1: ( ( ( rule__GoTo__DestinationAssignment_1 ) ) )
            // InternalMyDsl.g:1703:1: ( ( rule__GoTo__DestinationAssignment_1 ) )
            {
            // InternalMyDsl.g:1703:1: ( ( rule__GoTo__DestinationAssignment_1 ) )
            // InternalMyDsl.g:1704:2: ( rule__GoTo__DestinationAssignment_1 )
            {
             before(grammarAccess.getGoToAccess().getDestinationAssignment_1()); 
            // InternalMyDsl.g:1705:2: ( rule__GoTo__DestinationAssignment_1 )
            // InternalMyDsl.g:1705:3: rule__GoTo__DestinationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__DestinationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGoToAccess().getDestinationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__1__Impl"


    // $ANTLR start "rule__GoTo__Group__2"
    // InternalMyDsl.g:1713:1: rule__GoTo__Group__2 : rule__GoTo__Group__2__Impl ;
    public final void rule__GoTo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1717:1: ( rule__GoTo__Group__2__Impl )
            // InternalMyDsl.g:1718:2: rule__GoTo__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__2"


    // $ANTLR start "rule__GoTo__Group__2__Impl"
    // InternalMyDsl.g:1724:1: rule__GoTo__Group__2__Impl : ( ( rule__GoTo__Group_2__0 )? ) ;
    public final void rule__GoTo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1728:1: ( ( ( rule__GoTo__Group_2__0 )? ) )
            // InternalMyDsl.g:1729:1: ( ( rule__GoTo__Group_2__0 )? )
            {
            // InternalMyDsl.g:1729:1: ( ( rule__GoTo__Group_2__0 )? )
            // InternalMyDsl.g:1730:2: ( rule__GoTo__Group_2__0 )?
            {
             before(grammarAccess.getGoToAccess().getGroup_2()); 
            // InternalMyDsl.g:1731:2: ( rule__GoTo__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1731:3: rule__GoTo__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GoTo__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGoToAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__2__Impl"


    // $ANTLR start "rule__GoTo__Group_2__0"
    // InternalMyDsl.g:1740:1: rule__GoTo__Group_2__0 : rule__GoTo__Group_2__0__Impl rule__GoTo__Group_2__1 ;
    public final void rule__GoTo__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1744:1: ( rule__GoTo__Group_2__0__Impl rule__GoTo__Group_2__1 )
            // InternalMyDsl.g:1745:2: rule__GoTo__Group_2__0__Impl rule__GoTo__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__GoTo__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoTo__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group_2__0"


    // $ANTLR start "rule__GoTo__Group_2__0__Impl"
    // InternalMyDsl.g:1752:1: rule__GoTo__Group_2__0__Impl : ( 'if' ) ;
    public final void rule__GoTo__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1756:1: ( ( 'if' ) )
            // InternalMyDsl.g:1757:1: ( 'if' )
            {
            // InternalMyDsl.g:1757:1: ( 'if' )
            // InternalMyDsl.g:1758:2: 'if'
            {
             before(grammarAccess.getGoToAccess().getIfKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getIfKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group_2__0__Impl"


    // $ANTLR start "rule__GoTo__Group_2__1"
    // InternalMyDsl.g:1767:1: rule__GoTo__Group_2__1 : rule__GoTo__Group_2__1__Impl ;
    public final void rule__GoTo__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1771:1: ( rule__GoTo__Group_2__1__Impl )
            // InternalMyDsl.g:1772:2: rule__GoTo__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group_2__1"


    // $ANTLR start "rule__GoTo__Group_2__1__Impl"
    // InternalMyDsl.g:1778:1: rule__GoTo__Group_2__1__Impl : ( ( rule__GoTo__ConditionAssignment_2_1 ) ) ;
    public final void rule__GoTo__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1782:1: ( ( ( rule__GoTo__ConditionAssignment_2_1 ) ) )
            // InternalMyDsl.g:1783:1: ( ( rule__GoTo__ConditionAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1783:1: ( ( rule__GoTo__ConditionAssignment_2_1 ) )
            // InternalMyDsl.g:1784:2: ( rule__GoTo__ConditionAssignment_2_1 )
            {
             before(grammarAccess.getGoToAccess().getConditionAssignment_2_1()); 
            // InternalMyDsl.g:1785:2: ( rule__GoTo__ConditionAssignment_2_1 )
            // InternalMyDsl.g:1785:3: rule__GoTo__ConditionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__ConditionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGoToAccess().getConditionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group_2__1__Impl"


    // $ANTLR start "rule__SensorActivation__Group__0"
    // InternalMyDsl.g:1794:1: rule__SensorActivation__Group__0 : rule__SensorActivation__Group__0__Impl rule__SensorActivation__Group__1 ;
    public final void rule__SensorActivation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1798:1: ( rule__SensorActivation__Group__0__Impl rule__SensorActivation__Group__1 )
            // InternalMyDsl.g:1799:2: rule__SensorActivation__Group__0__Impl rule__SensorActivation__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__SensorActivation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorActivation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorActivation__Group__0"


    // $ANTLR start "rule__SensorActivation__Group__0__Impl"
    // InternalMyDsl.g:1806:1: rule__SensorActivation__Group__0__Impl : ( () ) ;
    public final void rule__SensorActivation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1810:1: ( ( () ) )
            // InternalMyDsl.g:1811:1: ( () )
            {
            // InternalMyDsl.g:1811:1: ( () )
            // InternalMyDsl.g:1812:2: ()
            {
             before(grammarAccess.getSensorActivationAccess().getSensorActivationAction_0()); 
            // InternalMyDsl.g:1813:2: ()
            // InternalMyDsl.g:1813:3: 
            {
            }

             after(grammarAccess.getSensorActivationAccess().getSensorActivationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorActivation__Group__0__Impl"


    // $ANTLR start "rule__SensorActivation__Group__1"
    // InternalMyDsl.g:1821:1: rule__SensorActivation__Group__1 : rule__SensorActivation__Group__1__Impl ;
    public final void rule__SensorActivation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1825:1: ( rule__SensorActivation__Group__1__Impl )
            // InternalMyDsl.g:1826:2: rule__SensorActivation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorActivation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorActivation__Group__1"


    // $ANTLR start "rule__SensorActivation__Group__1__Impl"
    // InternalMyDsl.g:1832:1: rule__SensorActivation__Group__1__Impl : ( 'SensorActivated' ) ;
    public final void rule__SensorActivation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1836:1: ( ( 'SensorActivated' ) )
            // InternalMyDsl.g:1837:1: ( 'SensorActivated' )
            {
            // InternalMyDsl.g:1837:1: ( 'SensorActivated' )
            // InternalMyDsl.g:1838:2: 'SensorActivated'
            {
             before(grammarAccess.getSensorActivationAccess().getSensorActivatedKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSensorActivationAccess().getSensorActivatedKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorActivation__Group__1__Impl"


    // $ANTLR start "rule__Robot__InstructionsAssignment_3_0"
    // InternalMyDsl.g:1848:1: rule__Robot__InstructionsAssignment_3_0 : ( ruleInstruction ) ;
    public final void rule__Robot__InstructionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1852:1: ( ( ruleInstruction ) )
            // InternalMyDsl.g:1853:2: ( ruleInstruction )
            {
            // InternalMyDsl.g:1853:2: ( ruleInstruction )
            // InternalMyDsl.g:1854:3: ruleInstruction
            {
             before(grammarAccess.getRobotAccess().getInstructionsInstructionParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getInstructionsInstructionParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__InstructionsAssignment_3_0"


    // $ANTLR start "rule__Robot__InstructionsAssignment_3_1"
    // InternalMyDsl.g:1863:1: rule__Robot__InstructionsAssignment_3_1 : ( ruleInstruction ) ;
    public final void rule__Robot__InstructionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1867:1: ( ( ruleInstruction ) )
            // InternalMyDsl.g:1868:2: ( ruleInstruction )
            {
            // InternalMyDsl.g:1868:2: ( ruleInstruction )
            // InternalMyDsl.g:1869:3: ruleInstruction
            {
             before(grammarAccess.getRobotAccess().getInstructionsInstructionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getInstructionsInstructionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__InstructionsAssignment_3_1"


    // $ANTLR start "rule__MoveStraight__DistanceAssignment_1"
    // InternalMyDsl.g:1878:1: rule__MoveStraight__DistanceAssignment_1 : ( ruleDistance ) ;
    public final void rule__MoveStraight__DistanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1882:1: ( ( ruleDistance ) )
            // InternalMyDsl.g:1883:2: ( ruleDistance )
            {
            // InternalMyDsl.g:1883:2: ( ruleDistance )
            // InternalMyDsl.g:1884:3: ruleDistance
            {
             before(grammarAccess.getMoveStraightAccess().getDistanceDistanceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDistance();

            state._fsp--;

             after(grammarAccess.getMoveStraightAccess().getDistanceDistanceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStraight__DistanceAssignment_1"


    // $ANTLR start "rule__MoveStraight__DurationAssignment_3"
    // InternalMyDsl.g:1893:1: rule__MoveStraight__DurationAssignment_3 : ( ruleDuration ) ;
    public final void rule__MoveStraight__DurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1897:1: ( ( ruleDuration ) )
            // InternalMyDsl.g:1898:2: ( ruleDuration )
            {
            // InternalMyDsl.g:1898:2: ( ruleDuration )
            // InternalMyDsl.g:1899:3: ruleDuration
            {
             before(grammarAccess.getMoveStraightAccess().getDurationDurationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getMoveStraightAccess().getDurationDurationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStraight__DurationAssignment_3"


    // $ANTLR start "rule__Wait__DurationAssignment_3"
    // InternalMyDsl.g:1908:1: rule__Wait__DurationAssignment_3 : ( ruleDuration ) ;
    public final void rule__Wait__DurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1912:1: ( ( ruleDuration ) )
            // InternalMyDsl.g:1913:2: ( ruleDuration )
            {
            // InternalMyDsl.g:1913:2: ( ruleDuration )
            // InternalMyDsl.g:1914:3: ruleDuration
            {
             before(grammarAccess.getWaitAccess().getDurationDurationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getWaitAccess().getDurationDurationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__DurationAssignment_3"


    // $ANTLR start "rule__Turn__AngleAssignment_1"
    // InternalMyDsl.g:1923:1: rule__Turn__AngleAssignment_1 : ( ruleAngle ) ;
    public final void rule__Turn__AngleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1927:1: ( ( ruleAngle ) )
            // InternalMyDsl.g:1928:2: ( ruleAngle )
            {
            // InternalMyDsl.g:1928:2: ( ruleAngle )
            // InternalMyDsl.g:1929:3: ruleAngle
            {
             before(grammarAccess.getTurnAccess().getAngleAngleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAngle();

            state._fsp--;

             after(grammarAccess.getTurnAccess().getAngleAngleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__AngleAssignment_1"


    // $ANTLR start "rule__Turn__DurationAssignment_3"
    // InternalMyDsl.g:1938:1: rule__Turn__DurationAssignment_3 : ( ruleDuration ) ;
    public final void rule__Turn__DurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1942:1: ( ( ruleDuration ) )
            // InternalMyDsl.g:1943:2: ( ruleDuration )
            {
            // InternalMyDsl.g:1943:2: ( ruleDuration )
            // InternalMyDsl.g:1944:3: ruleDuration
            {
             before(grammarAccess.getTurnAccess().getDurationDurationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getTurnAccess().getDurationDurationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__DurationAssignment_3"


    // $ANTLR start "rule__Distance__ValueAssignment_0"
    // InternalMyDsl.g:1953:1: rule__Distance__ValueAssignment_0 : ( ruleEInt ) ;
    public final void rule__Distance__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1957:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:1958:2: ( ruleEInt )
            {
            // InternalMyDsl.g:1958:2: ( ruleEInt )
            // InternalMyDsl.g:1959:3: ruleEInt
            {
             before(grammarAccess.getDistanceAccess().getValueEIntParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDistanceAccess().getValueEIntParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__ValueAssignment_0"


    // $ANTLR start "rule__Distance__DistanceUnitAssignment_1"
    // InternalMyDsl.g:1968:1: rule__Distance__DistanceUnitAssignment_1 : ( ruleDistanceUnit ) ;
    public final void rule__Distance__DistanceUnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1972:1: ( ( ruleDistanceUnit ) )
            // InternalMyDsl.g:1973:2: ( ruleDistanceUnit )
            {
            // InternalMyDsl.g:1973:2: ( ruleDistanceUnit )
            // InternalMyDsl.g:1974:3: ruleDistanceUnit
            {
             before(grammarAccess.getDistanceAccess().getDistanceUnitDistanceUnitEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDistanceUnit();

            state._fsp--;

             after(grammarAccess.getDistanceAccess().getDistanceUnitDistanceUnitEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__DistanceUnitAssignment_1"


    // $ANTLR start "rule__Angle__ValueAssignment_0"
    // InternalMyDsl.g:1983:1: rule__Angle__ValueAssignment_0 : ( ruleEInt ) ;
    public final void rule__Angle__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1987:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:1988:2: ( ruleEInt )
            {
            // InternalMyDsl.g:1988:2: ( ruleEInt )
            // InternalMyDsl.g:1989:3: ruleEInt
            {
             before(grammarAccess.getAngleAccess().getValueEIntParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAngleAccess().getValueEIntParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Angle__ValueAssignment_0"


    // $ANTLR start "rule__Angle__AngleUnitAssignment_1"
    // InternalMyDsl.g:1998:1: rule__Angle__AngleUnitAssignment_1 : ( ruleAngleUnit ) ;
    public final void rule__Angle__AngleUnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2002:1: ( ( ruleAngleUnit ) )
            // InternalMyDsl.g:2003:2: ( ruleAngleUnit )
            {
            // InternalMyDsl.g:2003:2: ( ruleAngleUnit )
            // InternalMyDsl.g:2004:3: ruleAngleUnit
            {
             before(grammarAccess.getAngleAccess().getAngleUnitAngleUnitEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAngleUnit();

            state._fsp--;

             after(grammarAccess.getAngleAccess().getAngleUnitAngleUnitEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Angle__AngleUnitAssignment_1"


    // $ANTLR start "rule__Duration__ValueAssignment_0"
    // InternalMyDsl.g:2013:1: rule__Duration__ValueAssignment_0 : ( ruleEInt ) ;
    public final void rule__Duration__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2017:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2018:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2018:2: ( ruleEInt )
            // InternalMyDsl.g:2019:3: ruleEInt
            {
             before(grammarAccess.getDurationAccess().getValueEIntParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDurationAccess().getValueEIntParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__ValueAssignment_0"


    // $ANTLR start "rule__Duration__TimeUnitAssignment_1"
    // InternalMyDsl.g:2028:1: rule__Duration__TimeUnitAssignment_1 : ( ruleTimeUnit ) ;
    public final void rule__Duration__TimeUnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2032:1: ( ( ruleTimeUnit ) )
            // InternalMyDsl.g:2033:2: ( ruleTimeUnit )
            {
            // InternalMyDsl.g:2033:2: ( ruleTimeUnit )
            // InternalMyDsl.g:2034:3: ruleTimeUnit
            {
             before(grammarAccess.getDurationAccess().getTimeUnitTimeUnitEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getDurationAccess().getTimeUnitTimeUnitEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__TimeUnitAssignment_1"


    // $ANTLR start "rule__NamedBlock__NameAssignment_1"
    // InternalMyDsl.g:2043:1: rule__NamedBlock__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__NamedBlock__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2047:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2048:2: ( ruleEString )
            {
            // InternalMyDsl.g:2048:2: ( ruleEString )
            // InternalMyDsl.g:2049:3: ruleEString
            {
             before(grammarAccess.getNamedBlockAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNamedBlockAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedBlock__NameAssignment_1"


    // $ANTLR start "rule__NamedBlock__InstructionsAssignment_3_0"
    // InternalMyDsl.g:2058:1: rule__NamedBlock__InstructionsAssignment_3_0 : ( ruleInstruction ) ;
    public final void rule__NamedBlock__InstructionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2062:1: ( ( ruleInstruction ) )
            // InternalMyDsl.g:2063:2: ( ruleInstruction )
            {
            // InternalMyDsl.g:2063:2: ( ruleInstruction )
            // InternalMyDsl.g:2064:3: ruleInstruction
            {
             before(grammarAccess.getNamedBlockAccess().getInstructionsInstructionParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getNamedBlockAccess().getInstructionsInstructionParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedBlock__InstructionsAssignment_3_0"


    // $ANTLR start "rule__NamedBlock__InstructionsAssignment_3_1"
    // InternalMyDsl.g:2073:1: rule__NamedBlock__InstructionsAssignment_3_1 : ( ruleInstruction ) ;
    public final void rule__NamedBlock__InstructionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2077:1: ( ( ruleInstruction ) )
            // InternalMyDsl.g:2078:2: ( ruleInstruction )
            {
            // InternalMyDsl.g:2078:2: ( ruleInstruction )
            // InternalMyDsl.g:2079:3: ruleInstruction
            {
             before(grammarAccess.getNamedBlockAccess().getInstructionsInstructionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getNamedBlockAccess().getInstructionsInstructionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedBlock__InstructionsAssignment_3_1"


    // $ANTLR start "rule__GoTo__DestinationAssignment_1"
    // InternalMyDsl.g:2088:1: rule__GoTo__DestinationAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__GoTo__DestinationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2092:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2093:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2093:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2094:3: ( ruleEString )
            {
             before(grammarAccess.getGoToAccess().getDestinationNamedBlockCrossReference_1_0()); 
            // InternalMyDsl.g:2095:3: ( ruleEString )
            // InternalMyDsl.g:2096:4: ruleEString
            {
             before(grammarAccess.getGoToAccess().getDestinationNamedBlockEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGoToAccess().getDestinationNamedBlockEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getGoToAccess().getDestinationNamedBlockCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__DestinationAssignment_1"


    // $ANTLR start "rule__GoTo__ConditionAssignment_2_1"
    // InternalMyDsl.g:2107:1: rule__GoTo__ConditionAssignment_2_1 : ( ruleCondition ) ;
    public final void rule__GoTo__ConditionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2111:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:2112:2: ( ruleCondition )
            {
            // InternalMyDsl.g:2112:2: ( ruleCondition )
            // InternalMyDsl.g:2113:3: ruleCondition
            {
             before(grammarAccess.getGoToAccess().getConditionConditionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getGoToAccess().getConditionConditionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__ConditionAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000D5E0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000D5C0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000D5C0002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001500000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});

}