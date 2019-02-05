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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'{'", "'}'", "'for'", "'MoveStraight'", "'Turn'", "'-'", "'NamedBlock'", "'GoTo'", "'ms'", "'s'", "'cm'", "'deg'"
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
    public static final int RULE_INT=4;
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

            if ( ((LA2_0>=15 && LA2_0<=16)||(LA2_0>=18 && LA2_0<=19)) ) {
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

                        if ( ((LA1_0>=15 && LA1_0<=16)||(LA1_0>=18 && LA1_0<=19)) ) {
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
    // InternalMyDsl.g:150:1: ruleInstruction returns [EObject current=null] : (this_Movement_0= ruleMovement | this_NamedBlock_1= ruleNamedBlock | this_GoTo_2= ruleGoTo ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Movement_0 = null;

        EObject this_NamedBlock_1 = null;

        EObject this_GoTo_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:156:2: ( (this_Movement_0= ruleMovement | this_NamedBlock_1= ruleNamedBlock | this_GoTo_2= ruleGoTo ) )
            // InternalMyDsl.g:157:2: (this_Movement_0= ruleMovement | this_NamedBlock_1= ruleNamedBlock | this_GoTo_2= ruleGoTo )
            {
            // InternalMyDsl.g:157:2: (this_Movement_0= ruleMovement | this_NamedBlock_1= ruleNamedBlock | this_GoTo_2= ruleGoTo )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:158:3: this_Movement_0= ruleMovement
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getMovementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Movement_0=ruleMovement();

                    state._fsp--;


                    			current = this_Movement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:167:3: this_NamedBlock_1= ruleNamedBlock
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getNamedBlockParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NamedBlock_1=ruleNamedBlock();

                    state._fsp--;


                    			current = this_NamedBlock_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:176:3: this_GoTo_2= ruleGoTo
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getGoToParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GoTo_2=ruleGoTo();

                    state._fsp--;


                    			current = this_GoTo_2;
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


    // $ANTLR start "entryRuleMovement"
    // InternalMyDsl.g:188:1: entryRuleMovement returns [EObject current=null] : iv_ruleMovement= ruleMovement EOF ;
    public final EObject entryRuleMovement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovement = null;


        try {
            // InternalMyDsl.g:188:49: (iv_ruleMovement= ruleMovement EOF )
            // InternalMyDsl.g:189:2: iv_ruleMovement= ruleMovement EOF
            {
             newCompositeNode(grammarAccess.getMovementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMovement=ruleMovement();

            state._fsp--;

             current =iv_ruleMovement; 
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
    // $ANTLR end "entryRuleMovement"


    // $ANTLR start "ruleMovement"
    // InternalMyDsl.g:195:1: ruleMovement returns [EObject current=null] : ( (this_MoveStraight_0= ruleMoveStraight | this_Turn_1= ruleTurn ) otherlv_2= 'for' ( (lv_duration_3_0= ruleDuration ) )? ) ;
    public final EObject ruleMovement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_MoveStraight_0 = null;

        EObject this_Turn_1 = null;

        EObject lv_duration_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:201:2: ( ( (this_MoveStraight_0= ruleMoveStraight | this_Turn_1= ruleTurn ) otherlv_2= 'for' ( (lv_duration_3_0= ruleDuration ) )? ) )
            // InternalMyDsl.g:202:2: ( (this_MoveStraight_0= ruleMoveStraight | this_Turn_1= ruleTurn ) otherlv_2= 'for' ( (lv_duration_3_0= ruleDuration ) )? )
            {
            // InternalMyDsl.g:202:2: ( (this_MoveStraight_0= ruleMoveStraight | this_Turn_1= ruleTurn ) otherlv_2= 'for' ( (lv_duration_3_0= ruleDuration ) )? )
            // InternalMyDsl.g:203:3: (this_MoveStraight_0= ruleMoveStraight | this_Turn_1= ruleTurn ) otherlv_2= 'for' ( (lv_duration_3_0= ruleDuration ) )?
            {
            // InternalMyDsl.g:203:3: (this_MoveStraight_0= ruleMoveStraight | this_Turn_1= ruleTurn )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:204:4: this_MoveStraight_0= ruleMoveStraight
                    {

                    				newCompositeNode(grammarAccess.getMovementAccess().getMoveStraightParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_5);
                    this_MoveStraight_0=ruleMoveStraight();

                    state._fsp--;


                    				current = this_MoveStraight_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:213:4: this_Turn_1= ruleTurn
                    {

                    				newCompositeNode(grammarAccess.getMovementAccess().getTurnParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_5);
                    this_Turn_1=ruleTurn();

                    state._fsp--;


                    				current = this_Turn_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMovementAccess().getForKeyword_1());
            		
            // InternalMyDsl.g:226:3: ( (lv_duration_3_0= ruleDuration ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT||LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:227:4: (lv_duration_3_0= ruleDuration )
                    {
                    // InternalMyDsl.g:227:4: (lv_duration_3_0= ruleDuration )
                    // InternalMyDsl.g:228:5: lv_duration_3_0= ruleDuration
                    {

                    					newCompositeNode(grammarAccess.getMovementAccess().getDurationDurationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_duration_3_0=ruleDuration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMovementRule());
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
    // $ANTLR end "ruleMovement"


    // $ANTLR start "entryRuleMoveStraight"
    // InternalMyDsl.g:249:1: entryRuleMoveStraight returns [EObject current=null] : iv_ruleMoveStraight= ruleMoveStraight EOF ;
    public final EObject entryRuleMoveStraight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveStraight = null;


        try {
            // InternalMyDsl.g:249:53: (iv_ruleMoveStraight= ruleMoveStraight EOF )
            // InternalMyDsl.g:250:2: iv_ruleMoveStraight= ruleMoveStraight EOF
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
    // InternalMyDsl.g:256:1: ruleMoveStraight returns [EObject current=null] : (otherlv_0= 'MoveStraight' ( (lv_distance_1_0= ruleDistance ) ) ) ;
    public final EObject ruleMoveStraight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_distance_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:262:2: ( (otherlv_0= 'MoveStraight' ( (lv_distance_1_0= ruleDistance ) ) ) )
            // InternalMyDsl.g:263:2: (otherlv_0= 'MoveStraight' ( (lv_distance_1_0= ruleDistance ) ) )
            {
            // InternalMyDsl.g:263:2: (otherlv_0= 'MoveStraight' ( (lv_distance_1_0= ruleDistance ) ) )
            // InternalMyDsl.g:264:3: otherlv_0= 'MoveStraight' ( (lv_distance_1_0= ruleDistance ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveStraightAccess().getMoveStraightKeyword_0());
            		
            // InternalMyDsl.g:268:3: ( (lv_distance_1_0= ruleDistance ) )
            // InternalMyDsl.g:269:4: (lv_distance_1_0= ruleDistance )
            {
            // InternalMyDsl.g:269:4: (lv_distance_1_0= ruleDistance )
            // InternalMyDsl.g:270:5: lv_distance_1_0= ruleDistance
            {

            					newCompositeNode(grammarAccess.getMoveStraightAccess().getDistanceDistanceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleTurn"
    // InternalMyDsl.g:291:1: entryRuleTurn returns [EObject current=null] : iv_ruleTurn= ruleTurn EOF ;
    public final EObject entryRuleTurn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurn = null;


        try {
            // InternalMyDsl.g:291:45: (iv_ruleTurn= ruleTurn EOF )
            // InternalMyDsl.g:292:2: iv_ruleTurn= ruleTurn EOF
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
    // InternalMyDsl.g:298:1: ruleTurn returns [EObject current=null] : (otherlv_0= 'Turn' ( (lv_angle_1_0= ruleAngle ) ) ) ;
    public final EObject ruleTurn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_angle_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:304:2: ( (otherlv_0= 'Turn' ( (lv_angle_1_0= ruleAngle ) ) ) )
            // InternalMyDsl.g:305:2: (otherlv_0= 'Turn' ( (lv_angle_1_0= ruleAngle ) ) )
            {
            // InternalMyDsl.g:305:2: (otherlv_0= 'Turn' ( (lv_angle_1_0= ruleAngle ) ) )
            // InternalMyDsl.g:306:3: otherlv_0= 'Turn' ( (lv_angle_1_0= ruleAngle ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnAccess().getTurnKeyword_0());
            		
            // InternalMyDsl.g:310:3: ( (lv_angle_1_0= ruleAngle ) )
            // InternalMyDsl.g:311:4: (lv_angle_1_0= ruleAngle )
            {
            // InternalMyDsl.g:311:4: (lv_angle_1_0= ruleAngle )
            // InternalMyDsl.g:312:5: lv_angle_1_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getTurnAccess().getAngleAngleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalMyDsl.g:333:1: entryRuleDistance returns [EObject current=null] : iv_ruleDistance= ruleDistance EOF ;
    public final EObject entryRuleDistance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistance = null;


        try {
            // InternalMyDsl.g:333:49: (iv_ruleDistance= ruleDistance EOF )
            // InternalMyDsl.g:334:2: iv_ruleDistance= ruleDistance EOF
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
    // InternalMyDsl.g:340:1: ruleDistance returns [EObject current=null] : ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_distanceUnit_1_0= ruleDistanceUnit ) ) ) ;
    public final EObject ruleDistance() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        Enumerator lv_distanceUnit_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:346:2: ( ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_distanceUnit_1_0= ruleDistanceUnit ) ) ) )
            // InternalMyDsl.g:347:2: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_distanceUnit_1_0= ruleDistanceUnit ) ) )
            {
            // InternalMyDsl.g:347:2: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_distanceUnit_1_0= ruleDistanceUnit ) ) )
            // InternalMyDsl.g:348:3: ( (lv_value_0_0= ruleEInt ) ) ( (lv_distanceUnit_1_0= ruleDistanceUnit ) )
            {
            // InternalMyDsl.g:348:3: ( (lv_value_0_0= ruleEInt ) )
            // InternalMyDsl.g:349:4: (lv_value_0_0= ruleEInt )
            {
            // InternalMyDsl.g:349:4: (lv_value_0_0= ruleEInt )
            // InternalMyDsl.g:350:5: lv_value_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDistanceAccess().getValueEIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalMyDsl.g:367:3: ( (lv_distanceUnit_1_0= ruleDistanceUnit ) )
            // InternalMyDsl.g:368:4: (lv_distanceUnit_1_0= ruleDistanceUnit )
            {
            // InternalMyDsl.g:368:4: (lv_distanceUnit_1_0= ruleDistanceUnit )
            // InternalMyDsl.g:369:5: lv_distanceUnit_1_0= ruleDistanceUnit
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
    // InternalMyDsl.g:390:1: entryRuleAngle returns [EObject current=null] : iv_ruleAngle= ruleAngle EOF ;
    public final EObject entryRuleAngle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngle = null;


        try {
            // InternalMyDsl.g:390:46: (iv_ruleAngle= ruleAngle EOF )
            // InternalMyDsl.g:391:2: iv_ruleAngle= ruleAngle EOF
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
    // InternalMyDsl.g:397:1: ruleAngle returns [EObject current=null] : ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_angleUnit_1_0= ruleAngleUnit ) )? ) ;
    public final EObject ruleAngle() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        Enumerator lv_angleUnit_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:403:2: ( ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_angleUnit_1_0= ruleAngleUnit ) )? ) )
            // InternalMyDsl.g:404:2: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_angleUnit_1_0= ruleAngleUnit ) )? )
            {
            // InternalMyDsl.g:404:2: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_angleUnit_1_0= ruleAngleUnit ) )? )
            // InternalMyDsl.g:405:3: ( (lv_value_0_0= ruleEInt ) ) ( (lv_angleUnit_1_0= ruleAngleUnit ) )?
            {
            // InternalMyDsl.g:405:3: ( (lv_value_0_0= ruleEInt ) )
            // InternalMyDsl.g:406:4: (lv_value_0_0= ruleEInt )
            {
            // InternalMyDsl.g:406:4: (lv_value_0_0= ruleEInt )
            // InternalMyDsl.g:407:5: lv_value_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getAngleAccess().getValueEIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalMyDsl.g:424:3: ( (lv_angleUnit_1_0= ruleAngleUnit ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:425:4: (lv_angleUnit_1_0= ruleAngleUnit )
                    {
                    // InternalMyDsl.g:425:4: (lv_angleUnit_1_0= ruleAngleUnit )
                    // InternalMyDsl.g:426:5: lv_angleUnit_1_0= ruleAngleUnit
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
    // InternalMyDsl.g:447:1: entryRuleDuration returns [EObject current=null] : iv_ruleDuration= ruleDuration EOF ;
    public final EObject entryRuleDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuration = null;


        try {
            // InternalMyDsl.g:447:49: (iv_ruleDuration= ruleDuration EOF )
            // InternalMyDsl.g:448:2: iv_ruleDuration= ruleDuration EOF
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
    // InternalMyDsl.g:454:1: ruleDuration returns [EObject current=null] : ( () ( ( (lv_value_1_0= ruleEInt ) ) ( (lv_timeUnit_2_0= ruleTimeUnit ) ) ) ) ;
    public final EObject ruleDuration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        Enumerator lv_timeUnit_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:460:2: ( ( () ( ( (lv_value_1_0= ruleEInt ) ) ( (lv_timeUnit_2_0= ruleTimeUnit ) ) ) ) )
            // InternalMyDsl.g:461:2: ( () ( ( (lv_value_1_0= ruleEInt ) ) ( (lv_timeUnit_2_0= ruleTimeUnit ) ) ) )
            {
            // InternalMyDsl.g:461:2: ( () ( ( (lv_value_1_0= ruleEInt ) ) ( (lv_timeUnit_2_0= ruleTimeUnit ) ) ) )
            // InternalMyDsl.g:462:3: () ( ( (lv_value_1_0= ruleEInt ) ) ( (lv_timeUnit_2_0= ruleTimeUnit ) ) )
            {
            // InternalMyDsl.g:462:3: ()
            // InternalMyDsl.g:463:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDurationAccess().getDurationAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:469:3: ( ( (lv_value_1_0= ruleEInt ) ) ( (lv_timeUnit_2_0= ruleTimeUnit ) ) )
            // InternalMyDsl.g:470:4: ( (lv_value_1_0= ruleEInt ) ) ( (lv_timeUnit_2_0= ruleTimeUnit ) )
            {
            // InternalMyDsl.g:470:4: ( (lv_value_1_0= ruleEInt ) )
            // InternalMyDsl.g:471:5: (lv_value_1_0= ruleEInt )
            {
            // InternalMyDsl.g:471:5: (lv_value_1_0= ruleEInt )
            // InternalMyDsl.g:472:6: lv_value_1_0= ruleEInt
            {

            						newCompositeNode(grammarAccess.getDurationAccess().getValueEIntParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_10);
            lv_value_1_0=ruleEInt();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDurationRule());
            						}
            						set(
            							current,
            							"value",
            							lv_value_1_0,
            							"fr.unice.polytech.robotproject.xtextdsl.MyDsl.EInt");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalMyDsl.g:489:4: ( (lv_timeUnit_2_0= ruleTimeUnit ) )
            // InternalMyDsl.g:490:5: (lv_timeUnit_2_0= ruleTimeUnit )
            {
            // InternalMyDsl.g:490:5: (lv_timeUnit_2_0= ruleTimeUnit )
            // InternalMyDsl.g:491:6: lv_timeUnit_2_0= ruleTimeUnit
            {

            						newCompositeNode(grammarAccess.getDurationAccess().getTimeUnitTimeUnitEnumRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_2);
            lv_timeUnit_2_0=ruleTimeUnit();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDurationRule());
            						}
            						set(
            							current,
            							"timeUnit",
            							lv_timeUnit_2_0,
            							"fr.unice.polytech.robotproject.xtextdsl.MyDsl.TimeUnit");
            						afterParserOrEnumRuleCall();
            					

            }


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
    // InternalMyDsl.g:513:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:513:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:514:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalMyDsl.g:520:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:526:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:527:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:527:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:528:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:528:3: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:529:4: kw= '-'
                    {
                    kw=(Token)match(input,17,FOLLOW_11); 

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
    // InternalMyDsl.g:546:1: entryRuleNamedBlock returns [EObject current=null] : iv_ruleNamedBlock= ruleNamedBlock EOF ;
    public final EObject entryRuleNamedBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedBlock = null;


        try {
            // InternalMyDsl.g:546:51: (iv_ruleNamedBlock= ruleNamedBlock EOF )
            // InternalMyDsl.g:547:2: iv_ruleNamedBlock= ruleNamedBlock EOF
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
    // InternalMyDsl.g:553:1: ruleNamedBlock returns [EObject current=null] : ( () otherlv_1= 'NamedBlock' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleInstruction ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleNamedBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_instructions_4_0 = null;

        EObject lv_instructions_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:559:2: ( ( () otherlv_1= 'NamedBlock' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleInstruction ) )* )? otherlv_6= '}' ) )
            // InternalMyDsl.g:560:2: ( () otherlv_1= 'NamedBlock' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleInstruction ) )* )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:560:2: ( () otherlv_1= 'NamedBlock' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleInstruction ) )* )? otherlv_6= '}' )
            // InternalMyDsl.g:561:3: () otherlv_1= 'NamedBlock' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleInstruction ) )* )? otherlv_6= '}'
            {
            // InternalMyDsl.g:561:3: ()
            // InternalMyDsl.g:562:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedBlockAccess().getNamedBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedBlockAccess().getNamedBlockKeyword_1());
            		
            // InternalMyDsl.g:572:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:573:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:573:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:574:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNamedBlockAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedBlockRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.polytech.robotproject.xtextdsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getNamedBlockAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:595:3: ( ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleInstruction ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=15 && LA9_0<=16)||(LA9_0>=18 && LA9_0<=19)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:596:4: ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleInstruction ) )*
                    {
                    // InternalMyDsl.g:596:4: ( (lv_instructions_4_0= ruleInstruction ) )
                    // InternalMyDsl.g:597:5: (lv_instructions_4_0= ruleInstruction )
                    {
                    // InternalMyDsl.g:597:5: (lv_instructions_4_0= ruleInstruction )
                    // InternalMyDsl.g:598:6: lv_instructions_4_0= ruleInstruction
                    {

                    						newCompositeNode(grammarAccess.getNamedBlockAccess().getInstructionsInstructionParserRuleCall_4_0_0());
                    					
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

                    // InternalMyDsl.g:615:4: ( (lv_instructions_5_0= ruleInstruction ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=15 && LA8_0<=16)||(LA8_0>=18 && LA8_0<=19)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:616:5: (lv_instructions_5_0= ruleInstruction )
                    	    {
                    	    // InternalMyDsl.g:616:5: (lv_instructions_5_0= ruleInstruction )
                    	    // InternalMyDsl.g:617:6: lv_instructions_5_0= ruleInstruction
                    	    {

                    	    						newCompositeNode(grammarAccess.getNamedBlockAccess().getInstructionsInstructionParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_instructions_5_0=ruleInstruction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getNamedBlockRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"instructions",
                    	    							lv_instructions_5_0,
                    	    							"fr.unice.polytech.robotproject.xtextdsl.MyDsl.Instruction");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getNamedBlockAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalMyDsl.g:643:1: entryRuleGoTo returns [EObject current=null] : iv_ruleGoTo= ruleGoTo EOF ;
    public final EObject entryRuleGoTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoTo = null;


        try {
            // InternalMyDsl.g:643:45: (iv_ruleGoTo= ruleGoTo EOF )
            // InternalMyDsl.g:644:2: iv_ruleGoTo= ruleGoTo EOF
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
    // InternalMyDsl.g:650:1: ruleGoTo returns [EObject current=null] : (otherlv_0= 'GoTo' ( ( ruleEString ) ) ) ;
    public final EObject ruleGoTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:656:2: ( (otherlv_0= 'GoTo' ( ( ruleEString ) ) ) )
            // InternalMyDsl.g:657:2: (otherlv_0= 'GoTo' ( ( ruleEString ) ) )
            {
            // InternalMyDsl.g:657:2: (otherlv_0= 'GoTo' ( ( ruleEString ) ) )
            // InternalMyDsl.g:658:3: otherlv_0= 'GoTo' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getGoToAccess().getGoToKeyword_0());
            		
            // InternalMyDsl.g:662:3: ( ( ruleEString ) )
            // InternalMyDsl.g:663:4: ( ruleEString )
            {
            // InternalMyDsl.g:663:4: ( ruleEString )
            // InternalMyDsl.g:664:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoToRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGoToAccess().getDestinationNamedBlockCrossReference_1_0());
            				
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
    // $ANTLR end "ruleGoTo"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:682:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:682:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:683:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:689:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:695:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:696:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:696:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:697:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:705:3: this_ID_1= RULE_ID
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
    // InternalMyDsl.g:716:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:722:2: ( ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) ) )
            // InternalMyDsl.g:723:2: ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) )
            {
            // InternalMyDsl.g:723:2: ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            else if ( (LA11_0==21) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:724:3: (enumLiteral_0= 'ms' )
                    {
                    // InternalMyDsl.g:724:3: (enumLiteral_0= 'ms' )
                    // InternalMyDsl.g:725:4: enumLiteral_0= 'ms'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:732:3: (enumLiteral_1= 's' )
                    {
                    // InternalMyDsl.g:732:3: (enumLiteral_1= 's' )
                    // InternalMyDsl.g:733:4: enumLiteral_1= 's'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

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
    // InternalMyDsl.g:743:1: ruleDistanceUnit returns [Enumerator current=null] : (enumLiteral_0= 'cm' ) ;
    public final Enumerator ruleDistanceUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:749:2: ( (enumLiteral_0= 'cm' ) )
            // InternalMyDsl.g:750:2: (enumLiteral_0= 'cm' )
            {
            // InternalMyDsl.g:750:2: (enumLiteral_0= 'cm' )
            // InternalMyDsl.g:751:3: enumLiteral_0= 'cm'
            {
            enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMyDsl.g:760:1: ruleAngleUnit returns [Enumerator current=null] : (enumLiteral_0= 'deg' ) ;
    public final Enumerator ruleAngleUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:766:2: ( (enumLiteral_0= 'deg' ) )
            // InternalMyDsl.g:767:2: (enumLiteral_0= 'deg' )
            {
            // InternalMyDsl.g:767:2: (enumLiteral_0= 'deg' )
            // InternalMyDsl.g:768:3: enumLiteral_0= 'deg'
            {
            enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000DA000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000060L});

}