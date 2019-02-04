package fr.unice.polytech.robotproject.xtextdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.unice.polytech.robotproject.xtextdsl.services.MyDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'{'", "'instructions'", "','", "'}'", "'MoveStraight:'", "'Turn:'", "'for'", "'-'"
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

        public InternalMyDSLParser(TokenStream input, MyDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Robot";
       	}

       	@Override
       	protected MyDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRobot"
    // InternalMyDSL.g:64:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalMyDSL.g:64:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalMyDSL.g:65:2: iv_ruleRobot= ruleRobot EOF
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
    // InternalMyDSL.g:71:1: ruleRobot returns [EObject current=null] : ( () otherlv_1= 'Robot' otherlv_2= '{' (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_instructions_5_0 = null;

        EObject lv_instructions_7_0 = null;



        	enterRule();

        try {
            // InternalMyDSL.g:77:2: ( ( () otherlv_1= 'Robot' otherlv_2= '{' (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalMyDSL.g:78:2: ( () otherlv_1= 'Robot' otherlv_2= '{' (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalMyDSL.g:78:2: ( () otherlv_1= 'Robot' otherlv_2= '{' (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalMyDSL.g:79:3: () otherlv_1= 'Robot' otherlv_2= '{' (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalMyDSL.g:79:3: ()
            // InternalMyDSL.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobotAccess().getRobotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotAccess().getRobotKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDSL.g:94:3: (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDSL.g:95:4: otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRobotAccess().getInstructionsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMyDSL.g:103:4: ( (lv_instructions_5_0= ruleInstruction ) )
                    // InternalMyDSL.g:104:5: (lv_instructions_5_0= ruleInstruction )
                    {
                    // InternalMyDSL.g:104:5: (lv_instructions_5_0= ruleInstruction )
                    // InternalMyDSL.g:105:6: lv_instructions_5_0= ruleInstruction
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getInstructionsInstructionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_instructions_5_0=ruleInstruction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						add(
                    							current,
                    							"instructions",
                    							lv_instructions_5_0,
                    							"fr.unice.polytech.robotproject.xtextdsl.MyDSL.Instruction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDSL.g:122:4: (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDSL.g:123:5: otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRobotAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDSL.g:127:5: ( (lv_instructions_7_0= ruleInstruction ) )
                    	    // InternalMyDSL.g:128:6: (lv_instructions_7_0= ruleInstruction )
                    	    {
                    	    // InternalMyDSL.g:128:6: (lv_instructions_7_0= ruleInstruction )
                    	    // InternalMyDSL.g:129:7: lv_instructions_7_0= ruleInstruction
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotAccess().getInstructionsInstructionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_instructions_7_0=ruleInstruction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobotRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"instructions",
                    	    								lv_instructions_7_0,
                    	    								"fr.unice.polytech.robotproject.xtextdsl.MyDSL.Instruction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalMyDSL.g:160:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalMyDSL.g:160:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalMyDSL.g:161:2: iv_ruleInstruction= ruleInstruction EOF
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
    // InternalMyDSL.g:167:1: ruleInstruction returns [EObject current=null] : (this_MoveStraight_0= ruleMoveStraight | this_Turn_1= ruleTurn ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_MoveStraight_0 = null;

        EObject this_Turn_1 = null;



        	enterRule();

        try {
            // InternalMyDSL.g:173:2: ( (this_MoveStraight_0= ruleMoveStraight | this_Turn_1= ruleTurn ) )
            // InternalMyDSL.g:174:2: (this_MoveStraight_0= ruleMoveStraight | this_Turn_1= ruleTurn )
            {
            // InternalMyDSL.g:174:2: (this_MoveStraight_0= ruleMoveStraight | this_Turn_1= ruleTurn )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDSL.g:175:3: this_MoveStraight_0= ruleMoveStraight
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getMoveStraightParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveStraight_0=ruleMoveStraight();

                    state._fsp--;


                    			current = this_MoveStraight_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDSL.g:184:3: this_Turn_1= ruleTurn
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getTurnParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Turn_1=ruleTurn();

                    state._fsp--;


                    			current = this_Turn_1;
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


    // $ANTLR start "entryRuleMoveStraight"
    // InternalMyDSL.g:196:1: entryRuleMoveStraight returns [EObject current=null] : iv_ruleMoveStraight= ruleMoveStraight EOF ;
    public final EObject entryRuleMoveStraight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveStraight = null;


        try {
            // InternalMyDSL.g:196:53: (iv_ruleMoveStraight= ruleMoveStraight EOF )
            // InternalMyDSL.g:197:2: iv_ruleMoveStraight= ruleMoveStraight EOF
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
    // InternalMyDSL.g:203:1: ruleMoveStraight returns [EObject current=null] : (otherlv_0= 'MoveStraight:' ( (lv_amount_1_0= ruleAmount ) ) ( (lv_duration_2_0= ruleDuration ) )? ) ;
    public final EObject ruleMoveStraight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_amount_1_0 = null;

        EObject lv_duration_2_0 = null;



        	enterRule();

        try {
            // InternalMyDSL.g:209:2: ( (otherlv_0= 'MoveStraight:' ( (lv_amount_1_0= ruleAmount ) ) ( (lv_duration_2_0= ruleDuration ) )? ) )
            // InternalMyDSL.g:210:2: (otherlv_0= 'MoveStraight:' ( (lv_amount_1_0= ruleAmount ) ) ( (lv_duration_2_0= ruleDuration ) )? )
            {
            // InternalMyDSL.g:210:2: (otherlv_0= 'MoveStraight:' ( (lv_amount_1_0= ruleAmount ) ) ( (lv_duration_2_0= ruleDuration ) )? )
            // InternalMyDSL.g:211:3: otherlv_0= 'MoveStraight:' ( (lv_amount_1_0= ruleAmount ) ) ( (lv_duration_2_0= ruleDuration ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveStraightAccess().getMoveStraightKeyword_0());
            		
            // InternalMyDSL.g:215:3: ( (lv_amount_1_0= ruleAmount ) )
            // InternalMyDSL.g:216:4: (lv_amount_1_0= ruleAmount )
            {
            // InternalMyDSL.g:216:4: (lv_amount_1_0= ruleAmount )
            // InternalMyDSL.g:217:5: lv_amount_1_0= ruleAmount
            {

            					newCompositeNode(grammarAccess.getMoveStraightAccess().getAmountAmountParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_amount_1_0=ruleAmount();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveStraightRule());
            					}
            					set(
            						current,
            						"amount",
            						lv_amount_1_0,
            						"fr.unice.polytech.robotproject.xtextdsl.MyDSL.Amount");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDSL.g:234:3: ( (lv_duration_2_0= ruleDuration ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDSL.g:235:4: (lv_duration_2_0= ruleDuration )
                    {
                    // InternalMyDSL.g:235:4: (lv_duration_2_0= ruleDuration )
                    // InternalMyDSL.g:236:5: lv_duration_2_0= ruleDuration
                    {

                    					newCompositeNode(grammarAccess.getMoveStraightAccess().getDurationDurationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_duration_2_0=ruleDuration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMoveStraightRule());
                    					}
                    					set(
                    						current,
                    						"duration",
                    						lv_duration_2_0,
                    						"fr.unice.polytech.robotproject.xtextdsl.MyDSL.Duration");
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


    // $ANTLR start "entryRuleTurn"
    // InternalMyDSL.g:257:1: entryRuleTurn returns [EObject current=null] : iv_ruleTurn= ruleTurn EOF ;
    public final EObject entryRuleTurn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurn = null;


        try {
            // InternalMyDSL.g:257:45: (iv_ruleTurn= ruleTurn EOF )
            // InternalMyDSL.g:258:2: iv_ruleTurn= ruleTurn EOF
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
    // InternalMyDSL.g:264:1: ruleTurn returns [EObject current=null] : (otherlv_0= 'Turn:' ( (lv_amount_1_0= ruleAmount ) ) ( (lv_duration_2_0= ruleDuration ) )? ) ;
    public final EObject ruleTurn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_amount_1_0 = null;

        EObject lv_duration_2_0 = null;



        	enterRule();

        try {
            // InternalMyDSL.g:270:2: ( (otherlv_0= 'Turn:' ( (lv_amount_1_0= ruleAmount ) ) ( (lv_duration_2_0= ruleDuration ) )? ) )
            // InternalMyDSL.g:271:2: (otherlv_0= 'Turn:' ( (lv_amount_1_0= ruleAmount ) ) ( (lv_duration_2_0= ruleDuration ) )? )
            {
            // InternalMyDSL.g:271:2: (otherlv_0= 'Turn:' ( (lv_amount_1_0= ruleAmount ) ) ( (lv_duration_2_0= ruleDuration ) )? )
            // InternalMyDSL.g:272:3: otherlv_0= 'Turn:' ( (lv_amount_1_0= ruleAmount ) ) ( (lv_duration_2_0= ruleDuration ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnAccess().getTurnKeyword_0());
            		
            // InternalMyDSL.g:276:3: ( (lv_amount_1_0= ruleAmount ) )
            // InternalMyDSL.g:277:4: (lv_amount_1_0= ruleAmount )
            {
            // InternalMyDSL.g:277:4: (lv_amount_1_0= ruleAmount )
            // InternalMyDSL.g:278:5: lv_amount_1_0= ruleAmount
            {

            					newCompositeNode(grammarAccess.getTurnAccess().getAmountAmountParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_amount_1_0=ruleAmount();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurnRule());
            					}
            					set(
            						current,
            						"amount",
            						lv_amount_1_0,
            						"fr.unice.polytech.robotproject.xtextdsl.MyDSL.Amount");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDSL.g:295:3: ( (lv_duration_2_0= ruleDuration ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDSL.g:296:4: (lv_duration_2_0= ruleDuration )
                    {
                    // InternalMyDSL.g:296:4: (lv_duration_2_0= ruleDuration )
                    // InternalMyDSL.g:297:5: lv_duration_2_0= ruleDuration
                    {

                    					newCompositeNode(grammarAccess.getTurnAccess().getDurationDurationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_duration_2_0=ruleDuration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTurnRule());
                    					}
                    					set(
                    						current,
                    						"duration",
                    						lv_duration_2_0,
                    						"fr.unice.polytech.robotproject.xtextdsl.MyDSL.Duration");
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


    // $ANTLR start "entryRuleAmount"
    // InternalMyDSL.g:318:1: entryRuleAmount returns [EObject current=null] : iv_ruleAmount= ruleAmount EOF ;
    public final EObject entryRuleAmount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmount = null;


        try {
            // InternalMyDSL.g:318:47: (iv_ruleAmount= ruleAmount EOF )
            // InternalMyDSL.g:319:2: iv_ruleAmount= ruleAmount EOF
            {
             newCompositeNode(grammarAccess.getAmountRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAmount=ruleAmount();

            state._fsp--;

             current =iv_ruleAmount; 
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
    // $ANTLR end "entryRuleAmount"


    // $ANTLR start "ruleAmount"
    // InternalMyDSL.g:325:1: ruleAmount returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleAmount() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMyDSL.g:331:2: ( ( (lv_value_0_0= ruleEInt ) ) )
            // InternalMyDSL.g:332:2: ( (lv_value_0_0= ruleEInt ) )
            {
            // InternalMyDSL.g:332:2: ( (lv_value_0_0= ruleEInt ) )
            // InternalMyDSL.g:333:3: (lv_value_0_0= ruleEInt )
            {
            // InternalMyDSL.g:333:3: (lv_value_0_0= ruleEInt )
            // InternalMyDSL.g:334:4: lv_value_0_0= ruleEInt
            {

            				newCompositeNode(grammarAccess.getAmountAccess().getValueEIntParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEInt();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAmountRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"fr.unice.polytech.robotproject.xtextdsl.MyDSL.EInt");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleAmount"


    // $ANTLR start "entryRuleDuration"
    // InternalMyDSL.g:354:1: entryRuleDuration returns [EObject current=null] : iv_ruleDuration= ruleDuration EOF ;
    public final EObject entryRuleDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuration = null;


        try {
            // InternalMyDSL.g:354:49: (iv_ruleDuration= ruleDuration EOF )
            // InternalMyDSL.g:355:2: iv_ruleDuration= ruleDuration EOF
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
    // InternalMyDSL.g:361:1: ruleDuration returns [EObject current=null] : (otherlv_0= 'for' ( (lv_value_1_0= ruleEInt ) ) ) ;
    public final EObject ruleDuration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyDSL.g:367:2: ( (otherlv_0= 'for' ( (lv_value_1_0= ruleEInt ) ) ) )
            // InternalMyDSL.g:368:2: (otherlv_0= 'for' ( (lv_value_1_0= ruleEInt ) ) )
            {
            // InternalMyDSL.g:368:2: (otherlv_0= 'for' ( (lv_value_1_0= ruleEInt ) ) )
            // InternalMyDSL.g:369:3: otherlv_0= 'for' ( (lv_value_1_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDurationAccess().getForKeyword_0());
            		
            // InternalMyDSL.g:373:3: ( (lv_value_1_0= ruleEInt ) )
            // InternalMyDSL.g:374:4: (lv_value_1_0= ruleEInt )
            {
            // InternalMyDSL.g:374:4: (lv_value_1_0= ruleEInt )
            // InternalMyDSL.g:375:5: lv_value_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDurationAccess().getValueEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDurationRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"fr.unice.polytech.robotproject.xtextdsl.MyDSL.EInt");
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
    // InternalMyDSL.g:396:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDSL.g:396:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDSL.g:397:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalMyDSL.g:403:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDSL.g:409:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDSL.g:410:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDSL.g:410:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDSL.g:411:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDSL.g:411:3: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDSL.g:412:4: kw= '-'
                    {
                    kw=(Token)match(input,19,FOLLOW_10); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});

}