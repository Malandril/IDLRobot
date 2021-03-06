package fr.unice.polytech.robotproject.xtextdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.unice.polytech.robotproject.xtextdsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'{'", "'}'", "'function'", "'if'", "'else'", "'release'", "'grab'", "'moveStraight'", "'in'", "'wait'", "'for'", "'turn'", "'home'", "'-'", "'call'", "'print'", "'detected'", "'is'", "'sensorActivated'", "'ms'", "'s'", "'cm'", "'deg'", "'ball'", "'nothing'", "'wall'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Robot";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRobot"
    // InternalMyDsl.g:65:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalMyDsl.g:65:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalMyDsl.g:66:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalMyDsl.g:72:1: ruleRobot returns [EObject current=null] : ( () otherlv_1= 'Robot' otherlv_2= '{' ( ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_instructions_3_0 = null;

        EObject lv_instructions_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( () otherlv_1= 'Robot' otherlv_2= '{' ( ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* )? otherlv_5= '}' ) )
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'Robot' otherlv_2= '{' ( ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'Robot' otherlv_2= '{' ( ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* )? otherlv_5= '}' )
            // InternalMyDsl.g:80:3: () otherlv_1= 'Robot' otherlv_2= '{' ( ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* )? otherlv_5= '}'
            {
            // InternalMyDsl.g:80:3: ()
            // InternalMyDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobotAccess().getRobotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotAccess().getRobotKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:95:3: ( ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=14 && LA2_0<=15)||(LA2_0>=17 && LA2_0<=19)||LA2_0==21||LA2_0==23||(LA2_0>=26 && LA2_0<=27)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:96:4: ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )*
                    {
                    // InternalMyDsl.g:96:4: ( (lv_instructions_3_0= ruleInstruction ) )
                    // InternalMyDsl.g:97:5: (lv_instructions_3_0= ruleInstruction )
                    {
                    // InternalMyDsl.g:97:5: (lv_instructions_3_0= ruleInstruction )
                    // InternalMyDsl.g:98:6: lv_instructions_3_0= ruleInstruction
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getInstructionsInstructionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_instructions_3_0=ruleInstruction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						add(
                    							current,
                    							"instructions",
                    							lv_instructions_3_0,
                    							"fr.unice.polytech.robotproject.xtextdsl.MyDsl.Instruction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:115:4: ( (lv_instructions_4_0= ruleInstruction ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=14 && LA1_0<=15)||(LA1_0>=17 && LA1_0<=19)||LA1_0==21||LA1_0==23||(LA1_0>=26 && LA1_0<=27)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:116:5: (lv_instructions_4_0= ruleInstruction )
                    	    {
                    	    // InternalMyDsl.g:116:5: (lv_instructions_4_0= ruleInstruction )
                    	    // InternalMyDsl.g:117:6: lv_instructions_4_0= ruleInstruction
                    	    {

                    	    						newCompositeNode(grammarAccess.getRobotAccess().getInstructionsInstructionParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_instructions_4_0=ruleInstruction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"instructions",
                    	    							lv_instructions_4_0,
                    	    							"fr.unice.polytech.robotproject.xtextdsl.MyDsl.Instruction");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleInstruction"
    // InternalMyDsl.g:143:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalMyDsl.g:143:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalMyDsl.g:144:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalMyDsl.g:150:1: ruleInstruction returns [EObject current=null] : (this_Print_0= rulePrint | this_TimedInstruction_1= ruleTimedInstruction | this_Grab_2= ruleGrab | this_Release_3= ruleRelease | this_Function_4= ruleFunction | this_Call_5= ruleCall | this_If_6= ruleIf ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Print_0 = null;

        EObject this_TimedInstruction_1 = null;

        EObject this_Grab_2 = null;

        EObject this_Release_3 = null;

        EObject this_Function_4 = null;

        EObject this_Call_5 = null;

        EObject this_If_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:156:2: ( (this_Print_0= rulePrint | this_TimedInstruction_1= ruleTimedInstruction | this_Grab_2= ruleGrab | this_Release_3= ruleRelease | this_Function_4= ruleFunction | this_Call_5= ruleCall | this_If_6= ruleIf ) )
            // InternalMyDsl.g:157:2: (this_Print_0= rulePrint | this_TimedInstruction_1= ruleTimedInstruction | this_Grab_2= ruleGrab | this_Release_3= ruleRelease | this_Function_4= ruleFunction | this_Call_5= ruleCall | this_If_6= ruleIf )
            {
            // InternalMyDsl.g:157:2: (this_Print_0= rulePrint | this_TimedInstruction_1= ruleTimedInstruction | this_Grab_2= ruleGrab | this_Release_3= ruleRelease | this_Function_4= ruleFunction | this_Call_5= ruleCall | this_If_6= ruleIf )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt3=1;
                }
                break;
            case 19:
            case 21:
            case 23:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            case 14:
                {
                alt3=5;
                }
                break;
            case 26:
                {
                alt3=6;
                }
                break;
            case 15:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:158:3: this_Print_0= rulePrint
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getPrintParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Print_0=rulePrint();

                    state._fsp--;


                    			current = this_Print_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:167:3: this_TimedInstruction_1= ruleTimedInstruction
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getTimedInstructionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimedInstruction_1=ruleTimedInstruction();

                    state._fsp--;


                    			current = this_TimedInstruction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:176:3: this_Grab_2= ruleGrab
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getGrabParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Grab_2=ruleGrab();

                    state._fsp--;


                    			current = this_Grab_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:185:3: this_Release_3= ruleRelease
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getReleaseParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Release_3=ruleRelease();

                    state._fsp--;


                    			current = this_Release_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:194:3: this_Function_4= ruleFunction
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getFunctionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Function_4=ruleFunction();

                    state._fsp--;


                    			current = this_Function_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:203:3: this_Call_5= ruleCall
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCallParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Call_5=ruleCall();

                    state._fsp--;


                    			current = this_Call_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:212:3: this_If_6= ruleIf
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getIfParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_If_6=ruleIf();

                    state._fsp--;


                    			current = this_If_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleInstructionBlock"
    // InternalMyDsl.g:224:1: entryRuleInstructionBlock returns [EObject current=null] : iv_ruleInstructionBlock= ruleInstructionBlock EOF ;
    public final EObject entryRuleInstructionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructionBlock = null;


        try {
            // InternalMyDsl.g:224:57: (iv_ruleInstructionBlock= ruleInstructionBlock EOF )
            // InternalMyDsl.g:225:2: iv_ruleInstructionBlock= ruleInstructionBlock EOF
            {
             newCompositeNode(grammarAccess.getInstructionBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstructionBlock=ruleInstructionBlock();

            state._fsp--;

             current =iv_ruleInstructionBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstructionBlock"


    // $ANTLR start "ruleInstructionBlock"
    // InternalMyDsl.g:231:1: ruleInstructionBlock returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_instructions_2_0= ruleInstruction ) ) ( (lv_instructions_3_0= ruleInstruction ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleInstructionBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_instructions_2_0 = null;

        EObject lv_instructions_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:237:2: ( ( () otherlv_1= '{' ( ( (lv_instructions_2_0= ruleInstruction ) ) ( (lv_instructions_3_0= ruleInstruction ) )* )? otherlv_4= '}' ) )
            // InternalMyDsl.g:238:2: ( () otherlv_1= '{' ( ( (lv_instructions_2_0= ruleInstruction ) ) ( (lv_instructions_3_0= ruleInstruction ) )* )? otherlv_4= '}' )
            {
            // InternalMyDsl.g:238:2: ( () otherlv_1= '{' ( ( (lv_instructions_2_0= ruleInstruction ) ) ( (lv_instructions_3_0= ruleInstruction ) )* )? otherlv_4= '}' )
            // InternalMyDsl.g:239:3: () otherlv_1= '{' ( ( (lv_instructions_2_0= ruleInstruction ) ) ( (lv_instructions_3_0= ruleInstruction ) )* )? otherlv_4= '}'
            {
            // InternalMyDsl.g:239:3: ()
            // InternalMyDsl.g:240:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInstructionBlockAccess().getInstructionBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getInstructionBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:250:3: ( ( (lv_instructions_2_0= ruleInstruction ) ) ( (lv_instructions_3_0= ruleInstruction ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=14 && LA5_0<=15)||(LA5_0>=17 && LA5_0<=19)||LA5_0==21||LA5_0==23||(LA5_0>=26 && LA5_0<=27)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:251:4: ( (lv_instructions_2_0= ruleInstruction ) ) ( (lv_instructions_3_0= ruleInstruction ) )*
                    {
                    // InternalMyDsl.g:251:4: ( (lv_instructions_2_0= ruleInstruction ) )
                    // InternalMyDsl.g:252:5: (lv_instructions_2_0= ruleInstruction )
                    {
                    // InternalMyDsl.g:252:5: (lv_instructions_2_0= ruleInstruction )
                    // InternalMyDsl.g:253:6: lv_instructions_2_0= ruleInstruction
                    {

                    						newCompositeNode(grammarAccess.getInstructionBlockAccess().getInstructionsInstructionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_instructions_2_0=ruleInstruction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstructionBlockRule());
                    						}
                    						add(
                    							current,
                    							"instructions",
                    							lv_instructions_2_0,
                    							"fr.unice.polytech.robotproject.xtextdsl.MyDsl.Instruction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:270:4: ( (lv_instructions_3_0= ruleInstruction ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=14 && LA4_0<=15)||(LA4_0>=17 && LA4_0<=19)||LA4_0==21||LA4_0==23||(LA4_0>=26 && LA4_0<=27)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:271:5: (lv_instructions_3_0= ruleInstruction )
                    	    {
                    	    // InternalMyDsl.g:271:5: (lv_instructions_3_0= ruleInstruction )
                    	    // InternalMyDsl.g:272:6: lv_instructions_3_0= ruleInstruction
                    	    {

                    	    						newCompositeNode(grammarAccess.getInstructionBlockAccess().getInstructionsInstructionParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_instructions_3_0=ruleInstruction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getInstructionBlockRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"instructions",
                    	    							lv_instructions_3_0,
                    	    							"fr.unice.polytech.robotproject.xtextdsl.MyDsl.Instruction");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInstructionBlockAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstructionBlock"


    // $ANTLR start "entryRuleFunction"
    // InternalMyDsl.g:298:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalMyDsl.g:298:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalMyDsl.g:299:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalMyDsl.g:305:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= ruleEString ) ) ( (lv_instructionBlock_2_0= ruleInstructionBlock ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_instructionBlock_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:311:2: ( (otherlv_0= 'function' ( (lv_name_1_0= ruleEString ) ) ( (lv_instructionBlock_2_0= ruleInstructionBlock ) ) ) )
            // InternalMyDsl.g:312:2: (otherlv_0= 'function' ( (lv_name_1_0= ruleEString ) ) ( (lv_instructionBlock_2_0= ruleInstructionBlock ) ) )
            {
            // InternalMyDsl.g:312:2: (otherlv_0= 'function' ( (lv_name_1_0= ruleEString ) ) ( (lv_instructionBlock_2_0= ruleInstructionBlock ) ) )
            // InternalMyDsl.g:313:3: otherlv_0= 'function' ( (lv_name_1_0= ruleEString ) ) ( (lv_instructionBlock_2_0= ruleInstructionBlock ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalMyDsl.g:317:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:318:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:318:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:319:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:336:3: ( (lv_instructionBlock_2_0= ruleInstructionBlock ) )
            // InternalMyDsl.g:337:4: (lv_instructionBlock_2_0= ruleInstructionBlock )
            {
            // InternalMyDsl.g:337:4: (lv_instructionBlock_2_0= ruleInstructionBlock )
            // InternalMyDsl.g:338:5: lv_instructionBlock_2_0= ruleInstructionBlock
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getInstructionBlockInstructionBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_instructionBlock_2_0=ruleInstructionBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"instructionBlock",
            						lv_instructionBlock_2_0,
            						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.InstructionBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleIf"
    // InternalMyDsl.g:359:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalMyDsl.g:359:43: (iv_ruleIf= ruleIf EOF )
            // InternalMyDsl.g:360:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalMyDsl.g:366:1: ruleIf returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleCondition ) )? ( (lv_trueBlock_3_0= ruleInstructionBlock ) ) (otherlv_4= 'else' ( (lv_falseBlock_5_0= ruleInstructionBlock ) ) )? ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_condition_2_0 = null;

        EObject lv_trueBlock_3_0 = null;

        EObject lv_falseBlock_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:372:2: ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleCondition ) )? ( (lv_trueBlock_3_0= ruleInstructionBlock ) ) (otherlv_4= 'else' ( (lv_falseBlock_5_0= ruleInstructionBlock ) ) )? ) )
            // InternalMyDsl.g:373:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleCondition ) )? ( (lv_trueBlock_3_0= ruleInstructionBlock ) ) (otherlv_4= 'else' ( (lv_falseBlock_5_0= ruleInstructionBlock ) ) )? )
            {
            // InternalMyDsl.g:373:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleCondition ) )? ( (lv_trueBlock_3_0= ruleInstructionBlock ) ) (otherlv_4= 'else' ( (lv_falseBlock_5_0= ruleInstructionBlock ) ) )? )
            // InternalMyDsl.g:374:3: () otherlv_1= 'if' ( (lv_condition_2_0= ruleCondition ) )? ( (lv_trueBlock_3_0= ruleInstructionBlock ) ) (otherlv_4= 'else' ( (lv_falseBlock_5_0= ruleInstructionBlock ) ) )?
            {
            // InternalMyDsl.g:374:3: ()
            // InternalMyDsl.g:375:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfAccess().getIfAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getIfKeyword_1());
            		
            // InternalMyDsl.g:385:3: ( (lv_condition_2_0= ruleCondition ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28||LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:386:4: (lv_condition_2_0= ruleCondition )
                    {
                    // InternalMyDsl.g:386:4: (lv_condition_2_0= ruleCondition )
                    // InternalMyDsl.g:387:5: lv_condition_2_0= ruleCondition
                    {

                    					newCompositeNode(grammarAccess.getIfAccess().getConditionConditionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_condition_2_0=ruleCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIfRule());
                    					}
                    					set(
                    						current,
                    						"condition",
                    						lv_condition_2_0,
                    						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.Condition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:404:3: ( (lv_trueBlock_3_0= ruleInstructionBlock ) )
            // InternalMyDsl.g:405:4: (lv_trueBlock_3_0= ruleInstructionBlock )
            {
            // InternalMyDsl.g:405:4: (lv_trueBlock_3_0= ruleInstructionBlock )
            // InternalMyDsl.g:406:5: lv_trueBlock_3_0= ruleInstructionBlock
            {

            					newCompositeNode(grammarAccess.getIfAccess().getTrueBlockInstructionBlockParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_trueBlock_3_0=ruleInstructionBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"trueBlock",
            						lv_trueBlock_3_0,
            						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.InstructionBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:423:3: (otherlv_4= 'else' ( (lv_falseBlock_5_0= ruleInstructionBlock ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:424:4: otherlv_4= 'else' ( (lv_falseBlock_5_0= ruleInstructionBlock ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getIfAccess().getElseKeyword_4_0());
                    			
                    // InternalMyDsl.g:428:4: ( (lv_falseBlock_5_0= ruleInstructionBlock ) )
                    // InternalMyDsl.g:429:5: (lv_falseBlock_5_0= ruleInstructionBlock )
                    {
                    // InternalMyDsl.g:429:5: (lv_falseBlock_5_0= ruleInstructionBlock )
                    // InternalMyDsl.g:430:6: lv_falseBlock_5_0= ruleInstructionBlock
                    {

                    						newCompositeNode(grammarAccess.getIfAccess().getFalseBlockInstructionBlockParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_falseBlock_5_0=ruleInstructionBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfRule());
                    						}
                    						set(
                    							current,
                    							"falseBlock",
                    							lv_falseBlock_5_0,
                    							"fr.unice.polytech.robotproject.xtextdsl.MyDsl.InstructionBlock");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleRelease"
    // InternalMyDsl.g:452:1: entryRuleRelease returns [EObject current=null] : iv_ruleRelease= ruleRelease EOF ;
    public final EObject entryRuleRelease() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelease = null;


        try {
            // InternalMyDsl.g:452:48: (iv_ruleRelease= ruleRelease EOF )
            // InternalMyDsl.g:453:2: iv_ruleRelease= ruleRelease EOF
            {
             newCompositeNode(grammarAccess.getReleaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelease=ruleRelease();

            state._fsp--;

             current =iv_ruleRelease; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelease"


    // $ANTLR start "ruleRelease"
    // InternalMyDsl.g:459:1: ruleRelease returns [EObject current=null] : ( () otherlv_1= 'release' ) ;
    public final EObject ruleRelease() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:465:2: ( ( () otherlv_1= 'release' ) )
            // InternalMyDsl.g:466:2: ( () otherlv_1= 'release' )
            {
            // InternalMyDsl.g:466:2: ( () otherlv_1= 'release' )
            // InternalMyDsl.g:467:3: () otherlv_1= 'release'
            {
            // InternalMyDsl.g:467:3: ()
            // InternalMyDsl.g:468:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReleaseAccess().getReleaseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getReleaseAccess().getReleaseKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelease"


    // $ANTLR start "entryRuleGrab"
    // InternalMyDsl.g:482:1: entryRuleGrab returns [EObject current=null] : iv_ruleGrab= ruleGrab EOF ;
    public final EObject entryRuleGrab() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrab = null;


        try {
            // InternalMyDsl.g:482:45: (iv_ruleGrab= ruleGrab EOF )
            // InternalMyDsl.g:483:2: iv_ruleGrab= ruleGrab EOF
            {
             newCompositeNode(grammarAccess.getGrabRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrab=ruleGrab();

            state._fsp--;

             current =iv_ruleGrab; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrab"


    // $ANTLR start "ruleGrab"
    // InternalMyDsl.g:489:1: ruleGrab returns [EObject current=null] : ( () otherlv_1= 'grab' ) ;
    public final EObject ruleGrab() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:495:2: ( ( () otherlv_1= 'grab' ) )
            // InternalMyDsl.g:496:2: ( () otherlv_1= 'grab' )
            {
            // InternalMyDsl.g:496:2: ( () otherlv_1= 'grab' )
            // InternalMyDsl.g:497:3: () otherlv_1= 'grab'
            {
            // InternalMyDsl.g:497:3: ()
            // InternalMyDsl.g:498:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGrabAccess().getGrabAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGrabAccess().getGrabKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrab"


    // $ANTLR start "entryRuleTimedInstruction"
    // InternalMyDsl.g:512:1: entryRuleTimedInstruction returns [EObject current=null] : iv_ruleTimedInstruction= ruleTimedInstruction EOF ;
    public final EObject entryRuleTimedInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimedInstruction = null;


        try {
            // InternalMyDsl.g:512:57: (iv_ruleTimedInstruction= ruleTimedInstruction EOF )
            // InternalMyDsl.g:513:2: iv_ruleTimedInstruction= ruleTimedInstruction EOF
            {
             newCompositeNode(grammarAccess.getTimedInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimedInstruction=ruleTimedInstruction();

            state._fsp--;

             current =iv_ruleTimedInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimedInstruction"


    // $ANTLR start "ruleTimedInstruction"
    // InternalMyDsl.g:519:1: ruleTimedInstruction returns [EObject current=null] : (this_MoveStraight_0= ruleMoveStraight | this_Turn_1= ruleTurn | this_Wait_2= ruleWait ) ;
    public final EObject ruleTimedInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_MoveStraight_0 = null;

        EObject this_Turn_1 = null;

        EObject this_Wait_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:525:2: ( (this_MoveStraight_0= ruleMoveStraight | this_Turn_1= ruleTurn | this_Wait_2= ruleWait ) )
            // InternalMyDsl.g:526:2: (this_MoveStraight_0= ruleMoveStraight | this_Turn_1= ruleTurn | this_Wait_2= ruleWait )
            {
            // InternalMyDsl.g:526:2: (this_MoveStraight_0= ruleMoveStraight | this_Turn_1= ruleTurn | this_Wait_2= ruleWait )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:527:3: this_MoveStraight_0= ruleMoveStraight
                    {

                    			newCompositeNode(grammarAccess.getTimedInstructionAccess().getMoveStraightParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveStraight_0=ruleMoveStraight();

                    state._fsp--;


                    			current = this_MoveStraight_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:536:3: this_Turn_1= ruleTurn
                    {

                    			newCompositeNode(grammarAccess.getTimedInstructionAccess().getTurnParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Turn_1=ruleTurn();

                    state._fsp--;


                    			current = this_Turn_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:545:3: this_Wait_2= ruleWait
                    {

                    			newCompositeNode(grammarAccess.getTimedInstructionAccess().getWaitParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Wait_2=ruleWait();

                    state._fsp--;


                    			current = this_Wait_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimedInstruction"


    // $ANTLR start "entryRuleMoveStraight"
    // InternalMyDsl.g:557:1: entryRuleMoveStraight returns [EObject current=null] : iv_ruleMoveStraight= ruleMoveStraight EOF ;
    public final EObject entryRuleMoveStraight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveStraight = null;


        try {
            // InternalMyDsl.g:557:53: (iv_ruleMoveStraight= ruleMoveStraight EOF )
            // InternalMyDsl.g:558:2: iv_ruleMoveStraight= ruleMoveStraight EOF
            {
             newCompositeNode(grammarAccess.getMoveStraightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveStraight=ruleMoveStraight();

            state._fsp--;

             current =iv_ruleMoveStraight; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMoveStraight"


    // $ANTLR start "ruleMoveStraight"
    // InternalMyDsl.g:564:1: ruleMoveStraight returns [EObject current=null] : (otherlv_0= 'moveStraight' ( (lv_distance_1_0= ruleDistance ) ) otherlv_2= 'in' ( (lv_duration_3_0= ruleDuration ) )? ) ;
    public final EObject ruleMoveStraight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_distance_1_0 = null;

        EObject lv_duration_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:570:2: ( (otherlv_0= 'moveStraight' ( (lv_distance_1_0= ruleDistance ) ) otherlv_2= 'in' ( (lv_duration_3_0= ruleDuration ) )? ) )
            // InternalMyDsl.g:571:2: (otherlv_0= 'moveStraight' ( (lv_distance_1_0= ruleDistance ) ) otherlv_2= 'in' ( (lv_duration_3_0= ruleDuration ) )? )
            {
            // InternalMyDsl.g:571:2: (otherlv_0= 'moveStraight' ( (lv_distance_1_0= ruleDistance ) ) otherlv_2= 'in' ( (lv_duration_3_0= ruleDuration ) )? )
            // InternalMyDsl.g:572:3: otherlv_0= 'moveStraight' ( (lv_distance_1_0= ruleDistance ) ) otherlv_2= 'in' ( (lv_duration_3_0= ruleDuration ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveStraightAccess().getMoveStraightKeyword_0());
            		
            // InternalMyDsl.g:576:3: ( (lv_distance_1_0= ruleDistance ) )
            // InternalMyDsl.g:577:4: (lv_distance_1_0= ruleDistance )
            {
            // InternalMyDsl.g:577:4: (lv_distance_1_0= ruleDistance )
            // InternalMyDsl.g:578:5: lv_distance_1_0= ruleDistance
            {

            					newCompositeNode(grammarAccess.getMoveStraightAccess().getDistanceDistanceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_distance_1_0=ruleDistance();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveStraightRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_1_0,
            						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.Distance");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getMoveStraightAccess().getInKeyword_2());
            		
            // InternalMyDsl.g:599:3: ( (lv_duration_3_0= ruleDuration ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:600:4: (lv_duration_3_0= ruleDuration )
                    {
                    // InternalMyDsl.g:600:4: (lv_duration_3_0= ruleDuration )
                    // InternalMyDsl.g:601:5: lv_duration_3_0= ruleDuration
                    {

                    					newCompositeNode(grammarAccess.getMoveStraightAccess().getDurationDurationParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_duration_3_0=ruleDuration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMoveStraightRule());
                    					}
                    					set(
                    						current,
                    						"duration",
                    						lv_duration_3_0,
                    						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.Duration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMoveStraight"


    // $ANTLR start "entryRuleWait"
    // InternalMyDsl.g:622:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalMyDsl.g:622:45: (iv_ruleWait= ruleWait EOF )
            // InternalMyDsl.g:623:2: iv_ruleWait= ruleWait EOF
            {
             newCompositeNode(grammarAccess.getWaitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWait=ruleWait();

            state._fsp--;

             current =iv_ruleWait; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWait"


    // $ANTLR start "ruleWait"
    // InternalMyDsl.g:629:1: ruleWait returns [EObject current=null] : ( () otherlv_1= 'wait' otherlv_2= 'for' ( (lv_duration_3_0= ruleDuration ) )? ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_duration_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:635:2: ( ( () otherlv_1= 'wait' otherlv_2= 'for' ( (lv_duration_3_0= ruleDuration ) )? ) )
            // InternalMyDsl.g:636:2: ( () otherlv_1= 'wait' otherlv_2= 'for' ( (lv_duration_3_0= ruleDuration ) )? )
            {
            // InternalMyDsl.g:636:2: ( () otherlv_1= 'wait' otherlv_2= 'for' ( (lv_duration_3_0= ruleDuration ) )? )
            // InternalMyDsl.g:637:3: () otherlv_1= 'wait' otherlv_2= 'for' ( (lv_duration_3_0= ruleDuration ) )?
            {
            // InternalMyDsl.g:637:3: ()
            // InternalMyDsl.g:638:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWaitAccess().getWaitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getWaitAccess().getWaitKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getWaitAccess().getForKeyword_2());
            		
            // InternalMyDsl.g:652:3: ( (lv_duration_3_0= ruleDuration ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT||LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:653:4: (lv_duration_3_0= ruleDuration )
                    {
                    // InternalMyDsl.g:653:4: (lv_duration_3_0= ruleDuration )
                    // InternalMyDsl.g:654:5: lv_duration_3_0= ruleDuration
                    {

                    					newCompositeNode(grammarAccess.getWaitAccess().getDurationDurationParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_duration_3_0=ruleDuration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWaitRule());
                    					}
                    					set(
                    						current,
                    						"duration",
                    						lv_duration_3_0,
                    						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.Duration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWait"


    // $ANTLR start "entryRuleTurn"
    // InternalMyDsl.g:675:1: entryRuleTurn returns [EObject current=null] : iv_ruleTurn= ruleTurn EOF ;
    public final EObject entryRuleTurn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurn = null;


        try {
            // InternalMyDsl.g:675:45: (iv_ruleTurn= ruleTurn EOF )
            // InternalMyDsl.g:676:2: iv_ruleTurn= ruleTurn EOF
            {
             newCompositeNode(grammarAccess.getTurnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurn=ruleTurn();

            state._fsp--;

             current =iv_ruleTurn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTurn"


    // $ANTLR start "ruleTurn"
    // InternalMyDsl.g:682:1: ruleTurn returns [EObject current=null] : (otherlv_0= 'turn' ( (lv_angle_1_0= ruleAngle ) ) otherlv_2= 'in' ( (lv_duration_3_0= ruleDuration ) )? ) ;
    public final EObject ruleTurn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_angle_1_0 = null;

        EObject lv_duration_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:688:2: ( (otherlv_0= 'turn' ( (lv_angle_1_0= ruleAngle ) ) otherlv_2= 'in' ( (lv_duration_3_0= ruleDuration ) )? ) )
            // InternalMyDsl.g:689:2: (otherlv_0= 'turn' ( (lv_angle_1_0= ruleAngle ) ) otherlv_2= 'in' ( (lv_duration_3_0= ruleDuration ) )? )
            {
            // InternalMyDsl.g:689:2: (otherlv_0= 'turn' ( (lv_angle_1_0= ruleAngle ) ) otherlv_2= 'in' ( (lv_duration_3_0= ruleDuration ) )? )
            // InternalMyDsl.g:690:3: otherlv_0= 'turn' ( (lv_angle_1_0= ruleAngle ) ) otherlv_2= 'in' ( (lv_duration_3_0= ruleDuration ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnAccess().getTurnKeyword_0());
            		
            // InternalMyDsl.g:694:3: ( (lv_angle_1_0= ruleAngle ) )
            // InternalMyDsl.g:695:4: (lv_angle_1_0= ruleAngle )
            {
            // InternalMyDsl.g:695:4: (lv_angle_1_0= ruleAngle )
            // InternalMyDsl.g:696:5: lv_angle_1_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getTurnAccess().getAngleAngleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_angle_1_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurnRule());
            					}
            					set(
            						current,
            						"angle",
            						lv_angle_1_0,
            						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getTurnAccess().getInKeyword_2());
            		
            // InternalMyDsl.g:717:3: ( (lv_duration_3_0= ruleDuration ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT||LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:718:4: (lv_duration_3_0= ruleDuration )
                    {
                    // InternalMyDsl.g:718:4: (lv_duration_3_0= ruleDuration )
                    // InternalMyDsl.g:719:5: lv_duration_3_0= ruleDuration
                    {

                    					newCompositeNode(grammarAccess.getTurnAccess().getDurationDurationParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_duration_3_0=ruleDuration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTurnRule());
                    					}
                    					set(
                    						current,
                    						"duration",
                    						lv_duration_3_0,
                    						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.Duration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurn"


    // $ANTLR start "entryRuleDistance"
    // InternalMyDsl.g:740:1: entryRuleDistance returns [EObject current=null] : iv_ruleDistance= ruleDistance EOF ;
    public final EObject entryRuleDistance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistance = null;


        try {
            // InternalMyDsl.g:740:49: (iv_ruleDistance= ruleDistance EOF )
            // InternalMyDsl.g:741:2: iv_ruleDistance= ruleDistance EOF
            {
             newCompositeNode(grammarAccess.getDistanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDistance=ruleDistance();

            state._fsp--;

             current =iv_ruleDistance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDistance"


    // $ANTLR start "ruleDistance"
    // InternalMyDsl.g:747:1: ruleDistance returns [EObject current=null] : ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_distanceUnit_1_0= ruleDistanceUnit ) ) ) ;
    public final EObject ruleDistance() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        Enumerator lv_distanceUnit_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:753:2: ( ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_distanceUnit_1_0= ruleDistanceUnit ) ) ) )
            // InternalMyDsl.g:754:2: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_distanceUnit_1_0= ruleDistanceUnit ) ) )
            {
            // InternalMyDsl.g:754:2: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_distanceUnit_1_0= ruleDistanceUnit ) ) )
            // InternalMyDsl.g:755:3: ( (lv_value_0_0= ruleEInt ) ) ( (lv_distanceUnit_1_0= ruleDistanceUnit ) )
            {
            // InternalMyDsl.g:755:3: ( (lv_value_0_0= ruleEInt ) )
            // InternalMyDsl.g:756:4: (lv_value_0_0= ruleEInt )
            {
            // InternalMyDsl.g:756:4: (lv_value_0_0= ruleEInt )
            // InternalMyDsl.g:757:5: lv_value_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDistanceAccess().getValueEIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_value_0_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDistanceRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_0_0,
            						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:774:3: ( (lv_distanceUnit_1_0= ruleDistanceUnit ) )
            // InternalMyDsl.g:775:4: (lv_distanceUnit_1_0= ruleDistanceUnit )
            {
            // InternalMyDsl.g:775:4: (lv_distanceUnit_1_0= ruleDistanceUnit )
            // InternalMyDsl.g:776:5: lv_distanceUnit_1_0= ruleDistanceUnit
            {

            					newCompositeNode(grammarAccess.getDistanceAccess().getDistanceUnitDistanceUnitEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_distanceUnit_1_0=ruleDistanceUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDistanceRule());
            					}
            					set(
            						current,
            						"distanceUnit",
            						lv_distanceUnit_1_0,
            						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.DistanceUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDistance"


    // $ANTLR start "entryRuleAngle"
    // InternalMyDsl.g:797:1: entryRuleAngle returns [EObject current=null] : iv_ruleAngle= ruleAngle EOF ;
    public final EObject entryRuleAngle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngle = null;


        try {
            // InternalMyDsl.g:797:46: (iv_ruleAngle= ruleAngle EOF )
            // InternalMyDsl.g:798:2: iv_ruleAngle= ruleAngle EOF
            {
             newCompositeNode(grammarAccess.getAngleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAngle=ruleAngle();

            state._fsp--;

             current =iv_ruleAngle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAngle"


    // $ANTLR start "ruleAngle"
    // InternalMyDsl.g:804:1: ruleAngle returns [EObject current=null] : ( ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_angleUnit_1_0= ruleAngleUnit ) )? ) | this_HomeDirection_2= ruleHomeDirection ) ;
    public final EObject ruleAngle() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        Enumerator lv_angleUnit_1_0 = null;

        EObject this_HomeDirection_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:810:2: ( ( ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_angleUnit_1_0= ruleAngleUnit ) )? ) | this_HomeDirection_2= ruleHomeDirection ) )
            // InternalMyDsl.g:811:2: ( ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_angleUnit_1_0= ruleAngleUnit ) )? ) | this_HomeDirection_2= ruleHomeDirection )
            {
            // InternalMyDsl.g:811:2: ( ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_angleUnit_1_0= ruleAngleUnit ) )? ) | this_HomeDirection_2= ruleHomeDirection )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT||LA13_0==25) ) {
                alt13=1;
            }
            else if ( (LA13_0==24) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:812:3: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_angleUnit_1_0= ruleAngleUnit ) )? )
                    {
                    // InternalMyDsl.g:812:3: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_angleUnit_1_0= ruleAngleUnit ) )? )
                    // InternalMyDsl.g:813:4: ( (lv_value_0_0= ruleEInt ) ) ( (lv_angleUnit_1_0= ruleAngleUnit ) )?
                    {
                    // InternalMyDsl.g:813:4: ( (lv_value_0_0= ruleEInt ) )
                    // InternalMyDsl.g:814:5: (lv_value_0_0= ruleEInt )
                    {
                    // InternalMyDsl.g:814:5: (lv_value_0_0= ruleEInt )
                    // InternalMyDsl.g:815:6: lv_value_0_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAngleAccess().getValueEIntParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_value_0_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAngleRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_0_0,
                    							"fr.unice.polytech.robotproject.xtextdsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:832:4: ( (lv_angleUnit_1_0= ruleAngleUnit ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==34) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMyDsl.g:833:5: (lv_angleUnit_1_0= ruleAngleUnit )
                            {
                            // InternalMyDsl.g:833:5: (lv_angleUnit_1_0= ruleAngleUnit )
                            // InternalMyDsl.g:834:6: lv_angleUnit_1_0= ruleAngleUnit
                            {

                            						newCompositeNode(grammarAccess.getAngleAccess().getAngleUnitAngleUnitEnumRuleCall_0_1_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_angleUnit_1_0=ruleAngleUnit();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getAngleRule());
                            						}
                            						set(
                            							current,
                            							"angleUnit",
                            							lv_angleUnit_1_0,
                            							"fr.unice.polytech.robotproject.xtextdsl.MyDsl.AngleUnit");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:853:3: this_HomeDirection_2= ruleHomeDirection
                    {

                    			newCompositeNode(grammarAccess.getAngleAccess().getHomeDirectionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_HomeDirection_2=ruleHomeDirection();

                    state._fsp--;


                    			current = this_HomeDirection_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAngle"


    // $ANTLR start "entryRuleHomeDirection"
    // InternalMyDsl.g:865:1: entryRuleHomeDirection returns [EObject current=null] : iv_ruleHomeDirection= ruleHomeDirection EOF ;
    public final EObject entryRuleHomeDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHomeDirection = null;


        try {
            // InternalMyDsl.g:865:54: (iv_ruleHomeDirection= ruleHomeDirection EOF )
            // InternalMyDsl.g:866:2: iv_ruleHomeDirection= ruleHomeDirection EOF
            {
             newCompositeNode(grammarAccess.getHomeDirectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHomeDirection=ruleHomeDirection();

            state._fsp--;

             current =iv_ruleHomeDirection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHomeDirection"


    // $ANTLR start "ruleHomeDirection"
    // InternalMyDsl.g:872:1: ruleHomeDirection returns [EObject current=null] : ( () otherlv_1= 'home' ) ;
    public final EObject ruleHomeDirection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:878:2: ( ( () otherlv_1= 'home' ) )
            // InternalMyDsl.g:879:2: ( () otherlv_1= 'home' )
            {
            // InternalMyDsl.g:879:2: ( () otherlv_1= 'home' )
            // InternalMyDsl.g:880:3: () otherlv_1= 'home'
            {
            // InternalMyDsl.g:880:3: ()
            // InternalMyDsl.g:881:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHomeDirectionAccess().getHomeDirectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getHomeDirectionAccess().getHomeKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHomeDirection"


    // $ANTLR start "entryRuleDuration"
    // InternalMyDsl.g:895:1: entryRuleDuration returns [EObject current=null] : iv_ruleDuration= ruleDuration EOF ;
    public final EObject entryRuleDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuration = null;


        try {
            // InternalMyDsl.g:895:49: (iv_ruleDuration= ruleDuration EOF )
            // InternalMyDsl.g:896:2: iv_ruleDuration= ruleDuration EOF
            {
             newCompositeNode(grammarAccess.getDurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDuration=ruleDuration();

            state._fsp--;

             current =iv_ruleDuration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // InternalMyDsl.g:902:1: ruleDuration returns [EObject current=null] : ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleDuration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        Enumerator lv_timeUnit_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:908:2: ( ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnit ) ) ) )
            // InternalMyDsl.g:909:2: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnit ) ) )
            {
            // InternalMyDsl.g:909:2: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnit ) ) )
            // InternalMyDsl.g:910:3: ( (lv_value_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnit ) )
            {
            // InternalMyDsl.g:910:3: ( (lv_value_0_0= ruleEInt ) )
            // InternalMyDsl.g:911:4: (lv_value_0_0= ruleEInt )
            {
            // InternalMyDsl.g:911:4: (lv_value_0_0= ruleEInt )
            // InternalMyDsl.g:912:5: lv_value_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDurationAccess().getValueEIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_value_0_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDurationRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_0_0,
            						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:929:3: ( (lv_timeUnit_1_0= ruleTimeUnit ) )
            // InternalMyDsl.g:930:4: (lv_timeUnit_1_0= ruleTimeUnit )
            {
            // InternalMyDsl.g:930:4: (lv_timeUnit_1_0= ruleTimeUnit )
            // InternalMyDsl.g:931:5: lv_timeUnit_1_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getDurationAccess().getTimeUnitTimeUnitEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_timeUnit_1_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDurationRule());
            					}
            					set(
            						current,
            						"timeUnit",
            						lv_timeUnit_1_0,
            						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.TimeUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:952:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:952:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:953:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:959:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:965:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:966:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:966:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:967:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:967:3: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:968:4: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_16); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleCall"
    // InternalMyDsl.g:985:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalMyDsl.g:985:45: (iv_ruleCall= ruleCall EOF )
            // InternalMyDsl.g:986:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // InternalMyDsl.g:992:1: ruleCall returns [EObject current=null] : (otherlv_0= 'call' ( ( ruleEString ) ) ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:998:2: ( (otherlv_0= 'call' ( ( ruleEString ) ) ) )
            // InternalMyDsl.g:999:2: (otherlv_0= 'call' ( ( ruleEString ) ) )
            {
            // InternalMyDsl.g:999:2: (otherlv_0= 'call' ( ( ruleEString ) ) )
            // InternalMyDsl.g:1000:3: otherlv_0= 'call' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCallAccess().getCallKeyword_0());
            		
            // InternalMyDsl.g:1004:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1005:4: ( ruleEString )
            {
            // InternalMyDsl.g:1005:4: ( ruleEString )
            // InternalMyDsl.g:1006:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCallAccess().getDestinationFunctionCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRulePrint"
    // InternalMyDsl.g:1024:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalMyDsl.g:1024:46: (iv_rulePrint= rulePrint EOF )
            // InternalMyDsl.g:1025:2: iv_rulePrint= rulePrint EOF
            {
             newCompositeNode(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrint=rulePrint();

            state._fsp--;

             current =iv_rulePrint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalMyDsl.g:1031:1: rulePrint returns [EObject current=null] : ( () otherlv_1= 'print' ( (lv_string_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_string_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1037:2: ( ( () otherlv_1= 'print' ( (lv_string_2_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:1038:2: ( () otherlv_1= 'print' ( (lv_string_2_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:1038:2: ( () otherlv_1= 'print' ( (lv_string_2_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1039:3: () otherlv_1= 'print' ( (lv_string_2_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:1039:3: ()
            // InternalMyDsl.g:1040:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrintAccess().getPrintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintAccess().getPrintKeyword_1());
            		
            // InternalMyDsl.g:1050:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalMyDsl.g:1051:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:1051:4: (lv_string_2_0= RULE_STRING )
            // InternalMyDsl.g:1052:5: lv_string_2_0= RULE_STRING
            {
            lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_string_2_0, grammarAccess.getPrintAccess().getStringSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"string",
            						lv_string_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:1072:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:1072:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:1073:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyDsl.g:1079:1: ruleCondition returns [EObject current=null] : (this_SensorActivation_0= ruleSensorActivation | this_DetectedObjectIs_1= ruleDetectedObjectIs ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_SensorActivation_0 = null;

        EObject this_DetectedObjectIs_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1085:2: ( (this_SensorActivation_0= ruleSensorActivation | this_DetectedObjectIs_1= ruleDetectedObjectIs ) )
            // InternalMyDsl.g:1086:2: (this_SensorActivation_0= ruleSensorActivation | this_DetectedObjectIs_1= ruleDetectedObjectIs )
            {
            // InternalMyDsl.g:1086:2: (this_SensorActivation_0= ruleSensorActivation | this_DetectedObjectIs_1= ruleDetectedObjectIs )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            else if ( (LA15_0==28) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1087:3: this_SensorActivation_0= ruleSensorActivation
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getSensorActivationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SensorActivation_0=ruleSensorActivation();

                    state._fsp--;


                    			current = this_SensorActivation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1096:3: this_DetectedObjectIs_1= ruleDetectedObjectIs
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getDetectedObjectIsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DetectedObjectIs_1=ruleDetectedObjectIs();

                    state._fsp--;


                    			current = this_DetectedObjectIs_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleDetectedObjectIs"
    // InternalMyDsl.g:1108:1: entryRuleDetectedObjectIs returns [EObject current=null] : iv_ruleDetectedObjectIs= ruleDetectedObjectIs EOF ;
    public final EObject entryRuleDetectedObjectIs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetectedObjectIs = null;


        try {
            // InternalMyDsl.g:1108:57: (iv_ruleDetectedObjectIs= ruleDetectedObjectIs EOF )
            // InternalMyDsl.g:1109:2: iv_ruleDetectedObjectIs= ruleDetectedObjectIs EOF
            {
             newCompositeNode(grammarAccess.getDetectedObjectIsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDetectedObjectIs=ruleDetectedObjectIs();

            state._fsp--;

             current =iv_ruleDetectedObjectIs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDetectedObjectIs"


    // $ANTLR start "ruleDetectedObjectIs"
    // InternalMyDsl.g:1115:1: ruleDetectedObjectIs returns [EObject current=null] : (otherlv_0= 'detected' otherlv_1= 'is' ( (lv_rightOperand_2_0= ruleDetectedType ) ) ) ;
    public final EObject ruleDetectedObjectIs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_rightOperand_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1121:2: ( (otherlv_0= 'detected' otherlv_1= 'is' ( (lv_rightOperand_2_0= ruleDetectedType ) ) ) )
            // InternalMyDsl.g:1122:2: (otherlv_0= 'detected' otherlv_1= 'is' ( (lv_rightOperand_2_0= ruleDetectedType ) ) )
            {
            // InternalMyDsl.g:1122:2: (otherlv_0= 'detected' otherlv_1= 'is' ( (lv_rightOperand_2_0= ruleDetectedType ) ) )
            // InternalMyDsl.g:1123:3: otherlv_0= 'detected' otherlv_1= 'is' ( (lv_rightOperand_2_0= ruleDetectedType ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getDetectedObjectIsAccess().getDetectedKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getDetectedObjectIsAccess().getIsKeyword_1());
            		
            // InternalMyDsl.g:1131:3: ( (lv_rightOperand_2_0= ruleDetectedType ) )
            // InternalMyDsl.g:1132:4: (lv_rightOperand_2_0= ruleDetectedType )
            {
            // InternalMyDsl.g:1132:4: (lv_rightOperand_2_0= ruleDetectedType )
            // InternalMyDsl.g:1133:5: lv_rightOperand_2_0= ruleDetectedType
            {

            					newCompositeNode(grammarAccess.getDetectedObjectIsAccess().getRightOperandDetectedTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_rightOperand_2_0=ruleDetectedType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDetectedObjectIsRule());
            					}
            					set(
            						current,
            						"rightOperand",
            						lv_rightOperand_2_0,
            						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.DetectedType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDetectedObjectIs"


    // $ANTLR start "entryRuleSensorActivation"
    // InternalMyDsl.g:1154:1: entryRuleSensorActivation returns [EObject current=null] : iv_ruleSensorActivation= ruleSensorActivation EOF ;
    public final EObject entryRuleSensorActivation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorActivation = null;


        try {
            // InternalMyDsl.g:1154:57: (iv_ruleSensorActivation= ruleSensorActivation EOF )
            // InternalMyDsl.g:1155:2: iv_ruleSensorActivation= ruleSensorActivation EOF
            {
             newCompositeNode(grammarAccess.getSensorActivationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorActivation=ruleSensorActivation();

            state._fsp--;

             current =iv_ruleSensorActivation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorActivation"


    // $ANTLR start "ruleSensorActivation"
    // InternalMyDsl.g:1161:1: ruleSensorActivation returns [EObject current=null] : ( () otherlv_1= 'sensorActivated' ) ;
    public final EObject ruleSensorActivation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1167:2: ( ( () otherlv_1= 'sensorActivated' ) )
            // InternalMyDsl.g:1168:2: ( () otherlv_1= 'sensorActivated' )
            {
            // InternalMyDsl.g:1168:2: ( () otherlv_1= 'sensorActivated' )
            // InternalMyDsl.g:1169:3: () otherlv_1= 'sensorActivated'
            {
            // InternalMyDsl.g:1169:3: ()
            // InternalMyDsl.g:1170:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorActivationAccess().getSensorActivationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorActivationAccess().getSensorActivatedKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorActivation"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:1184:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:1184:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:1185:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:1191:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1197:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:1198:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:1198:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1199:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1207:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleTimeUnit"
    // InternalMyDsl.g:1218:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1224:2: ( ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) ) )
            // InternalMyDsl.g:1225:2: ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) )
            {
            // InternalMyDsl.g:1225:2: ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            else if ( (LA17_0==32) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1226:3: (enumLiteral_0= 'ms' )
                    {
                    // InternalMyDsl.g:1226:3: (enumLiteral_0= 'ms' )
                    // InternalMyDsl.g:1227:4: enumLiteral_0= 'ms'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1234:3: (enumLiteral_1= 's' )
                    {
                    // InternalMyDsl.g:1234:3: (enumLiteral_1= 's' )
                    // InternalMyDsl.g:1235:4: enumLiteral_1= 's'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getSECONDSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getSECONDSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "ruleDistanceUnit"
    // InternalMyDsl.g:1245:1: ruleDistanceUnit returns [Enumerator current=null] : (enumLiteral_0= 'cm' ) ;
    public final Enumerator ruleDistanceUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1251:2: ( (enumLiteral_0= 'cm' ) )
            // InternalMyDsl.g:1252:2: (enumLiteral_0= 'cm' )
            {
            // InternalMyDsl.g:1252:2: (enumLiteral_0= 'cm' )
            // InternalMyDsl.g:1253:3: enumLiteral_0= 'cm'
            {
            enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

            			current = grammarAccess.getDistanceUnitAccess().getCENTIMETERSEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getDistanceUnitAccess().getCENTIMETERSEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDistanceUnit"


    // $ANTLR start "ruleAngleUnit"
    // InternalMyDsl.g:1262:1: ruleAngleUnit returns [Enumerator current=null] : (enumLiteral_0= 'deg' ) ;
    public final Enumerator ruleAngleUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1268:2: ( (enumLiteral_0= 'deg' ) )
            // InternalMyDsl.g:1269:2: (enumLiteral_0= 'deg' )
            {
            // InternalMyDsl.g:1269:2: (enumLiteral_0= 'deg' )
            // InternalMyDsl.g:1270:3: enumLiteral_0= 'deg'
            {
            enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

            			current = grammarAccess.getAngleUnitAccess().getDEGREESEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getAngleUnitAccess().getDEGREESEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAngleUnit"


    // $ANTLR start "ruleDetectedType"
    // InternalMyDsl.g:1279:1: ruleDetectedType returns [Enumerator current=null] : ( (enumLiteral_0= 'ball' ) | (enumLiteral_1= 'nothing' ) | (enumLiteral_2= 'wall' ) ) ;
    public final Enumerator ruleDetectedType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1285:2: ( ( (enumLiteral_0= 'ball' ) | (enumLiteral_1= 'nothing' ) | (enumLiteral_2= 'wall' ) ) )
            // InternalMyDsl.g:1286:2: ( (enumLiteral_0= 'ball' ) | (enumLiteral_1= 'nothing' ) | (enumLiteral_2= 'wall' ) )
            {
            // InternalMyDsl.g:1286:2: ( (enumLiteral_0= 'ball' ) | (enumLiteral_1= 'nothing' ) | (enumLiteral_2= 'wall' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt18=1;
                }
                break;
            case 36:
                {
                alt18=2;
                }
                break;
            case 37:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1287:3: (enumLiteral_0= 'ball' )
                    {
                    // InternalMyDsl.g:1287:3: (enumLiteral_0= 'ball' )
                    // InternalMyDsl.g:1288:4: enumLiteral_0= 'ball'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getDetectedTypeAccess().getBALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDetectedTypeAccess().getBALLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1295:3: (enumLiteral_1= 'nothing' )
                    {
                    // InternalMyDsl.g:1295:3: (enumLiteral_1= 'nothing' )
                    // InternalMyDsl.g:1296:4: enumLiteral_1= 'nothing'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getDetectedTypeAccess().getNULLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDetectedTypeAccess().getNULLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1303:3: (enumLiteral_2= 'wall' )
                    {
                    // InternalMyDsl.g:1303:3: (enumLiteral_2= 'wall' )
                    // InternalMyDsl.g:1304:4: enumLiteral_2= 'wall'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getDetectedTypeAccess().getWALLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDetectedTypeAccess().getWALLEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDetectedType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000CAEE000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000050001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000003800000000L});

}