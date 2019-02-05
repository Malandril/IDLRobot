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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'cm'", "'deg'", "'ms'", "'s'", "'Robot'", "'{'", "'}'", "'for'", "'MoveStraight'", "'Turn'", "'-'", "'NamedBlock'", "'GoTo'"
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
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
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


    // $ANTLR start "entryRuleMovement"
    // InternalMyDsl.g:103:1: entryRuleMovement : ruleMovement EOF ;
    public final void entryRuleMovement() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleMovement EOF )
            // InternalMyDsl.g:105:1: ruleMovement EOF
            {
             before(grammarAccess.getMovementRule()); 
            pushFollow(FOLLOW_1);
            ruleMovement();

            state._fsp--;

             after(grammarAccess.getMovementRule()); 
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
    // $ANTLR end "entryRuleMovement"


    // $ANTLR start "ruleMovement"
    // InternalMyDsl.g:112:1: ruleMovement : ( ( rule__Movement__Group__0 ) ) ;
    public final void ruleMovement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Movement__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Movement__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Movement__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Movement__Group__0 )
            {
             before(grammarAccess.getMovementAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Movement__Group__0 )
            // InternalMyDsl.g:119:4: rule__Movement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Movement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMovementAccess().getGroup()); 

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
    // $ANTLR end "ruleMovement"


    // $ANTLR start "entryRuleMoveStraight"
    // InternalMyDsl.g:128:1: entryRuleMoveStraight : ruleMoveStraight EOF ;
    public final void entryRuleMoveStraight() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleMoveStraight EOF )
            // InternalMyDsl.g:130:1: ruleMoveStraight EOF
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
    // InternalMyDsl.g:137:1: ruleMoveStraight : ( ( rule__MoveStraight__Group__0 ) ) ;
    public final void ruleMoveStraight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__MoveStraight__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__MoveStraight__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__MoveStraight__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__MoveStraight__Group__0 )
            {
             before(grammarAccess.getMoveStraightAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__MoveStraight__Group__0 )
            // InternalMyDsl.g:144:4: rule__MoveStraight__Group__0
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


    // $ANTLR start "entryRuleTurn"
    // InternalMyDsl.g:153:1: entryRuleTurn : ruleTurn EOF ;
    public final void entryRuleTurn() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleTurn EOF )
            // InternalMyDsl.g:155:1: ruleTurn EOF
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
    // InternalMyDsl.g:162:1: ruleTurn : ( ( rule__Turn__Group__0 ) ) ;
    public final void ruleTurn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Turn__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Turn__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Turn__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Turn__Group__0 )
            {
             before(grammarAccess.getTurnAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Turn__Group__0 )
            // InternalMyDsl.g:169:4: rule__Turn__Group__0
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
    // InternalMyDsl.g:178:1: entryRuleDistance : ruleDistance EOF ;
    public final void entryRuleDistance() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleDistance EOF )
            // InternalMyDsl.g:180:1: ruleDistance EOF
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
    // InternalMyDsl.g:187:1: ruleDistance : ( ( rule__Distance__Group__0 ) ) ;
    public final void ruleDistance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Distance__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Distance__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Distance__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Distance__Group__0 )
            {
             before(grammarAccess.getDistanceAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Distance__Group__0 )
            // InternalMyDsl.g:194:4: rule__Distance__Group__0
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
    // InternalMyDsl.g:203:1: entryRuleAngle : ruleAngle EOF ;
    public final void entryRuleAngle() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleAngle EOF )
            // InternalMyDsl.g:205:1: ruleAngle EOF
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
    // InternalMyDsl.g:212:1: ruleAngle : ( ( rule__Angle__Group__0 ) ) ;
    public final void ruleAngle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Angle__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Angle__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Angle__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Angle__Group__0 )
            {
             before(grammarAccess.getAngleAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Angle__Group__0 )
            // InternalMyDsl.g:219:4: rule__Angle__Group__0
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
    // InternalMyDsl.g:228:1: entryRuleDuration : ruleDuration EOF ;
    public final void entryRuleDuration() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleDuration EOF )
            // InternalMyDsl.g:230:1: ruleDuration EOF
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
    // InternalMyDsl.g:237:1: ruleDuration : ( ( rule__Duration__Group__0 ) ) ;
    public final void ruleDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Duration__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Duration__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Duration__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Duration__Group__0 )
            {
             before(grammarAccess.getDurationAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Duration__Group__0 )
            // InternalMyDsl.g:244:4: rule__Duration__Group__0
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
    // InternalMyDsl.g:253:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleEInt EOF )
            // InternalMyDsl.g:255:1: ruleEInt EOF
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
    // InternalMyDsl.g:262:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:269:4: rule__EInt__Group__0
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
    // InternalMyDsl.g:278:1: entryRuleNamedBlock : ruleNamedBlock EOF ;
    public final void entryRuleNamedBlock() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleNamedBlock EOF )
            // InternalMyDsl.g:280:1: ruleNamedBlock EOF
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
    // InternalMyDsl.g:287:1: ruleNamedBlock : ( ( rule__NamedBlock__Group__0 ) ) ;
    public final void ruleNamedBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__NamedBlock__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__NamedBlock__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__NamedBlock__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__NamedBlock__Group__0 )
            {
             before(grammarAccess.getNamedBlockAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__NamedBlock__Group__0 )
            // InternalMyDsl.g:294:4: rule__NamedBlock__Group__0
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
    // InternalMyDsl.g:303:1: entryRuleGoTo : ruleGoTo EOF ;
    public final void entryRuleGoTo() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleGoTo EOF )
            // InternalMyDsl.g:305:1: ruleGoTo EOF
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
    // InternalMyDsl.g:312:1: ruleGoTo : ( ( rule__GoTo__Group__0 ) ) ;
    public final void ruleGoTo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__GoTo__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__GoTo__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__GoTo__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__GoTo__Group__0 )
            {
             before(grammarAccess.getGoToAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__GoTo__Group__0 )
            // InternalMyDsl.g:319:4: rule__GoTo__Group__0
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


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:328:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleEString EOF )
            // InternalMyDsl.g:330:1: ruleEString EOF
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
    // InternalMyDsl.g:337:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:343:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:344:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:344:4: rule__EString__Alternatives
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
    // InternalMyDsl.g:353:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:357:1: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // InternalMyDsl.g:358:2: ( ( rule__TimeUnit__Alternatives ) )
            {
            // InternalMyDsl.g:358:2: ( ( rule__TimeUnit__Alternatives ) )
            // InternalMyDsl.g:359:3: ( rule__TimeUnit__Alternatives )
            {
             before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            // InternalMyDsl.g:360:3: ( rule__TimeUnit__Alternatives )
            // InternalMyDsl.g:360:4: rule__TimeUnit__Alternatives
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
    // InternalMyDsl.g:369:1: ruleDistanceUnit : ( ( 'cm' ) ) ;
    public final void ruleDistanceUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:373:1: ( ( ( 'cm' ) ) )
            // InternalMyDsl.g:374:2: ( ( 'cm' ) )
            {
            // InternalMyDsl.g:374:2: ( ( 'cm' ) )
            // InternalMyDsl.g:375:3: ( 'cm' )
            {
             before(grammarAccess.getDistanceUnitAccess().getCENTIMETERSEnumLiteralDeclaration()); 
            // InternalMyDsl.g:376:3: ( 'cm' )
            // InternalMyDsl.g:376:4: 'cm'
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
    // InternalMyDsl.g:385:1: ruleAngleUnit : ( ( 'deg' ) ) ;
    public final void ruleAngleUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:389:1: ( ( ( 'deg' ) ) )
            // InternalMyDsl.g:390:2: ( ( 'deg' ) )
            {
            // InternalMyDsl.g:390:2: ( ( 'deg' ) )
            // InternalMyDsl.g:391:3: ( 'deg' )
            {
             before(grammarAccess.getAngleUnitAccess().getDEGREESEnumLiteralDeclaration()); 
            // InternalMyDsl.g:392:3: ( 'deg' )
            // InternalMyDsl.g:392:4: 'deg'
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
    // InternalMyDsl.g:400:1: rule__Instruction__Alternatives : ( ( ruleMovement ) | ( ruleNamedBlock ) | ( ruleGoTo ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:404:1: ( ( ruleMovement ) | ( ruleNamedBlock ) | ( ruleGoTo ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 19:
            case 20:
                {
                alt1=1;
                }
                break;
            case 22:
                {
                alt1=2;
                }
                break;
            case 23:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:405:2: ( ruleMovement )
                    {
                    // InternalMyDsl.g:405:2: ( ruleMovement )
                    // InternalMyDsl.g:406:3: ruleMovement
                    {
                     before(grammarAccess.getInstructionAccess().getMovementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMovement();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getMovementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:411:2: ( ruleNamedBlock )
                    {
                    // InternalMyDsl.g:411:2: ( ruleNamedBlock )
                    // InternalMyDsl.g:412:3: ruleNamedBlock
                    {
                     before(grammarAccess.getInstructionAccess().getNamedBlockParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNamedBlock();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getNamedBlockParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:417:2: ( ruleGoTo )
                    {
                    // InternalMyDsl.g:417:2: ( ruleGoTo )
                    // InternalMyDsl.g:418:3: ruleGoTo
                    {
                     before(grammarAccess.getInstructionAccess().getGoToParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGoTo();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getGoToParserRuleCall_2()); 

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


    // $ANTLR start "rule__Movement__Alternatives_0"
    // InternalMyDsl.g:427:1: rule__Movement__Alternatives_0 : ( ( ruleMoveStraight ) | ( ruleTurn ) );
    public final void rule__Movement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:431:1: ( ( ruleMoveStraight ) | ( ruleTurn ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:432:2: ( ruleMoveStraight )
                    {
                    // InternalMyDsl.g:432:2: ( ruleMoveStraight )
                    // InternalMyDsl.g:433:3: ruleMoveStraight
                    {
                     before(grammarAccess.getMovementAccess().getMoveStraightParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveStraight();

                    state._fsp--;

                     after(grammarAccess.getMovementAccess().getMoveStraightParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:438:2: ( ruleTurn )
                    {
                    // InternalMyDsl.g:438:2: ( ruleTurn )
                    // InternalMyDsl.g:439:3: ruleTurn
                    {
                     before(grammarAccess.getMovementAccess().getTurnParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTurn();

                    state._fsp--;

                     after(grammarAccess.getMovementAccess().getTurnParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Movement__Alternatives_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:448:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:452:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalMyDsl.g:453:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:453:2: ( RULE_STRING )
                    // InternalMyDsl.g:454:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:459:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:459:2: ( RULE_ID )
                    // InternalMyDsl.g:460:3: RULE_ID
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
    // InternalMyDsl.g:469:1: rule__TimeUnit__Alternatives : ( ( ( 'ms' ) ) | ( ( 's' ) ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:473:1: ( ( ( 'ms' ) ) | ( ( 's' ) ) )
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
                    // InternalMyDsl.g:474:2: ( ( 'ms' ) )
                    {
                    // InternalMyDsl.g:474:2: ( ( 'ms' ) )
                    // InternalMyDsl.g:475:3: ( 'ms' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:476:3: ( 'ms' )
                    // InternalMyDsl.g:476:4: 'ms'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:480:2: ( ( 's' ) )
                    {
                    // InternalMyDsl.g:480:2: ( ( 's' ) )
                    // InternalMyDsl.g:481:3: ( 's' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getSECONDSEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:482:3: ( 's' )
                    // InternalMyDsl.g:482:4: 's'
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
    // InternalMyDsl.g:490:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:494:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalMyDsl.g:495:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
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
    // InternalMyDsl.g:502:1: rule__Robot__Group__0__Impl : ( () ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:506:1: ( ( () ) )
            // InternalMyDsl.g:507:1: ( () )
            {
            // InternalMyDsl.g:507:1: ( () )
            // InternalMyDsl.g:508:2: ()
            {
             before(grammarAccess.getRobotAccess().getRobotAction_0()); 
            // InternalMyDsl.g:509:2: ()
            // InternalMyDsl.g:509:3: 
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
    // InternalMyDsl.g:517:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:521:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalMyDsl.g:522:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
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
    // InternalMyDsl.g:529:1: rule__Robot__Group__1__Impl : ( 'Robot' ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:533:1: ( ( 'Robot' ) )
            // InternalMyDsl.g:534:1: ( 'Robot' )
            {
            // InternalMyDsl.g:534:1: ( 'Robot' )
            // InternalMyDsl.g:535:2: 'Robot'
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
    // InternalMyDsl.g:544:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl rule__Robot__Group__3 ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:548:1: ( rule__Robot__Group__2__Impl rule__Robot__Group__3 )
            // InternalMyDsl.g:549:2: rule__Robot__Group__2__Impl rule__Robot__Group__3
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
    // InternalMyDsl.g:556:1: rule__Robot__Group__2__Impl : ( '{' ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:560:1: ( ( '{' ) )
            // InternalMyDsl.g:561:1: ( '{' )
            {
            // InternalMyDsl.g:561:1: ( '{' )
            // InternalMyDsl.g:562:2: '{'
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
    // InternalMyDsl.g:571:1: rule__Robot__Group__3 : rule__Robot__Group__3__Impl rule__Robot__Group__4 ;
    public final void rule__Robot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:575:1: ( rule__Robot__Group__3__Impl rule__Robot__Group__4 )
            // InternalMyDsl.g:576:2: rule__Robot__Group__3__Impl rule__Robot__Group__4
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
    // InternalMyDsl.g:583:1: rule__Robot__Group__3__Impl : ( ( rule__Robot__Group_3__0 )? ) ;
    public final void rule__Robot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:587:1: ( ( ( rule__Robot__Group_3__0 )? ) )
            // InternalMyDsl.g:588:1: ( ( rule__Robot__Group_3__0 )? )
            {
            // InternalMyDsl.g:588:1: ( ( rule__Robot__Group_3__0 )? )
            // InternalMyDsl.g:589:2: ( rule__Robot__Group_3__0 )?
            {
             before(grammarAccess.getRobotAccess().getGroup_3()); 
            // InternalMyDsl.g:590:2: ( rule__Robot__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=19 && LA5_0<=20)||(LA5_0>=22 && LA5_0<=23)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:590:3: rule__Robot__Group_3__0
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
    // InternalMyDsl.g:598:1: rule__Robot__Group__4 : rule__Robot__Group__4__Impl ;
    public final void rule__Robot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:602:1: ( rule__Robot__Group__4__Impl )
            // InternalMyDsl.g:603:2: rule__Robot__Group__4__Impl
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
    // InternalMyDsl.g:609:1: rule__Robot__Group__4__Impl : ( '}' ) ;
    public final void rule__Robot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:613:1: ( ( '}' ) )
            // InternalMyDsl.g:614:1: ( '}' )
            {
            // InternalMyDsl.g:614:1: ( '}' )
            // InternalMyDsl.g:615:2: '}'
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
    // InternalMyDsl.g:625:1: rule__Robot__Group_3__0 : rule__Robot__Group_3__0__Impl rule__Robot__Group_3__1 ;
    public final void rule__Robot__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:629:1: ( rule__Robot__Group_3__0__Impl rule__Robot__Group_3__1 )
            // InternalMyDsl.g:630:2: rule__Robot__Group_3__0__Impl rule__Robot__Group_3__1
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
    // InternalMyDsl.g:637:1: rule__Robot__Group_3__0__Impl : ( ( rule__Robot__InstructionsAssignment_3_0 ) ) ;
    public final void rule__Robot__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:1: ( ( ( rule__Robot__InstructionsAssignment_3_0 ) ) )
            // InternalMyDsl.g:642:1: ( ( rule__Robot__InstructionsAssignment_3_0 ) )
            {
            // InternalMyDsl.g:642:1: ( ( rule__Robot__InstructionsAssignment_3_0 ) )
            // InternalMyDsl.g:643:2: ( rule__Robot__InstructionsAssignment_3_0 )
            {
             before(grammarAccess.getRobotAccess().getInstructionsAssignment_3_0()); 
            // InternalMyDsl.g:644:2: ( rule__Robot__InstructionsAssignment_3_0 )
            // InternalMyDsl.g:644:3: rule__Robot__InstructionsAssignment_3_0
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
    // InternalMyDsl.g:652:1: rule__Robot__Group_3__1 : rule__Robot__Group_3__1__Impl ;
    public final void rule__Robot__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:656:1: ( rule__Robot__Group_3__1__Impl )
            // InternalMyDsl.g:657:2: rule__Robot__Group_3__1__Impl
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
    // InternalMyDsl.g:663:1: rule__Robot__Group_3__1__Impl : ( ( rule__Robot__InstructionsAssignment_3_1 )* ) ;
    public final void rule__Robot__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:667:1: ( ( ( rule__Robot__InstructionsAssignment_3_1 )* ) )
            // InternalMyDsl.g:668:1: ( ( rule__Robot__InstructionsAssignment_3_1 )* )
            {
            // InternalMyDsl.g:668:1: ( ( rule__Robot__InstructionsAssignment_3_1 )* )
            // InternalMyDsl.g:669:2: ( rule__Robot__InstructionsAssignment_3_1 )*
            {
             before(grammarAccess.getRobotAccess().getInstructionsAssignment_3_1()); 
            // InternalMyDsl.g:670:2: ( rule__Robot__InstructionsAssignment_3_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=19 && LA6_0<=20)||(LA6_0>=22 && LA6_0<=23)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:670:3: rule__Robot__InstructionsAssignment_3_1
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


    // $ANTLR start "rule__Movement__Group__0"
    // InternalMyDsl.g:679:1: rule__Movement__Group__0 : rule__Movement__Group__0__Impl rule__Movement__Group__1 ;
    public final void rule__Movement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:683:1: ( rule__Movement__Group__0__Impl rule__Movement__Group__1 )
            // InternalMyDsl.g:684:2: rule__Movement__Group__0__Impl rule__Movement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Movement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movement__Group__1();

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
    // $ANTLR end "rule__Movement__Group__0"


    // $ANTLR start "rule__Movement__Group__0__Impl"
    // InternalMyDsl.g:691:1: rule__Movement__Group__0__Impl : ( ( rule__Movement__Alternatives_0 ) ) ;
    public final void rule__Movement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:695:1: ( ( ( rule__Movement__Alternatives_0 ) ) )
            // InternalMyDsl.g:696:1: ( ( rule__Movement__Alternatives_0 ) )
            {
            // InternalMyDsl.g:696:1: ( ( rule__Movement__Alternatives_0 ) )
            // InternalMyDsl.g:697:2: ( rule__Movement__Alternatives_0 )
            {
             before(grammarAccess.getMovementAccess().getAlternatives_0()); 
            // InternalMyDsl.g:698:2: ( rule__Movement__Alternatives_0 )
            // InternalMyDsl.g:698:3: rule__Movement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Movement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMovementAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Movement__Group__0__Impl"


    // $ANTLR start "rule__Movement__Group__1"
    // InternalMyDsl.g:706:1: rule__Movement__Group__1 : rule__Movement__Group__1__Impl rule__Movement__Group__2 ;
    public final void rule__Movement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:710:1: ( rule__Movement__Group__1__Impl rule__Movement__Group__2 )
            // InternalMyDsl.g:711:2: rule__Movement__Group__1__Impl rule__Movement__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Movement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movement__Group__2();

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
    // $ANTLR end "rule__Movement__Group__1"


    // $ANTLR start "rule__Movement__Group__1__Impl"
    // InternalMyDsl.g:718:1: rule__Movement__Group__1__Impl : ( 'for' ) ;
    public final void rule__Movement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:722:1: ( ( 'for' ) )
            // InternalMyDsl.g:723:1: ( 'for' )
            {
            // InternalMyDsl.g:723:1: ( 'for' )
            // InternalMyDsl.g:724:2: 'for'
            {
             before(grammarAccess.getMovementAccess().getForKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMovementAccess().getForKeyword_1()); 

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
    // $ANTLR end "rule__Movement__Group__1__Impl"


    // $ANTLR start "rule__Movement__Group__2"
    // InternalMyDsl.g:733:1: rule__Movement__Group__2 : rule__Movement__Group__2__Impl ;
    public final void rule__Movement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:737:1: ( rule__Movement__Group__2__Impl )
            // InternalMyDsl.g:738:2: rule__Movement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Movement__Group__2__Impl();

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
    // $ANTLR end "rule__Movement__Group__2"


    // $ANTLR start "rule__Movement__Group__2__Impl"
    // InternalMyDsl.g:744:1: rule__Movement__Group__2__Impl : ( ( rule__Movement__DurationAssignment_2 )? ) ;
    public final void rule__Movement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:748:1: ( ( ( rule__Movement__DurationAssignment_2 )? ) )
            // InternalMyDsl.g:749:1: ( ( rule__Movement__DurationAssignment_2 )? )
            {
            // InternalMyDsl.g:749:1: ( ( rule__Movement__DurationAssignment_2 )? )
            // InternalMyDsl.g:750:2: ( rule__Movement__DurationAssignment_2 )?
            {
             before(grammarAccess.getMovementAccess().getDurationAssignment_2()); 
            // InternalMyDsl.g:751:2: ( rule__Movement__DurationAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT||LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:751:3: rule__Movement__DurationAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Movement__DurationAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMovementAccess().getDurationAssignment_2()); 

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
    // $ANTLR end "rule__Movement__Group__2__Impl"


    // $ANTLR start "rule__MoveStraight__Group__0"
    // InternalMyDsl.g:760:1: rule__MoveStraight__Group__0 : rule__MoveStraight__Group__0__Impl rule__MoveStraight__Group__1 ;
    public final void rule__MoveStraight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:764:1: ( rule__MoveStraight__Group__0__Impl rule__MoveStraight__Group__1 )
            // InternalMyDsl.g:765:2: rule__MoveStraight__Group__0__Impl rule__MoveStraight__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:772:1: rule__MoveStraight__Group__0__Impl : ( 'MoveStraight' ) ;
    public final void rule__MoveStraight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:776:1: ( ( 'MoveStraight' ) )
            // InternalMyDsl.g:777:1: ( 'MoveStraight' )
            {
            // InternalMyDsl.g:777:1: ( 'MoveStraight' )
            // InternalMyDsl.g:778:2: 'MoveStraight'
            {
             before(grammarAccess.getMoveStraightAccess().getMoveStraightKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:787:1: rule__MoveStraight__Group__1 : rule__MoveStraight__Group__1__Impl ;
    public final void rule__MoveStraight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:1: ( rule__MoveStraight__Group__1__Impl )
            // InternalMyDsl.g:792:2: rule__MoveStraight__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveStraight__Group__1__Impl();

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
    // InternalMyDsl.g:798:1: rule__MoveStraight__Group__1__Impl : ( ( rule__MoveStraight__DistanceAssignment_1 ) ) ;
    public final void rule__MoveStraight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:802:1: ( ( ( rule__MoveStraight__DistanceAssignment_1 ) ) )
            // InternalMyDsl.g:803:1: ( ( rule__MoveStraight__DistanceAssignment_1 ) )
            {
            // InternalMyDsl.g:803:1: ( ( rule__MoveStraight__DistanceAssignment_1 ) )
            // InternalMyDsl.g:804:2: ( rule__MoveStraight__DistanceAssignment_1 )
            {
             before(grammarAccess.getMoveStraightAccess().getDistanceAssignment_1()); 
            // InternalMyDsl.g:805:2: ( rule__MoveStraight__DistanceAssignment_1 )
            // InternalMyDsl.g:805:3: rule__MoveStraight__DistanceAssignment_1
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


    // $ANTLR start "rule__Turn__Group__0"
    // InternalMyDsl.g:814:1: rule__Turn__Group__0 : rule__Turn__Group__0__Impl rule__Turn__Group__1 ;
    public final void rule__Turn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:818:1: ( rule__Turn__Group__0__Impl rule__Turn__Group__1 )
            // InternalMyDsl.g:819:2: rule__Turn__Group__0__Impl rule__Turn__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:826:1: rule__Turn__Group__0__Impl : ( 'Turn' ) ;
    public final void rule__Turn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:830:1: ( ( 'Turn' ) )
            // InternalMyDsl.g:831:1: ( 'Turn' )
            {
            // InternalMyDsl.g:831:1: ( 'Turn' )
            // InternalMyDsl.g:832:2: 'Turn'
            {
             before(grammarAccess.getTurnAccess().getTurnKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:841:1: rule__Turn__Group__1 : rule__Turn__Group__1__Impl ;
    public final void rule__Turn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:845:1: ( rule__Turn__Group__1__Impl )
            // InternalMyDsl.g:846:2: rule__Turn__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Turn__Group__1__Impl();

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
    // InternalMyDsl.g:852:1: rule__Turn__Group__1__Impl : ( ( rule__Turn__AngleAssignment_1 ) ) ;
    public final void rule__Turn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:856:1: ( ( ( rule__Turn__AngleAssignment_1 ) ) )
            // InternalMyDsl.g:857:1: ( ( rule__Turn__AngleAssignment_1 ) )
            {
            // InternalMyDsl.g:857:1: ( ( rule__Turn__AngleAssignment_1 ) )
            // InternalMyDsl.g:858:2: ( rule__Turn__AngleAssignment_1 )
            {
             before(grammarAccess.getTurnAccess().getAngleAssignment_1()); 
            // InternalMyDsl.g:859:2: ( rule__Turn__AngleAssignment_1 )
            // InternalMyDsl.g:859:3: rule__Turn__AngleAssignment_1
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


    // $ANTLR start "rule__Distance__Group__0"
    // InternalMyDsl.g:868:1: rule__Distance__Group__0 : rule__Distance__Group__0__Impl rule__Distance__Group__1 ;
    public final void rule__Distance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:872:1: ( rule__Distance__Group__0__Impl rule__Distance__Group__1 )
            // InternalMyDsl.g:873:2: rule__Distance__Group__0__Impl rule__Distance__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:880:1: rule__Distance__Group__0__Impl : ( ( rule__Distance__ValueAssignment_0 ) ) ;
    public final void rule__Distance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:884:1: ( ( ( rule__Distance__ValueAssignment_0 ) ) )
            // InternalMyDsl.g:885:1: ( ( rule__Distance__ValueAssignment_0 ) )
            {
            // InternalMyDsl.g:885:1: ( ( rule__Distance__ValueAssignment_0 ) )
            // InternalMyDsl.g:886:2: ( rule__Distance__ValueAssignment_0 )
            {
             before(grammarAccess.getDistanceAccess().getValueAssignment_0()); 
            // InternalMyDsl.g:887:2: ( rule__Distance__ValueAssignment_0 )
            // InternalMyDsl.g:887:3: rule__Distance__ValueAssignment_0
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
    // InternalMyDsl.g:895:1: rule__Distance__Group__1 : rule__Distance__Group__1__Impl ;
    public final void rule__Distance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:899:1: ( rule__Distance__Group__1__Impl )
            // InternalMyDsl.g:900:2: rule__Distance__Group__1__Impl
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
    // InternalMyDsl.g:906:1: rule__Distance__Group__1__Impl : ( ( rule__Distance__DistanceUnitAssignment_1 ) ) ;
    public final void rule__Distance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:910:1: ( ( ( rule__Distance__DistanceUnitAssignment_1 ) ) )
            // InternalMyDsl.g:911:1: ( ( rule__Distance__DistanceUnitAssignment_1 ) )
            {
            // InternalMyDsl.g:911:1: ( ( rule__Distance__DistanceUnitAssignment_1 ) )
            // InternalMyDsl.g:912:2: ( rule__Distance__DistanceUnitAssignment_1 )
            {
             before(grammarAccess.getDistanceAccess().getDistanceUnitAssignment_1()); 
            // InternalMyDsl.g:913:2: ( rule__Distance__DistanceUnitAssignment_1 )
            // InternalMyDsl.g:913:3: rule__Distance__DistanceUnitAssignment_1
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
    // InternalMyDsl.g:922:1: rule__Angle__Group__0 : rule__Angle__Group__0__Impl rule__Angle__Group__1 ;
    public final void rule__Angle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:926:1: ( rule__Angle__Group__0__Impl rule__Angle__Group__1 )
            // InternalMyDsl.g:927:2: rule__Angle__Group__0__Impl rule__Angle__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:934:1: rule__Angle__Group__0__Impl : ( ( rule__Angle__ValueAssignment_0 ) ) ;
    public final void rule__Angle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:938:1: ( ( ( rule__Angle__ValueAssignment_0 ) ) )
            // InternalMyDsl.g:939:1: ( ( rule__Angle__ValueAssignment_0 ) )
            {
            // InternalMyDsl.g:939:1: ( ( rule__Angle__ValueAssignment_0 ) )
            // InternalMyDsl.g:940:2: ( rule__Angle__ValueAssignment_0 )
            {
             before(grammarAccess.getAngleAccess().getValueAssignment_0()); 
            // InternalMyDsl.g:941:2: ( rule__Angle__ValueAssignment_0 )
            // InternalMyDsl.g:941:3: rule__Angle__ValueAssignment_0
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
    // InternalMyDsl.g:949:1: rule__Angle__Group__1 : rule__Angle__Group__1__Impl ;
    public final void rule__Angle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:953:1: ( rule__Angle__Group__1__Impl )
            // InternalMyDsl.g:954:2: rule__Angle__Group__1__Impl
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
    // InternalMyDsl.g:960:1: rule__Angle__Group__1__Impl : ( ( rule__Angle__AngleUnitAssignment_1 )? ) ;
    public final void rule__Angle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:964:1: ( ( ( rule__Angle__AngleUnitAssignment_1 )? ) )
            // InternalMyDsl.g:965:1: ( ( rule__Angle__AngleUnitAssignment_1 )? )
            {
            // InternalMyDsl.g:965:1: ( ( rule__Angle__AngleUnitAssignment_1 )? )
            // InternalMyDsl.g:966:2: ( rule__Angle__AngleUnitAssignment_1 )?
            {
             before(grammarAccess.getAngleAccess().getAngleUnitAssignment_1()); 
            // InternalMyDsl.g:967:2: ( rule__Angle__AngleUnitAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:967:3: rule__Angle__AngleUnitAssignment_1
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
    // InternalMyDsl.g:976:1: rule__Duration__Group__0 : rule__Duration__Group__0__Impl rule__Duration__Group__1 ;
    public final void rule__Duration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:980:1: ( rule__Duration__Group__0__Impl rule__Duration__Group__1 )
            // InternalMyDsl.g:981:2: rule__Duration__Group__0__Impl rule__Duration__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:988:1: rule__Duration__Group__0__Impl : ( () ) ;
    public final void rule__Duration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:992:1: ( ( () ) )
            // InternalMyDsl.g:993:1: ( () )
            {
            // InternalMyDsl.g:993:1: ( () )
            // InternalMyDsl.g:994:2: ()
            {
             before(grammarAccess.getDurationAccess().getDurationAction_0()); 
            // InternalMyDsl.g:995:2: ()
            // InternalMyDsl.g:995:3: 
            {
            }

             after(grammarAccess.getDurationAccess().getDurationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__0__Impl"


    // $ANTLR start "rule__Duration__Group__1"
    // InternalMyDsl.g:1003:1: rule__Duration__Group__1 : rule__Duration__Group__1__Impl ;
    public final void rule__Duration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1007:1: ( rule__Duration__Group__1__Impl )
            // InternalMyDsl.g:1008:2: rule__Duration__Group__1__Impl
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
    // InternalMyDsl.g:1014:1: rule__Duration__Group__1__Impl : ( ( rule__Duration__Group_1__0 ) ) ;
    public final void rule__Duration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1018:1: ( ( ( rule__Duration__Group_1__0 ) ) )
            // InternalMyDsl.g:1019:1: ( ( rule__Duration__Group_1__0 ) )
            {
            // InternalMyDsl.g:1019:1: ( ( rule__Duration__Group_1__0 ) )
            // InternalMyDsl.g:1020:2: ( rule__Duration__Group_1__0 )
            {
             before(grammarAccess.getDurationAccess().getGroup_1()); 
            // InternalMyDsl.g:1021:2: ( rule__Duration__Group_1__0 )
            // InternalMyDsl.g:1021:3: rule__Duration__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getGroup_1()); 

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


    // $ANTLR start "rule__Duration__Group_1__0"
    // InternalMyDsl.g:1030:1: rule__Duration__Group_1__0 : rule__Duration__Group_1__0__Impl rule__Duration__Group_1__1 ;
    public final void rule__Duration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1034:1: ( rule__Duration__Group_1__0__Impl rule__Duration__Group_1__1 )
            // InternalMyDsl.g:1035:2: rule__Duration__Group_1__0__Impl rule__Duration__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Duration__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Duration__Group_1__1();

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
    // $ANTLR end "rule__Duration__Group_1__0"


    // $ANTLR start "rule__Duration__Group_1__0__Impl"
    // InternalMyDsl.g:1042:1: rule__Duration__Group_1__0__Impl : ( ( rule__Duration__ValueAssignment_1_0 ) ) ;
    public final void rule__Duration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1046:1: ( ( ( rule__Duration__ValueAssignment_1_0 ) ) )
            // InternalMyDsl.g:1047:1: ( ( rule__Duration__ValueAssignment_1_0 ) )
            {
            // InternalMyDsl.g:1047:1: ( ( rule__Duration__ValueAssignment_1_0 ) )
            // InternalMyDsl.g:1048:2: ( rule__Duration__ValueAssignment_1_0 )
            {
             before(grammarAccess.getDurationAccess().getValueAssignment_1_0()); 
            // InternalMyDsl.g:1049:2: ( rule__Duration__ValueAssignment_1_0 )
            // InternalMyDsl.g:1049:3: rule__Duration__ValueAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Duration__ValueAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getValueAssignment_1_0()); 

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
    // $ANTLR end "rule__Duration__Group_1__0__Impl"


    // $ANTLR start "rule__Duration__Group_1__1"
    // InternalMyDsl.g:1057:1: rule__Duration__Group_1__1 : rule__Duration__Group_1__1__Impl ;
    public final void rule__Duration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1061:1: ( rule__Duration__Group_1__1__Impl )
            // InternalMyDsl.g:1062:2: rule__Duration__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group_1__1__Impl();

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
    // $ANTLR end "rule__Duration__Group_1__1"


    // $ANTLR start "rule__Duration__Group_1__1__Impl"
    // InternalMyDsl.g:1068:1: rule__Duration__Group_1__1__Impl : ( ( rule__Duration__TimeUnitAssignment_1_1 ) ) ;
    public final void rule__Duration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1072:1: ( ( ( rule__Duration__TimeUnitAssignment_1_1 ) ) )
            // InternalMyDsl.g:1073:1: ( ( rule__Duration__TimeUnitAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1073:1: ( ( rule__Duration__TimeUnitAssignment_1_1 ) )
            // InternalMyDsl.g:1074:2: ( rule__Duration__TimeUnitAssignment_1_1 )
            {
             before(grammarAccess.getDurationAccess().getTimeUnitAssignment_1_1()); 
            // InternalMyDsl.g:1075:2: ( rule__Duration__TimeUnitAssignment_1_1 )
            // InternalMyDsl.g:1075:3: rule__Duration__TimeUnitAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Duration__TimeUnitAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getTimeUnitAssignment_1_1()); 

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
    // $ANTLR end "rule__Duration__Group_1__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:1084:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1088:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:1089:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1096:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1100:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:1101:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:1101:1: ( ( '-' )? )
            // InternalMyDsl.g:1102:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:1103:2: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1103:3: '-'
                    {
                    match(input,21,FOLLOW_2); 

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
    // InternalMyDsl.g:1111:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1115:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:1116:2: rule__EInt__Group__1__Impl
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
    // InternalMyDsl.g:1122:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1126:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1127:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1127:1: ( RULE_INT )
            // InternalMyDsl.g:1128:2: RULE_INT
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
    // InternalMyDsl.g:1138:1: rule__NamedBlock__Group__0 : rule__NamedBlock__Group__0__Impl rule__NamedBlock__Group__1 ;
    public final void rule__NamedBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1142:1: ( rule__NamedBlock__Group__0__Impl rule__NamedBlock__Group__1 )
            // InternalMyDsl.g:1143:2: rule__NamedBlock__Group__0__Impl rule__NamedBlock__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1150:1: rule__NamedBlock__Group__0__Impl : ( () ) ;
    public final void rule__NamedBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1154:1: ( ( () ) )
            // InternalMyDsl.g:1155:1: ( () )
            {
            // InternalMyDsl.g:1155:1: ( () )
            // InternalMyDsl.g:1156:2: ()
            {
             before(grammarAccess.getNamedBlockAccess().getNamedBlockAction_0()); 
            // InternalMyDsl.g:1157:2: ()
            // InternalMyDsl.g:1157:3: 
            {
            }

             after(grammarAccess.getNamedBlockAccess().getNamedBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedBlock__Group__0__Impl"


    // $ANTLR start "rule__NamedBlock__Group__1"
    // InternalMyDsl.g:1165:1: rule__NamedBlock__Group__1 : rule__NamedBlock__Group__1__Impl rule__NamedBlock__Group__2 ;
    public final void rule__NamedBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1169:1: ( rule__NamedBlock__Group__1__Impl rule__NamedBlock__Group__2 )
            // InternalMyDsl.g:1170:2: rule__NamedBlock__Group__1__Impl rule__NamedBlock__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1177:1: rule__NamedBlock__Group__1__Impl : ( 'NamedBlock' ) ;
    public final void rule__NamedBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1181:1: ( ( 'NamedBlock' ) )
            // InternalMyDsl.g:1182:1: ( 'NamedBlock' )
            {
            // InternalMyDsl.g:1182:1: ( 'NamedBlock' )
            // InternalMyDsl.g:1183:2: 'NamedBlock'
            {
             before(grammarAccess.getNamedBlockAccess().getNamedBlockKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNamedBlockAccess().getNamedBlockKeyword_1()); 

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
    // InternalMyDsl.g:1192:1: rule__NamedBlock__Group__2 : rule__NamedBlock__Group__2__Impl rule__NamedBlock__Group__3 ;
    public final void rule__NamedBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1196:1: ( rule__NamedBlock__Group__2__Impl rule__NamedBlock__Group__3 )
            // InternalMyDsl.g:1197:2: rule__NamedBlock__Group__2__Impl rule__NamedBlock__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1204:1: rule__NamedBlock__Group__2__Impl : ( ( rule__NamedBlock__NameAssignment_2 ) ) ;
    public final void rule__NamedBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1208:1: ( ( ( rule__NamedBlock__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1209:1: ( ( rule__NamedBlock__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1209:1: ( ( rule__NamedBlock__NameAssignment_2 ) )
            // InternalMyDsl.g:1210:2: ( rule__NamedBlock__NameAssignment_2 )
            {
             before(grammarAccess.getNamedBlockAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1211:2: ( rule__NamedBlock__NameAssignment_2 )
            // InternalMyDsl.g:1211:3: rule__NamedBlock__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NamedBlock__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNamedBlockAccess().getNameAssignment_2()); 

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
    // InternalMyDsl.g:1219:1: rule__NamedBlock__Group__3 : rule__NamedBlock__Group__3__Impl rule__NamedBlock__Group__4 ;
    public final void rule__NamedBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1223:1: ( rule__NamedBlock__Group__3__Impl rule__NamedBlock__Group__4 )
            // InternalMyDsl.g:1224:2: rule__NamedBlock__Group__3__Impl rule__NamedBlock__Group__4
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
    // InternalMyDsl.g:1231:1: rule__NamedBlock__Group__3__Impl : ( '{' ) ;
    public final void rule__NamedBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1235:1: ( ( '{' ) )
            // InternalMyDsl.g:1236:1: ( '{' )
            {
            // InternalMyDsl.g:1236:1: ( '{' )
            // InternalMyDsl.g:1237:2: '{'
            {
             before(grammarAccess.getNamedBlockAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNamedBlockAccess().getLeftCurlyBracketKeyword_3()); 

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
    // InternalMyDsl.g:1246:1: rule__NamedBlock__Group__4 : rule__NamedBlock__Group__4__Impl rule__NamedBlock__Group__5 ;
    public final void rule__NamedBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1250:1: ( rule__NamedBlock__Group__4__Impl rule__NamedBlock__Group__5 )
            // InternalMyDsl.g:1251:2: rule__NamedBlock__Group__4__Impl rule__NamedBlock__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__NamedBlock__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedBlock__Group__5();

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
    // InternalMyDsl.g:1258:1: rule__NamedBlock__Group__4__Impl : ( ( rule__NamedBlock__Group_4__0 )? ) ;
    public final void rule__NamedBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1262:1: ( ( ( rule__NamedBlock__Group_4__0 )? ) )
            // InternalMyDsl.g:1263:1: ( ( rule__NamedBlock__Group_4__0 )? )
            {
            // InternalMyDsl.g:1263:1: ( ( rule__NamedBlock__Group_4__0 )? )
            // InternalMyDsl.g:1264:2: ( rule__NamedBlock__Group_4__0 )?
            {
             before(grammarAccess.getNamedBlockAccess().getGroup_4()); 
            // InternalMyDsl.g:1265:2: ( rule__NamedBlock__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=19 && LA10_0<=20)||(LA10_0>=22 && LA10_0<=23)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1265:3: rule__NamedBlock__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedBlock__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamedBlockAccess().getGroup_4()); 

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


    // $ANTLR start "rule__NamedBlock__Group__5"
    // InternalMyDsl.g:1273:1: rule__NamedBlock__Group__5 : rule__NamedBlock__Group__5__Impl ;
    public final void rule__NamedBlock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1277:1: ( rule__NamedBlock__Group__5__Impl )
            // InternalMyDsl.g:1278:2: rule__NamedBlock__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedBlock__Group__5__Impl();

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
    // $ANTLR end "rule__NamedBlock__Group__5"


    // $ANTLR start "rule__NamedBlock__Group__5__Impl"
    // InternalMyDsl.g:1284:1: rule__NamedBlock__Group__5__Impl : ( '}' ) ;
    public final void rule__NamedBlock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1288:1: ( ( '}' ) )
            // InternalMyDsl.g:1289:1: ( '}' )
            {
            // InternalMyDsl.g:1289:1: ( '}' )
            // InternalMyDsl.g:1290:2: '}'
            {
             before(grammarAccess.getNamedBlockAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNamedBlockAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__NamedBlock__Group__5__Impl"


    // $ANTLR start "rule__NamedBlock__Group_4__0"
    // InternalMyDsl.g:1300:1: rule__NamedBlock__Group_4__0 : rule__NamedBlock__Group_4__0__Impl rule__NamedBlock__Group_4__1 ;
    public final void rule__NamedBlock__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1304:1: ( rule__NamedBlock__Group_4__0__Impl rule__NamedBlock__Group_4__1 )
            // InternalMyDsl.g:1305:2: rule__NamedBlock__Group_4__0__Impl rule__NamedBlock__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__NamedBlock__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedBlock__Group_4__1();

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
    // $ANTLR end "rule__NamedBlock__Group_4__0"


    // $ANTLR start "rule__NamedBlock__Group_4__0__Impl"
    // InternalMyDsl.g:1312:1: rule__NamedBlock__Group_4__0__Impl : ( ( rule__NamedBlock__InstructionsAssignment_4_0 ) ) ;
    public final void rule__NamedBlock__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1316:1: ( ( ( rule__NamedBlock__InstructionsAssignment_4_0 ) ) )
            // InternalMyDsl.g:1317:1: ( ( rule__NamedBlock__InstructionsAssignment_4_0 ) )
            {
            // InternalMyDsl.g:1317:1: ( ( rule__NamedBlock__InstructionsAssignment_4_0 ) )
            // InternalMyDsl.g:1318:2: ( rule__NamedBlock__InstructionsAssignment_4_0 )
            {
             before(grammarAccess.getNamedBlockAccess().getInstructionsAssignment_4_0()); 
            // InternalMyDsl.g:1319:2: ( rule__NamedBlock__InstructionsAssignment_4_0 )
            // InternalMyDsl.g:1319:3: rule__NamedBlock__InstructionsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__NamedBlock__InstructionsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getNamedBlockAccess().getInstructionsAssignment_4_0()); 

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
    // $ANTLR end "rule__NamedBlock__Group_4__0__Impl"


    // $ANTLR start "rule__NamedBlock__Group_4__1"
    // InternalMyDsl.g:1327:1: rule__NamedBlock__Group_4__1 : rule__NamedBlock__Group_4__1__Impl ;
    public final void rule__NamedBlock__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1331:1: ( rule__NamedBlock__Group_4__1__Impl )
            // InternalMyDsl.g:1332:2: rule__NamedBlock__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedBlock__Group_4__1__Impl();

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
    // $ANTLR end "rule__NamedBlock__Group_4__1"


    // $ANTLR start "rule__NamedBlock__Group_4__1__Impl"
    // InternalMyDsl.g:1338:1: rule__NamedBlock__Group_4__1__Impl : ( ( rule__NamedBlock__InstructionsAssignment_4_1 )* ) ;
    public final void rule__NamedBlock__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1342:1: ( ( ( rule__NamedBlock__InstructionsAssignment_4_1 )* ) )
            // InternalMyDsl.g:1343:1: ( ( rule__NamedBlock__InstructionsAssignment_4_1 )* )
            {
            // InternalMyDsl.g:1343:1: ( ( rule__NamedBlock__InstructionsAssignment_4_1 )* )
            // InternalMyDsl.g:1344:2: ( rule__NamedBlock__InstructionsAssignment_4_1 )*
            {
             before(grammarAccess.getNamedBlockAccess().getInstructionsAssignment_4_1()); 
            // InternalMyDsl.g:1345:2: ( rule__NamedBlock__InstructionsAssignment_4_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=19 && LA11_0<=20)||(LA11_0>=22 && LA11_0<=23)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1345:3: rule__NamedBlock__InstructionsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__NamedBlock__InstructionsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getNamedBlockAccess().getInstructionsAssignment_4_1()); 

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
    // $ANTLR end "rule__NamedBlock__Group_4__1__Impl"


    // $ANTLR start "rule__GoTo__Group__0"
    // InternalMyDsl.g:1354:1: rule__GoTo__Group__0 : rule__GoTo__Group__0__Impl rule__GoTo__Group__1 ;
    public final void rule__GoTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1358:1: ( rule__GoTo__Group__0__Impl rule__GoTo__Group__1 )
            // InternalMyDsl.g:1359:2: rule__GoTo__Group__0__Impl rule__GoTo__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1366:1: rule__GoTo__Group__0__Impl : ( 'GoTo' ) ;
    public final void rule__GoTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1370:1: ( ( 'GoTo' ) )
            // InternalMyDsl.g:1371:1: ( 'GoTo' )
            {
            // InternalMyDsl.g:1371:1: ( 'GoTo' )
            // InternalMyDsl.g:1372:2: 'GoTo'
            {
             before(grammarAccess.getGoToAccess().getGoToKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:1381:1: rule__GoTo__Group__1 : rule__GoTo__Group__1__Impl ;
    public final void rule__GoTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1385:1: ( rule__GoTo__Group__1__Impl )
            // InternalMyDsl.g:1386:2: rule__GoTo__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__Group__1__Impl();

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
    // InternalMyDsl.g:1392:1: rule__GoTo__Group__1__Impl : ( ( rule__GoTo__DestinationAssignment_1 ) ) ;
    public final void rule__GoTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1396:1: ( ( ( rule__GoTo__DestinationAssignment_1 ) ) )
            // InternalMyDsl.g:1397:1: ( ( rule__GoTo__DestinationAssignment_1 ) )
            {
            // InternalMyDsl.g:1397:1: ( ( rule__GoTo__DestinationAssignment_1 ) )
            // InternalMyDsl.g:1398:2: ( rule__GoTo__DestinationAssignment_1 )
            {
             before(grammarAccess.getGoToAccess().getDestinationAssignment_1()); 
            // InternalMyDsl.g:1399:2: ( rule__GoTo__DestinationAssignment_1 )
            // InternalMyDsl.g:1399:3: rule__GoTo__DestinationAssignment_1
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


    // $ANTLR start "rule__Robot__InstructionsAssignment_3_0"
    // InternalMyDsl.g:1408:1: rule__Robot__InstructionsAssignment_3_0 : ( ruleInstruction ) ;
    public final void rule__Robot__InstructionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1412:1: ( ( ruleInstruction ) )
            // InternalMyDsl.g:1413:2: ( ruleInstruction )
            {
            // InternalMyDsl.g:1413:2: ( ruleInstruction )
            // InternalMyDsl.g:1414:3: ruleInstruction
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
    // InternalMyDsl.g:1423:1: rule__Robot__InstructionsAssignment_3_1 : ( ruleInstruction ) ;
    public final void rule__Robot__InstructionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1427:1: ( ( ruleInstruction ) )
            // InternalMyDsl.g:1428:2: ( ruleInstruction )
            {
            // InternalMyDsl.g:1428:2: ( ruleInstruction )
            // InternalMyDsl.g:1429:3: ruleInstruction
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


    // $ANTLR start "rule__Movement__DurationAssignment_2"
    // InternalMyDsl.g:1438:1: rule__Movement__DurationAssignment_2 : ( ruleDuration ) ;
    public final void rule__Movement__DurationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1442:1: ( ( ruleDuration ) )
            // InternalMyDsl.g:1443:2: ( ruleDuration )
            {
            // InternalMyDsl.g:1443:2: ( ruleDuration )
            // InternalMyDsl.g:1444:3: ruleDuration
            {
             before(grammarAccess.getMovementAccess().getDurationDurationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getMovementAccess().getDurationDurationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Movement__DurationAssignment_2"


    // $ANTLR start "rule__MoveStraight__DistanceAssignment_1"
    // InternalMyDsl.g:1453:1: rule__MoveStraight__DistanceAssignment_1 : ( ruleDistance ) ;
    public final void rule__MoveStraight__DistanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1457:1: ( ( ruleDistance ) )
            // InternalMyDsl.g:1458:2: ( ruleDistance )
            {
            // InternalMyDsl.g:1458:2: ( ruleDistance )
            // InternalMyDsl.g:1459:3: ruleDistance
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


    // $ANTLR start "rule__Turn__AngleAssignment_1"
    // InternalMyDsl.g:1468:1: rule__Turn__AngleAssignment_1 : ( ruleAngle ) ;
    public final void rule__Turn__AngleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1472:1: ( ( ruleAngle ) )
            // InternalMyDsl.g:1473:2: ( ruleAngle )
            {
            // InternalMyDsl.g:1473:2: ( ruleAngle )
            // InternalMyDsl.g:1474:3: ruleAngle
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


    // $ANTLR start "rule__Distance__ValueAssignment_0"
    // InternalMyDsl.g:1483:1: rule__Distance__ValueAssignment_0 : ( ruleEInt ) ;
    public final void rule__Distance__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1487:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:1488:2: ( ruleEInt )
            {
            // InternalMyDsl.g:1488:2: ( ruleEInt )
            // InternalMyDsl.g:1489:3: ruleEInt
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
    // InternalMyDsl.g:1498:1: rule__Distance__DistanceUnitAssignment_1 : ( ruleDistanceUnit ) ;
    public final void rule__Distance__DistanceUnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1502:1: ( ( ruleDistanceUnit ) )
            // InternalMyDsl.g:1503:2: ( ruleDistanceUnit )
            {
            // InternalMyDsl.g:1503:2: ( ruleDistanceUnit )
            // InternalMyDsl.g:1504:3: ruleDistanceUnit
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
    // InternalMyDsl.g:1513:1: rule__Angle__ValueAssignment_0 : ( ruleEInt ) ;
    public final void rule__Angle__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1517:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:1518:2: ( ruleEInt )
            {
            // InternalMyDsl.g:1518:2: ( ruleEInt )
            // InternalMyDsl.g:1519:3: ruleEInt
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
    // InternalMyDsl.g:1528:1: rule__Angle__AngleUnitAssignment_1 : ( ruleAngleUnit ) ;
    public final void rule__Angle__AngleUnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1532:1: ( ( ruleAngleUnit ) )
            // InternalMyDsl.g:1533:2: ( ruleAngleUnit )
            {
            // InternalMyDsl.g:1533:2: ( ruleAngleUnit )
            // InternalMyDsl.g:1534:3: ruleAngleUnit
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


    // $ANTLR start "rule__Duration__ValueAssignment_1_0"
    // InternalMyDsl.g:1543:1: rule__Duration__ValueAssignment_1_0 : ( ruleEInt ) ;
    public final void rule__Duration__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1547:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:1548:2: ( ruleEInt )
            {
            // InternalMyDsl.g:1548:2: ( ruleEInt )
            // InternalMyDsl.g:1549:3: ruleEInt
            {
             before(grammarAccess.getDurationAccess().getValueEIntParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDurationAccess().getValueEIntParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Duration__ValueAssignment_1_0"


    // $ANTLR start "rule__Duration__TimeUnitAssignment_1_1"
    // InternalMyDsl.g:1558:1: rule__Duration__TimeUnitAssignment_1_1 : ( ruleTimeUnit ) ;
    public final void rule__Duration__TimeUnitAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1562:1: ( ( ruleTimeUnit ) )
            // InternalMyDsl.g:1563:2: ( ruleTimeUnit )
            {
            // InternalMyDsl.g:1563:2: ( ruleTimeUnit )
            // InternalMyDsl.g:1564:3: ruleTimeUnit
            {
             before(grammarAccess.getDurationAccess().getTimeUnitTimeUnitEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getDurationAccess().getTimeUnitTimeUnitEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Duration__TimeUnitAssignment_1_1"


    // $ANTLR start "rule__NamedBlock__NameAssignment_2"
    // InternalMyDsl.g:1573:1: rule__NamedBlock__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__NamedBlock__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1577:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1578:2: ( ruleEString )
            {
            // InternalMyDsl.g:1578:2: ( ruleEString )
            // InternalMyDsl.g:1579:3: ruleEString
            {
             before(grammarAccess.getNamedBlockAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNamedBlockAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__NamedBlock__NameAssignment_2"


    // $ANTLR start "rule__NamedBlock__InstructionsAssignment_4_0"
    // InternalMyDsl.g:1588:1: rule__NamedBlock__InstructionsAssignment_4_0 : ( ruleInstruction ) ;
    public final void rule__NamedBlock__InstructionsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1592:1: ( ( ruleInstruction ) )
            // InternalMyDsl.g:1593:2: ( ruleInstruction )
            {
            // InternalMyDsl.g:1593:2: ( ruleInstruction )
            // InternalMyDsl.g:1594:3: ruleInstruction
            {
             before(grammarAccess.getNamedBlockAccess().getInstructionsInstructionParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getNamedBlockAccess().getInstructionsInstructionParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__NamedBlock__InstructionsAssignment_4_0"


    // $ANTLR start "rule__NamedBlock__InstructionsAssignment_4_1"
    // InternalMyDsl.g:1603:1: rule__NamedBlock__InstructionsAssignment_4_1 : ( ruleInstruction ) ;
    public final void rule__NamedBlock__InstructionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1607:1: ( ( ruleInstruction ) )
            // InternalMyDsl.g:1608:2: ( ruleInstruction )
            {
            // InternalMyDsl.g:1608:2: ( ruleInstruction )
            // InternalMyDsl.g:1609:3: ruleInstruction
            {
             before(grammarAccess.getNamedBlockAccess().getInstructionsInstructionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getNamedBlockAccess().getInstructionsInstructionParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__NamedBlock__InstructionsAssignment_4_1"


    // $ANTLR start "rule__GoTo__DestinationAssignment_1"
    // InternalMyDsl.g:1618:1: rule__GoTo__DestinationAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__GoTo__DestinationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1622:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:1623:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:1623:2: ( ( ruleEString ) )
            // InternalMyDsl.g:1624:3: ( ruleEString )
            {
             before(grammarAccess.getGoToAccess().getDestinationNamedBlockCrossReference_1_0()); 
            // InternalMyDsl.g:1625:3: ( ruleEString )
            // InternalMyDsl.g:1626:4: ruleEString
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000DA0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000D80000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000D80002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000030L});

}