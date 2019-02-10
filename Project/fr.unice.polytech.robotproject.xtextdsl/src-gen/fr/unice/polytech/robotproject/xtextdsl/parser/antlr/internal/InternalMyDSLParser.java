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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'{'", "'}'", "'Release'", "'Grab'", "'MoveStraight'", "'in'", "'Wait'", "'for'", "'Turn'", "'-'", "'NamedBlock'", "'GoTo'", "'if'", "'SensorActivated'", "'ms'", "'s'", "'cm'", "'deg'"
    };
    public static final int RULE_STRING=5;
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

            if ( ((LA2_0>=14 && LA2_0<=16)||LA2_0==18||LA2_0==20||(LA2_0>=22 && LA2_0<=23)) ) {
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

                        if ( ((LA1_0>=14 && LA1_0<=16)||LA1_0==18||LA1_0==20||(LA1_0>=22 && LA1_0<=23)) ) {
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
    // InternalMyDsl.g:150:1: ruleInstruction returns [EObject current=null] : (this_TimedInstruction_0= ruleTimedInstruction | this_Grab_1= ruleGrab | this_Release_2= ruleRelease | this_NamedBlock_3= ruleNamedBlock | this_GoTo_4= ruleGoTo ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_TimedInstruction_0 = null;

        EObject this_Grab_1 = null;

        EObject this_Release_2 = null;

        EObject this_NamedBlock_3 = null;

        EObject this_GoTo_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:156:2: ( (this_TimedInstruction_0= ruleTimedInstruction | this_Grab_1= ruleGrab | this_Release_2= ruleRelease | this_NamedBlock_3= ruleNamedBlock | this_GoTo_4= ruleGoTo ) )
            // InternalMyDsl.g:157:2: (this_TimedInstruction_0= ruleTimedInstruction | this_Grab_1= ruleGrab | this_Release_2= ruleRelease | this_NamedBlock_3= ruleNamedBlock | this_GoTo_4= ruleGoTo )
            {
            // InternalMyDsl.g:157:2: (this_TimedInstruction_0= ruleTimedInstruction | this_Grab_1= ruleGrab | this_Release_2= ruleRelease | this_NamedBlock_3= ruleNamedBlock | this_GoTo_4= ruleGoTo )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 16:
            case 18:
            case 20:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 22:
                {
                alt3=4;
                }
                break;
            case 23:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:158:3: this_TimedInstruction_0= ruleTimedInstruction
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getTimedInstructionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimedInstruction_0=ruleTimedInstruction();

                    state._fsp--;


                    			current = this_TimedInstruction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:167:3: this_Grab_1= ruleGrab
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getGrabParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Grab_1=ruleGrab();

                    state._fsp--;


                    			current = this_Grab_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:176:3: this_Release_2= ruleRelease
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getReleaseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Release_2=ruleRelease();

                    state._fsp--;


                    			current = this_Release_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:185:3: this_NamedBlock_3= ruleNamedBlock
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getNamedBlockParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_NamedBlock_3=ruleNamedBlock();

                    state._fsp--;


                    			current = this_NamedBlock_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:194:3: this_GoTo_4= ruleGoTo
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getGoToParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_GoTo_4=ruleGoTo();

                    state._fsp--;


                    			current = this_GoTo_4;
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


    // $ANTLR start "entryRuleRelease"
    // InternalMyDsl.g:206:1: entryRuleRelease returns [EObject current=null] : iv_ruleRelease= ruleRelease EOF ;
    public final EObject entryRuleRelease() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelease = null;


        try {
            // InternalMyDsl.g:206:48: (iv_ruleRelease= ruleRelease EOF )
            // InternalMyDsl.g:207:2: iv_ruleRelease= ruleRelease EOF
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
    // InternalMyDsl.g:213:1: ruleRelease returns [EObject current=null] : ( () otherlv_1= 'Release' ) ;
    public final EObject ruleRelease() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:219:2: ( ( () otherlv_1= 'Release' ) )
            // InternalMyDsl.g:220:2: ( () otherlv_1= 'Release' )
            {
            // InternalMyDsl.g:220:2: ( () otherlv_1= 'Release' )
            // InternalMyDsl.g:221:3: () otherlv_1= 'Release'
            {
            // InternalMyDsl.g:221:3: ()
            // InternalMyDsl.g:222:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReleaseAccess().getReleaseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_2); 

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
    // InternalMyDsl.g:236:1: entryRuleGrab returns [EObject current=null] : iv_ruleGrab= ruleGrab EOF ;
    public final EObject entryRuleGrab() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrab = null;


        try {
            // InternalMyDsl.g:236:45: (iv_ruleGrab= ruleGrab EOF )
            // InternalMyDsl.g:237:2: iv_ruleGrab= ruleGrab EOF
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
    // InternalMyDsl.g:243:1: ruleGrab returns [EObject current=null] : ( () otherlv_1= 'Grab' ) ;
    public final EObject ruleGrab() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:249:2: ( ( () otherlv_1= 'Grab' ) )
            // InternalMyDsl.g:250:2: ( () otherlv_1= 'Grab' )
            {
            // InternalMyDsl.g:250:2: ( () otherlv_1= 'Grab' )
            // InternalMyDsl.g:251:3: () otherlv_1= 'Grab'
            {
            // InternalMyDsl.g:251:3: ()
            // InternalMyDsl.g:252:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGrabAccess().getGrabAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_2); 

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
    // InternalMyDsl.g:266:1: entryRuleTimedInstruction returns [EObject current=null] : iv_ruleTimedInstruction= ruleTimedInstruction EOF ;
    public final EObject entryRuleTimedInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimedInstruction = null;


        try {
            // InternalMyDsl.g:266:57: (iv_ruleTimedInstruction= ruleTimedInstruction EOF )
            // InternalMyDsl.g:267:2: iv_ruleTimedInstruction= ruleTimedInstruction EOF
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
    // InternalMyDsl.g:273:1: ruleTimedInstruction returns [EObject current=null] : (this_MoveStraight_0= ruleMoveStraight | this_Turn_1= ruleTurn | this_Wait_2= ruleWait ) ;
    public final EObject ruleTimedInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_MoveStraight_0 = null;

        EObject this_Turn_1 = null;

        EObject this_Wait_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:279:2: ( (this_MoveStraight_0= ruleMoveStraight | this_Turn_1= ruleTurn | this_Wait_2= ruleWait ) )
            // InternalMyDsl.g:280:2: (this_MoveStraight_0= ruleMoveStraight | this_Turn_1= ruleTurn | this_Wait_2= ruleWait )
            {
            // InternalMyDsl.g:280:2: (this_MoveStraight_0= ruleMoveStraight | this_Turn_1= ruleTurn | this_Wait_2= ruleWait )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:281:3: this_MoveStraight_0= ruleMoveStraight
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
                    // InternalMyDsl.g:290:3: this_Turn_1= ruleTurn
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
                    // InternalMyDsl.g:299:3: this_Wait_2= ruleWait
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
    // InternalMyDsl.g:311:1: entryRuleMoveStraight returns [EObject current=null] : iv_ruleMoveStraight= ruleMoveStraight EOF ;
    public final EObject entryRuleMoveStraight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveStraight = null;


        try {
            // InternalMyDsl.g:311:53: (iv_ruleMoveStraight= ruleMoveStraight EOF )
            // InternalMyDsl.g:312:2: iv_ruleMoveStraight= ruleMoveStraight EOF
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
    // InternalMyDsl.g:318:1: ruleMoveStraight returns [EObject current=null] : (otherlv_0= 'MoveStraight' ( (lv_distance_1_0= ruleDistance ) ) otherlv_2= 'in' ( (lv_duration_3_0= ruleDuration ) )? ) ;
    public final EObject ruleMoveStraight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_distance_1_0 = null;

        EObject lv_duration_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:324:2: ( (otherlv_0= 'MoveStraight' ( (lv_distance_1_0= ruleDistance ) ) otherlv_2= 'in' ( (lv_duration_3_0= ruleDuration ) )? ) )
            // InternalMyDsl.g:325:2: (otherlv_0= 'MoveStraight' ( (lv_distance_1_0= ruleDistance ) ) otherlv_2= 'in' ( (lv_duration_3_0= ruleDuration ) )? )
            {
            // InternalMyDsl.g:325:2: (otherlv_0= 'MoveStraight' ( (lv_distance_1_0= ruleDistance ) ) otherlv_2= 'in' ( (lv_duration_3_0= ruleDuration ) )? )
            // InternalMyDsl.g:326:3: otherlv_0= 'MoveStraight' ( (lv_distance_1_0= ruleDistance ) ) otherlv_2= 'in' ( (lv_duration_3_0= ruleDuration ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveStraightAccess().getMoveStraightKeyword_0());
            		
            // InternalMyDsl.g:330:3: ( (lv_distance_1_0= ruleDistance ) )
            // InternalMyDsl.g:331:4: (lv_distance_1_0= ruleDistance )
            {
            // InternalMyDsl.g:331:4: (lv_distance_1_0= ruleDistance )
            // InternalMyDsl.g:332:5: lv_distance_1_0= ruleDistance
            {

            					newCompositeNode(grammarAccess.getMoveStraightAccess().getDistanceDistanceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_2=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMoveStraightAccess().getInKeyword_2());
            		
            // InternalMyDsl.g:353:3: ( (lv_duration_3_0= ruleDuration ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT||LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:354:4: (lv_duration_3_0= ruleDuration )
                    {
                    // InternalMyDsl.g:354:4: (lv_duration_3_0= ruleDuration )
                    // InternalMyDsl.g:355:5: lv_duration_3_0= ruleDuration
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
    // InternalMyDsl.g:376:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalMyDsl.g:376:45: (iv_ruleWait= ruleWait EOF )
            // InternalMyDsl.g:377:2: iv_ruleWait= ruleWait EOF
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
    // InternalMyDsl.g:383:1: ruleWait returns [EObject current=null] : ( () otherlv_1= 'Wait' otherlv_2= 'for' ( (lv_duration_3_0= ruleDuration ) )? ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_duration_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:389:2: ( ( () otherlv_1= 'Wait' otherlv_2= 'for' ( (lv_duration_3_0= ruleDuration ) )? ) )
            // InternalMyDsl.g:390:2: ( () otherlv_1= 'Wait' otherlv_2= 'for' ( (lv_duration_3_0= ruleDuration ) )? )
            {
            // InternalMyDsl.g:390:2: ( () otherlv_1= 'Wait' otherlv_2= 'for' ( (lv_duration_3_0= ruleDuration ) )? )
            // InternalMyDsl.g:391:3: () otherlv_1= 'Wait' otherlv_2= 'for' ( (lv_duration_3_0= ruleDuration ) )?
            {
            // InternalMyDsl.g:391:3: ()
            // InternalMyDsl.g:392:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWaitAccess().getWaitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getWaitAccess().getWaitKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getWaitAccess().getForKeyword_2());
            		
            // InternalMyDsl.g:406:3: ( (lv_duration_3_0= ruleDuration ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT||LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:407:4: (lv_duration_3_0= ruleDuration )
                    {
                    // InternalMyDsl.g:407:4: (lv_duration_3_0= ruleDuration )
                    // InternalMyDsl.g:408:5: lv_duration_3_0= ruleDuration
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
    // InternalMyDsl.g:429:1: entryRuleTurn returns [EObject current=null] : iv_ruleTurn= ruleTurn EOF ;
    public final EObject entryRuleTurn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurn = null;


        try {
            // InternalMyDsl.g:429:45: (iv_ruleTurn= ruleTurn EOF )
            // InternalMyDsl.g:430:2: iv_ruleTurn= ruleTurn EOF
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
    // InternalMyDsl.g:436:1: ruleTurn returns [EObject current=null] : (otherlv_0= 'Turn' ( (lv_angle_1_0= ruleAngle ) ) otherlv_2= 'in' ( (lv_duration_3_0= ruleDuration ) )? ) ;
    public final EObject ruleTurn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_angle_1_0 = null;

        EObject lv_duration_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:442:2: ( (otherlv_0= 'Turn' ( (lv_angle_1_0= ruleAngle ) ) otherlv_2= 'in' ( (lv_duration_3_0= ruleDuration ) )? ) )
            // InternalMyDsl.g:443:2: (otherlv_0= 'Turn' ( (lv_angle_1_0= ruleAngle ) ) otherlv_2= 'in' ( (lv_duration_3_0= ruleDuration ) )? )
            {
            // InternalMyDsl.g:443:2: (otherlv_0= 'Turn' ( (lv_angle_1_0= ruleAngle ) ) otherlv_2= 'in' ( (lv_duration_3_0= ruleDuration ) )? )
            // InternalMyDsl.g:444:3: otherlv_0= 'Turn' ( (lv_angle_1_0= ruleAngle ) ) otherlv_2= 'in' ( (lv_duration_3_0= ruleDuration ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnAccess().getTurnKeyword_0());
            		
            // InternalMyDsl.g:448:3: ( (lv_angle_1_0= ruleAngle ) )
            // InternalMyDsl.g:449:4: (lv_angle_1_0= ruleAngle )
            {
            // InternalMyDsl.g:449:4: (lv_angle_1_0= ruleAngle )
            // InternalMyDsl.g:450:5: lv_angle_1_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getTurnAccess().getAngleAngleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_2=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getTurnAccess().getInKeyword_2());
            		
            // InternalMyDsl.g:471:3: ( (lv_duration_3_0= ruleDuration ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT||LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:472:4: (lv_duration_3_0= ruleDuration )
                    {
                    // InternalMyDsl.g:472:4: (lv_duration_3_0= ruleDuration )
                    // InternalMyDsl.g:473:5: lv_duration_3_0= ruleDuration
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
    // InternalMyDsl.g:494:1: entryRuleDistance returns [EObject current=null] : iv_ruleDistance= ruleDistance EOF ;
    public final EObject entryRuleDistance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistance = null;


        try {
            // InternalMyDsl.g:494:49: (iv_ruleDistance= ruleDistance EOF )
            // InternalMyDsl.g:495:2: iv_ruleDistance= ruleDistance EOF
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
    // InternalMyDsl.g:501:1: ruleDistance returns [EObject current=null] : ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_distanceUnit_1_0= ruleDistanceUnit ) ) ) ;
    public final EObject ruleDistance() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        Enumerator lv_distanceUnit_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:507:2: ( ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_distanceUnit_1_0= ruleDistanceUnit ) ) ) )
            // InternalMyDsl.g:508:2: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_distanceUnit_1_0= ruleDistanceUnit ) ) )
            {
            // InternalMyDsl.g:508:2: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_distanceUnit_1_0= ruleDistanceUnit ) ) )
            // InternalMyDsl.g:509:3: ( (lv_value_0_0= ruleEInt ) ) ( (lv_distanceUnit_1_0= ruleDistanceUnit ) )
            {
            // InternalMyDsl.g:509:3: ( (lv_value_0_0= ruleEInt ) )
            // InternalMyDsl.g:510:4: (lv_value_0_0= ruleEInt )
            {
            // InternalMyDsl.g:510:4: (lv_value_0_0= ruleEInt )
            // InternalMyDsl.g:511:5: lv_value_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDistanceAccess().getValueEIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalMyDsl.g:528:3: ( (lv_distanceUnit_1_0= ruleDistanceUnit ) )
            // InternalMyDsl.g:529:4: (lv_distanceUnit_1_0= ruleDistanceUnit )
            {
            // InternalMyDsl.g:529:4: (lv_distanceUnit_1_0= ruleDistanceUnit )
            // InternalMyDsl.g:530:5: lv_distanceUnit_1_0= ruleDistanceUnit
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
    // InternalMyDsl.g:551:1: entryRuleAngle returns [EObject current=null] : iv_ruleAngle= ruleAngle EOF ;
    public final EObject entryRuleAngle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngle = null;


        try {
            // InternalMyDsl.g:551:46: (iv_ruleAngle= ruleAngle EOF )
            // InternalMyDsl.g:552:2: iv_ruleAngle= ruleAngle EOF
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
    // InternalMyDsl.g:558:1: ruleAngle returns [EObject current=null] : ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_angleUnit_1_0= ruleAngleUnit ) )? ) ;
    public final EObject ruleAngle() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        Enumerator lv_angleUnit_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:564:2: ( ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_angleUnit_1_0= ruleAngleUnit ) )? ) )
            // InternalMyDsl.g:565:2: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_angleUnit_1_0= ruleAngleUnit ) )? )
            {
            // InternalMyDsl.g:565:2: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_angleUnit_1_0= ruleAngleUnit ) )? )
            // InternalMyDsl.g:566:3: ( (lv_value_0_0= ruleEInt ) ) ( (lv_angleUnit_1_0= ruleAngleUnit ) )?
            {
            // InternalMyDsl.g:566:3: ( (lv_value_0_0= ruleEInt ) )
            // InternalMyDsl.g:567:4: (lv_value_0_0= ruleEInt )
            {
            // InternalMyDsl.g:567:4: (lv_value_0_0= ruleEInt )
            // InternalMyDsl.g:568:5: lv_value_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getAngleAccess().getValueEIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalMyDsl.g:585:3: ( (lv_angleUnit_1_0= ruleAngleUnit ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:586:4: (lv_angleUnit_1_0= ruleAngleUnit )
                    {
                    // InternalMyDsl.g:586:4: (lv_angleUnit_1_0= ruleAngleUnit )
                    // InternalMyDsl.g:587:5: lv_angleUnit_1_0= ruleAngleUnit
                    {

                    					newCompositeNode(grammarAccess.getAngleAccess().getAngleUnitAngleUnitEnumRuleCall_1_0());
                    				
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


    // $ANTLR start "entryRuleDuration"
    // InternalMyDsl.g:608:1: entryRuleDuration returns [EObject current=null] : iv_ruleDuration= ruleDuration EOF ;
    public final EObject entryRuleDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuration = null;


        try {
            // InternalMyDsl.g:608:49: (iv_ruleDuration= ruleDuration EOF )
            // InternalMyDsl.g:609:2: iv_ruleDuration= ruleDuration EOF
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
    // InternalMyDsl.g:615:1: ruleDuration returns [EObject current=null] : ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleDuration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        Enumerator lv_timeUnit_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:621:2: ( ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnit ) ) ) )
            // InternalMyDsl.g:622:2: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnit ) ) )
            {
            // InternalMyDsl.g:622:2: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnit ) ) )
            // InternalMyDsl.g:623:3: ( (lv_value_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnit ) )
            {
            // InternalMyDsl.g:623:3: ( (lv_value_0_0= ruleEInt ) )
            // InternalMyDsl.g:624:4: (lv_value_0_0= ruleEInt )
            {
            // InternalMyDsl.g:624:4: (lv_value_0_0= ruleEInt )
            // InternalMyDsl.g:625:5: lv_value_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDurationAccess().getValueEIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalMyDsl.g:642:3: ( (lv_timeUnit_1_0= ruleTimeUnit ) )
            // InternalMyDsl.g:643:4: (lv_timeUnit_1_0= ruleTimeUnit )
            {
            // InternalMyDsl.g:643:4: (lv_timeUnit_1_0= ruleTimeUnit )
            // InternalMyDsl.g:644:5: lv_timeUnit_1_0= ruleTimeUnit
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
    // InternalMyDsl.g:665:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:665:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:666:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalMyDsl.g:672:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:678:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:679:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:679:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:680:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:680:3: (kw= '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:681:4: kw= '-'
                    {
                    kw=(Token)match(input,21,FOLLOW_12); 

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


    // $ANTLR start "entryRuleNamedBlock"
    // InternalMyDsl.g:698:1: entryRuleNamedBlock returns [EObject current=null] : iv_ruleNamedBlock= ruleNamedBlock EOF ;
    public final EObject entryRuleNamedBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedBlock = null;


        try {
            // InternalMyDsl.g:698:51: (iv_ruleNamedBlock= ruleNamedBlock EOF )
            // InternalMyDsl.g:699:2: iv_ruleNamedBlock= ruleNamedBlock EOF
            {
             newCompositeNode(grammarAccess.getNamedBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedBlock=ruleNamedBlock();

            state._fsp--;

             current =iv_ruleNamedBlock; 
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
    // $ANTLR end "entryRuleNamedBlock"


    // $ANTLR start "ruleNamedBlock"
    // InternalMyDsl.g:705:1: ruleNamedBlock returns [EObject current=null] : (otherlv_0= 'NamedBlock' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleNamedBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_instructions_3_0 = null;

        EObject lv_instructions_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:711:2: ( (otherlv_0= 'NamedBlock' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* )? otherlv_5= '}' ) )
            // InternalMyDsl.g:712:2: (otherlv_0= 'NamedBlock' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:712:2: (otherlv_0= 'NamedBlock' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* )? otherlv_5= '}' )
            // InternalMyDsl.g:713:3: otherlv_0= 'NamedBlock' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getNamedBlockAccess().getNamedBlockKeyword_0());
            		
            // InternalMyDsl.g:717:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:718:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:718:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:719:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNamedBlockAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedBlockRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getNamedBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:740:3: ( ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=14 && LA11_0<=16)||LA11_0==18||LA11_0==20||(LA11_0>=22 && LA11_0<=23)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:741:4: ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )*
                    {
                    // InternalMyDsl.g:741:4: ( (lv_instructions_3_0= ruleInstruction ) )
                    // InternalMyDsl.g:742:5: (lv_instructions_3_0= ruleInstruction )
                    {
                    // InternalMyDsl.g:742:5: (lv_instructions_3_0= ruleInstruction )
                    // InternalMyDsl.g:743:6: lv_instructions_3_0= ruleInstruction
                    {

                    						newCompositeNode(grammarAccess.getNamedBlockAccess().getInstructionsInstructionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_instructions_3_0=ruleInstruction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNamedBlockRule());
                    						}
                    						add(
                    							current,
                    							"instructions",
                    							lv_instructions_3_0,
                    							"fr.unice.polytech.robotproject.xtextdsl.MyDsl.Instruction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:760:4: ( (lv_instructions_4_0= ruleInstruction ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=14 && LA10_0<=16)||LA10_0==18||LA10_0==20||(LA10_0>=22 && LA10_0<=23)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDsl.g:761:5: (lv_instructions_4_0= ruleInstruction )
                    	    {
                    	    // InternalMyDsl.g:761:5: (lv_instructions_4_0= ruleInstruction )
                    	    // InternalMyDsl.g:762:6: lv_instructions_4_0= ruleInstruction
                    	    {

                    	    						newCompositeNode(grammarAccess.getNamedBlockAccess().getInstructionsInstructionParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_instructions_4_0=ruleInstruction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getNamedBlockRule());
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
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getNamedBlockAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleNamedBlock"


    // $ANTLR start "entryRuleGoTo"
    // InternalMyDsl.g:788:1: entryRuleGoTo returns [EObject current=null] : iv_ruleGoTo= ruleGoTo EOF ;
    public final EObject entryRuleGoTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoTo = null;


        try {
            // InternalMyDsl.g:788:45: (iv_ruleGoTo= ruleGoTo EOF )
            // InternalMyDsl.g:789:2: iv_ruleGoTo= ruleGoTo EOF
            {
             newCompositeNode(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoTo=ruleGoTo();

            state._fsp--;

             current =iv_ruleGoTo; 
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
    // $ANTLR end "entryRuleGoTo"


    // $ANTLR start "ruleGoTo"
    // InternalMyDsl.g:795:1: ruleGoTo returns [EObject current=null] : (otherlv_0= 'GoTo' ( ( ruleEString ) ) (otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) )? ) ;
    public final EObject ruleGoTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:801:2: ( (otherlv_0= 'GoTo' ( ( ruleEString ) ) (otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) )? ) )
            // InternalMyDsl.g:802:2: (otherlv_0= 'GoTo' ( ( ruleEString ) ) (otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) )? )
            {
            // InternalMyDsl.g:802:2: (otherlv_0= 'GoTo' ( ( ruleEString ) ) (otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) )? )
            // InternalMyDsl.g:803:3: otherlv_0= 'GoTo' ( ( ruleEString ) ) (otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getGoToAccess().getGoToKeyword_0());
            		
            // InternalMyDsl.g:807:3: ( ( ruleEString ) )
            // InternalMyDsl.g:808:4: ( ruleEString )
            {
            // InternalMyDsl.g:808:4: ( ruleEString )
            // InternalMyDsl.g:809:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoToRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGoToAccess().getDestinationNamedBlockCrossReference_1_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:823:3: (otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:824:4: otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getGoToAccess().getIfKeyword_2_0());
                    			
                    // InternalMyDsl.g:828:4: ( (lv_condition_3_0= ruleCondition ) )
                    // InternalMyDsl.g:829:5: (lv_condition_3_0= ruleCondition )
                    {
                    // InternalMyDsl.g:829:5: (lv_condition_3_0= ruleCondition )
                    // InternalMyDsl.g:830:6: lv_condition_3_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getGoToAccess().getConditionConditionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition_3_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGoToRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_3_0,
                    							"fr.unice.polytech.robotproject.xtextdsl.MyDsl.Condition");
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
    // $ANTLR end "ruleGoTo"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:852:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:852:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:853:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalMyDsl.g:859:1: ruleCondition returns [EObject current=null] : this_SensorActivation_0= ruleSensorActivation ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_SensorActivation_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:865:2: (this_SensorActivation_0= ruleSensorActivation )
            // InternalMyDsl.g:866:2: this_SensorActivation_0= ruleSensorActivation
            {

            		newCompositeNode(grammarAccess.getConditionAccess().getSensorActivationParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_SensorActivation_0=ruleSensorActivation();

            state._fsp--;


            		current = this_SensorActivation_0;
            		afterParserOrEnumRuleCall();
            	

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


    // $ANTLR start "entryRuleSensorActivation"
    // InternalMyDsl.g:877:1: entryRuleSensorActivation returns [EObject current=null] : iv_ruleSensorActivation= ruleSensorActivation EOF ;
    public final EObject entryRuleSensorActivation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorActivation = null;


        try {
            // InternalMyDsl.g:877:57: (iv_ruleSensorActivation= ruleSensorActivation EOF )
            // InternalMyDsl.g:878:2: iv_ruleSensorActivation= ruleSensorActivation EOF
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
    // InternalMyDsl.g:884:1: ruleSensorActivation returns [EObject current=null] : ( () otherlv_1= 'SensorActivated' ) ;
    public final EObject ruleSensorActivation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:890:2: ( ( () otherlv_1= 'SensorActivated' ) )
            // InternalMyDsl.g:891:2: ( () otherlv_1= 'SensorActivated' )
            {
            // InternalMyDsl.g:891:2: ( () otherlv_1= 'SensorActivated' )
            // InternalMyDsl.g:892:3: () otherlv_1= 'SensorActivated'
            {
            // InternalMyDsl.g:892:3: ()
            // InternalMyDsl.g:893:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorActivationAccess().getSensorActivationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_2); 

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
    // InternalMyDsl.g:907:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:907:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:908:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:914:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:920:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:921:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:921:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:922:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:930:3: this_ID_1= RULE_ID
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
    // InternalMyDsl.g:941:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:947:2: ( ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) ) )
            // InternalMyDsl.g:948:2: ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) )
            {
            // InternalMyDsl.g:948:2: ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            else if ( (LA14_0==27) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:949:3: (enumLiteral_0= 'ms' )
                    {
                    // InternalMyDsl.g:949:3: (enumLiteral_0= 'ms' )
                    // InternalMyDsl.g:950:4: enumLiteral_0= 'ms'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:957:3: (enumLiteral_1= 's' )
                    {
                    // InternalMyDsl.g:957:3: (enumLiteral_1= 's' )
                    // InternalMyDsl.g:958:4: enumLiteral_1= 's'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

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
    // InternalMyDsl.g:968:1: ruleDistanceUnit returns [Enumerator current=null] : (enumLiteral_0= 'cm' ) ;
    public final Enumerator ruleDistanceUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:974:2: ( (enumLiteral_0= 'cm' ) )
            // InternalMyDsl.g:975:2: (enumLiteral_0= 'cm' )
            {
            // InternalMyDsl.g:975:2: (enumLiteral_0= 'cm' )
            // InternalMyDsl.g:976:3: enumLiteral_0= 'cm'
            {
            enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

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
    // InternalMyDsl.g:985:1: ruleAngleUnit returns [Enumerator current=null] : (enumLiteral_0= 'deg' ) ;
    public final Enumerator ruleAngleUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:991:2: ( (enumLiteral_0= 'deg' ) )
            // InternalMyDsl.g:992:2: (enumLiteral_0= 'deg' )
            {
            // InternalMyDsl.g:992:2: (enumLiteral_0= 'deg' )
            // InternalMyDsl.g:993:3: enumLiteral_0= 'deg'
            {
            enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000D5E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});

}