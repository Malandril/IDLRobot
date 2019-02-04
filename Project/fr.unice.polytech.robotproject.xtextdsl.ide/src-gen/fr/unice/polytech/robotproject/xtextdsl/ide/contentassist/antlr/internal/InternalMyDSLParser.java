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
import fr.unice.polytech.robotproject.xtextdsl.services.MyDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'{'", "'}'", "'instructions'", "'\\n'", "'MoveStraight:'", "'Turn:'", "'for'", "'-'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMyDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDSL.g"; }


    	private MyDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDSLGrammarAccess grammarAccess) {
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
    // InternalMyDSL.g:53:1: entryRuleRobot : ruleRobot EOF ;
    public final void entryRuleRobot() throws RecognitionException {
        try {
            // InternalMyDSL.g:54:1: ( ruleRobot EOF )
            // InternalMyDSL.g:55:1: ruleRobot EOF
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
    // InternalMyDSL.g:62:1: ruleRobot : ( ( rule__Robot__Group__0 ) ) ;
    public final void ruleRobot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:66:2: ( ( ( rule__Robot__Group__0 ) ) )
            // InternalMyDSL.g:67:2: ( ( rule__Robot__Group__0 ) )
            {
            // InternalMyDSL.g:67:2: ( ( rule__Robot__Group__0 ) )
            // InternalMyDSL.g:68:3: ( rule__Robot__Group__0 )
            {
             before(grammarAccess.getRobotAccess().getGroup()); 
            // InternalMyDSL.g:69:3: ( rule__Robot__Group__0 )
            // InternalMyDSL.g:69:4: rule__Robot__Group__0
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
    // InternalMyDSL.g:78:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalMyDSL.g:79:1: ( ruleInstruction EOF )
            // InternalMyDSL.g:80:1: ruleInstruction EOF
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
    // InternalMyDSL.g:87:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:91:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // InternalMyDSL.g:92:2: ( ( rule__Instruction__Alternatives ) )
            {
            // InternalMyDSL.g:92:2: ( ( rule__Instruction__Alternatives ) )
            // InternalMyDSL.g:93:3: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // InternalMyDSL.g:94:3: ( rule__Instruction__Alternatives )
            // InternalMyDSL.g:94:4: rule__Instruction__Alternatives
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


    // $ANTLR start "entryRuleMoveStraight"
    // InternalMyDSL.g:103:1: entryRuleMoveStraight : ruleMoveStraight EOF ;
    public final void entryRuleMoveStraight() throws RecognitionException {
        try {
            // InternalMyDSL.g:104:1: ( ruleMoveStraight EOF )
            // InternalMyDSL.g:105:1: ruleMoveStraight EOF
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
    // InternalMyDSL.g:112:1: ruleMoveStraight : ( ( rule__MoveStraight__Group__0 ) ) ;
    public final void ruleMoveStraight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:116:2: ( ( ( rule__MoveStraight__Group__0 ) ) )
            // InternalMyDSL.g:117:2: ( ( rule__MoveStraight__Group__0 ) )
            {
            // InternalMyDSL.g:117:2: ( ( rule__MoveStraight__Group__0 ) )
            // InternalMyDSL.g:118:3: ( rule__MoveStraight__Group__0 )
            {
             before(grammarAccess.getMoveStraightAccess().getGroup()); 
            // InternalMyDSL.g:119:3: ( rule__MoveStraight__Group__0 )
            // InternalMyDSL.g:119:4: rule__MoveStraight__Group__0
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
    // InternalMyDSL.g:128:1: entryRuleTurn : ruleTurn EOF ;
    public final void entryRuleTurn() throws RecognitionException {
        try {
            // InternalMyDSL.g:129:1: ( ruleTurn EOF )
            // InternalMyDSL.g:130:1: ruleTurn EOF
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
    // InternalMyDSL.g:137:1: ruleTurn : ( ( rule__Turn__Group__0 ) ) ;
    public final void ruleTurn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:141:2: ( ( ( rule__Turn__Group__0 ) ) )
            // InternalMyDSL.g:142:2: ( ( rule__Turn__Group__0 ) )
            {
            // InternalMyDSL.g:142:2: ( ( rule__Turn__Group__0 ) )
            // InternalMyDSL.g:143:3: ( rule__Turn__Group__0 )
            {
             before(grammarAccess.getTurnAccess().getGroup()); 
            // InternalMyDSL.g:144:3: ( rule__Turn__Group__0 )
            // InternalMyDSL.g:144:4: rule__Turn__Group__0
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


    // $ANTLR start "entryRuleAmount"
    // InternalMyDSL.g:153:1: entryRuleAmount : ruleAmount EOF ;
    public final void entryRuleAmount() throws RecognitionException {
        try {
            // InternalMyDSL.g:154:1: ( ruleAmount EOF )
            // InternalMyDSL.g:155:1: ruleAmount EOF
            {
             before(grammarAccess.getAmountRule()); 
            pushFollow(FOLLOW_1);
            ruleAmount();

            state._fsp--;

             after(grammarAccess.getAmountRule()); 
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
    // $ANTLR end "entryRuleAmount"


    // $ANTLR start "ruleAmount"
    // InternalMyDSL.g:162:1: ruleAmount : ( ( rule__Amount__ValueAssignment ) ) ;
    public final void ruleAmount() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:166:2: ( ( ( rule__Amount__ValueAssignment ) ) )
            // InternalMyDSL.g:167:2: ( ( rule__Amount__ValueAssignment ) )
            {
            // InternalMyDSL.g:167:2: ( ( rule__Amount__ValueAssignment ) )
            // InternalMyDSL.g:168:3: ( rule__Amount__ValueAssignment )
            {
             before(grammarAccess.getAmountAccess().getValueAssignment()); 
            // InternalMyDSL.g:169:3: ( rule__Amount__ValueAssignment )
            // InternalMyDSL.g:169:4: rule__Amount__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Amount__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAmountAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleAmount"


    // $ANTLR start "entryRuleDuration"
    // InternalMyDSL.g:178:1: entryRuleDuration : ruleDuration EOF ;
    public final void entryRuleDuration() throws RecognitionException {
        try {
            // InternalMyDSL.g:179:1: ( ruleDuration EOF )
            // InternalMyDSL.g:180:1: ruleDuration EOF
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
    // InternalMyDSL.g:187:1: ruleDuration : ( ( rule__Duration__Group__0 ) ) ;
    public final void ruleDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:191:2: ( ( ( rule__Duration__Group__0 ) ) )
            // InternalMyDSL.g:192:2: ( ( rule__Duration__Group__0 ) )
            {
            // InternalMyDSL.g:192:2: ( ( rule__Duration__Group__0 ) )
            // InternalMyDSL.g:193:3: ( rule__Duration__Group__0 )
            {
             before(grammarAccess.getDurationAccess().getGroup()); 
            // InternalMyDSL.g:194:3: ( rule__Duration__Group__0 )
            // InternalMyDSL.g:194:4: rule__Duration__Group__0
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
    // InternalMyDSL.g:203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDSL.g:204:1: ( ruleEInt EOF )
            // InternalMyDSL.g:205:1: ruleEInt EOF
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
    // InternalMyDSL.g:212:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:216:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDSL.g:217:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDSL.g:217:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDSL.g:218:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDSL.g:219:3: ( rule__EInt__Group__0 )
            // InternalMyDSL.g:219:4: rule__EInt__Group__0
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


    // $ANTLR start "rule__Instruction__Alternatives"
    // InternalMyDSL.g:227:1: rule__Instruction__Alternatives : ( ( ruleMoveStraight ) | ( ruleTurn ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:231:1: ( ( ruleMoveStraight ) | ( ruleTurn ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDSL.g:232:2: ( ruleMoveStraight )
                    {
                    // InternalMyDSL.g:232:2: ( ruleMoveStraight )
                    // InternalMyDSL.g:233:3: ruleMoveStraight
                    {
                     before(grammarAccess.getInstructionAccess().getMoveStraightParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveStraight();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getMoveStraightParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDSL.g:238:2: ( ruleTurn )
                    {
                    // InternalMyDSL.g:238:2: ( ruleTurn )
                    // InternalMyDSL.g:239:3: ruleTurn
                    {
                     before(grammarAccess.getInstructionAccess().getTurnParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTurn();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getTurnParserRuleCall_1()); 

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


    // $ANTLR start "rule__Robot__Group__0"
    // InternalMyDSL.g:248:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:252:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalMyDSL.g:253:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
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
    // InternalMyDSL.g:260:1: rule__Robot__Group__0__Impl : ( () ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:264:1: ( ( () ) )
            // InternalMyDSL.g:265:1: ( () )
            {
            // InternalMyDSL.g:265:1: ( () )
            // InternalMyDSL.g:266:2: ()
            {
             before(grammarAccess.getRobotAccess().getRobotAction_0()); 
            // InternalMyDSL.g:267:2: ()
            // InternalMyDSL.g:267:3: 
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
    // InternalMyDSL.g:275:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:279:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalMyDSL.g:280:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
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
    // InternalMyDSL.g:287:1: rule__Robot__Group__1__Impl : ( 'Robot' ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:291:1: ( ( 'Robot' ) )
            // InternalMyDSL.g:292:1: ( 'Robot' )
            {
            // InternalMyDSL.g:292:1: ( 'Robot' )
            // InternalMyDSL.g:293:2: 'Robot'
            {
             before(grammarAccess.getRobotAccess().getRobotKeyword_1()); 
            match(input,11,FOLLOW_2); 
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
    // InternalMyDSL.g:302:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl rule__Robot__Group__3 ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:306:1: ( rule__Robot__Group__2__Impl rule__Robot__Group__3 )
            // InternalMyDSL.g:307:2: rule__Robot__Group__2__Impl rule__Robot__Group__3
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
    // InternalMyDSL.g:314:1: rule__Robot__Group__2__Impl : ( '{' ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:318:1: ( ( '{' ) )
            // InternalMyDSL.g:319:1: ( '{' )
            {
            // InternalMyDSL.g:319:1: ( '{' )
            // InternalMyDSL.g:320:2: '{'
            {
             before(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalMyDSL.g:329:1: rule__Robot__Group__3 : rule__Robot__Group__3__Impl rule__Robot__Group__4 ;
    public final void rule__Robot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:333:1: ( rule__Robot__Group__3__Impl rule__Robot__Group__4 )
            // InternalMyDSL.g:334:2: rule__Robot__Group__3__Impl rule__Robot__Group__4
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
    // InternalMyDSL.g:341:1: rule__Robot__Group__3__Impl : ( ( rule__Robot__Group_3__0 )? ) ;
    public final void rule__Robot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:345:1: ( ( ( rule__Robot__Group_3__0 )? ) )
            // InternalMyDSL.g:346:1: ( ( rule__Robot__Group_3__0 )? )
            {
            // InternalMyDSL.g:346:1: ( ( rule__Robot__Group_3__0 )? )
            // InternalMyDSL.g:347:2: ( rule__Robot__Group_3__0 )?
            {
             before(grammarAccess.getRobotAccess().getGroup_3()); 
            // InternalMyDSL.g:348:2: ( rule__Robot__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDSL.g:348:3: rule__Robot__Group_3__0
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
    // InternalMyDSL.g:356:1: rule__Robot__Group__4 : rule__Robot__Group__4__Impl ;
    public final void rule__Robot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:360:1: ( rule__Robot__Group__4__Impl )
            // InternalMyDSL.g:361:2: rule__Robot__Group__4__Impl
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
    // InternalMyDSL.g:367:1: rule__Robot__Group__4__Impl : ( '}' ) ;
    public final void rule__Robot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:371:1: ( ( '}' ) )
            // InternalMyDSL.g:372:1: ( '}' )
            {
            // InternalMyDSL.g:372:1: ( '}' )
            // InternalMyDSL.g:373:2: '}'
            {
             before(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalMyDSL.g:383:1: rule__Robot__Group_3__0 : rule__Robot__Group_3__0__Impl rule__Robot__Group_3__1 ;
    public final void rule__Robot__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:387:1: ( rule__Robot__Group_3__0__Impl rule__Robot__Group_3__1 )
            // InternalMyDSL.g:388:2: rule__Robot__Group_3__0__Impl rule__Robot__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDSL.g:395:1: rule__Robot__Group_3__0__Impl : ( 'instructions' ) ;
    public final void rule__Robot__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:399:1: ( ( 'instructions' ) )
            // InternalMyDSL.g:400:1: ( 'instructions' )
            {
            // InternalMyDSL.g:400:1: ( 'instructions' )
            // InternalMyDSL.g:401:2: 'instructions'
            {
             before(grammarAccess.getRobotAccess().getInstructionsKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getInstructionsKeyword_3_0()); 

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
    // InternalMyDSL.g:410:1: rule__Robot__Group_3__1 : rule__Robot__Group_3__1__Impl rule__Robot__Group_3__2 ;
    public final void rule__Robot__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:414:1: ( rule__Robot__Group_3__1__Impl rule__Robot__Group_3__2 )
            // InternalMyDSL.g:415:2: rule__Robot__Group_3__1__Impl rule__Robot__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__Robot__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_3__2();

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
    // InternalMyDSL.g:422:1: rule__Robot__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Robot__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:426:1: ( ( '{' ) )
            // InternalMyDSL.g:427:1: ( '{' )
            {
            // InternalMyDSL.g:427:1: ( '{' )
            // InternalMyDSL.g:428:2: '{'
            {
             before(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_3_1()); 

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


    // $ANTLR start "rule__Robot__Group_3__2"
    // InternalMyDSL.g:437:1: rule__Robot__Group_3__2 : rule__Robot__Group_3__2__Impl rule__Robot__Group_3__3 ;
    public final void rule__Robot__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:441:1: ( rule__Robot__Group_3__2__Impl rule__Robot__Group_3__3 )
            // InternalMyDSL.g:442:2: rule__Robot__Group_3__2__Impl rule__Robot__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__Robot__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_3__3();

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
    // $ANTLR end "rule__Robot__Group_3__2"


    // $ANTLR start "rule__Robot__Group_3__2__Impl"
    // InternalMyDSL.g:449:1: rule__Robot__Group_3__2__Impl : ( ( rule__Robot__InstructionsAssignment_3_2 ) ) ;
    public final void rule__Robot__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:453:1: ( ( ( rule__Robot__InstructionsAssignment_3_2 ) ) )
            // InternalMyDSL.g:454:1: ( ( rule__Robot__InstructionsAssignment_3_2 ) )
            {
            // InternalMyDSL.g:454:1: ( ( rule__Robot__InstructionsAssignment_3_2 ) )
            // InternalMyDSL.g:455:2: ( rule__Robot__InstructionsAssignment_3_2 )
            {
             before(grammarAccess.getRobotAccess().getInstructionsAssignment_3_2()); 
            // InternalMyDSL.g:456:2: ( rule__Robot__InstructionsAssignment_3_2 )
            // InternalMyDSL.g:456:3: rule__Robot__InstructionsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Robot__InstructionsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getInstructionsAssignment_3_2()); 

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
    // $ANTLR end "rule__Robot__Group_3__2__Impl"


    // $ANTLR start "rule__Robot__Group_3__3"
    // InternalMyDSL.g:464:1: rule__Robot__Group_3__3 : rule__Robot__Group_3__3__Impl rule__Robot__Group_3__4 ;
    public final void rule__Robot__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:468:1: ( rule__Robot__Group_3__3__Impl rule__Robot__Group_3__4 )
            // InternalMyDSL.g:469:2: rule__Robot__Group_3__3__Impl rule__Robot__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__Robot__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_3__4();

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
    // $ANTLR end "rule__Robot__Group_3__3"


    // $ANTLR start "rule__Robot__Group_3__3__Impl"
    // InternalMyDSL.g:476:1: rule__Robot__Group_3__3__Impl : ( ( rule__Robot__Group_3_3__0 )* ) ;
    public final void rule__Robot__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:480:1: ( ( ( rule__Robot__Group_3_3__0 )* ) )
            // InternalMyDSL.g:481:1: ( ( rule__Robot__Group_3_3__0 )* )
            {
            // InternalMyDSL.g:481:1: ( ( rule__Robot__Group_3_3__0 )* )
            // InternalMyDSL.g:482:2: ( rule__Robot__Group_3_3__0 )*
            {
             before(grammarAccess.getRobotAccess().getGroup_3_3()); 
            // InternalMyDSL.g:483:2: ( rule__Robot__Group_3_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDSL.g:483:3: rule__Robot__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Robot__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRobotAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__Robot__Group_3__3__Impl"


    // $ANTLR start "rule__Robot__Group_3__4"
    // InternalMyDSL.g:491:1: rule__Robot__Group_3__4 : rule__Robot__Group_3__4__Impl ;
    public final void rule__Robot__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:495:1: ( rule__Robot__Group_3__4__Impl )
            // InternalMyDSL.g:496:2: rule__Robot__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group_3__4__Impl();

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
    // $ANTLR end "rule__Robot__Group_3__4"


    // $ANTLR start "rule__Robot__Group_3__4__Impl"
    // InternalMyDSL.g:502:1: rule__Robot__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Robot__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:506:1: ( ( '}' ) )
            // InternalMyDSL.g:507:1: ( '}' )
            {
            // InternalMyDSL.g:507:1: ( '}' )
            // InternalMyDSL.g:508:2: '}'
            {
             before(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__Robot__Group_3__4__Impl"


    // $ANTLR start "rule__Robot__Group_3_3__0"
    // InternalMyDSL.g:518:1: rule__Robot__Group_3_3__0 : rule__Robot__Group_3_3__0__Impl rule__Robot__Group_3_3__1 ;
    public final void rule__Robot__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:522:1: ( rule__Robot__Group_3_3__0__Impl rule__Robot__Group_3_3__1 )
            // InternalMyDSL.g:523:2: rule__Robot__Group_3_3__0__Impl rule__Robot__Group_3_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Robot__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_3_3__1();

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
    // $ANTLR end "rule__Robot__Group_3_3__0"


    // $ANTLR start "rule__Robot__Group_3_3__0__Impl"
    // InternalMyDSL.g:530:1: rule__Robot__Group_3_3__0__Impl : ( '\\n' ) ;
    public final void rule__Robot__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:534:1: ( ( '\\n' ) )
            // InternalMyDSL.g:535:1: ( '\\n' )
            {
            // InternalMyDSL.g:535:1: ( '\\n' )
            // InternalMyDSL.g:536:2: '\\n'
            {
             before(grammarAccess.getRobotAccess().getLineFeedKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getLineFeedKeyword_3_3_0()); 

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
    // $ANTLR end "rule__Robot__Group_3_3__0__Impl"


    // $ANTLR start "rule__Robot__Group_3_3__1"
    // InternalMyDSL.g:545:1: rule__Robot__Group_3_3__1 : rule__Robot__Group_3_3__1__Impl ;
    public final void rule__Robot__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:549:1: ( rule__Robot__Group_3_3__1__Impl )
            // InternalMyDSL.g:550:2: rule__Robot__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Robot__Group_3_3__1"


    // $ANTLR start "rule__Robot__Group_3_3__1__Impl"
    // InternalMyDSL.g:556:1: rule__Robot__Group_3_3__1__Impl : ( ( rule__Robot__InstructionsAssignment_3_3_1 ) ) ;
    public final void rule__Robot__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:560:1: ( ( ( rule__Robot__InstructionsAssignment_3_3_1 ) ) )
            // InternalMyDSL.g:561:1: ( ( rule__Robot__InstructionsAssignment_3_3_1 ) )
            {
            // InternalMyDSL.g:561:1: ( ( rule__Robot__InstructionsAssignment_3_3_1 ) )
            // InternalMyDSL.g:562:2: ( rule__Robot__InstructionsAssignment_3_3_1 )
            {
             before(grammarAccess.getRobotAccess().getInstructionsAssignment_3_3_1()); 
            // InternalMyDSL.g:563:2: ( rule__Robot__InstructionsAssignment_3_3_1 )
            // InternalMyDSL.g:563:3: rule__Robot__InstructionsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Robot__InstructionsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getInstructionsAssignment_3_3_1()); 

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
    // $ANTLR end "rule__Robot__Group_3_3__1__Impl"


    // $ANTLR start "rule__MoveStraight__Group__0"
    // InternalMyDSL.g:572:1: rule__MoveStraight__Group__0 : rule__MoveStraight__Group__0__Impl rule__MoveStraight__Group__1 ;
    public final void rule__MoveStraight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:576:1: ( rule__MoveStraight__Group__0__Impl rule__MoveStraight__Group__1 )
            // InternalMyDSL.g:577:2: rule__MoveStraight__Group__0__Impl rule__MoveStraight__Group__1
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
    // InternalMyDSL.g:584:1: rule__MoveStraight__Group__0__Impl : ( 'MoveStraight:' ) ;
    public final void rule__MoveStraight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:588:1: ( ( 'MoveStraight:' ) )
            // InternalMyDSL.g:589:1: ( 'MoveStraight:' )
            {
            // InternalMyDSL.g:589:1: ( 'MoveStraight:' )
            // InternalMyDSL.g:590:2: 'MoveStraight:'
            {
             before(grammarAccess.getMoveStraightAccess().getMoveStraightKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDSL.g:599:1: rule__MoveStraight__Group__1 : rule__MoveStraight__Group__1__Impl rule__MoveStraight__Group__2 ;
    public final void rule__MoveStraight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:603:1: ( rule__MoveStraight__Group__1__Impl rule__MoveStraight__Group__2 )
            // InternalMyDSL.g:604:2: rule__MoveStraight__Group__1__Impl rule__MoveStraight__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDSL.g:611:1: rule__MoveStraight__Group__1__Impl : ( ( rule__MoveStraight__AmountAssignment_1 ) ) ;
    public final void rule__MoveStraight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:615:1: ( ( ( rule__MoveStraight__AmountAssignment_1 ) ) )
            // InternalMyDSL.g:616:1: ( ( rule__MoveStraight__AmountAssignment_1 ) )
            {
            // InternalMyDSL.g:616:1: ( ( rule__MoveStraight__AmountAssignment_1 ) )
            // InternalMyDSL.g:617:2: ( rule__MoveStraight__AmountAssignment_1 )
            {
             before(grammarAccess.getMoveStraightAccess().getAmountAssignment_1()); 
            // InternalMyDSL.g:618:2: ( rule__MoveStraight__AmountAssignment_1 )
            // InternalMyDSL.g:618:3: rule__MoveStraight__AmountAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveStraight__AmountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveStraightAccess().getAmountAssignment_1()); 

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
    // InternalMyDSL.g:626:1: rule__MoveStraight__Group__2 : rule__MoveStraight__Group__2__Impl ;
    public final void rule__MoveStraight__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:630:1: ( rule__MoveStraight__Group__2__Impl )
            // InternalMyDSL.g:631:2: rule__MoveStraight__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveStraight__Group__2__Impl();

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
    // InternalMyDSL.g:637:1: rule__MoveStraight__Group__2__Impl : ( ( rule__MoveStraight__DurationAssignment_2 )? ) ;
    public final void rule__MoveStraight__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:641:1: ( ( ( rule__MoveStraight__DurationAssignment_2 )? ) )
            // InternalMyDSL.g:642:1: ( ( rule__MoveStraight__DurationAssignment_2 )? )
            {
            // InternalMyDSL.g:642:1: ( ( rule__MoveStraight__DurationAssignment_2 )? )
            // InternalMyDSL.g:643:2: ( rule__MoveStraight__DurationAssignment_2 )?
            {
             before(grammarAccess.getMoveStraightAccess().getDurationAssignment_2()); 
            // InternalMyDSL.g:644:2: ( rule__MoveStraight__DurationAssignment_2 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDSL.g:644:3: rule__MoveStraight__DurationAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MoveStraight__DurationAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMoveStraightAccess().getDurationAssignment_2()); 

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


    // $ANTLR start "rule__Turn__Group__0"
    // InternalMyDSL.g:653:1: rule__Turn__Group__0 : rule__Turn__Group__0__Impl rule__Turn__Group__1 ;
    public final void rule__Turn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:657:1: ( rule__Turn__Group__0__Impl rule__Turn__Group__1 )
            // InternalMyDSL.g:658:2: rule__Turn__Group__0__Impl rule__Turn__Group__1
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
    // InternalMyDSL.g:665:1: rule__Turn__Group__0__Impl : ( 'Turn:' ) ;
    public final void rule__Turn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:669:1: ( ( 'Turn:' ) )
            // InternalMyDSL.g:670:1: ( 'Turn:' )
            {
            // InternalMyDSL.g:670:1: ( 'Turn:' )
            // InternalMyDSL.g:671:2: 'Turn:'
            {
             before(grammarAccess.getTurnAccess().getTurnKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDSL.g:680:1: rule__Turn__Group__1 : rule__Turn__Group__1__Impl rule__Turn__Group__2 ;
    public final void rule__Turn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:684:1: ( rule__Turn__Group__1__Impl rule__Turn__Group__2 )
            // InternalMyDSL.g:685:2: rule__Turn__Group__1__Impl rule__Turn__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDSL.g:692:1: rule__Turn__Group__1__Impl : ( ( rule__Turn__AmountAssignment_1 ) ) ;
    public final void rule__Turn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:696:1: ( ( ( rule__Turn__AmountAssignment_1 ) ) )
            // InternalMyDSL.g:697:1: ( ( rule__Turn__AmountAssignment_1 ) )
            {
            // InternalMyDSL.g:697:1: ( ( rule__Turn__AmountAssignment_1 ) )
            // InternalMyDSL.g:698:2: ( rule__Turn__AmountAssignment_1 )
            {
             before(grammarAccess.getTurnAccess().getAmountAssignment_1()); 
            // InternalMyDSL.g:699:2: ( rule__Turn__AmountAssignment_1 )
            // InternalMyDSL.g:699:3: rule__Turn__AmountAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Turn__AmountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTurnAccess().getAmountAssignment_1()); 

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
    // InternalMyDSL.g:707:1: rule__Turn__Group__2 : rule__Turn__Group__2__Impl ;
    public final void rule__Turn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:711:1: ( rule__Turn__Group__2__Impl )
            // InternalMyDSL.g:712:2: rule__Turn__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Turn__Group__2__Impl();

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
    // InternalMyDSL.g:718:1: rule__Turn__Group__2__Impl : ( ( rule__Turn__DurationAssignment_2 )? ) ;
    public final void rule__Turn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:722:1: ( ( ( rule__Turn__DurationAssignment_2 )? ) )
            // InternalMyDSL.g:723:1: ( ( rule__Turn__DurationAssignment_2 )? )
            {
            // InternalMyDSL.g:723:1: ( ( rule__Turn__DurationAssignment_2 )? )
            // InternalMyDSL.g:724:2: ( rule__Turn__DurationAssignment_2 )?
            {
             before(grammarAccess.getTurnAccess().getDurationAssignment_2()); 
            // InternalMyDSL.g:725:2: ( rule__Turn__DurationAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDSL.g:725:3: rule__Turn__DurationAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Turn__DurationAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTurnAccess().getDurationAssignment_2()); 

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


    // $ANTLR start "rule__Duration__Group__0"
    // InternalMyDSL.g:734:1: rule__Duration__Group__0 : rule__Duration__Group__0__Impl rule__Duration__Group__1 ;
    public final void rule__Duration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:738:1: ( rule__Duration__Group__0__Impl rule__Duration__Group__1 )
            // InternalMyDSL.g:739:2: rule__Duration__Group__0__Impl rule__Duration__Group__1
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
    // InternalMyDSL.g:746:1: rule__Duration__Group__0__Impl : ( 'for' ) ;
    public final void rule__Duration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:750:1: ( ( 'for' ) )
            // InternalMyDSL.g:751:1: ( 'for' )
            {
            // InternalMyDSL.g:751:1: ( 'for' )
            // InternalMyDSL.g:752:2: 'for'
            {
             before(grammarAccess.getDurationAccess().getForKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDurationAccess().getForKeyword_0()); 

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
    // InternalMyDSL.g:761:1: rule__Duration__Group__1 : rule__Duration__Group__1__Impl ;
    public final void rule__Duration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:765:1: ( rule__Duration__Group__1__Impl )
            // InternalMyDSL.g:766:2: rule__Duration__Group__1__Impl
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
    // InternalMyDSL.g:772:1: rule__Duration__Group__1__Impl : ( ( rule__Duration__ValueAssignment_1 ) ) ;
    public final void rule__Duration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:776:1: ( ( ( rule__Duration__ValueAssignment_1 ) ) )
            // InternalMyDSL.g:777:1: ( ( rule__Duration__ValueAssignment_1 ) )
            {
            // InternalMyDSL.g:777:1: ( ( rule__Duration__ValueAssignment_1 ) )
            // InternalMyDSL.g:778:2: ( rule__Duration__ValueAssignment_1 )
            {
             before(grammarAccess.getDurationAccess().getValueAssignment_1()); 
            // InternalMyDSL.g:779:2: ( rule__Duration__ValueAssignment_1 )
            // InternalMyDSL.g:779:3: rule__Duration__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Duration__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getValueAssignment_1()); 

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
    // InternalMyDSL.g:788:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:792:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDSL.g:793:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalMyDSL.g:800:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:804:1: ( ( ( '-' )? ) )
            // InternalMyDSL.g:805:1: ( ( '-' )? )
            {
            // InternalMyDSL.g:805:1: ( ( '-' )? )
            // InternalMyDSL.g:806:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDSL.g:807:2: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDSL.g:807:3: '-'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalMyDSL.g:815:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:819:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDSL.g:820:2: rule__EInt__Group__1__Impl
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
    // InternalMyDSL.g:826:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:830:1: ( ( RULE_INT ) )
            // InternalMyDSL.g:831:1: ( RULE_INT )
            {
            // InternalMyDSL.g:831:1: ( RULE_INT )
            // InternalMyDSL.g:832:2: RULE_INT
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


    // $ANTLR start "rule__Robot__InstructionsAssignment_3_2"
    // InternalMyDSL.g:842:1: rule__Robot__InstructionsAssignment_3_2 : ( ruleInstruction ) ;
    public final void rule__Robot__InstructionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:846:1: ( ( ruleInstruction ) )
            // InternalMyDSL.g:847:2: ( ruleInstruction )
            {
            // InternalMyDSL.g:847:2: ( ruleInstruction )
            // InternalMyDSL.g:848:3: ruleInstruction
            {
             before(grammarAccess.getRobotAccess().getInstructionsInstructionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getInstructionsInstructionParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Robot__InstructionsAssignment_3_2"


    // $ANTLR start "rule__Robot__InstructionsAssignment_3_3_1"
    // InternalMyDSL.g:857:1: rule__Robot__InstructionsAssignment_3_3_1 : ( ruleInstruction ) ;
    public final void rule__Robot__InstructionsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:861:1: ( ( ruleInstruction ) )
            // InternalMyDSL.g:862:2: ( ruleInstruction )
            {
            // InternalMyDSL.g:862:2: ( ruleInstruction )
            // InternalMyDSL.g:863:3: ruleInstruction
            {
             before(grammarAccess.getRobotAccess().getInstructionsInstructionParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getInstructionsInstructionParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__Robot__InstructionsAssignment_3_3_1"


    // $ANTLR start "rule__MoveStraight__AmountAssignment_1"
    // InternalMyDSL.g:872:1: rule__MoveStraight__AmountAssignment_1 : ( ruleAmount ) ;
    public final void rule__MoveStraight__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:876:1: ( ( ruleAmount ) )
            // InternalMyDSL.g:877:2: ( ruleAmount )
            {
            // InternalMyDSL.g:877:2: ( ruleAmount )
            // InternalMyDSL.g:878:3: ruleAmount
            {
             before(grammarAccess.getMoveStraightAccess().getAmountAmountParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAmount();

            state._fsp--;

             after(grammarAccess.getMoveStraightAccess().getAmountAmountParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MoveStraight__AmountAssignment_1"


    // $ANTLR start "rule__MoveStraight__DurationAssignment_2"
    // InternalMyDSL.g:887:1: rule__MoveStraight__DurationAssignment_2 : ( ruleDuration ) ;
    public final void rule__MoveStraight__DurationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:891:1: ( ( ruleDuration ) )
            // InternalMyDSL.g:892:2: ( ruleDuration )
            {
            // InternalMyDSL.g:892:2: ( ruleDuration )
            // InternalMyDSL.g:893:3: ruleDuration
            {
             before(grammarAccess.getMoveStraightAccess().getDurationDurationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getMoveStraightAccess().getDurationDurationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MoveStraight__DurationAssignment_2"


    // $ANTLR start "rule__Turn__AmountAssignment_1"
    // InternalMyDSL.g:902:1: rule__Turn__AmountAssignment_1 : ( ruleAmount ) ;
    public final void rule__Turn__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:906:1: ( ( ruleAmount ) )
            // InternalMyDSL.g:907:2: ( ruleAmount )
            {
            // InternalMyDSL.g:907:2: ( ruleAmount )
            // InternalMyDSL.g:908:3: ruleAmount
            {
             before(grammarAccess.getTurnAccess().getAmountAmountParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAmount();

            state._fsp--;

             after(grammarAccess.getTurnAccess().getAmountAmountParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Turn__AmountAssignment_1"


    // $ANTLR start "rule__Turn__DurationAssignment_2"
    // InternalMyDSL.g:917:1: rule__Turn__DurationAssignment_2 : ( ruleDuration ) ;
    public final void rule__Turn__DurationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:921:1: ( ( ruleDuration ) )
            // InternalMyDSL.g:922:2: ( ruleDuration )
            {
            // InternalMyDSL.g:922:2: ( ruleDuration )
            // InternalMyDSL.g:923:3: ruleDuration
            {
             before(grammarAccess.getTurnAccess().getDurationDurationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getTurnAccess().getDurationDurationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Turn__DurationAssignment_2"


    // $ANTLR start "rule__Amount__ValueAssignment"
    // InternalMyDSL.g:932:1: rule__Amount__ValueAssignment : ( ruleEInt ) ;
    public final void rule__Amount__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:936:1: ( ( ruleEInt ) )
            // InternalMyDSL.g:937:2: ( ruleEInt )
            {
            // InternalMyDSL.g:937:2: ( ruleEInt )
            // InternalMyDSL.g:938:3: ruleEInt
            {
             before(grammarAccess.getAmountAccess().getValueEIntParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAmountAccess().getValueEIntParserRuleCall_0()); 

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
    // $ANTLR end "rule__Amount__ValueAssignment"


    // $ANTLR start "rule__Duration__ValueAssignment_1"
    // InternalMyDSL.g:947:1: rule__Duration__ValueAssignment_1 : ( ruleEInt ) ;
    public final void rule__Duration__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:951:1: ( ( ruleEInt ) )
            // InternalMyDSL.g:952:2: ( ruleEInt )
            {
            // InternalMyDSL.g:952:2: ( ruleEInt )
            // InternalMyDSL.g:953:3: ruleEInt
            {
             before(grammarAccess.getDurationAccess().getValueEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDurationAccess().getValueEIntParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Duration__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});

}