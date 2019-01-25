package fr.unice.polytech.robotproject.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.unice.polytech.robotproject.services.RobotdslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRobotdslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'{'", "'instructions'", "','", "'}'", "'Move'", "'distance'", "'-'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalRobotdslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRobotdslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRobotdslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRobotdsl.g"; }



     	private RobotdslGrammarAccess grammarAccess;

        public InternalRobotdslParser(TokenStream input, RobotdslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Robot";
       	}

       	@Override
       	protected RobotdslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRobot"
    // InternalRobotdsl.g:64:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalRobotdsl.g:64:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalRobotdsl.g:65:2: iv_ruleRobot= ruleRobot EOF
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
    // InternalRobotdsl.g:71:1: ruleRobot returns [EObject current=null] : ( () otherlv_1= 'Robot' otherlv_2= '{' (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalRobotdsl.g:77:2: ( ( () otherlv_1= 'Robot' otherlv_2= '{' (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRobotdsl.g:78:2: ( () otherlv_1= 'Robot' otherlv_2= '{' (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRobotdsl.g:78:2: ( () otherlv_1= 'Robot' otherlv_2= '{' (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRobotdsl.g:79:3: () otherlv_1= 'Robot' otherlv_2= '{' (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRobotdsl.g:79:3: ()
            // InternalRobotdsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobotAccess().getRobotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotAccess().getRobotKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRobotdsl.g:94:3: (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRobotdsl.g:95:4: otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRobotAccess().getInstructionsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRobotdsl.g:103:4: ( (lv_instructions_5_0= ruleInstruction ) )
                    // InternalRobotdsl.g:104:5: (lv_instructions_5_0= ruleInstruction )
                    {
                    // InternalRobotdsl.g:104:5: (lv_instructions_5_0= ruleInstruction )
                    // InternalRobotdsl.g:105:6: lv_instructions_5_0= ruleInstruction
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
                    							"fr.unice.polytech.robotproject.Robotdsl.Instruction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotdsl.g:122:4: (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRobotdsl.g:123:5: otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRobotAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRobotdsl.g:127:5: ( (lv_instructions_7_0= ruleInstruction ) )
                    	    // InternalRobotdsl.g:128:6: (lv_instructions_7_0= ruleInstruction )
                    	    {
                    	    // InternalRobotdsl.g:128:6: (lv_instructions_7_0= ruleInstruction )
                    	    // InternalRobotdsl.g:129:7: lv_instructions_7_0= ruleInstruction
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
                    	    								"fr.unice.polytech.robotproject.Robotdsl.Instruction");
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
    // InternalRobotdsl.g:160:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalRobotdsl.g:160:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalRobotdsl.g:161:2: iv_ruleInstruction= ruleInstruction EOF
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
    // InternalRobotdsl.g:167:1: ruleInstruction returns [EObject current=null] : this_Move_0= ruleMove ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Move_0 = null;



        	enterRule();

        try {
            // InternalRobotdsl.g:173:2: (this_Move_0= ruleMove )
            // InternalRobotdsl.g:174:2: this_Move_0= ruleMove
            {

            		newCompositeNode(grammarAccess.getInstructionAccess().getMoveParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Move_0=ruleMove();

            state._fsp--;


            		current = this_Move_0;
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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleMove"
    // InternalRobotdsl.g:185:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalRobotdsl.g:185:45: (iv_ruleMove= ruleMove EOF )
            // InternalRobotdsl.g:186:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
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
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalRobotdsl.g:192:1: ruleMove returns [EObject current=null] : ( () otherlv_1= 'Move' otherlv_2= '{' (otherlv_3= 'distance' ( (lv_distance_4_0= ruleEInt ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_distance_4_0 = null;



        	enterRule();

        try {
            // InternalRobotdsl.g:198:2: ( ( () otherlv_1= 'Move' otherlv_2= '{' (otherlv_3= 'distance' ( (lv_distance_4_0= ruleEInt ) ) )? otherlv_5= '}' ) )
            // InternalRobotdsl.g:199:2: ( () otherlv_1= 'Move' otherlv_2= '{' (otherlv_3= 'distance' ( (lv_distance_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            {
            // InternalRobotdsl.g:199:2: ( () otherlv_1= 'Move' otherlv_2= '{' (otherlv_3= 'distance' ( (lv_distance_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            // InternalRobotdsl.g:200:3: () otherlv_1= 'Move' otherlv_2= '{' (otherlv_3= 'distance' ( (lv_distance_4_0= ruleEInt ) ) )? otherlv_5= '}'
            {
            // InternalRobotdsl.g:200:3: ()
            // InternalRobotdsl.g:201:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoveAccess().getMoveAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getMoveKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getMoveAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRobotdsl.g:215:3: (otherlv_3= 'distance' ( (lv_distance_4_0= ruleEInt ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRobotdsl.g:216:4: otherlv_3= 'distance' ( (lv_distance_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getMoveAccess().getDistanceKeyword_3_0());
                    			
                    // InternalRobotdsl.g:220:4: ( (lv_distance_4_0= ruleEInt ) )
                    // InternalRobotdsl.g:221:5: (lv_distance_4_0= ruleEInt )
                    {
                    // InternalRobotdsl.g:221:5: (lv_distance_4_0= ruleEInt )
                    // InternalRobotdsl.g:222:6: lv_distance_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMoveAccess().getDistanceEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_distance_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMoveRule());
                    						}
                    						set(
                    							current,
                    							"distance",
                    							lv_distance_4_0,
                    							"fr.unice.polytech.robotproject.Robotdsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMoveAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleEInt"
    // InternalRobotdsl.g:248:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRobotdsl.g:248:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRobotdsl.g:249:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalRobotdsl.g:255:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRobotdsl.g:261:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRobotdsl.g:262:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRobotdsl.g:262:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRobotdsl.g:263:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRobotdsl.g:263:3: (kw= '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRobotdsl.g:264:4: kw= '-'
                    {
                    kw=(Token)match(input,18,FOLLOW_10); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});

}