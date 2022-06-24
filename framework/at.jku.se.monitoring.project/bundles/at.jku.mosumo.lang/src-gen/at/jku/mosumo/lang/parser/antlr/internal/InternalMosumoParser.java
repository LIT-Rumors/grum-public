package at.jku.mosumo.lang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.jku.mosumo.lang.services.MosumoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMosumoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MOConfig'", "'{'", "'namespace'", "'projectName'", "'defaultServer'", "'ePackage'", "'servers'", "','", "'}'", "'system'", "'Server'", "'connectionURL'", "'connectionOptions'", "'EPackage'", "'nsURI'", "'nsPrefix'", "'eAnnotations'", "'eClassifiers'", "'eSubpackages'", "'MoSystem'", "'eClass'", "'agents'", "'ConnectionOptions'", "'automaticReconnect'", "'cleanSession'", "'connectionTimeOut'", "'setMaxInflight'", "'true'", "'false'", "'-'", "'EAnnotation'", "'source'", "'references'", "'('", "')'", "'details'", "'contents'", "'EStringToStringMapEntry'", "'key'", "'value'", "'EObject'", "'ETypeParameter'", "'eBounds'", "'abstract'", "'interface'", "'EClass'", "'instanceClassName'", "'instanceTypeName'", "'eSuperTypes'", "'eTypeParameters'", "'eOperations'", "'eStructuralFeatures'", "'eGenericSuperTypes'", "'EDataType'", "'serializable'", "'EEnum'", "'eLiterals'", "'EGenericType'", "'eTypeParameter'", "'eClassifier'", "'eUpperBound'", "'eTypeArguments'", "'eLowerBound'", "'EOperation'", "'ordered'", "'unique'", "'lowerBound'", "'upperBound'", "'eType'", "'eExceptions'", "'eGenericType'", "'eParameters'", "'eGenericExceptions'", "'EParameter'", "'volatile'", "'transient'", "'unsettable'", "'derived'", "'iD'", "'EAttribute'", "'changeable'", "'defaultValueLiteral'", "'containment'", "'EReference'", "'resolveProxies'", "'eOpposite'", "'eKeys'", "'EEnumLiteral'", "'literal'", "'MOAgent'", "'topic'", "'sync'", "'server'", "'elements'", "'derivedproperties'", "'DerivedProperty'", "'MOProperty'", "'properties'", "'MOValue'", "'eAttribute'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalMosumoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMosumoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMosumoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMosumo.g"; }



     	private MosumoGrammarAccess grammarAccess;

        public InternalMosumoParser(TokenStream input, MosumoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MOConfig";
       	}

       	@Override
       	protected MosumoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMOConfig"
    // InternalMosumo.g:64:1: entryRuleMOConfig returns [EObject current=null] : iv_ruleMOConfig= ruleMOConfig EOF ;
    public final EObject entryRuleMOConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMOConfig = null;


        try {
            // InternalMosumo.g:64:49: (iv_ruleMOConfig= ruleMOConfig EOF )
            // InternalMosumo.g:65:2: iv_ruleMOConfig= ruleMOConfig EOF
            {
             newCompositeNode(grammarAccess.getMOConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMOConfig=ruleMOConfig();

            state._fsp--;

             current =iv_ruleMOConfig; 
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
    // $ANTLR end "entryRuleMOConfig"


    // $ANTLR start "ruleMOConfig"
    // InternalMosumo.g:71:1: ruleMOConfig returns [EObject current=null] : (otherlv_0= 'MOConfig' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) )? (otherlv_5= 'projectName' ( (lv_projectName_6_0= ruleEString ) ) )? otherlv_7= 'defaultServer' ( ( ruleEString ) ) otherlv_9= 'ePackage' ( ( ruleEString ) ) (otherlv_11= 'servers' otherlv_12= '{' ( (lv_servers_13_0= ruleServer ) ) (otherlv_14= ',' ( (lv_servers_15_0= ruleServer ) ) )* otherlv_16= '}' )? otherlv_17= 'system' ( (lv_system_18_0= ruleMoSystem ) ) otherlv_19= '}' ) ;
    public final EObject ruleMOConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_namespace_4_0 = null;

        AntlrDatatypeRuleToken lv_projectName_6_0 = null;

        EObject lv_servers_13_0 = null;

        EObject lv_servers_15_0 = null;

        EObject lv_system_18_0 = null;



        	enterRule();

        try {
            // InternalMosumo.g:77:2: ( (otherlv_0= 'MOConfig' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) )? (otherlv_5= 'projectName' ( (lv_projectName_6_0= ruleEString ) ) )? otherlv_7= 'defaultServer' ( ( ruleEString ) ) otherlv_9= 'ePackage' ( ( ruleEString ) ) (otherlv_11= 'servers' otherlv_12= '{' ( (lv_servers_13_0= ruleServer ) ) (otherlv_14= ',' ( (lv_servers_15_0= ruleServer ) ) )* otherlv_16= '}' )? otherlv_17= 'system' ( (lv_system_18_0= ruleMoSystem ) ) otherlv_19= '}' ) )
            // InternalMosumo.g:78:2: (otherlv_0= 'MOConfig' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) )? (otherlv_5= 'projectName' ( (lv_projectName_6_0= ruleEString ) ) )? otherlv_7= 'defaultServer' ( ( ruleEString ) ) otherlv_9= 'ePackage' ( ( ruleEString ) ) (otherlv_11= 'servers' otherlv_12= '{' ( (lv_servers_13_0= ruleServer ) ) (otherlv_14= ',' ( (lv_servers_15_0= ruleServer ) ) )* otherlv_16= '}' )? otherlv_17= 'system' ( (lv_system_18_0= ruleMoSystem ) ) otherlv_19= '}' )
            {
            // InternalMosumo.g:78:2: (otherlv_0= 'MOConfig' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) )? (otherlv_5= 'projectName' ( (lv_projectName_6_0= ruleEString ) ) )? otherlv_7= 'defaultServer' ( ( ruleEString ) ) otherlv_9= 'ePackage' ( ( ruleEString ) ) (otherlv_11= 'servers' otherlv_12= '{' ( (lv_servers_13_0= ruleServer ) ) (otherlv_14= ',' ( (lv_servers_15_0= ruleServer ) ) )* otherlv_16= '}' )? otherlv_17= 'system' ( (lv_system_18_0= ruleMoSystem ) ) otherlv_19= '}' )
            // InternalMosumo.g:79:3: otherlv_0= 'MOConfig' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) )? (otherlv_5= 'projectName' ( (lv_projectName_6_0= ruleEString ) ) )? otherlv_7= 'defaultServer' ( ( ruleEString ) ) otherlv_9= 'ePackage' ( ( ruleEString ) ) (otherlv_11= 'servers' otherlv_12= '{' ( (lv_servers_13_0= ruleServer ) ) (otherlv_14= ',' ( (lv_servers_15_0= ruleServer ) ) )* otherlv_16= '}' )? otherlv_17= 'system' ( (lv_system_18_0= ruleMoSystem ) ) otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMOConfigAccess().getMOConfigKeyword_0());
            		
            // InternalMosumo.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMosumo.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalMosumo.g:84:4: (lv_name_1_0= ruleEString )
            // InternalMosumo.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMOConfigAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMOConfigRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"at.jku.mosumo.lang.Mosumo.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMOConfigAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMosumo.g:106:3: (otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMosumo.g:107:4: otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMOConfigAccess().getNamespaceKeyword_3_0());
                    			
                    // InternalMosumo.g:111:4: ( (lv_namespace_4_0= ruleEString ) )
                    // InternalMosumo.g:112:5: (lv_namespace_4_0= ruleEString )
                    {
                    // InternalMosumo.g:112:5: (lv_namespace_4_0= ruleEString )
                    // InternalMosumo.g:113:6: lv_namespace_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMOConfigAccess().getNamespaceEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_namespace_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMOConfigRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_4_0,
                    							"at.jku.mosumo.lang.Mosumo.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:131:3: (otherlv_5= 'projectName' ( (lv_projectName_6_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMosumo.g:132:4: otherlv_5= 'projectName' ( (lv_projectName_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getMOConfigAccess().getProjectNameKeyword_4_0());
                    			
                    // InternalMosumo.g:136:4: ( (lv_projectName_6_0= ruleEString ) )
                    // InternalMosumo.g:137:5: (lv_projectName_6_0= ruleEString )
                    {
                    // InternalMosumo.g:137:5: (lv_projectName_6_0= ruleEString )
                    // InternalMosumo.g:138:6: lv_projectName_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMOConfigAccess().getProjectNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_projectName_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMOConfigRule());
                    						}
                    						set(
                    							current,
                    							"projectName",
                    							lv_projectName_6_0,
                    							"at.jku.mosumo.lang.Mosumo.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getMOConfigAccess().getDefaultServerKeyword_5());
            		
            // InternalMosumo.g:160:3: ( ( ruleEString ) )
            // InternalMosumo.g:161:4: ( ruleEString )
            {
            // InternalMosumo.g:161:4: ( ruleEString )
            // InternalMosumo.g:162:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMOConfigRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMOConfigAccess().getDefaultServerServerCrossReference_6_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getMOConfigAccess().getEPackageKeyword_7());
            		
            // InternalMosumo.g:180:3: ( ( ruleEString ) )
            // InternalMosumo.g:181:4: ( ruleEString )
            {
            // InternalMosumo.g:181:4: ( ruleEString )
            // InternalMosumo.g:182:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMOConfigRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMOConfigAccess().getEPackageEPackageCrossReference_8_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMosumo.g:196:3: (otherlv_11= 'servers' otherlv_12= '{' ( (lv_servers_13_0= ruleServer ) ) (otherlv_14= ',' ( (lv_servers_15_0= ruleServer ) ) )* otherlv_16= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMosumo.g:197:4: otherlv_11= 'servers' otherlv_12= '{' ( (lv_servers_13_0= ruleServer ) ) (otherlv_14= ',' ( (lv_servers_15_0= ruleServer ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getMOConfigAccess().getServersKeyword_9_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getMOConfigAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalMosumo.g:205:4: ( (lv_servers_13_0= ruleServer ) )
                    // InternalMosumo.g:206:5: (lv_servers_13_0= ruleServer )
                    {
                    // InternalMosumo.g:206:5: (lv_servers_13_0= ruleServer )
                    // InternalMosumo.g:207:6: lv_servers_13_0= ruleServer
                    {

                    						newCompositeNode(grammarAccess.getMOConfigAccess().getServersServerParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_servers_13_0=ruleServer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMOConfigRule());
                    						}
                    						add(
                    							current,
                    							"servers",
                    							lv_servers_13_0,
                    							"at.jku.mosumo.lang.Mosumo.Server");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:224:4: (otherlv_14= ',' ( (lv_servers_15_0= ruleServer ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==18) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMosumo.g:225:5: otherlv_14= ',' ( (lv_servers_15_0= ruleServer ) )
                    	    {
                    	    otherlv_14=(Token)match(input,18,FOLLOW_10); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getMOConfigAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMosumo.g:229:5: ( (lv_servers_15_0= ruleServer ) )
                    	    // InternalMosumo.g:230:6: (lv_servers_15_0= ruleServer )
                    	    {
                    	    // InternalMosumo.g:230:6: (lv_servers_15_0= ruleServer )
                    	    // InternalMosumo.g:231:7: lv_servers_15_0= ruleServer
                    	    {

                    	    							newCompositeNode(grammarAccess.getMOConfigAccess().getServersServerParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_servers_15_0=ruleServer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMOConfigRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"servers",
                    	    								lv_servers_15_0,
                    	    								"at.jku.mosumo.lang.Mosumo.Server");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_16, grammarAccess.getMOConfigAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_17, grammarAccess.getMOConfigAccess().getSystemKeyword_10());
            		
            // InternalMosumo.g:258:3: ( (lv_system_18_0= ruleMoSystem ) )
            // InternalMosumo.g:259:4: (lv_system_18_0= ruleMoSystem )
            {
            // InternalMosumo.g:259:4: (lv_system_18_0= ruleMoSystem )
            // InternalMosumo.g:260:5: lv_system_18_0= ruleMoSystem
            {

            					newCompositeNode(grammarAccess.getMOConfigAccess().getSystemMoSystemParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_14);
            lv_system_18_0=ruleMoSystem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMOConfigRule());
            					}
            					set(
            						current,
            						"system",
            						lv_system_18_0,
            						"at.jku.mosumo.lang.Mosumo.MoSystem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getMOConfigAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleMOConfig"


    // $ANTLR start "entryRuleEClassifier"
    // InternalMosumo.g:285:1: entryRuleEClassifier returns [EObject current=null] : iv_ruleEClassifier= ruleEClassifier EOF ;
    public final EObject entryRuleEClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClassifier = null;


        try {
            // InternalMosumo.g:285:52: (iv_ruleEClassifier= ruleEClassifier EOF )
            // InternalMosumo.g:286:2: iv_ruleEClassifier= ruleEClassifier EOF
            {
             newCompositeNode(grammarAccess.getEClassifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEClassifier=ruleEClassifier();

            state._fsp--;

             current =iv_ruleEClassifier; 
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
    // $ANTLR end "entryRuleEClassifier"


    // $ANTLR start "ruleEClassifier"
    // InternalMosumo.g:292:1: ruleEClassifier returns [EObject current=null] : (this_EClass_0= ruleEClass | this_EDataType_Impl_1= ruleEDataType_Impl | this_EEnum_2= ruleEEnum ) ;
    public final EObject ruleEClassifier() throws RecognitionException {
        EObject current = null;

        EObject this_EClass_0 = null;

        EObject this_EDataType_Impl_1 = null;

        EObject this_EEnum_2 = null;



        	enterRule();

        try {
            // InternalMosumo.g:298:2: ( (this_EClass_0= ruleEClass | this_EDataType_Impl_1= ruleEDataType_Impl | this_EEnum_2= ruleEEnum ) )
            // InternalMosumo.g:299:2: (this_EClass_0= ruleEClass | this_EDataType_Impl_1= ruleEDataType_Impl | this_EEnum_2= ruleEEnum )
            {
            // InternalMosumo.g:299:2: (this_EClass_0= ruleEClass | this_EDataType_Impl_1= ruleEDataType_Impl | this_EEnum_2= ruleEEnum )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 54:
            case 55:
            case 56:
                {
                alt5=1;
                }
                break;
            case 64:
                {
                alt5=2;
                }
                break;
            case 66:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMosumo.g:300:3: this_EClass_0= ruleEClass
                    {

                    			newCompositeNode(grammarAccess.getEClassifierAccess().getEClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EClass_0=ruleEClass();

                    state._fsp--;


                    			current = this_EClass_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMosumo.g:309:3: this_EDataType_Impl_1= ruleEDataType_Impl
                    {

                    			newCompositeNode(grammarAccess.getEClassifierAccess().getEDataType_ImplParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EDataType_Impl_1=ruleEDataType_Impl();

                    state._fsp--;


                    			current = this_EDataType_Impl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMosumo.g:318:3: this_EEnum_2= ruleEEnum
                    {

                    			newCompositeNode(grammarAccess.getEClassifierAccess().getEEnumParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EEnum_2=ruleEEnum();

                    state._fsp--;


                    			current = this_EEnum_2;
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
    // $ANTLR end "ruleEClassifier"


    // $ANTLR start "entryRuleEStructuralFeature"
    // InternalMosumo.g:330:1: entryRuleEStructuralFeature returns [EObject current=null] : iv_ruleEStructuralFeature= ruleEStructuralFeature EOF ;
    public final EObject entryRuleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStructuralFeature = null;


        try {
            // InternalMosumo.g:330:59: (iv_ruleEStructuralFeature= ruleEStructuralFeature EOF )
            // InternalMosumo.g:331:2: iv_ruleEStructuralFeature= ruleEStructuralFeature EOF
            {
             newCompositeNode(grammarAccess.getEStructuralFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEStructuralFeature=ruleEStructuralFeature();

            state._fsp--;

             current =iv_ruleEStructuralFeature; 
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
    // $ANTLR end "entryRuleEStructuralFeature"


    // $ANTLR start "ruleEStructuralFeature"
    // InternalMosumo.g:337:1: ruleEStructuralFeature returns [EObject current=null] : (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) ;
    public final EObject ruleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject this_EAttribute_0 = null;

        EObject this_EReference_1 = null;



        	enterRule();

        try {
            // InternalMosumo.g:343:2: ( (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) )
            // InternalMosumo.g:344:2: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            {
            // InternalMosumo.g:344:2: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            int alt6=2;
            switch ( input.LA(1) ) {
            case 85:
                {
                switch ( input.LA(2) ) {
                case 86:
                    {
                    switch ( input.LA(3) ) {
                    case 87:
                        {
                        switch ( input.LA(4) ) {
                        case 88:
                            {
                            int LA6_4 = input.LA(5);

                            if ( ((LA6_4>=89 && LA6_4<=90)) ) {
                                alt6=1;
                            }
                            else if ( ((LA6_4>=93 && LA6_4<=94)) ) {
                                alt6=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 4, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 93:
                        case 94:
                            {
                            alt6=2;
                            }
                            break;
                        case 89:
                        case 90:
                            {
                            alt6=1;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 88:
                        {
                        int LA6_4 = input.LA(4);

                        if ( ((LA6_4>=89 && LA6_4<=90)) ) {
                            alt6=1;
                        }
                        else if ( ((LA6_4>=93 && LA6_4<=94)) ) {
                            alt6=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 89:
                    case 90:
                        {
                        alt6=1;
                        }
                        break;
                    case 93:
                    case 94:
                        {
                        alt6=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case 87:
                    {
                    switch ( input.LA(3) ) {
                    case 88:
                        {
                        int LA6_4 = input.LA(4);

                        if ( ((LA6_4>=89 && LA6_4<=90)) ) {
                            alt6=1;
                        }
                        else if ( ((LA6_4>=93 && LA6_4<=94)) ) {
                            alt6=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 93:
                    case 94:
                        {
                        alt6=2;
                        }
                        break;
                    case 89:
                    case 90:
                        {
                        alt6=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 88:
                    {
                    int LA6_4 = input.LA(3);

                    if ( ((LA6_4>=89 && LA6_4<=90)) ) {
                        alt6=1;
                    }
                    else if ( ((LA6_4>=93 && LA6_4<=94)) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 93:
                case 94:
                    {
                    alt6=2;
                    }
                    break;
                case 89:
                case 90:
                    {
                    alt6=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

                }
                break;
            case 86:
                {
                switch ( input.LA(2) ) {
                case 87:
                    {
                    switch ( input.LA(3) ) {
                    case 88:
                        {
                        int LA6_4 = input.LA(4);

                        if ( ((LA6_4>=89 && LA6_4<=90)) ) {
                            alt6=1;
                        }
                        else if ( ((LA6_4>=93 && LA6_4<=94)) ) {
                            alt6=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 93:
                    case 94:
                        {
                        alt6=2;
                        }
                        break;
                    case 89:
                    case 90:
                        {
                        alt6=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 88:
                    {
                    int LA6_4 = input.LA(3);

                    if ( ((LA6_4>=89 && LA6_4<=90)) ) {
                        alt6=1;
                    }
                    else if ( ((LA6_4>=93 && LA6_4<=94)) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 89:
                case 90:
                    {
                    alt6=1;
                    }
                    break;
                case 93:
                case 94:
                    {
                    alt6=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }

                }
                break;
            case 87:
                {
                switch ( input.LA(2) ) {
                case 88:
                    {
                    int LA6_4 = input.LA(3);

                    if ( ((LA6_4>=89 && LA6_4<=90)) ) {
                        alt6=1;
                    }
                    else if ( ((LA6_4>=93 && LA6_4<=94)) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 93:
                case 94:
                    {
                    alt6=2;
                    }
                    break;
                case 89:
                case 90:
                    {
                    alt6=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }

                }
                break;
            case 88:
                {
                int LA6_4 = input.LA(2);

                if ( ((LA6_4>=89 && LA6_4<=90)) ) {
                    alt6=1;
                }
                else if ( ((LA6_4>=93 && LA6_4<=94)) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;
                }
                }
                break;
            case 89:
            case 90:
                {
                alt6=1;
                }
                break;
            case 93:
            case 94:
                {
                alt6=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMosumo.g:345:3: this_EAttribute_0= ruleEAttribute
                    {

                    			newCompositeNode(grammarAccess.getEStructuralFeatureAccess().getEAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EAttribute_0=ruleEAttribute();

                    state._fsp--;


                    			current = this_EAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMosumo.g:354:3: this_EReference_1= ruleEReference
                    {

                    			newCompositeNode(grammarAccess.getEStructuralFeatureAccess().getEReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EReference_1=ruleEReference();

                    state._fsp--;


                    			current = this_EReference_1;
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
    // $ANTLR end "ruleEStructuralFeature"


    // $ANTLR start "entryRuleMOElement"
    // InternalMosumo.g:366:1: entryRuleMOElement returns [EObject current=null] : iv_ruleMOElement= ruleMOElement EOF ;
    public final EObject entryRuleMOElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMOElement = null;


        try {
            // InternalMosumo.g:366:50: (iv_ruleMOElement= ruleMOElement EOF )
            // InternalMosumo.g:367:2: iv_ruleMOElement= ruleMOElement EOF
            {
             newCompositeNode(grammarAccess.getMOElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMOElement=ruleMOElement();

            state._fsp--;

             current =iv_ruleMOElement; 
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
    // $ANTLR end "entryRuleMOElement"


    // $ANTLR start "ruleMOElement"
    // InternalMosumo.g:373:1: ruleMOElement returns [EObject current=null] : (this_MOProperty_0= ruleMOProperty | this_MOValue_1= ruleMOValue ) ;
    public final EObject ruleMOElement() throws RecognitionException {
        EObject current = null;

        EObject this_MOProperty_0 = null;

        EObject this_MOValue_1 = null;



        	enterRule();

        try {
            // InternalMosumo.g:379:2: ( (this_MOProperty_0= ruleMOProperty | this_MOValue_1= ruleMOValue ) )
            // InternalMosumo.g:380:2: (this_MOProperty_0= ruleMOProperty | this_MOValue_1= ruleMOValue )
            {
            // InternalMosumo.g:380:2: (this_MOProperty_0= ruleMOProperty | this_MOValue_1= ruleMOValue )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==107) ) {
                alt7=1;
            }
            else if ( (LA7_0==109) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMosumo.g:381:3: this_MOProperty_0= ruleMOProperty
                    {

                    			newCompositeNode(grammarAccess.getMOElementAccess().getMOPropertyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MOProperty_0=ruleMOProperty();

                    state._fsp--;


                    			current = this_MOProperty_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMosumo.g:390:3: this_MOValue_1= ruleMOValue
                    {

                    			newCompositeNode(grammarAccess.getMOElementAccess().getMOValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MOValue_1=ruleMOValue();

                    state._fsp--;


                    			current = this_MOValue_1;
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
    // $ANTLR end "ruleMOElement"


    // $ANTLR start "entryRuleEString"
    // InternalMosumo.g:402:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMosumo.g:402:47: (iv_ruleEString= ruleEString EOF )
            // InternalMosumo.g:403:2: iv_ruleEString= ruleEString EOF
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
    // InternalMosumo.g:409:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMosumo.g:415:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMosumo.g:416:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMosumo.g:416:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMosumo.g:417:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMosumo.g:425:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleServer"
    // InternalMosumo.g:436:1: entryRuleServer returns [EObject current=null] : iv_ruleServer= ruleServer EOF ;
    public final EObject entryRuleServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServer = null;


        try {
            // InternalMosumo.g:436:47: (iv_ruleServer= ruleServer EOF )
            // InternalMosumo.g:437:2: iv_ruleServer= ruleServer EOF
            {
             newCompositeNode(grammarAccess.getServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServer=ruleServer();

            state._fsp--;

             current =iv_ruleServer; 
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
    // $ANTLR end "entryRuleServer"


    // $ANTLR start "ruleServer"
    // InternalMosumo.g:443:1: ruleServer returns [EObject current=null] : ( () otherlv_1= 'Server' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connectionURL' ( (lv_connectionURL_5_0= ruleEString ) ) )? (otherlv_6= 'connectionOptions' ( (lv_connectionOptions_7_0= ruleConnectionOptions ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_connectionURL_5_0 = null;

        EObject lv_connectionOptions_7_0 = null;



        	enterRule();

        try {
            // InternalMosumo.g:449:2: ( ( () otherlv_1= 'Server' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connectionURL' ( (lv_connectionURL_5_0= ruleEString ) ) )? (otherlv_6= 'connectionOptions' ( (lv_connectionOptions_7_0= ruleConnectionOptions ) ) )? otherlv_8= '}' ) )
            // InternalMosumo.g:450:2: ( () otherlv_1= 'Server' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connectionURL' ( (lv_connectionURL_5_0= ruleEString ) ) )? (otherlv_6= 'connectionOptions' ( (lv_connectionOptions_7_0= ruleConnectionOptions ) ) )? otherlv_8= '}' )
            {
            // InternalMosumo.g:450:2: ( () otherlv_1= 'Server' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connectionURL' ( (lv_connectionURL_5_0= ruleEString ) ) )? (otherlv_6= 'connectionOptions' ( (lv_connectionOptions_7_0= ruleConnectionOptions ) ) )? otherlv_8= '}' )
            // InternalMosumo.g:451:3: () otherlv_1= 'Server' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connectionURL' ( (lv_connectionURL_5_0= ruleEString ) ) )? (otherlv_6= 'connectionOptions' ( (lv_connectionOptions_7_0= ruleConnectionOptions ) ) )? otherlv_8= '}'
            {
            // InternalMosumo.g:451:3: ()
            // InternalMosumo.g:452:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServerAccess().getServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getServerAccess().getServerKeyword_1());
            		
            // InternalMosumo.g:462:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMosumo.g:463:4: (lv_name_2_0= ruleEString )
            {
            // InternalMosumo.g:463:4: (lv_name_2_0= ruleEString )
            // InternalMosumo.g:464:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"at.jku.mosumo.lang.Mosumo.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMosumo.g:485:3: (otherlv_4= 'connectionURL' ( (lv_connectionURL_5_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMosumo.g:486:4: otherlv_4= 'connectionURL' ( (lv_connectionURL_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getServerAccess().getConnectionURLKeyword_4_0());
                    			
                    // InternalMosumo.g:490:4: ( (lv_connectionURL_5_0= ruleEString ) )
                    // InternalMosumo.g:491:5: (lv_connectionURL_5_0= ruleEString )
                    {
                    // InternalMosumo.g:491:5: (lv_connectionURL_5_0= ruleEString )
                    // InternalMosumo.g:492:6: lv_connectionURL_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServerAccess().getConnectionURLEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_connectionURL_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServerRule());
                    						}
                    						set(
                    							current,
                    							"connectionURL",
                    							lv_connectionURL_5_0,
                    							"at.jku.mosumo.lang.Mosumo.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:510:3: (otherlv_6= 'connectionOptions' ( (lv_connectionOptions_7_0= ruleConnectionOptions ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMosumo.g:511:4: otherlv_6= 'connectionOptions' ( (lv_connectionOptions_7_0= ruleConnectionOptions ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getServerAccess().getConnectionOptionsKeyword_5_0());
                    			
                    // InternalMosumo.g:515:4: ( (lv_connectionOptions_7_0= ruleConnectionOptions ) )
                    // InternalMosumo.g:516:5: (lv_connectionOptions_7_0= ruleConnectionOptions )
                    {
                    // InternalMosumo.g:516:5: (lv_connectionOptions_7_0= ruleConnectionOptions )
                    // InternalMosumo.g:517:6: lv_connectionOptions_7_0= ruleConnectionOptions
                    {

                    						newCompositeNode(grammarAccess.getServerAccess().getConnectionOptionsConnectionOptionsParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_connectionOptions_7_0=ruleConnectionOptions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServerRule());
                    						}
                    						set(
                    							current,
                    							"connectionOptions",
                    							lv_connectionOptions_7_0,
                    							"at.jku.mosumo.lang.Mosumo.ConnectionOptions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getServerAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleServer"


    // $ANTLR start "entryRuleEPackage"
    // InternalMosumo.g:543:1: entryRuleEPackage returns [EObject current=null] : iv_ruleEPackage= ruleEPackage EOF ;
    public final EObject entryRuleEPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPackage = null;


        try {
            // InternalMosumo.g:543:49: (iv_ruleEPackage= ruleEPackage EOF )
            // InternalMosumo.g:544:2: iv_ruleEPackage= ruleEPackage EOF
            {
             newCompositeNode(grammarAccess.getEPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPackage=ruleEPackage();

            state._fsp--;

             current =iv_ruleEPackage; 
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
    // $ANTLR end "entryRuleEPackage"


    // $ANTLR start "ruleEPackage"
    // InternalMosumo.g:550:1: ruleEPackage returns [EObject current=null] : ( () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) ;
    public final EObject ruleEPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_nsURI_5_0 = null;

        AntlrDatatypeRuleToken lv_nsPrefix_7_0 = null;

        EObject lv_eAnnotations_10_0 = null;

        EObject lv_eAnnotations_12_0 = null;

        EObject lv_eClassifiers_16_0 = null;

        EObject lv_eClassifiers_18_0 = null;

        EObject lv_eSubpackages_22_0 = null;

        EObject lv_eSubpackages_24_0 = null;



        	enterRule();

        try {
            // InternalMosumo.g:556:2: ( ( () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) )
            // InternalMosumo.g:557:2: ( () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            {
            // InternalMosumo.g:557:2: ( () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            // InternalMosumo.g:558:3: () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}'
            {
            // InternalMosumo.g:558:3: ()
            // InternalMosumo.g:559:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPackageAccess().getEPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEPackageAccess().getEPackageKeyword_1());
            		
            // InternalMosumo.g:569:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMosumo.g:570:4: (lv_name_2_0= ruleEString )
            {
            // InternalMosumo.g:570:4: (lv_name_2_0= ruleEString )
            // InternalMosumo.g:571:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEPackageAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"at.jku.mosumo.lang.Mosumo.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getEPackageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMosumo.g:592:3: (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMosumo.g:593:4: otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEPackageAccess().getNsURIKeyword_4_0());
                    			
                    // InternalMosumo.g:597:4: ( (lv_nsURI_5_0= ruleEString ) )
                    // InternalMosumo.g:598:5: (lv_nsURI_5_0= ruleEString )
                    {
                    // InternalMosumo.g:598:5: (lv_nsURI_5_0= ruleEString )
                    // InternalMosumo.g:599:6: lv_nsURI_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEPackageAccess().getNsURIEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_nsURI_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEPackageRule());
                    						}
                    						set(
                    							current,
                    							"nsURI",
                    							lv_nsURI_5_0,
                    							"at.jku.mosumo.lang.Mosumo.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:617:3: (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMosumo.g:618:4: otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEPackageAccess().getNsPrefixKeyword_5_0());
                    			
                    // InternalMosumo.g:622:4: ( (lv_nsPrefix_7_0= ruleEString ) )
                    // InternalMosumo.g:623:5: (lv_nsPrefix_7_0= ruleEString )
                    {
                    // InternalMosumo.g:623:5: (lv_nsPrefix_7_0= ruleEString )
                    // InternalMosumo.g:624:6: lv_nsPrefix_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEPackageAccess().getNsPrefixEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_nsPrefix_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEPackageRule());
                    						}
                    						set(
                    							current,
                    							"nsPrefix",
                    							lv_nsPrefix_7_0,
                    							"at.jku.mosumo.lang.Mosumo.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:642:3: (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMosumo.g:643:4: otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEPackageAccess().getEAnnotationsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getEPackageAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalMosumo.g:651:4: ( (lv_eAnnotations_10_0= ruleEAnnotation ) )
                    // InternalMosumo.g:652:5: (lv_eAnnotations_10_0= ruleEAnnotation )
                    {
                    // InternalMosumo.g:652:5: (lv_eAnnotations_10_0= ruleEAnnotation )
                    // InternalMosumo.g:653:6: lv_eAnnotations_10_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEPackageAccess().getEAnnotationsEAnnotationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eAnnotations_10_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEPackageRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_10_0,
                    							"at.jku.mosumo.lang.Mosumo.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:670:4: (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==18) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMosumo.g:671:5: otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,18,FOLLOW_21); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getEPackageAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMosumo.g:675:5: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    // InternalMosumo.g:676:6: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    {
                    	    // InternalMosumo.g:676:6: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    // InternalMosumo.g:677:7: lv_eAnnotations_12_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEPackageAccess().getEAnnotationsEAnnotationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eAnnotations_12_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_12_0,
                    	    								"at.jku.mosumo.lang.Mosumo.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,19,FOLLOW_22); 

                    				newLeafNode(otherlv_13, grammarAccess.getEPackageAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:700:3: (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMosumo.g:701:4: otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getEPackageAccess().getEClassifiersKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_15, grammarAccess.getEPackageAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMosumo.g:709:4: ( (lv_eClassifiers_16_0= ruleEClassifier ) )
                    // InternalMosumo.g:710:5: (lv_eClassifiers_16_0= ruleEClassifier )
                    {
                    // InternalMosumo.g:710:5: (lv_eClassifiers_16_0= ruleEClassifier )
                    // InternalMosumo.g:711:6: lv_eClassifiers_16_0= ruleEClassifier
                    {

                    						newCompositeNode(grammarAccess.getEPackageAccess().getEClassifiersEClassifierParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eClassifiers_16_0=ruleEClassifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEPackageRule());
                    						}
                    						add(
                    							current,
                    							"eClassifiers",
                    							lv_eClassifiers_16_0,
                    							"at.jku.mosumo.lang.Mosumo.EClassifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:728:4: (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==18) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalMosumo.g:729:5: otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) )
                    	    {
                    	    otherlv_17=(Token)match(input,18,FOLLOW_23); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEPackageAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMosumo.g:733:5: ( (lv_eClassifiers_18_0= ruleEClassifier ) )
                    	    // InternalMosumo.g:734:6: (lv_eClassifiers_18_0= ruleEClassifier )
                    	    {
                    	    // InternalMosumo.g:734:6: (lv_eClassifiers_18_0= ruleEClassifier )
                    	    // InternalMosumo.g:735:7: lv_eClassifiers_18_0= ruleEClassifier
                    	    {

                    	    							newCompositeNode(grammarAccess.getEPackageAccess().getEClassifiersEClassifierParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eClassifiers_18_0=ruleEClassifier();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eClassifiers",
                    	    								lv_eClassifiers_18_0,
                    	    								"at.jku.mosumo.lang.Mosumo.EClassifier");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,19,FOLLOW_24); 

                    				newLeafNode(otherlv_19, grammarAccess.getEPackageAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:758:3: (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMosumo.g:759:4: otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getEPackageAccess().getESubpackagesKeyword_8_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_21, grammarAccess.getEPackageAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalMosumo.g:767:4: ( (lv_eSubpackages_22_0= ruleEPackage ) )
                    // InternalMosumo.g:768:5: (lv_eSubpackages_22_0= ruleEPackage )
                    {
                    // InternalMosumo.g:768:5: (lv_eSubpackages_22_0= ruleEPackage )
                    // InternalMosumo.g:769:6: lv_eSubpackages_22_0= ruleEPackage
                    {

                    						newCompositeNode(grammarAccess.getEPackageAccess().getESubpackagesEPackageParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eSubpackages_22_0=ruleEPackage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEPackageRule());
                    						}
                    						add(
                    							current,
                    							"eSubpackages",
                    							lv_eSubpackages_22_0,
                    							"at.jku.mosumo.lang.Mosumo.EPackage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:786:4: (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==18) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalMosumo.g:787:5: otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) )
                    	    {
                    	    otherlv_23=(Token)match(input,18,FOLLOW_25); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getEPackageAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalMosumo.g:791:5: ( (lv_eSubpackages_24_0= ruleEPackage ) )
                    	    // InternalMosumo.g:792:6: (lv_eSubpackages_24_0= ruleEPackage )
                    	    {
                    	    // InternalMosumo.g:792:6: (lv_eSubpackages_24_0= ruleEPackage )
                    	    // InternalMosumo.g:793:7: lv_eSubpackages_24_0= ruleEPackage
                    	    {

                    	    							newCompositeNode(grammarAccess.getEPackageAccess().getESubpackagesEPackageParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eSubpackages_24_0=ruleEPackage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eSubpackages",
                    	    								lv_eSubpackages_24_0,
                    	    								"at.jku.mosumo.lang.Mosumo.EPackage");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_25, grammarAccess.getEPackageAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_26=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getEPackageAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleEPackage"


    // $ANTLR start "entryRuleMoSystem"
    // InternalMosumo.g:824:1: entryRuleMoSystem returns [EObject current=null] : iv_ruleMoSystem= ruleMoSystem EOF ;
    public final EObject entryRuleMoSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoSystem = null;


        try {
            // InternalMosumo.g:824:49: (iv_ruleMoSystem= ruleMoSystem EOF )
            // InternalMosumo.g:825:2: iv_ruleMoSystem= ruleMoSystem EOF
            {
             newCompositeNode(grammarAccess.getMoSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoSystem=ruleMoSystem();

            state._fsp--;

             current =iv_ruleMoSystem; 
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
    // $ANTLR end "entryRuleMoSystem"


    // $ANTLR start "ruleMoSystem"
    // InternalMosumo.g:831:1: ruleMoSystem returns [EObject current=null] : ( () otherlv_1= 'MoSystem' otherlv_2= '{' (otherlv_3= 'eClass' ( ( ruleEString ) ) )? (otherlv_5= 'agents' otherlv_6= '{' ( (lv_agents_7_0= ruleMOAgent ) ) (otherlv_8= ',' ( (lv_agents_9_0= ruleMOAgent ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleMoSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_agents_7_0 = null;

        EObject lv_agents_9_0 = null;



        	enterRule();

        try {
            // InternalMosumo.g:837:2: ( ( () otherlv_1= 'MoSystem' otherlv_2= '{' (otherlv_3= 'eClass' ( ( ruleEString ) ) )? (otherlv_5= 'agents' otherlv_6= '{' ( (lv_agents_7_0= ruleMOAgent ) ) (otherlv_8= ',' ( (lv_agents_9_0= ruleMOAgent ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalMosumo.g:838:2: ( () otherlv_1= 'MoSystem' otherlv_2= '{' (otherlv_3= 'eClass' ( ( ruleEString ) ) )? (otherlv_5= 'agents' otherlv_6= '{' ( (lv_agents_7_0= ruleMOAgent ) ) (otherlv_8= ',' ( (lv_agents_9_0= ruleMOAgent ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalMosumo.g:838:2: ( () otherlv_1= 'MoSystem' otherlv_2= '{' (otherlv_3= 'eClass' ( ( ruleEString ) ) )? (otherlv_5= 'agents' otherlv_6= '{' ( (lv_agents_7_0= ruleMOAgent ) ) (otherlv_8= ',' ( (lv_agents_9_0= ruleMOAgent ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalMosumo.g:839:3: () otherlv_1= 'MoSystem' otherlv_2= '{' (otherlv_3= 'eClass' ( ( ruleEString ) ) )? (otherlv_5= 'agents' otherlv_6= '{' ( (lv_agents_7_0= ruleMOAgent ) ) (otherlv_8= ',' ( (lv_agents_9_0= ruleMOAgent ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalMosumo.g:839:3: ()
            // InternalMosumo.g:840:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoSystemAccess().getMoSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMoSystemAccess().getMoSystemKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getMoSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMosumo.g:854:3: (otherlv_3= 'eClass' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMosumo.g:855:4: otherlv_3= 'eClass' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMoSystemAccess().getEClassKeyword_3_0());
                    			
                    // InternalMosumo.g:859:4: ( ( ruleEString ) )
                    // InternalMosumo.g:860:5: ( ruleEString )
                    {
                    // InternalMosumo.g:860:5: ( ruleEString )
                    // InternalMosumo.g:861:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMoSystemRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMoSystemAccess().getEClassEClassCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:876:3: (otherlv_5= 'agents' otherlv_6= '{' ( (lv_agents_7_0= ruleMOAgent ) ) (otherlv_8= ',' ( (lv_agents_9_0= ruleMOAgent ) ) )* otherlv_10= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMosumo.g:877:4: otherlv_5= 'agents' otherlv_6= '{' ( (lv_agents_7_0= ruleMOAgent ) ) (otherlv_8= ',' ( (lv_agents_9_0= ruleMOAgent ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getMoSystemAccess().getAgentsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getMoSystemAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMosumo.g:885:4: ( (lv_agents_7_0= ruleMOAgent ) )
                    // InternalMosumo.g:886:5: (lv_agents_7_0= ruleMOAgent )
                    {
                    // InternalMosumo.g:886:5: (lv_agents_7_0= ruleMOAgent )
                    // InternalMosumo.g:887:6: lv_agents_7_0= ruleMOAgent
                    {

                    						newCompositeNode(grammarAccess.getMoSystemAccess().getAgentsMOAgentParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_agents_7_0=ruleMOAgent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMoSystemRule());
                    						}
                    						add(
                    							current,
                    							"agents",
                    							lv_agents_7_0,
                    							"at.jku.mosumo.lang.Mosumo.MOAgent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:904:4: (otherlv_8= ',' ( (lv_agents_9_0= ruleMOAgent ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==18) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalMosumo.g:905:5: otherlv_8= ',' ( (lv_agents_9_0= ruleMOAgent ) )
                    	    {
                    	    otherlv_8=(Token)match(input,18,FOLLOW_28); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getMoSystemAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMosumo.g:909:5: ( (lv_agents_9_0= ruleMOAgent ) )
                    	    // InternalMosumo.g:910:6: (lv_agents_9_0= ruleMOAgent )
                    	    {
                    	    // InternalMosumo.g:910:6: (lv_agents_9_0= ruleMOAgent )
                    	    // InternalMosumo.g:911:7: lv_agents_9_0= ruleMOAgent
                    	    {

                    	    							newCompositeNode(grammarAccess.getMoSystemAccess().getAgentsMOAgentParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_agents_9_0=ruleMOAgent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMoSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"agents",
                    	    								lv_agents_9_0,
                    	    								"at.jku.mosumo.lang.Mosumo.MOAgent");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getMoSystemAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getMoSystemAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMoSystem"


    // $ANTLR start "entryRuleConnectionOptions"
    // InternalMosumo.g:942:1: entryRuleConnectionOptions returns [EObject current=null] : iv_ruleConnectionOptions= ruleConnectionOptions EOF ;
    public final EObject entryRuleConnectionOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionOptions = null;


        try {
            // InternalMosumo.g:942:58: (iv_ruleConnectionOptions= ruleConnectionOptions EOF )
            // InternalMosumo.g:943:2: iv_ruleConnectionOptions= ruleConnectionOptions EOF
            {
             newCompositeNode(grammarAccess.getConnectionOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectionOptions=ruleConnectionOptions();

            state._fsp--;

             current =iv_ruleConnectionOptions; 
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
    // $ANTLR end "entryRuleConnectionOptions"


    // $ANTLR start "ruleConnectionOptions"
    // InternalMosumo.g:949:1: ruleConnectionOptions returns [EObject current=null] : ( () otherlv_1= 'ConnectionOptions' otherlv_2= '{' (otherlv_3= 'automaticReconnect' ( (lv_automaticReconnect_4_0= ruleEBoolean ) ) )? (otherlv_5= 'cleanSession' ( (lv_cleanSession_6_0= ruleEBoolean ) ) )? (otherlv_7= 'connectionTimeOut' ( (lv_connectionTimeOut_8_0= ruleEIntegerObject ) ) )? (otherlv_9= 'setMaxInflight' ( (lv_setMaxInflight_10_0= ruleEIntegerObject ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleConnectionOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_automaticReconnect_4_0 = null;

        AntlrDatatypeRuleToken lv_cleanSession_6_0 = null;

        AntlrDatatypeRuleToken lv_connectionTimeOut_8_0 = null;

        AntlrDatatypeRuleToken lv_setMaxInflight_10_0 = null;



        	enterRule();

        try {
            // InternalMosumo.g:955:2: ( ( () otherlv_1= 'ConnectionOptions' otherlv_2= '{' (otherlv_3= 'automaticReconnect' ( (lv_automaticReconnect_4_0= ruleEBoolean ) ) )? (otherlv_5= 'cleanSession' ( (lv_cleanSession_6_0= ruleEBoolean ) ) )? (otherlv_7= 'connectionTimeOut' ( (lv_connectionTimeOut_8_0= ruleEIntegerObject ) ) )? (otherlv_9= 'setMaxInflight' ( (lv_setMaxInflight_10_0= ruleEIntegerObject ) ) )? otherlv_11= '}' ) )
            // InternalMosumo.g:956:2: ( () otherlv_1= 'ConnectionOptions' otherlv_2= '{' (otherlv_3= 'automaticReconnect' ( (lv_automaticReconnect_4_0= ruleEBoolean ) ) )? (otherlv_5= 'cleanSession' ( (lv_cleanSession_6_0= ruleEBoolean ) ) )? (otherlv_7= 'connectionTimeOut' ( (lv_connectionTimeOut_8_0= ruleEIntegerObject ) ) )? (otherlv_9= 'setMaxInflight' ( (lv_setMaxInflight_10_0= ruleEIntegerObject ) ) )? otherlv_11= '}' )
            {
            // InternalMosumo.g:956:2: ( () otherlv_1= 'ConnectionOptions' otherlv_2= '{' (otherlv_3= 'automaticReconnect' ( (lv_automaticReconnect_4_0= ruleEBoolean ) ) )? (otherlv_5= 'cleanSession' ( (lv_cleanSession_6_0= ruleEBoolean ) ) )? (otherlv_7= 'connectionTimeOut' ( (lv_connectionTimeOut_8_0= ruleEIntegerObject ) ) )? (otherlv_9= 'setMaxInflight' ( (lv_setMaxInflight_10_0= ruleEIntegerObject ) ) )? otherlv_11= '}' )
            // InternalMosumo.g:957:3: () otherlv_1= 'ConnectionOptions' otherlv_2= '{' (otherlv_3= 'automaticReconnect' ( (lv_automaticReconnect_4_0= ruleEBoolean ) ) )? (otherlv_5= 'cleanSession' ( (lv_cleanSession_6_0= ruleEBoolean ) ) )? (otherlv_7= 'connectionTimeOut' ( (lv_connectionTimeOut_8_0= ruleEIntegerObject ) ) )? (otherlv_9= 'setMaxInflight' ( (lv_setMaxInflight_10_0= ruleEIntegerObject ) ) )? otherlv_11= '}'
            {
            // InternalMosumo.g:957:3: ()
            // InternalMosumo.g:958:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConnectionOptionsAccess().getConnectionOptionsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectionOptionsAccess().getConnectionOptionsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectionOptionsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMosumo.g:972:3: (otherlv_3= 'automaticReconnect' ( (lv_automaticReconnect_4_0= ruleEBoolean ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMosumo.g:973:4: otherlv_3= 'automaticReconnect' ( (lv_automaticReconnect_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_30); 

                    				newLeafNode(otherlv_3, grammarAccess.getConnectionOptionsAccess().getAutomaticReconnectKeyword_3_0());
                    			
                    // InternalMosumo.g:977:4: ( (lv_automaticReconnect_4_0= ruleEBoolean ) )
                    // InternalMosumo.g:978:5: (lv_automaticReconnect_4_0= ruleEBoolean )
                    {
                    // InternalMosumo.g:978:5: (lv_automaticReconnect_4_0= ruleEBoolean )
                    // InternalMosumo.g:979:6: lv_automaticReconnect_4_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getConnectionOptionsAccess().getAutomaticReconnectEBooleanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_automaticReconnect_4_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectionOptionsRule());
                    						}
                    						set(
                    							current,
                    							"automaticReconnect",
                    							lv_automaticReconnect_4_0,
                    							"at.jku.mosumo.lang.Mosumo.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:997:3: (otherlv_5= 'cleanSession' ( (lv_cleanSession_6_0= ruleEBoolean ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMosumo.g:998:4: otherlv_5= 'cleanSession' ( (lv_cleanSession_6_0= ruleEBoolean ) )
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_30); 

                    				newLeafNode(otherlv_5, grammarAccess.getConnectionOptionsAccess().getCleanSessionKeyword_4_0());
                    			
                    // InternalMosumo.g:1002:4: ( (lv_cleanSession_6_0= ruleEBoolean ) )
                    // InternalMosumo.g:1003:5: (lv_cleanSession_6_0= ruleEBoolean )
                    {
                    // InternalMosumo.g:1003:5: (lv_cleanSession_6_0= ruleEBoolean )
                    // InternalMosumo.g:1004:6: lv_cleanSession_6_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getConnectionOptionsAccess().getCleanSessionEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_cleanSession_6_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectionOptionsRule());
                    						}
                    						set(
                    							current,
                    							"cleanSession",
                    							lv_cleanSession_6_0,
                    							"at.jku.mosumo.lang.Mosumo.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:1022:3: (otherlv_7= 'connectionTimeOut' ( (lv_connectionTimeOut_8_0= ruleEIntegerObject ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMosumo.g:1023:4: otherlv_7= 'connectionTimeOut' ( (lv_connectionTimeOut_8_0= ruleEIntegerObject ) )
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_33); 

                    				newLeafNode(otherlv_7, grammarAccess.getConnectionOptionsAccess().getConnectionTimeOutKeyword_5_0());
                    			
                    // InternalMosumo.g:1027:4: ( (lv_connectionTimeOut_8_0= ruleEIntegerObject ) )
                    // InternalMosumo.g:1028:5: (lv_connectionTimeOut_8_0= ruleEIntegerObject )
                    {
                    // InternalMosumo.g:1028:5: (lv_connectionTimeOut_8_0= ruleEIntegerObject )
                    // InternalMosumo.g:1029:6: lv_connectionTimeOut_8_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getConnectionOptionsAccess().getConnectionTimeOutEIntegerObjectParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_connectionTimeOut_8_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectionOptionsRule());
                    						}
                    						set(
                    							current,
                    							"connectionTimeOut",
                    							lv_connectionTimeOut_8_0,
                    							"at.jku.mosumo.lang.Mosumo.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:1047:3: (otherlv_9= 'setMaxInflight' ( (lv_setMaxInflight_10_0= ruleEIntegerObject ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMosumo.g:1048:4: otherlv_9= 'setMaxInflight' ( (lv_setMaxInflight_10_0= ruleEIntegerObject ) )
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_33); 

                    				newLeafNode(otherlv_9, grammarAccess.getConnectionOptionsAccess().getSetMaxInflightKeyword_6_0());
                    			
                    // InternalMosumo.g:1052:4: ( (lv_setMaxInflight_10_0= ruleEIntegerObject ) )
                    // InternalMosumo.g:1053:5: (lv_setMaxInflight_10_0= ruleEIntegerObject )
                    {
                    // InternalMosumo.g:1053:5: (lv_setMaxInflight_10_0= ruleEIntegerObject )
                    // InternalMosumo.g:1054:6: lv_setMaxInflight_10_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getConnectionOptionsAccess().getSetMaxInflightEIntegerObjectParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_setMaxInflight_10_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectionOptionsRule());
                    						}
                    						set(
                    							current,
                    							"setMaxInflight",
                    							lv_setMaxInflight_10_0,
                    							"at.jku.mosumo.lang.Mosumo.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getConnectionOptionsAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleConnectionOptions"


    // $ANTLR start "entryRuleEBoolean"
    // InternalMosumo.g:1080:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalMosumo.g:1080:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalMosumo.g:1081:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalMosumo.g:1087:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMosumo.g:1093:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalMosumo.g:1094:2: (kw= 'true' | kw= 'false' )
            {
            // InternalMosumo.g:1094:2: (kw= 'true' | kw= 'false' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            else if ( (LA26_0==39) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalMosumo.g:1095:3: kw= 'true'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMosumo.g:1101:3: kw= 'false'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEIntegerObject"
    // InternalMosumo.g:1110:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalMosumo.g:1110:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalMosumo.g:1111:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
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
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // InternalMosumo.g:1117:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMosumo.g:1123:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMosumo.g:1124:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMosumo.g:1124:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMosumo.g:1125:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMosumo.g:1125:3: (kw= '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMosumo.g:1126:4: kw= '-'
                    {
                    kw=(Token)match(input,40,FOLLOW_35); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleEAnnotation"
    // InternalMosumo.g:1143:1: entryRuleEAnnotation returns [EObject current=null] : iv_ruleEAnnotation= ruleEAnnotation EOF ;
    public final EObject entryRuleEAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAnnotation = null;


        try {
            // InternalMosumo.g:1143:52: (iv_ruleEAnnotation= ruleEAnnotation EOF )
            // InternalMosumo.g:1144:2: iv_ruleEAnnotation= ruleEAnnotation EOF
            {
             newCompositeNode(grammarAccess.getEAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAnnotation=ruleEAnnotation();

            state._fsp--;

             current =iv_ruleEAnnotation; 
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
    // $ANTLR end "entryRuleEAnnotation"


    // $ANTLR start "ruleEAnnotation"
    // InternalMosumo.g:1150:1: ruleEAnnotation returns [EObject current=null] : ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
    public final EObject ruleEAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_source_4_0 = null;

        EObject lv_eAnnotations_13_0 = null;

        EObject lv_eAnnotations_15_0 = null;

        EObject lv_details_19_0 = null;

        EObject lv_details_21_0 = null;

        EObject lv_contents_25_0 = null;

        EObject lv_contents_27_0 = null;



        	enterRule();

        try {
            // InternalMosumo.g:1156:2: ( ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // InternalMosumo.g:1157:2: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // InternalMosumo.g:1157:2: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // InternalMosumo.g:1158:3: () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // InternalMosumo.g:1158:3: ()
            // InternalMosumo.g:1159:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAnnotationAccess().getEAnnotationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEAnnotationAccess().getEAnnotationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMosumo.g:1173:3: (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMosumo.g:1174:4: otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEAnnotationAccess().getSourceKeyword_3_0());
                    			
                    // InternalMosumo.g:1178:4: ( (lv_source_4_0= ruleEString ) )
                    // InternalMosumo.g:1179:5: (lv_source_4_0= ruleEString )
                    {
                    // InternalMosumo.g:1179:5: (lv_source_4_0= ruleEString )
                    // InternalMosumo.g:1180:6: lv_source_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getSourceEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_source_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    						}
                    						set(
                    							current,
                    							"source",
                    							lv_source_4_0,
                    							"at.jku.mosumo.lang.Mosumo.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:1198:3: (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==43) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMosumo.g:1199:4: otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_38); 

                    				newLeafNode(otherlv_5, grammarAccess.getEAnnotationAccess().getReferencesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEAnnotationAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalMosumo.g:1207:4: ( ( ruleEString ) )
                    // InternalMosumo.g:1208:5: ( ruleEString )
                    {
                    // InternalMosumo.g:1208:5: ( ruleEString )
                    // InternalMosumo.g:1209:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAnnotationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_39);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:1223:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==18) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalMosumo.g:1224:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,18,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEAnnotationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMosumo.g:1228:5: ( ( ruleEString ) )
                    	    // InternalMosumo.g:1229:6: ( ruleEString )
                    	    {
                    	    // InternalMosumo.g:1229:6: ( ruleEString )
                    	    // InternalMosumo.g:1230:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAnnotationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_39);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,45,FOLLOW_40); 

                    				newLeafNode(otherlv_10, grammarAccess.getEAnnotationAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:1250:3: (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==27) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMosumo.g:1251:4: otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getEAnnotationAccess().getEAnnotationsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMosumo.g:1259:4: ( (lv_eAnnotations_13_0= ruleEAnnotation ) )
                    // InternalMosumo.g:1260:5: (lv_eAnnotations_13_0= ruleEAnnotation )
                    {
                    // InternalMosumo.g:1260:5: (lv_eAnnotations_13_0= ruleEAnnotation )
                    // InternalMosumo.g:1261:6: lv_eAnnotations_13_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getEAnnotationsEAnnotationParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eAnnotations_13_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_13_0,
                    							"at.jku.mosumo.lang.Mosumo.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:1278:4: (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==18) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalMosumo.g:1279:5: otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,18,FOLLOW_21); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getEAnnotationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMosumo.g:1283:5: ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    // InternalMosumo.g:1284:6: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    {
                    	    // InternalMosumo.g:1284:6: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    // InternalMosumo.g:1285:7: lv_eAnnotations_15_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getEAnnotationsEAnnotationParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eAnnotations_15_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_15_0,
                    	    								"at.jku.mosumo.lang.Mosumo.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,19,FOLLOW_41); 

                    				newLeafNode(otherlv_16, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:1308:3: (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==46) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMosumo.g:1309:4: otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,46,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getEAnnotationAccess().getDetailsKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_42); 

                    				newLeafNode(otherlv_18, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalMosumo.g:1317:4: ( (lv_details_19_0= ruleEStringToStringMapEntry ) )
                    // InternalMosumo.g:1318:5: (lv_details_19_0= ruleEStringToStringMapEntry )
                    {
                    // InternalMosumo.g:1318:5: (lv_details_19_0= ruleEStringToStringMapEntry )
                    // InternalMosumo.g:1319:6: lv_details_19_0= ruleEStringToStringMapEntry
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getDetailsEStringToStringMapEntryParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_details_19_0=ruleEStringToStringMapEntry();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    						}
                    						add(
                    							current,
                    							"details",
                    							lv_details_19_0,
                    							"at.jku.mosumo.lang.Mosumo.EStringToStringMapEntry");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:1336:4: (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==18) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalMosumo.g:1337:5: otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    {
                    	    otherlv_20=(Token)match(input,18,FOLLOW_42); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getEAnnotationAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMosumo.g:1341:5: ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    // InternalMosumo.g:1342:6: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    {
                    	    // InternalMosumo.g:1342:6: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    // InternalMosumo.g:1343:7: lv_details_21_0= ruleEStringToStringMapEntry
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getDetailsEStringToStringMapEntryParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_details_21_0=ruleEStringToStringMapEntry();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"details",
                    	    								lv_details_21_0,
                    	    								"at.jku.mosumo.lang.Mosumo.EStringToStringMapEntry");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,19,FOLLOW_43); 

                    				newLeafNode(otherlv_22, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:1366:3: (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==47) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMosumo.g:1367:4: otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getEAnnotationAccess().getContentsKeyword_7_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_44); 

                    				newLeafNode(otherlv_24, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMosumo.g:1375:4: ( (lv_contents_25_0= ruleEObject ) )
                    // InternalMosumo.g:1376:5: (lv_contents_25_0= ruleEObject )
                    {
                    // InternalMosumo.g:1376:5: (lv_contents_25_0= ruleEObject )
                    // InternalMosumo.g:1377:6: lv_contents_25_0= ruleEObject
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getContentsEObjectParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_contents_25_0=ruleEObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    						}
                    						add(
                    							current,
                    							"contents",
                    							lv_contents_25_0,
                    							"at.jku.mosumo.lang.Mosumo.EObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:1394:4: (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==18) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalMosumo.g:1395:5: otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) )
                    	    {
                    	    otherlv_26=(Token)match(input,18,FOLLOW_44); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getEAnnotationAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMosumo.g:1399:5: ( (lv_contents_27_0= ruleEObject ) )
                    	    // InternalMosumo.g:1400:6: (lv_contents_27_0= ruleEObject )
                    	    {
                    	    // InternalMosumo.g:1400:6: (lv_contents_27_0= ruleEObject )
                    	    // InternalMosumo.g:1401:7: lv_contents_27_0= ruleEObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getContentsEObjectParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_contents_27_0=ruleEObject();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"contents",
                    	    								lv_contents_27_0,
                    	    								"at.jku.mosumo.lang.Mosumo.EObject");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_28, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_29=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleEAnnotation"


    // $ANTLR start "entryRuleEStringToStringMapEntry"
    // InternalMosumo.g:1432:1: entryRuleEStringToStringMapEntry returns [EObject current=null] : iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF ;
    public final EObject entryRuleEStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStringToStringMapEntry = null;


        try {
            // InternalMosumo.g:1432:64: (iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF )
            // InternalMosumo.g:1433:2: iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF
            {
             newCompositeNode(grammarAccess.getEStringToStringMapEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEStringToStringMapEntry=ruleEStringToStringMapEntry();

            state._fsp--;

             current =iv_ruleEStringToStringMapEntry; 
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
    // $ANTLR end "entryRuleEStringToStringMapEntry"


    // $ANTLR start "ruleEStringToStringMapEntry"
    // InternalMosumo.g:1439:1: ruleEStringToStringMapEntry returns [EObject current=null] : ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleEStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_key_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalMosumo.g:1445:2: ( ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalMosumo.g:1446:2: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalMosumo.g:1446:2: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalMosumo.g:1447:3: () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalMosumo.g:1447:3: ()
            // InternalMosumo.g:1448:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getEStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMosumo.g:1462:3: (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==49) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMosumo.g:1463:4: otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEStringToStringMapEntryAccess().getKeyKeyword_3_0());
                    			
                    // InternalMosumo.g:1467:4: ( (lv_key_4_0= ruleEString ) )
                    // InternalMosumo.g:1468:5: (lv_key_4_0= ruleEString )
                    {
                    // InternalMosumo.g:1468:5: (lv_key_4_0= ruleEString )
                    // InternalMosumo.g:1469:6: lv_key_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_key_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEStringToStringMapEntryRule());
                    						}
                    						set(
                    							current,
                    							"key",
                    							lv_key_4_0,
                    							"at.jku.mosumo.lang.Mosumo.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:1487:3: (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==50) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMosumo.g:1488:4: otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,50,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEStringToStringMapEntryAccess().getValueKeyword_4_0());
                    			
                    // InternalMosumo.g:1492:4: ( (lv_value_6_0= ruleEString ) )
                    // InternalMosumo.g:1493:5: (lv_value_6_0= ruleEString )
                    {
                    // InternalMosumo.g:1493:5: (lv_value_6_0= ruleEString )
                    // InternalMosumo.g:1494:6: lv_value_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEStringToStringMapEntryAccess().getValueEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_value_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEStringToStringMapEntryRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"at.jku.mosumo.lang.Mosumo.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEStringToStringMapEntryAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleEStringToStringMapEntry"


    // $ANTLR start "entryRuleEObject"
    // InternalMosumo.g:1520:1: entryRuleEObject returns [EObject current=null] : iv_ruleEObject= ruleEObject EOF ;
    public final EObject entryRuleEObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObject = null;


        try {
            // InternalMosumo.g:1520:48: (iv_ruleEObject= ruleEObject EOF )
            // InternalMosumo.g:1521:2: iv_ruleEObject= ruleEObject EOF
            {
             newCompositeNode(grammarAccess.getEObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEObject=ruleEObject();

            state._fsp--;

             current =iv_ruleEObject; 
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
    // $ANTLR end "entryRuleEObject"


    // $ANTLR start "ruleEObject"
    // InternalMosumo.g:1527:1: ruleEObject returns [EObject current=null] : ( () otherlv_1= 'EObject' ) ;
    public final EObject ruleEObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMosumo.g:1533:2: ( ( () otherlv_1= 'EObject' ) )
            // InternalMosumo.g:1534:2: ( () otherlv_1= 'EObject' )
            {
            // InternalMosumo.g:1534:2: ( () otherlv_1= 'EObject' )
            // InternalMosumo.g:1535:3: () otherlv_1= 'EObject'
            {
            // InternalMosumo.g:1535:3: ()
            // InternalMosumo.g:1536:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEObjectAccess().getEObjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEObjectAccess().getEObjectKeyword_1());
            		

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
    // $ANTLR end "ruleEObject"


    // $ANTLR start "entryRuleETypeParameter"
    // InternalMosumo.g:1550:1: entryRuleETypeParameter returns [EObject current=null] : iv_ruleETypeParameter= ruleETypeParameter EOF ;
    public final EObject entryRuleETypeParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETypeParameter = null;


        try {
            // InternalMosumo.g:1550:55: (iv_ruleETypeParameter= ruleETypeParameter EOF )
            // InternalMosumo.g:1551:2: iv_ruleETypeParameter= ruleETypeParameter EOF
            {
             newCompositeNode(grammarAccess.getETypeParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETypeParameter=ruleETypeParameter();

            state._fsp--;

             current =iv_ruleETypeParameter; 
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
    // $ANTLR end "entryRuleETypeParameter"


    // $ANTLR start "ruleETypeParameter"
    // InternalMosumo.g:1557:1: ruleETypeParameter returns [EObject current=null] : ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleETypeParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_eAnnotations_6_0 = null;

        EObject lv_eAnnotations_8_0 = null;

        EObject lv_eBounds_12_0 = null;

        EObject lv_eBounds_14_0 = null;



        	enterRule();

        try {
            // InternalMosumo.g:1563:2: ( ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalMosumo.g:1564:2: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalMosumo.g:1564:2: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalMosumo.g:1565:3: () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalMosumo.g:1565:3: ()
            // InternalMosumo.g:1566:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getETypeParameterAccess().getETypeParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getETypeParameterAccess().getETypeParameterKeyword_1());
            		
            // InternalMosumo.g:1576:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMosumo.g:1577:4: (lv_name_2_0= ruleEString )
            {
            // InternalMosumo.g:1577:4: (lv_name_2_0= ruleEString )
            // InternalMosumo.g:1578:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getETypeParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getETypeParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"at.jku.mosumo.lang.Mosumo.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_3, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMosumo.g:1599:3: (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==27) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMosumo.g:1600:4: otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getETypeParameterAccess().getEAnnotationsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMosumo.g:1608:4: ( (lv_eAnnotations_6_0= ruleEAnnotation ) )
                    // InternalMosumo.g:1609:5: (lv_eAnnotations_6_0= ruleEAnnotation )
                    {
                    // InternalMosumo.g:1609:5: (lv_eAnnotations_6_0= ruleEAnnotation )
                    // InternalMosumo.g:1610:6: lv_eAnnotations_6_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getETypeParameterAccess().getEAnnotationsEAnnotationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eAnnotations_6_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETypeParameterRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_6_0,
                    							"at.jku.mosumo.lang.Mosumo.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:1627:4: (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==18) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalMosumo.g:1628:5: otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FOLLOW_21); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getETypeParameterAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMosumo.g:1632:5: ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    // InternalMosumo.g:1633:6: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    {
                    	    // InternalMosumo.g:1633:6: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    // InternalMosumo.g:1634:7: lv_eAnnotations_8_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getETypeParameterAccess().getEAnnotationsEAnnotationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eAnnotations_8_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getETypeParameterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_8_0,
                    	    								"at.jku.mosumo.lang.Mosumo.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FOLLOW_48); 

                    				newLeafNode(otherlv_9, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:1657:3: (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==53) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMosumo.g:1658:4: otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getETypeParameterAccess().getEBoundsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_49); 

                    				newLeafNode(otherlv_11, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMosumo.g:1666:4: ( (lv_eBounds_12_0= ruleEGenericType ) )
                    // InternalMosumo.g:1667:5: (lv_eBounds_12_0= ruleEGenericType )
                    {
                    // InternalMosumo.g:1667:5: (lv_eBounds_12_0= ruleEGenericType )
                    // InternalMosumo.g:1668:6: lv_eBounds_12_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getETypeParameterAccess().getEBoundsEGenericTypeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eBounds_12_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETypeParameterRule());
                    						}
                    						add(
                    							current,
                    							"eBounds",
                    							lv_eBounds_12_0,
                    							"at.jku.mosumo.lang.Mosumo.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:1685:4: (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==18) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalMosumo.g:1686:5: otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_13=(Token)match(input,18,FOLLOW_49); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getETypeParameterAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMosumo.g:1690:5: ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    // InternalMosumo.g:1691:6: (lv_eBounds_14_0= ruleEGenericType )
                    	    {
                    	    // InternalMosumo.g:1691:6: (lv_eBounds_14_0= ruleEGenericType )
                    	    // InternalMosumo.g:1692:7: lv_eBounds_14_0= ruleEGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getETypeParameterAccess().getEBoundsEGenericTypeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eBounds_14_0=ruleEGenericType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getETypeParameterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eBounds",
                    	    								lv_eBounds_14_0,
                    	    								"at.jku.mosumo.lang.Mosumo.EGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleETypeParameter"


    // $ANTLR start "entryRuleEClass"
    // InternalMosumo.g:1723:1: entryRuleEClass returns [EObject current=null] : iv_ruleEClass= ruleEClass EOF ;
    public final EObject entryRuleEClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClass = null;


        try {
            // InternalMosumo.g:1723:47: (iv_ruleEClass= ruleEClass EOF )
            // InternalMosumo.g:1724:2: iv_ruleEClass= ruleEClass EOF
            {
             newCompositeNode(grammarAccess.getEClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEClass=ruleEClass();

            state._fsp--;

             current =iv_ruleEClass; 
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
    // $ANTLR end "entryRuleEClass"


    // $ANTLR start "ruleEClass"
    // InternalMosumo.g:1730:1: ruleEClass returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
    public final EObject ruleEClass() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token lv_interface_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_7_0 = null;

        AntlrDatatypeRuleToken lv_instanceTypeName_9_0 = null;

        EObject lv_eAnnotations_18_0 = null;

        EObject lv_eAnnotations_20_0 = null;

        EObject lv_eTypeParameters_24_0 = null;

        EObject lv_eTypeParameters_26_0 = null;

        EObject lv_eOperations_30_0 = null;

        EObject lv_eOperations_32_0 = null;

        EObject lv_eStructuralFeatures_36_0 = null;

        EObject lv_eStructuralFeatures_38_0 = null;

        EObject lv_eGenericSuperTypes_42_0 = null;

        EObject lv_eGenericSuperTypes_44_0 = null;



        	enterRule();

        try {
            // InternalMosumo.g:1736:2: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // InternalMosumo.g:1737:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // InternalMosumo.g:1737:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // InternalMosumo.g:1738:3: () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // InternalMosumo.g:1738:3: ()
            // InternalMosumo.g:1739:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEClassAccess().getEClassAction_0(),
            					current);
            			

            }

            // InternalMosumo.g:1745:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==54) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMosumo.g:1746:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalMosumo.g:1746:4: (lv_abstract_1_0= 'abstract' )
                    // InternalMosumo.g:1747:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,54,FOLLOW_50); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getEClassAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", lv_abstract_1_0 != null, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalMosumo.g:1759:3: ( (lv_interface_2_0= 'interface' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==55) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMosumo.g:1760:4: (lv_interface_2_0= 'interface' )
                    {
                    // InternalMosumo.g:1760:4: (lv_interface_2_0= 'interface' )
                    // InternalMosumo.g:1761:5: lv_interface_2_0= 'interface'
                    {
                    lv_interface_2_0=(Token)match(input,55,FOLLOW_51); 

                    					newLeafNode(lv_interface_2_0, grammarAccess.getEClassAccess().getInterfaceInterfaceKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEClassRule());
                    					}
                    					setWithLastConsumed(current, "interface", lv_interface_2_0 != null, "interface");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getEClassAccess().getEClassKeyword_3());
            		
            // InternalMosumo.g:1777:3: ( (lv_name_4_0= ruleEString ) )
            // InternalMosumo.g:1778:4: (lv_name_4_0= ruleEString )
            {
            // InternalMosumo.g:1778:4: (lv_name_4_0= ruleEString )
            // InternalMosumo.g:1779:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEClassAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"at.jku.mosumo.lang.Mosumo.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_5, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMosumo.g:1800:3: (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==57) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMosumo.g:1801:4: otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEClassAccess().getInstanceClassNameKeyword_6_0());
                    			
                    // InternalMosumo.g:1805:4: ( (lv_instanceClassName_7_0= ruleEString ) )
                    // InternalMosumo.g:1806:5: (lv_instanceClassName_7_0= ruleEString )
                    {
                    // InternalMosumo.g:1806:5: (lv_instanceClassName_7_0= ruleEString )
                    // InternalMosumo.g:1807:6: lv_instanceClassName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getInstanceClassNameEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_instanceClassName_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						set(
                    							current,
                    							"instanceClassName",
                    							lv_instanceClassName_7_0,
                    							"at.jku.mosumo.lang.Mosumo.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:1825:3: (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==58) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMosumo.g:1826:4: otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,58,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getEClassAccess().getInstanceTypeNameKeyword_7_0());
                    			
                    // InternalMosumo.g:1830:4: ( (lv_instanceTypeName_9_0= ruleEString ) )
                    // InternalMosumo.g:1831:5: (lv_instanceTypeName_9_0= ruleEString )
                    {
                    // InternalMosumo.g:1831:5: (lv_instanceTypeName_9_0= ruleEString )
                    // InternalMosumo.g:1832:6: lv_instanceTypeName_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getInstanceTypeNameEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_instanceTypeName_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						set(
                    							current,
                    							"instanceTypeName",
                    							lv_instanceTypeName_9_0,
                    							"at.jku.mosumo.lang.Mosumo.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:1850:3: (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==59) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMosumo.g:1851:4: otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,59,FOLLOW_38); 

                    				newLeafNode(otherlv_10, grammarAccess.getEClassAccess().getESuperTypesKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getEClassAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalMosumo.g:1859:4: ( ( ruleEString ) )
                    // InternalMosumo.g:1860:5: ( ruleEString )
                    {
                    // InternalMosumo.g:1860:5: ( ruleEString )
                    // InternalMosumo.g:1861:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_39);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:1875:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==18) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalMosumo.g:1876:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,18,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEClassAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalMosumo.g:1880:5: ( ( ruleEString ) )
                    	    // InternalMosumo.g:1881:6: ( ruleEString )
                    	    {
                    	    // InternalMosumo.g:1881:6: ( ruleEString )
                    	    // InternalMosumo.g:1882:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_39);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,45,FOLLOW_55); 

                    				newLeafNode(otherlv_15, grammarAccess.getEClassAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:1902:3: (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==27) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMosumo.g:1903:4: otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEClassAccess().getEAnnotationsKeyword_9_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_17, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalMosumo.g:1911:4: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    // InternalMosumo.g:1912:5: (lv_eAnnotations_18_0= ruleEAnnotation )
                    {
                    // InternalMosumo.g:1912:5: (lv_eAnnotations_18_0= ruleEAnnotation )
                    // InternalMosumo.g:1913:6: lv_eAnnotations_18_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getEAnnotationsEAnnotationParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eAnnotations_18_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_18_0,
                    							"at.jku.mosumo.lang.Mosumo.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:1930:4: (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==18) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalMosumo.g:1931:5: otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_19=(Token)match(input,18,FOLLOW_21); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEClassAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMosumo.g:1935:5: ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    // InternalMosumo.g:1936:6: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    {
                    	    // InternalMosumo.g:1936:6: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    // InternalMosumo.g:1937:7: lv_eAnnotations_20_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getEAnnotationsEAnnotationParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eAnnotations_20_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_20_0,
                    	    								"at.jku.mosumo.lang.Mosumo.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,19,FOLLOW_56); 

                    				newLeafNode(otherlv_21, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:1960:3: (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==60) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMosumo.g:1961:4: otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,60,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getEClassAccess().getETypeParametersKeyword_10_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_23, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalMosumo.g:1969:4: ( (lv_eTypeParameters_24_0= ruleETypeParameter ) )
                    // InternalMosumo.g:1970:5: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    {
                    // InternalMosumo.g:1970:5: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    // InternalMosumo.g:1971:6: lv_eTypeParameters_24_0= ruleETypeParameter
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getETypeParametersETypeParameterParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eTypeParameters_24_0=ruleETypeParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						add(
                    							current,
                    							"eTypeParameters",
                    							lv_eTypeParameters_24_0,
                    							"at.jku.mosumo.lang.Mosumo.ETypeParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:1988:4: (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==18) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalMosumo.g:1989:5: otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_25=(Token)match(input,18,FOLLOW_57); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getEClassAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalMosumo.g:1993:5: ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    // InternalMosumo.g:1994:6: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    {
                    	    // InternalMosumo.g:1994:6: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    // InternalMosumo.g:1995:7: lv_eTypeParameters_26_0= ruleETypeParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getETypeParametersETypeParameterParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eTypeParameters_26_0=ruleETypeParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eTypeParameters",
                    	    								lv_eTypeParameters_26_0,
                    	    								"at.jku.mosumo.lang.Mosumo.ETypeParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,19,FOLLOW_58); 

                    				newLeafNode(otherlv_27, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:2018:3: (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==61) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMosumo.g:2019:4: otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,61,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getEClassAccess().getEOperationsKeyword_11_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_59); 

                    				newLeafNode(otherlv_29, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalMosumo.g:2027:4: ( (lv_eOperations_30_0= ruleEOperation ) )
                    // InternalMosumo.g:2028:5: (lv_eOperations_30_0= ruleEOperation )
                    {
                    // InternalMosumo.g:2028:5: (lv_eOperations_30_0= ruleEOperation )
                    // InternalMosumo.g:2029:6: lv_eOperations_30_0= ruleEOperation
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getEOperationsEOperationParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eOperations_30_0=ruleEOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						add(
                    							current,
                    							"eOperations",
                    							lv_eOperations_30_0,
                    							"at.jku.mosumo.lang.Mosumo.EOperation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:2046:4: (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==18) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalMosumo.g:2047:5: otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    {
                    	    otherlv_31=(Token)match(input,18,FOLLOW_59); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getEClassAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalMosumo.g:2051:5: ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    // InternalMosumo.g:2052:6: (lv_eOperations_32_0= ruleEOperation )
                    	    {
                    	    // InternalMosumo.g:2052:6: (lv_eOperations_32_0= ruleEOperation )
                    	    // InternalMosumo.g:2053:7: lv_eOperations_32_0= ruleEOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getEOperationsEOperationParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eOperations_32_0=ruleEOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eOperations",
                    	    								lv_eOperations_32_0,
                    	    								"at.jku.mosumo.lang.Mosumo.EOperation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,19,FOLLOW_60); 

                    				newLeafNode(otherlv_33, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:2076:3: (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==62) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMosumo.g:2077:4: otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,62,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getEClassAccess().getEStructuralFeaturesKeyword_12_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_61); 

                    				newLeafNode(otherlv_35, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalMosumo.g:2085:4: ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) )
                    // InternalMosumo.g:2086:5: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    {
                    // InternalMosumo.g:2086:5: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    // InternalMosumo.g:2087:6: lv_eStructuralFeatures_36_0= ruleEStructuralFeature
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getEStructuralFeaturesEStructuralFeatureParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eStructuralFeatures_36_0=ruleEStructuralFeature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						add(
                    							current,
                    							"eStructuralFeatures",
                    							lv_eStructuralFeatures_36_0,
                    							"at.jku.mosumo.lang.Mosumo.EStructuralFeature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:2104:4: (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==18) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalMosumo.g:2105:5: otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    {
                    	    otherlv_37=(Token)match(input,18,FOLLOW_61); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getEClassAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalMosumo.g:2109:5: ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    // InternalMosumo.g:2110:6: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    {
                    	    // InternalMosumo.g:2110:6: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    // InternalMosumo.g:2111:7: lv_eStructuralFeatures_38_0= ruleEStructuralFeature
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getEStructuralFeaturesEStructuralFeatureParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eStructuralFeatures_38_0=ruleEStructuralFeature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eStructuralFeatures",
                    	    								lv_eStructuralFeatures_38_0,
                    	    								"at.jku.mosumo.lang.Mosumo.EStructuralFeature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,19,FOLLOW_62); 

                    				newLeafNode(otherlv_39, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:2134:3: (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==63) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMosumo.g:2135:4: otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,63,FOLLOW_4); 

                    				newLeafNode(otherlv_40, grammarAccess.getEClassAccess().getEGenericSuperTypesKeyword_13_0());
                    			
                    otherlv_41=(Token)match(input,12,FOLLOW_49); 

                    				newLeafNode(otherlv_41, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalMosumo.g:2143:4: ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) )
                    // InternalMosumo.g:2144:5: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    {
                    // InternalMosumo.g:2144:5: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    // InternalMosumo.g:2145:6: lv_eGenericSuperTypes_42_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getEGenericSuperTypesEGenericTypeParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eGenericSuperTypes_42_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						add(
                    							current,
                    							"eGenericSuperTypes",
                    							lv_eGenericSuperTypes_42_0,
                    							"at.jku.mosumo.lang.Mosumo.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:2162:4: (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==18) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalMosumo.g:2163:5: otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,18,FOLLOW_49); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getEClassAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalMosumo.g:2167:5: ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    // InternalMosumo.g:2168:6: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    {
                    	    // InternalMosumo.g:2168:6: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    // InternalMosumo.g:2169:7: lv_eGenericSuperTypes_44_0= ruleEGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getEGenericSuperTypesEGenericTypeParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eGenericSuperTypes_44_0=ruleEGenericType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eGenericSuperTypes",
                    	    								lv_eGenericSuperTypes_44_0,
                    	    								"at.jku.mosumo.lang.Mosumo.EGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_45, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            otherlv_46=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_46, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleEClass"


    // $ANTLR start "entryRuleEDataType_Impl"
    // InternalMosumo.g:2200:1: entryRuleEDataType_Impl returns [EObject current=null] : iv_ruleEDataType_Impl= ruleEDataType_Impl EOF ;
    public final EObject entryRuleEDataType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataType_Impl = null;


        try {
            // InternalMosumo.g:2200:55: (iv_ruleEDataType_Impl= ruleEDataType_Impl EOF )
            // InternalMosumo.g:2201:2: iv_ruleEDataType_Impl= ruleEDataType_Impl EOF
            {
             newCompositeNode(grammarAccess.getEDataType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDataType_Impl=ruleEDataType_Impl();

            state._fsp--;

             current =iv_ruleEDataType_Impl; 
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
    // $ANTLR end "entryRuleEDataType_Impl"


    // $ANTLR start "ruleEDataType_Impl"
    // InternalMosumo.g:2207:1: ruleEDataType_Impl returns [EObject current=null] : ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleEDataType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_5_0 = null;

        AntlrDatatypeRuleToken lv_instanceTypeName_7_0 = null;

        AntlrDatatypeRuleToken lv_serializable_9_0 = null;

        EObject lv_eAnnotations_12_0 = null;

        EObject lv_eAnnotations_14_0 = null;

        EObject lv_eTypeParameters_18_0 = null;

        EObject lv_eTypeParameters_20_0 = null;



        	enterRule();

        try {
            // InternalMosumo.g:2213:2: ( ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalMosumo.g:2214:2: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalMosumo.g:2214:2: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalMosumo.g:2215:3: () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalMosumo.g:2215:3: ()
            // InternalMosumo.g:2216:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEDataType_ImplAccess().getEDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEDataType_ImplAccess().getEDataTypeKeyword_1());
            		
            // InternalMosumo.g:2226:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMosumo.g:2227:4: (lv_name_2_0= ruleEString )
            {
            // InternalMosumo.g:2227:4: (lv_name_2_0= ruleEString )
            // InternalMosumo.g:2228:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEDataType_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"at.jku.mosumo.lang.Mosumo.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_63); 

            			newLeafNode(otherlv_3, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMosumo.g:2249:3: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==57) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMosumo.g:2250:4: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEDataType_ImplAccess().getInstanceClassNameKeyword_4_0());
                    			
                    // InternalMosumo.g:2254:4: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // InternalMosumo.g:2255:5: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // InternalMosumo.g:2255:5: (lv_instanceClassName_5_0= ruleEString )
                    // InternalMosumo.g:2256:6: lv_instanceClassName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceClassNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    lv_instanceClassName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    						}
                    						set(
                    							current,
                    							"instanceClassName",
                    							lv_instanceClassName_5_0,
                    							"at.jku.mosumo.lang.Mosumo.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:2274:3: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==58) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMosumo.g:2275:4: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,58,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameKeyword_5_0());
                    			
                    // InternalMosumo.g:2279:4: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // InternalMosumo.g:2280:5: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // InternalMosumo.g:2280:5: (lv_instanceTypeName_7_0= ruleEString )
                    // InternalMosumo.g:2281:6: lv_instanceTypeName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_instanceTypeName_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    						}
                    						set(
                    							current,
                    							"instanceTypeName",
                    							lv_instanceTypeName_7_0,
                    							"at.jku.mosumo.lang.Mosumo.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:2299:3: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==65) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMosumo.g:2300:4: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,65,FOLLOW_30); 

                    				newLeafNode(otherlv_8, grammarAccess.getEDataType_ImplAccess().getSerializableKeyword_6_0());
                    			
                    // InternalMosumo.g:2304:4: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // InternalMosumo.g:2305:5: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // InternalMosumo.g:2305:5: (lv_serializable_9_0= ruleEBoolean )
                    // InternalMosumo.g:2306:6: lv_serializable_9_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getSerializableEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_serializable_9_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    						}
                    						set(
                    							current,
                    							"serializable",
                    							lv_serializable_9_0,
                    							"at.jku.mosumo.lang.Mosumo.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:2324:3: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==27) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalMosumo.g:2325:4: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEDataType_ImplAccess().getEAnnotationsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMosumo.g:2333:4: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // InternalMosumo.g:2334:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // InternalMosumo.g:2334:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // InternalMosumo.g:2335:6: lv_eAnnotations_12_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getEAnnotationsEAnnotationParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eAnnotations_12_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_12_0,
                    							"at.jku.mosumo.lang.Mosumo.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:2352:4: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==18) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalMosumo.g:2353:5: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,18,FOLLOW_21); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMosumo.g:2357:5: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // InternalMosumo.g:2358:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // InternalMosumo.g:2358:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // InternalMosumo.g:2359:7: lv_eAnnotations_14_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEDataType_ImplAccess().getEAnnotationsEAnnotationParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eAnnotations_14_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_14_0,
                    	    								"at.jku.mosumo.lang.Mosumo.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,19,FOLLOW_67); 

                    				newLeafNode(otherlv_15, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:2382:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==60) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalMosumo.g:2383:4: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,60,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEDataType_ImplAccess().getETypeParametersKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_17, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalMosumo.g:2391:4: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // InternalMosumo.g:2392:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // InternalMosumo.g:2392:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // InternalMosumo.g:2393:6: lv_eTypeParameters_18_0= ruleETypeParameter
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getETypeParametersETypeParameterParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eTypeParameters_18_0=ruleETypeParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    						}
                    						add(
                    							current,
                    							"eTypeParameters",
                    							lv_eTypeParameters_18_0,
                    							"at.jku.mosumo.lang.Mosumo.ETypeParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:2410:4: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==18) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalMosumo.g:2411:5: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,18,FOLLOW_57); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalMosumo.g:2415:5: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // InternalMosumo.g:2416:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // InternalMosumo.g:2416:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // InternalMosumo.g:2417:7: lv_eTypeParameters_20_0= ruleETypeParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEDataType_ImplAccess().getETypeParametersETypeParameterParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eTypeParameters_20_0=ruleETypeParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eTypeParameters",
                    	    								lv_eTypeParameters_20_0,
                    	    								"at.jku.mosumo.lang.Mosumo.ETypeParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleEDataType_Impl"


    // $ANTLR start "entryRuleEEnum"
    // InternalMosumo.g:2448:1: entryRuleEEnum returns [EObject current=null] : iv_ruleEEnum= ruleEEnum EOF ;
    public final EObject entryRuleEEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnum = null;


        try {
            // InternalMosumo.g:2448:46: (iv_ruleEEnum= ruleEEnum EOF )
            // InternalMosumo.g:2449:2: iv_ruleEEnum= ruleEEnum EOF
            {
             newCompositeNode(grammarAccess.getEEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEEnum=ruleEEnum();

            state._fsp--;

             current =iv_ruleEEnum; 
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
    // $ANTLR end "entryRuleEEnum"


    // $ANTLR start "ruleEEnum"
    // InternalMosumo.g:2455:1: ruleEEnum returns [EObject current=null] : ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
    public final EObject ruleEEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_5_0 = null;

        AntlrDatatypeRuleToken lv_instanceTypeName_7_0 = null;

        AntlrDatatypeRuleToken lv_serializable_9_0 = null;

        EObject lv_eAnnotations_12_0 = null;

        EObject lv_eAnnotations_14_0 = null;

        EObject lv_eTypeParameters_18_0 = null;

        EObject lv_eTypeParameters_20_0 = null;

        EObject lv_eLiterals_24_0 = null;

        EObject lv_eLiterals_26_0 = null;



        	enterRule();

        try {
            // InternalMosumo.g:2461:2: ( ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // InternalMosumo.g:2462:2: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // InternalMosumo.g:2462:2: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // InternalMosumo.g:2463:3: () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // InternalMosumo.g:2463:3: ()
            // InternalMosumo.g:2464:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEEnumAccess().getEEnumAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEEnumAccess().getEEnumKeyword_1());
            		
            // InternalMosumo.g:2474:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMosumo.g:2475:4: (lv_name_2_0= ruleEString )
            {
            // InternalMosumo.g:2475:4: (lv_name_2_0= ruleEString )
            // InternalMosumo.g:2476:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEEnumAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEEnumRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"at.jku.mosumo.lang.Mosumo.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_68); 

            			newLeafNode(otherlv_3, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMosumo.g:2497:3: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==57) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalMosumo.g:2498:4: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEEnumAccess().getInstanceClassNameKeyword_4_0());
                    			
                    // InternalMosumo.g:2502:4: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // InternalMosumo.g:2503:5: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // InternalMosumo.g:2503:5: (lv_instanceClassName_5_0= ruleEString )
                    // InternalMosumo.g:2504:6: lv_instanceClassName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getInstanceClassNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    lv_instanceClassName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						set(
                    							current,
                    							"instanceClassName",
                    							lv_instanceClassName_5_0,
                    							"at.jku.mosumo.lang.Mosumo.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:2522:3: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==58) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalMosumo.g:2523:4: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,58,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEEnumAccess().getInstanceTypeNameKeyword_5_0());
                    			
                    // InternalMosumo.g:2527:4: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // InternalMosumo.g:2528:5: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // InternalMosumo.g:2528:5: (lv_instanceTypeName_7_0= ruleEString )
                    // InternalMosumo.g:2529:6: lv_instanceTypeName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_70);
                    lv_instanceTypeName_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						set(
                    							current,
                    							"instanceTypeName",
                    							lv_instanceTypeName_7_0,
                    							"at.jku.mosumo.lang.Mosumo.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:2547:3: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==65) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalMosumo.g:2548:4: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,65,FOLLOW_30); 

                    				newLeafNode(otherlv_8, grammarAccess.getEEnumAccess().getSerializableKeyword_6_0());
                    			
                    // InternalMosumo.g:2552:4: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // InternalMosumo.g:2553:5: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // InternalMosumo.g:2553:5: (lv_serializable_9_0= ruleEBoolean )
                    // InternalMosumo.g:2554:6: lv_serializable_9_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getSerializableEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_71);
                    lv_serializable_9_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						set(
                    							current,
                    							"serializable",
                    							lv_serializable_9_0,
                    							"at.jku.mosumo.lang.Mosumo.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:2572:3: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==27) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalMosumo.g:2573:4: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEEnumAccess().getEAnnotationsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMosumo.g:2581:4: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // InternalMosumo.g:2582:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // InternalMosumo.g:2582:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // InternalMosumo.g:2583:6: lv_eAnnotations_12_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getEAnnotationsEAnnotationParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eAnnotations_12_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_12_0,
                    							"at.jku.mosumo.lang.Mosumo.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:2600:4: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==18) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalMosumo.g:2601:5: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,18,FOLLOW_21); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEEnumAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMosumo.g:2605:5: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // InternalMosumo.g:2606:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // InternalMosumo.g:2606:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // InternalMosumo.g:2607:7: lv_eAnnotations_14_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEEnumAccess().getEAnnotationsEAnnotationParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eAnnotations_14_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_14_0,
                    	    								"at.jku.mosumo.lang.Mosumo.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,19,FOLLOW_72); 

                    				newLeafNode(otherlv_15, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:2630:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==60) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalMosumo.g:2631:4: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,60,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEEnumAccess().getETypeParametersKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_17, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalMosumo.g:2639:4: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // InternalMosumo.g:2640:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // InternalMosumo.g:2640:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // InternalMosumo.g:2641:6: lv_eTypeParameters_18_0= ruleETypeParameter
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getETypeParametersETypeParameterParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eTypeParameters_18_0=ruleETypeParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						add(
                    							current,
                    							"eTypeParameters",
                    							lv_eTypeParameters_18_0,
                    							"at.jku.mosumo.lang.Mosumo.ETypeParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:2658:4: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==18) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalMosumo.g:2659:5: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,18,FOLLOW_57); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEEnumAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalMosumo.g:2663:5: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // InternalMosumo.g:2664:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // InternalMosumo.g:2664:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // InternalMosumo.g:2665:7: lv_eTypeParameters_20_0= ruleETypeParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEEnumAccess().getETypeParametersETypeParameterParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eTypeParameters_20_0=ruleETypeParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eTypeParameters",
                    	    								lv_eTypeParameters_20_0,
                    	    								"at.jku.mosumo.lang.Mosumo.ETypeParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,19,FOLLOW_73); 

                    				newLeafNode(otherlv_21, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:2688:3: (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==67) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalMosumo.g:2689:4: otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,67,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getEEnumAccess().getELiteralsKeyword_9_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_74); 

                    				newLeafNode(otherlv_23, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalMosumo.g:2697:4: ( (lv_eLiterals_24_0= ruleEEnumLiteral ) )
                    // InternalMosumo.g:2698:5: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    {
                    // InternalMosumo.g:2698:5: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    // InternalMosumo.g:2699:6: lv_eLiterals_24_0= ruleEEnumLiteral
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getELiteralsEEnumLiteralParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eLiterals_24_0=ruleEEnumLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						add(
                    							current,
                    							"eLiterals",
                    							lv_eLiterals_24_0,
                    							"at.jku.mosumo.lang.Mosumo.EEnumLiteral");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:2716:4: (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==18) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalMosumo.g:2717:5: otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    {
                    	    otherlv_25=(Token)match(input,18,FOLLOW_74); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getEEnumAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMosumo.g:2721:5: ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    // InternalMosumo.g:2722:6: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    {
                    	    // InternalMosumo.g:2722:6: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    // InternalMosumo.g:2723:7: lv_eLiterals_26_0= ruleEEnumLiteral
                    	    {

                    	    							newCompositeNode(grammarAccess.getEEnumAccess().getELiteralsEEnumLiteralParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eLiterals_26_0=ruleEEnumLiteral();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eLiterals",
                    	    								lv_eLiterals_26_0,
                    	    								"at.jku.mosumo.lang.Mosumo.EEnumLiteral");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_27, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_28=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleEEnum"


    // $ANTLR start "entryRuleEGenericType"
    // InternalMosumo.g:2754:1: entryRuleEGenericType returns [EObject current=null] : iv_ruleEGenericType= ruleEGenericType EOF ;
    public final EObject entryRuleEGenericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGenericType = null;


        try {
            // InternalMosumo.g:2754:53: (iv_ruleEGenericType= ruleEGenericType EOF )
            // InternalMosumo.g:2755:2: iv_ruleEGenericType= ruleEGenericType EOF
            {
             newCompositeNode(grammarAccess.getEGenericTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEGenericType=ruleEGenericType();

            state._fsp--;

             current =iv_ruleEGenericType; 
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
    // $ANTLR end "entryRuleEGenericType"


    // $ANTLR start "ruleEGenericType"
    // InternalMosumo.g:2761:1: ruleEGenericType returns [EObject current=null] : ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleEGenericType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_eUpperBound_8_0 = null;

        EObject lv_eTypeArguments_11_0 = null;

        EObject lv_eTypeArguments_13_0 = null;

        EObject lv_eLowerBound_16_0 = null;



        	enterRule();

        try {
            // InternalMosumo.g:2767:2: ( ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) )
            // InternalMosumo.g:2768:2: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            {
            // InternalMosumo.g:2768:2: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            // InternalMosumo.g:2769:3: () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}'
            {
            // InternalMosumo.g:2769:3: ()
            // InternalMosumo.g:2770:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEGenericTypeAccess().getEGenericTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,68,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEGenericTypeAccess().getEGenericTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_75); 

            			newLeafNode(otherlv_2, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMosumo.g:2784:3: (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==69) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalMosumo.g:2785:4: otherlv_3= 'eTypeParameter' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,69,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEGenericTypeAccess().getETypeParameterKeyword_3_0());
                    			
                    // InternalMosumo.g:2789:4: ( ( ruleEString ) )
                    // InternalMosumo.g:2790:5: ( ruleEString )
                    {
                    // InternalMosumo.g:2790:5: ( ruleEString )
                    // InternalMosumo.g:2791:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEGenericTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeParameterETypeParameterCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_76);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:2806:3: (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==70) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalMosumo.g:2807:4: otherlv_5= 'eClassifier' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,70,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEGenericTypeAccess().getEClassifierKeyword_4_0());
                    			
                    // InternalMosumo.g:2811:4: ( ( ruleEString ) )
                    // InternalMosumo.g:2812:5: ( ruleEString )
                    {
                    // InternalMosumo.g:2812:5: ( ruleEString )
                    // InternalMosumo.g:2813:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEGenericTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getEClassifierEClassifierCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_77);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:2828:3: (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==71) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalMosumo.g:2829:4: otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    {
                    otherlv_7=(Token)match(input,71,FOLLOW_49); 

                    				newLeafNode(otherlv_7, grammarAccess.getEGenericTypeAccess().getEUpperBoundKeyword_5_0());
                    			
                    // InternalMosumo.g:2833:4: ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    // InternalMosumo.g:2834:5: (lv_eUpperBound_8_0= ruleEGenericType )
                    {
                    // InternalMosumo.g:2834:5: (lv_eUpperBound_8_0= ruleEGenericType )
                    // InternalMosumo.g:2835:6: lv_eUpperBound_8_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getEUpperBoundEGenericTypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_78);
                    lv_eUpperBound_8_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEGenericTypeRule());
                    						}
                    						set(
                    							current,
                    							"eUpperBound",
                    							lv_eUpperBound_8_0,
                    							"at.jku.mosumo.lang.Mosumo.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:2853:3: (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==72) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalMosumo.g:2854:4: otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,72,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getEGenericTypeAccess().getETypeArgumentsKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_49); 

                    				newLeafNode(otherlv_10, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalMosumo.g:2862:4: ( (lv_eTypeArguments_11_0= ruleEGenericType ) )
                    // InternalMosumo.g:2863:5: (lv_eTypeArguments_11_0= ruleEGenericType )
                    {
                    // InternalMosumo.g:2863:5: (lv_eTypeArguments_11_0= ruleEGenericType )
                    // InternalMosumo.g:2864:6: lv_eTypeArguments_11_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeArgumentsEGenericTypeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eTypeArguments_11_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEGenericTypeRule());
                    						}
                    						add(
                    							current,
                    							"eTypeArguments",
                    							lv_eTypeArguments_11_0,
                    							"at.jku.mosumo.lang.Mosumo.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:2881:4: (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==18) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalMosumo.g:2882:5: otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FOLLOW_49); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getEGenericTypeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMosumo.g:2886:5: ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    // InternalMosumo.g:2887:6: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    {
                    	    // InternalMosumo.g:2887:6: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    // InternalMosumo.g:2888:7: lv_eTypeArguments_13_0= ruleEGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeArgumentsEGenericTypeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eTypeArguments_13_0=ruleEGenericType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEGenericTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eTypeArguments",
                    	    								lv_eTypeArguments_13_0,
                    	    								"at.jku.mosumo.lang.Mosumo.EGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_79); 

                    				newLeafNode(otherlv_14, grammarAccess.getEGenericTypeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:2911:3: (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==73) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalMosumo.g:2912:4: otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    {
                    otherlv_15=(Token)match(input,73,FOLLOW_49); 

                    				newLeafNode(otherlv_15, grammarAccess.getEGenericTypeAccess().getELowerBoundKeyword_7_0());
                    			
                    // InternalMosumo.g:2916:4: ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    // InternalMosumo.g:2917:5: (lv_eLowerBound_16_0= ruleEGenericType )
                    {
                    // InternalMosumo.g:2917:5: (lv_eLowerBound_16_0= ruleEGenericType )
                    // InternalMosumo.g:2918:6: lv_eLowerBound_16_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getELowerBoundEGenericTypeParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eLowerBound_16_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEGenericTypeRule());
                    						}
                    						set(
                    							current,
                    							"eLowerBound",
                    							lv_eLowerBound_16_0,
                    							"at.jku.mosumo.lang.Mosumo.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getEGenericTypeAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleEGenericType"


    // $ANTLR start "entryRuleEOperation"
    // InternalMosumo.g:2944:1: entryRuleEOperation returns [EObject current=null] : iv_ruleEOperation= ruleEOperation EOF ;
    public final EObject entryRuleEOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperation = null;


        try {
            // InternalMosumo.g:2944:51: (iv_ruleEOperation= ruleEOperation EOF )
            // InternalMosumo.g:2945:2: iv_ruleEOperation= ruleEOperation EOF
            {
             newCompositeNode(grammarAccess.getEOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOperation=ruleEOperation();

            state._fsp--;

             current =iv_ruleEOperation; 
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
    // $ANTLR end "entryRuleEOperation"


    // $ANTLR start "ruleEOperation"
    // InternalMosumo.g:2951:1: ruleEOperation returns [EObject current=null] : ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
    public final EObject ruleEOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ordered_5_0 = null;

        AntlrDatatypeRuleToken lv_unique_7_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_9_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_11_0 = null;

        EObject lv_eAnnotations_22_0 = null;

        EObject lv_eAnnotations_24_0 = null;

        EObject lv_eGenericType_27_0 = null;

        EObject lv_eTypeParameters_30_0 = null;

        EObject lv_eTypeParameters_32_0 = null;

        EObject lv_eParameters_36_0 = null;

        EObject lv_eParameters_38_0 = null;

        EObject lv_eGenericExceptions_42_0 = null;

        EObject lv_eGenericExceptions_44_0 = null;



        	enterRule();

        try {
            // InternalMosumo.g:2957:2: ( ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // InternalMosumo.g:2958:2: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // InternalMosumo.g:2958:2: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // InternalMosumo.g:2959:3: () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // InternalMosumo.g:2959:3: ()
            // InternalMosumo.g:2960:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOperationAccess().getEOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEOperationAccess().getEOperationKeyword_1());
            		
            // InternalMosumo.g:2970:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMosumo.g:2971:4: (lv_name_2_0= ruleEString )
            {
            // InternalMosumo.g:2971:4: (lv_name_2_0= ruleEString )
            // InternalMosumo.g:2972:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEOperationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEOperationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"at.jku.mosumo.lang.Mosumo.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_80); 

            			newLeafNode(otherlv_3, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMosumo.g:2993:3: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==75) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalMosumo.g:2994:4: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,75,FOLLOW_30); 

                    				newLeafNode(otherlv_4, grammarAccess.getEOperationAccess().getOrderedKeyword_4_0());
                    			
                    // InternalMosumo.g:2998:4: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // InternalMosumo.g:2999:5: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // InternalMosumo.g:2999:5: (lv_ordered_5_0= ruleEBoolean )
                    // InternalMosumo.g:3000:6: lv_ordered_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getOrderedEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_81);
                    lv_ordered_5_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"ordered",
                    							lv_ordered_5_0,
                    							"at.jku.mosumo.lang.Mosumo.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:3018:3: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==76) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalMosumo.g:3019:4: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,76,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getEOperationAccess().getUniqueKeyword_5_0());
                    			
                    // InternalMosumo.g:3023:4: ( (lv_unique_7_0= ruleEBoolean ) )
                    // InternalMosumo.g:3024:5: (lv_unique_7_0= ruleEBoolean )
                    {
                    // InternalMosumo.g:3024:5: (lv_unique_7_0= ruleEBoolean )
                    // InternalMosumo.g:3025:6: lv_unique_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getUniqueEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_82);
                    lv_unique_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"unique",
                    							lv_unique_7_0,
                    							"at.jku.mosumo.lang.Mosumo.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:3043:3: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==77) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalMosumo.g:3044:4: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,77,FOLLOW_33); 

                    				newLeafNode(otherlv_8, grammarAccess.getEOperationAccess().getLowerBoundKeyword_6_0());
                    			
                    // InternalMosumo.g:3048:4: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // InternalMosumo.g:3049:5: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // InternalMosumo.g:3049:5: (lv_lowerBound_9_0= ruleEInt )
                    // InternalMosumo.g:3050:6: lv_lowerBound_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getLowerBoundEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_83);
                    lv_lowerBound_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_9_0,
                    							"at.jku.mosumo.lang.Mosumo.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:3068:3: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==78) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalMosumo.g:3069:4: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,78,FOLLOW_33); 

                    				newLeafNode(otherlv_10, grammarAccess.getEOperationAccess().getUpperBoundKeyword_7_0());
                    			
                    // InternalMosumo.g:3073:4: ( (lv_upperBound_11_0= ruleEInt ) )
                    // InternalMosumo.g:3074:5: (lv_upperBound_11_0= ruleEInt )
                    {
                    // InternalMosumo.g:3074:5: (lv_upperBound_11_0= ruleEInt )
                    // InternalMosumo.g:3075:6: lv_upperBound_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getUpperBoundEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_84);
                    lv_upperBound_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_11_0,
                    							"at.jku.mosumo.lang.Mosumo.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:3093:3: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==79) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalMosumo.g:3094:4: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getEOperationAccess().getETypeKeyword_8_0());
                    			
                    // InternalMosumo.g:3098:4: ( ( ruleEString ) )
                    // InternalMosumo.g:3099:5: ( ruleEString )
                    {
                    // InternalMosumo.g:3099:5: ( ruleEString )
                    // InternalMosumo.g:3100:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEOperationAccess().getETypeEClassifierCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_85);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:3115:3: (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==80) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalMosumo.g:3116:4: otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')'
                    {
                    otherlv_14=(Token)match(input,80,FOLLOW_38); 

                    				newLeafNode(otherlv_14, grammarAccess.getEOperationAccess().getEExceptionsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getEOperationAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalMosumo.g:3124:4: ( ( ruleEString ) )
                    // InternalMosumo.g:3125:5: ( ruleEString )
                    {
                    // InternalMosumo.g:3125:5: ( ruleEString )
                    // InternalMosumo.g:3126:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_39);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:3140:4: (otherlv_17= ',' ( ( ruleEString ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==18) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // InternalMosumo.g:3141:5: otherlv_17= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_17=(Token)match(input,18,FOLLOW_3); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEOperationAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMosumo.g:3145:5: ( ( ruleEString ) )
                    	    // InternalMosumo.g:3146:6: ( ruleEString )
                    	    {
                    	    // InternalMosumo.g:3146:6: ( ruleEString )
                    	    // InternalMosumo.g:3147:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEOperationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_39);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,45,FOLLOW_86); 

                    				newLeafNode(otherlv_19, grammarAccess.getEOperationAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:3167:3: (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==27) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalMosumo.g:3168:4: otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getEOperationAccess().getEAnnotationsKeyword_10_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_21, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalMosumo.g:3176:4: ( (lv_eAnnotations_22_0= ruleEAnnotation ) )
                    // InternalMosumo.g:3177:5: (lv_eAnnotations_22_0= ruleEAnnotation )
                    {
                    // InternalMosumo.g:3177:5: (lv_eAnnotations_22_0= ruleEAnnotation )
                    // InternalMosumo.g:3178:6: lv_eAnnotations_22_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEAnnotationsEAnnotationParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eAnnotations_22_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_22_0,
                    							"at.jku.mosumo.lang.Mosumo.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:3195:4: (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==18) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalMosumo.g:3196:5: otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_23=(Token)match(input,18,FOLLOW_21); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getEOperationAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalMosumo.g:3200:5: ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    // InternalMosumo.g:3201:6: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    {
                    	    // InternalMosumo.g:3201:6: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    // InternalMosumo.g:3202:7: lv_eAnnotations_24_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEAnnotationsEAnnotationParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eAnnotations_24_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_24_0,
                    	    								"at.jku.mosumo.lang.Mosumo.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,19,FOLLOW_87); 

                    				newLeafNode(otherlv_25, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:3225:3: (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==81) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalMosumo.g:3226:4: otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    {
                    otherlv_26=(Token)match(input,81,FOLLOW_49); 

                    				newLeafNode(otherlv_26, grammarAccess.getEOperationAccess().getEGenericTypeKeyword_11_0());
                    			
                    // InternalMosumo.g:3230:4: ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    // InternalMosumo.g:3231:5: (lv_eGenericType_27_0= ruleEGenericType )
                    {
                    // InternalMosumo.g:3231:5: (lv_eGenericType_27_0= ruleEGenericType )
                    // InternalMosumo.g:3232:6: lv_eGenericType_27_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEGenericTypeEGenericTypeParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_88);
                    lv_eGenericType_27_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"eGenericType",
                    							lv_eGenericType_27_0,
                    							"at.jku.mosumo.lang.Mosumo.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:3250:3: (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==60) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalMosumo.g:3251:4: otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,60,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getEOperationAccess().getETypeParametersKeyword_12_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_29, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalMosumo.g:3259:4: ( (lv_eTypeParameters_30_0= ruleETypeParameter ) )
                    // InternalMosumo.g:3260:5: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    {
                    // InternalMosumo.g:3260:5: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    // InternalMosumo.g:3261:6: lv_eTypeParameters_30_0= ruleETypeParameter
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getETypeParametersETypeParameterParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eTypeParameters_30_0=ruleETypeParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						add(
                    							current,
                    							"eTypeParameters",
                    							lv_eTypeParameters_30_0,
                    							"at.jku.mosumo.lang.Mosumo.ETypeParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:3278:4: (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==18) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalMosumo.g:3279:5: otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_31=(Token)match(input,18,FOLLOW_57); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getEOperationAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalMosumo.g:3283:5: ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    // InternalMosumo.g:3284:6: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    {
                    	    // InternalMosumo.g:3284:6: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    // InternalMosumo.g:3285:7: lv_eTypeParameters_32_0= ruleETypeParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getETypeParametersETypeParameterParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eTypeParameters_32_0=ruleETypeParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eTypeParameters",
                    	    								lv_eTypeParameters_32_0,
                    	    								"at.jku.mosumo.lang.Mosumo.ETypeParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,19,FOLLOW_89); 

                    				newLeafNode(otherlv_33, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:3308:3: (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==82) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalMosumo.g:3309:4: otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,82,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getEOperationAccess().getEParametersKeyword_13_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_90); 

                    				newLeafNode(otherlv_35, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalMosumo.g:3317:4: ( (lv_eParameters_36_0= ruleEParameter ) )
                    // InternalMosumo.g:3318:5: (lv_eParameters_36_0= ruleEParameter )
                    {
                    // InternalMosumo.g:3318:5: (lv_eParameters_36_0= ruleEParameter )
                    // InternalMosumo.g:3319:6: lv_eParameters_36_0= ruleEParameter
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEParametersEParameterParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eParameters_36_0=ruleEParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						add(
                    							current,
                    							"eParameters",
                    							lv_eParameters_36_0,
                    							"at.jku.mosumo.lang.Mosumo.EParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:3336:4: (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==18) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalMosumo.g:3337:5: otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    {
                    	    otherlv_37=(Token)match(input,18,FOLLOW_90); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getEOperationAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalMosumo.g:3341:5: ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    // InternalMosumo.g:3342:6: (lv_eParameters_38_0= ruleEParameter )
                    	    {
                    	    // InternalMosumo.g:3342:6: (lv_eParameters_38_0= ruleEParameter )
                    	    // InternalMosumo.g:3343:7: lv_eParameters_38_0= ruleEParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEParametersEParameterParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eParameters_38_0=ruleEParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eParameters",
                    	    								lv_eParameters_38_0,
                    	    								"at.jku.mosumo.lang.Mosumo.EParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,19,FOLLOW_91); 

                    				newLeafNode(otherlv_39, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:3366:3: (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==83) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalMosumo.g:3367:4: otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,83,FOLLOW_4); 

                    				newLeafNode(otherlv_40, grammarAccess.getEOperationAccess().getEGenericExceptionsKeyword_14_0());
                    			
                    otherlv_41=(Token)match(input,12,FOLLOW_49); 

                    				newLeafNode(otherlv_41, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalMosumo.g:3375:4: ( (lv_eGenericExceptions_42_0= ruleEGenericType ) )
                    // InternalMosumo.g:3376:5: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    {
                    // InternalMosumo.g:3376:5: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    // InternalMosumo.g:3377:6: lv_eGenericExceptions_42_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEGenericExceptionsEGenericTypeParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eGenericExceptions_42_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						add(
                    							current,
                    							"eGenericExceptions",
                    							lv_eGenericExceptions_42_0,
                    							"at.jku.mosumo.lang.Mosumo.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:3394:4: (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==18) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalMosumo.g:3395:5: otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,18,FOLLOW_49); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getEOperationAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalMosumo.g:3399:5: ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    // InternalMosumo.g:3400:6: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    {
                    	    // InternalMosumo.g:3400:6: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    // InternalMosumo.g:3401:7: lv_eGenericExceptions_44_0= ruleEGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEGenericExceptionsEGenericTypeParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eGenericExceptions_44_0=ruleEGenericType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eGenericExceptions",
                    	    								lv_eGenericExceptions_44_0,
                    	    								"at.jku.mosumo.lang.Mosumo.EGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_45, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            otherlv_46=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_46, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleEOperation"


    // $ANTLR start "entryRuleEInt"
    // InternalMosumo.g:3432:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMosumo.g:3432:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMosumo.g:3433:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalMosumo.g:3439:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMosumo.g:3445:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMosumo.g:3446:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMosumo.g:3446:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMosumo.g:3447:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMosumo.g:3447:3: (kw= '-' )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==40) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalMosumo.g:3448:4: kw= '-'
                    {
                    kw=(Token)match(input,40,FOLLOW_35); 

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


    // $ANTLR start "entryRuleEParameter"
    // InternalMosumo.g:3465:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // InternalMosumo.g:3465:51: (iv_ruleEParameter= ruleEParameter EOF )
            // InternalMosumo.g:3466:2: iv_ruleEParameter= ruleEParameter EOF
            {
             newCompositeNode(grammarAccess.getEParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEParameter=ruleEParameter();

            state._fsp--;

             current =iv_ruleEParameter; 
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
    // $ANTLR end "entryRuleEParameter"


    // $ANTLR start "ruleEParameter"
    // InternalMosumo.g:3472:1: ruleEParameter returns [EObject current=null] : ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) ;
    public final EObject ruleEParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ordered_5_0 = null;

        AntlrDatatypeRuleToken lv_unique_7_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_9_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_11_0 = null;

        EObject lv_eAnnotations_16_0 = null;

        EObject lv_eAnnotations_18_0 = null;

        EObject lv_eGenericType_21_0 = null;



        	enterRule();

        try {
            // InternalMosumo.g:3478:2: ( ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) )
            // InternalMosumo.g:3479:2: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            {
            // InternalMosumo.g:3479:2: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            // InternalMosumo.g:3480:3: () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}'
            {
            // InternalMosumo.g:3480:3: ()
            // InternalMosumo.g:3481:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEParameterAccess().getEParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,84,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEParameterAccess().getEParameterKeyword_1());
            		
            // InternalMosumo.g:3491:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMosumo.g:3492:4: (lv_name_2_0= ruleEString )
            {
            // InternalMosumo.g:3492:4: (lv_name_2_0= ruleEString )
            // InternalMosumo.g:3493:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"at.jku.mosumo.lang.Mosumo.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_92); 

            			newLeafNode(otherlv_3, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMosumo.g:3514:3: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==75) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalMosumo.g:3515:4: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,75,FOLLOW_30); 

                    				newLeafNode(otherlv_4, grammarAccess.getEParameterAccess().getOrderedKeyword_4_0());
                    			
                    // InternalMosumo.g:3519:4: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // InternalMosumo.g:3520:5: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // InternalMosumo.g:3520:5: (lv_ordered_5_0= ruleEBoolean )
                    // InternalMosumo.g:3521:6: lv_ordered_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getOrderedEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_93);
                    lv_ordered_5_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"ordered",
                    							lv_ordered_5_0,
                    							"at.jku.mosumo.lang.Mosumo.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:3539:3: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==76) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalMosumo.g:3540:4: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,76,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getEParameterAccess().getUniqueKeyword_5_0());
                    			
                    // InternalMosumo.g:3544:4: ( (lv_unique_7_0= ruleEBoolean ) )
                    // InternalMosumo.g:3545:5: (lv_unique_7_0= ruleEBoolean )
                    {
                    // InternalMosumo.g:3545:5: (lv_unique_7_0= ruleEBoolean )
                    // InternalMosumo.g:3546:6: lv_unique_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getUniqueEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_94);
                    lv_unique_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"unique",
                    							lv_unique_7_0,
                    							"at.jku.mosumo.lang.Mosumo.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:3564:3: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==77) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalMosumo.g:3565:4: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,77,FOLLOW_33); 

                    				newLeafNode(otherlv_8, grammarAccess.getEParameterAccess().getLowerBoundKeyword_6_0());
                    			
                    // InternalMosumo.g:3569:4: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // InternalMosumo.g:3570:5: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // InternalMosumo.g:3570:5: (lv_lowerBound_9_0= ruleEInt )
                    // InternalMosumo.g:3571:6: lv_lowerBound_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getLowerBoundEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_95);
                    lv_lowerBound_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_9_0,
                    							"at.jku.mosumo.lang.Mosumo.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:3589:3: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==78) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalMosumo.g:3590:4: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,78,FOLLOW_33); 

                    				newLeafNode(otherlv_10, grammarAccess.getEParameterAccess().getUpperBoundKeyword_7_0());
                    			
                    // InternalMosumo.g:3594:4: ( (lv_upperBound_11_0= ruleEInt ) )
                    // InternalMosumo.g:3595:5: (lv_upperBound_11_0= ruleEInt )
                    {
                    // InternalMosumo.g:3595:5: (lv_upperBound_11_0= ruleEInt )
                    // InternalMosumo.g:3596:6: lv_upperBound_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getUpperBoundEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_96);
                    lv_upperBound_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_11_0,
                    							"at.jku.mosumo.lang.Mosumo.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:3614:3: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==79) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalMosumo.g:3615:4: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getEParameterAccess().getETypeKeyword_8_0());
                    			
                    // InternalMosumo.g:3619:4: ( ( ruleEString ) )
                    // InternalMosumo.g:3620:5: ( ruleEString )
                    {
                    // InternalMosumo.g:3620:5: ( ruleEString )
                    // InternalMosumo.g:3621:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEParameterRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEParameterAccess().getETypeEClassifierCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_97);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:3636:3: (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==27) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalMosumo.g:3637:4: otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getEParameterAccess().getEAnnotationsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_15, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalMosumo.g:3645:4: ( (lv_eAnnotations_16_0= ruleEAnnotation ) )
                    // InternalMosumo.g:3646:5: (lv_eAnnotations_16_0= ruleEAnnotation )
                    {
                    // InternalMosumo.g:3646:5: (lv_eAnnotations_16_0= ruleEAnnotation )
                    // InternalMosumo.g:3647:6: lv_eAnnotations_16_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getEAnnotationsEAnnotationParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eAnnotations_16_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_16_0,
                    							"at.jku.mosumo.lang.Mosumo.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:3664:4: (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==18) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // InternalMosumo.g:3665:5: otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_17=(Token)match(input,18,FOLLOW_21); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEParameterAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMosumo.g:3669:5: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    // InternalMosumo.g:3670:6: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    {
                    	    // InternalMosumo.g:3670:6: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    // InternalMosumo.g:3671:7: lv_eAnnotations_18_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEParameterAccess().getEAnnotationsEAnnotationParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eAnnotations_18_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEParameterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_18_0,
                    	    								"at.jku.mosumo.lang.Mosumo.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop103;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,19,FOLLOW_98); 

                    				newLeafNode(otherlv_19, grammarAccess.getEParameterAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:3694:3: (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==81) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalMosumo.g:3695:4: otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    {
                    otherlv_20=(Token)match(input,81,FOLLOW_49); 

                    				newLeafNode(otherlv_20, grammarAccess.getEParameterAccess().getEGenericTypeKeyword_10_0());
                    			
                    // InternalMosumo.g:3699:4: ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    // InternalMosumo.g:3700:5: (lv_eGenericType_21_0= ruleEGenericType )
                    {
                    // InternalMosumo.g:3700:5: (lv_eGenericType_21_0= ruleEGenericType )
                    // InternalMosumo.g:3701:6: lv_eGenericType_21_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getEGenericTypeEGenericTypeParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eGenericType_21_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"eGenericType",
                    							lv_eGenericType_21_0,
                    							"at.jku.mosumo.lang.Mosumo.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getEParameterAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleEParameter"


    // $ANTLR start "entryRuleEAttribute"
    // InternalMosumo.g:3727:1: entryRuleEAttribute returns [EObject current=null] : iv_ruleEAttribute= ruleEAttribute EOF ;
    public final EObject entryRuleEAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttribute = null;


        try {
            // InternalMosumo.g:3727:51: (iv_ruleEAttribute= ruleEAttribute EOF )
            // InternalMosumo.g:3728:2: iv_ruleEAttribute= ruleEAttribute EOF
            {
             newCompositeNode(grammarAccess.getEAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAttribute=ruleEAttribute();

            state._fsp--;

             current =iv_ruleEAttribute; 
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
    // $ANTLR end "entryRuleEAttribute"


    // $ANTLR start "ruleEAttribute"
    // InternalMosumo.g:3734:1: ruleEAttribute returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) ;
    public final EObject ruleEAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_volatile_1_0=null;
        Token lv_transient_2_0=null;
        Token lv_unsettable_3_0=null;
        Token lv_derived_4_0=null;
        Token lv_iD_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_name_7_0 = null;

        AntlrDatatypeRuleToken lv_ordered_10_0 = null;

        AntlrDatatypeRuleToken lv_unique_12_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_14_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_16_0 = null;

        AntlrDatatypeRuleToken lv_changeable_18_0 = null;

        AntlrDatatypeRuleToken lv_defaultValueLiteral_20_0 = null;

        EObject lv_eAnnotations_25_0 = null;

        EObject lv_eAnnotations_27_0 = null;

        EObject lv_eGenericType_30_0 = null;



        	enterRule();

        try {
            // InternalMosumo.g:3740:2: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) )
            // InternalMosumo.g:3741:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            {
            // InternalMosumo.g:3741:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            // InternalMosumo.g:3742:3: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}'
            {
            // InternalMosumo.g:3742:3: ()
            // InternalMosumo.g:3743:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAttributeAccess().getEAttributeAction_0(),
            					current);
            			

            }

            // InternalMosumo.g:3749:3: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==85) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalMosumo.g:3750:4: (lv_volatile_1_0= 'volatile' )
                    {
                    // InternalMosumo.g:3750:4: (lv_volatile_1_0= 'volatile' )
                    // InternalMosumo.g:3751:5: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,85,FOLLOW_99); 

                    					newLeafNode(lv_volatile_1_0, grammarAccess.getEAttributeAccess().getVolatileVolatileKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "volatile", lv_volatile_1_0 != null, "volatile");
                    				

                    }


                    }
                    break;

            }

            // InternalMosumo.g:3763:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==86) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalMosumo.g:3764:4: (lv_transient_2_0= 'transient' )
                    {
                    // InternalMosumo.g:3764:4: (lv_transient_2_0= 'transient' )
                    // InternalMosumo.g:3765:5: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,86,FOLLOW_100); 

                    					newLeafNode(lv_transient_2_0, grammarAccess.getEAttributeAccess().getTransientTransientKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "transient", lv_transient_2_0 != null, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalMosumo.g:3777:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==87) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalMosumo.g:3778:4: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // InternalMosumo.g:3778:4: (lv_unsettable_3_0= 'unsettable' )
                    // InternalMosumo.g:3779:5: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,87,FOLLOW_101); 

                    					newLeafNode(lv_unsettable_3_0, grammarAccess.getEAttributeAccess().getUnsettableUnsettableKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "unsettable", lv_unsettable_3_0 != null, "unsettable");
                    				

                    }


                    }
                    break;

            }

            // InternalMosumo.g:3791:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==88) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalMosumo.g:3792:4: (lv_derived_4_0= 'derived' )
                    {
                    // InternalMosumo.g:3792:4: (lv_derived_4_0= 'derived' )
                    // InternalMosumo.g:3793:5: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,88,FOLLOW_102); 

                    					newLeafNode(lv_derived_4_0, grammarAccess.getEAttributeAccess().getDerivedDerivedKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "derived", lv_derived_4_0 != null, "derived");
                    				

                    }


                    }
                    break;

            }

            // InternalMosumo.g:3805:3: ( (lv_iD_5_0= 'iD' ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==89) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalMosumo.g:3806:4: (lv_iD_5_0= 'iD' )
                    {
                    // InternalMosumo.g:3806:4: (lv_iD_5_0= 'iD' )
                    // InternalMosumo.g:3807:5: lv_iD_5_0= 'iD'
                    {
                    lv_iD_5_0=(Token)match(input,89,FOLLOW_103); 

                    					newLeafNode(lv_iD_5_0, grammarAccess.getEAttributeAccess().getIDIDKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "iD", lv_iD_5_0 != null, "iD");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getEAttributeAccess().getEAttributeKeyword_6());
            		
            // InternalMosumo.g:3823:3: ( (lv_name_7_0= ruleEString ) )
            // InternalMosumo.g:3824:4: (lv_name_7_0= ruleEString )
            {
            // InternalMosumo.g:3824:4: (lv_name_7_0= ruleEString )
            // InternalMosumo.g:3825:5: lv_name_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEAttributeAccess().getNameEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_7_0,
            						"at.jku.mosumo.lang.Mosumo.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,12,FOLLOW_104); 

            			newLeafNode(otherlv_8, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMosumo.g:3846:3: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==75) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalMosumo.g:3847:4: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,75,FOLLOW_30); 

                    				newLeafNode(otherlv_9, grammarAccess.getEAttributeAccess().getOrderedKeyword_9_0());
                    			
                    // InternalMosumo.g:3851:4: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // InternalMosumo.g:3852:5: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // InternalMosumo.g:3852:5: (lv_ordered_10_0= ruleEBoolean )
                    // InternalMosumo.g:3853:6: lv_ordered_10_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getOrderedEBooleanParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_105);
                    lv_ordered_10_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"ordered",
                    							lv_ordered_10_0,
                    							"at.jku.mosumo.lang.Mosumo.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:3871:3: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==76) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalMosumo.g:3872:4: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,76,FOLLOW_30); 

                    				newLeafNode(otherlv_11, grammarAccess.getEAttributeAccess().getUniqueKeyword_10_0());
                    			
                    // InternalMosumo.g:3876:4: ( (lv_unique_12_0= ruleEBoolean ) )
                    // InternalMosumo.g:3877:5: (lv_unique_12_0= ruleEBoolean )
                    {
                    // InternalMosumo.g:3877:5: (lv_unique_12_0= ruleEBoolean )
                    // InternalMosumo.g:3878:6: lv_unique_12_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getUniqueEBooleanParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_106);
                    lv_unique_12_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"unique",
                    							lv_unique_12_0,
                    							"at.jku.mosumo.lang.Mosumo.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:3896:3: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==77) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalMosumo.g:3897:4: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,77,FOLLOW_33); 

                    				newLeafNode(otherlv_13, grammarAccess.getEAttributeAccess().getLowerBoundKeyword_11_0());
                    			
                    // InternalMosumo.g:3901:4: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // InternalMosumo.g:3902:5: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // InternalMosumo.g:3902:5: (lv_lowerBound_14_0= ruleEInt )
                    // InternalMosumo.g:3903:6: lv_lowerBound_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getLowerBoundEIntParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_107);
                    lv_lowerBound_14_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_14_0,
                    							"at.jku.mosumo.lang.Mosumo.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:3921:3: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==78) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalMosumo.g:3922:4: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,78,FOLLOW_33); 

                    				newLeafNode(otherlv_15, grammarAccess.getEAttributeAccess().getUpperBoundKeyword_12_0());
                    			
                    // InternalMosumo.g:3926:4: ( (lv_upperBound_16_0= ruleEInt ) )
                    // InternalMosumo.g:3927:5: (lv_upperBound_16_0= ruleEInt )
                    {
                    // InternalMosumo.g:3927:5: (lv_upperBound_16_0= ruleEInt )
                    // InternalMosumo.g:3928:6: lv_upperBound_16_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getUpperBoundEIntParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_108);
                    lv_upperBound_16_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_16_0,
                    							"at.jku.mosumo.lang.Mosumo.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:3946:3: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==91) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalMosumo.g:3947:4: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,91,FOLLOW_30); 

                    				newLeafNode(otherlv_17, grammarAccess.getEAttributeAccess().getChangeableKeyword_13_0());
                    			
                    // InternalMosumo.g:3951:4: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // InternalMosumo.g:3952:5: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // InternalMosumo.g:3952:5: (lv_changeable_18_0= ruleEBoolean )
                    // InternalMosumo.g:3953:6: lv_changeable_18_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getChangeableEBooleanParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_109);
                    lv_changeable_18_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"changeable",
                    							lv_changeable_18_0,
                    							"at.jku.mosumo.lang.Mosumo.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:3971:3: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==92) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalMosumo.g:3972:4: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,92,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getEAttributeAccess().getDefaultValueLiteralKeyword_14_0());
                    			
                    // InternalMosumo.g:3976:4: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // InternalMosumo.g:3977:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // InternalMosumo.g:3977:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    // InternalMosumo.g:3978:6: lv_defaultValueLiteral_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_96);
                    lv_defaultValueLiteral_20_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"defaultValueLiteral",
                    							lv_defaultValueLiteral_20_0,
                    							"at.jku.mosumo.lang.Mosumo.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:3996:3: (otherlv_21= 'eType' ( ( ruleEString ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==79) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalMosumo.g:3997:4: otherlv_21= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_21=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getEAttributeAccess().getETypeKeyword_15_0());
                    			
                    // InternalMosumo.g:4001:4: ( ( ruleEString ) )
                    // InternalMosumo.g:4002:5: ( ruleEString )
                    {
                    // InternalMosumo.g:4002:5: ( ruleEString )
                    // InternalMosumo.g:4003:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getETypeEClassifierCrossReference_15_1_0());
                    					
                    pushFollow(FOLLOW_97);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:4018:3: (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==27) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalMosumo.g:4019:4: otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getEAttributeAccess().getEAnnotationsKeyword_16_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_24, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_16_1());
                    			
                    // InternalMosumo.g:4027:4: ( (lv_eAnnotations_25_0= ruleEAnnotation ) )
                    // InternalMosumo.g:4028:5: (lv_eAnnotations_25_0= ruleEAnnotation )
                    {
                    // InternalMosumo.g:4028:5: (lv_eAnnotations_25_0= ruleEAnnotation )
                    // InternalMosumo.g:4029:6: lv_eAnnotations_25_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getEAnnotationsEAnnotationParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eAnnotations_25_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_25_0,
                    							"at.jku.mosumo.lang.Mosumo.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:4046:4: (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )*
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==18) ) {
                            alt118=1;
                        }


                        switch (alt118) {
                    	case 1 :
                    	    // InternalMosumo.g:4047:5: otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_26=(Token)match(input,18,FOLLOW_21); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getEAttributeAccess().getCommaKeyword_16_3_0());
                    	    				
                    	    // InternalMosumo.g:4051:5: ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    // InternalMosumo.g:4052:6: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    {
                    	    // InternalMosumo.g:4052:6: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    // InternalMosumo.g:4053:7: lv_eAnnotations_27_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAttributeAccess().getEAnnotationsEAnnotationParserRuleCall_16_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eAnnotations_27_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_27_0,
                    	    								"at.jku.mosumo.lang.Mosumo.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop118;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,19,FOLLOW_98); 

                    				newLeafNode(otherlv_28, grammarAccess.getEAttributeAccess().getRightCurlyBracketKeyword_16_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:4076:3: (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==81) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalMosumo.g:4077:4: otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    {
                    otherlv_29=(Token)match(input,81,FOLLOW_49); 

                    				newLeafNode(otherlv_29, grammarAccess.getEAttributeAccess().getEGenericTypeKeyword_17_0());
                    			
                    // InternalMosumo.g:4081:4: ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    // InternalMosumo.g:4082:5: (lv_eGenericType_30_0= ruleEGenericType )
                    {
                    // InternalMosumo.g:4082:5: (lv_eGenericType_30_0= ruleEGenericType )
                    // InternalMosumo.g:4083:6: lv_eGenericType_30_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getEGenericTypeEGenericTypeParserRuleCall_17_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eGenericType_30_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"eGenericType",
                    							lv_eGenericType_30_0,
                    							"at.jku.mosumo.lang.Mosumo.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_31=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getEAttributeAccess().getRightCurlyBracketKeyword_18());
            		

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
    // $ANTLR end "ruleEAttribute"


    // $ANTLR start "entryRuleEReference"
    // InternalMosumo.g:4109:1: entryRuleEReference returns [EObject current=null] : iv_ruleEReference= ruleEReference EOF ;
    public final EObject entryRuleEReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEReference = null;


        try {
            // InternalMosumo.g:4109:51: (iv_ruleEReference= ruleEReference EOF )
            // InternalMosumo.g:4110:2: iv_ruleEReference= ruleEReference EOF
            {
             newCompositeNode(grammarAccess.getEReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEReference=ruleEReference();

            state._fsp--;

             current =iv_ruleEReference; 
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
    // $ANTLR end "entryRuleEReference"


    // $ANTLR start "ruleEReference"
    // InternalMosumo.g:4116:1: ruleEReference returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) ;
    public final EObject ruleEReference() throws RecognitionException {
        EObject current = null;

        Token lv_volatile_1_0=null;
        Token lv_transient_2_0=null;
        Token lv_unsettable_3_0=null;
        Token lv_derived_4_0=null;
        Token lv_containment_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        AntlrDatatypeRuleToken lv_name_7_0 = null;

        AntlrDatatypeRuleToken lv_ordered_10_0 = null;

        AntlrDatatypeRuleToken lv_unique_12_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_14_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_16_0 = null;

        AntlrDatatypeRuleToken lv_changeable_18_0 = null;

        AntlrDatatypeRuleToken lv_defaultValueLiteral_20_0 = null;

        AntlrDatatypeRuleToken lv_resolveProxies_22_0 = null;

        EObject lv_eAnnotations_35_0 = null;

        EObject lv_eAnnotations_37_0 = null;

        EObject lv_eGenericType_40_0 = null;



        	enterRule();

        try {
            // InternalMosumo.g:4122:2: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) )
            // InternalMosumo.g:4123:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            {
            // InternalMosumo.g:4123:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            // InternalMosumo.g:4124:3: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}'
            {
            // InternalMosumo.g:4124:3: ()
            // InternalMosumo.g:4125:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEReferenceAccess().getEReferenceAction_0(),
            					current);
            			

            }

            // InternalMosumo.g:4131:3: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==85) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalMosumo.g:4132:4: (lv_volatile_1_0= 'volatile' )
                    {
                    // InternalMosumo.g:4132:4: (lv_volatile_1_0= 'volatile' )
                    // InternalMosumo.g:4133:5: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,85,FOLLOW_110); 

                    					newLeafNode(lv_volatile_1_0, grammarAccess.getEReferenceAccess().getVolatileVolatileKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "volatile", lv_volatile_1_0 != null, "volatile");
                    				

                    }


                    }
                    break;

            }

            // InternalMosumo.g:4145:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==86) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalMosumo.g:4146:4: (lv_transient_2_0= 'transient' )
                    {
                    // InternalMosumo.g:4146:4: (lv_transient_2_0= 'transient' )
                    // InternalMosumo.g:4147:5: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,86,FOLLOW_111); 

                    					newLeafNode(lv_transient_2_0, grammarAccess.getEReferenceAccess().getTransientTransientKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "transient", lv_transient_2_0 != null, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalMosumo.g:4159:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==87) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalMosumo.g:4160:4: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // InternalMosumo.g:4160:4: (lv_unsettable_3_0= 'unsettable' )
                    // InternalMosumo.g:4161:5: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,87,FOLLOW_112); 

                    					newLeafNode(lv_unsettable_3_0, grammarAccess.getEReferenceAccess().getUnsettableUnsettableKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "unsettable", lv_unsettable_3_0 != null, "unsettable");
                    				

                    }


                    }
                    break;

            }

            // InternalMosumo.g:4173:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==88) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalMosumo.g:4174:4: (lv_derived_4_0= 'derived' )
                    {
                    // InternalMosumo.g:4174:4: (lv_derived_4_0= 'derived' )
                    // InternalMosumo.g:4175:5: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,88,FOLLOW_113); 

                    					newLeafNode(lv_derived_4_0, grammarAccess.getEReferenceAccess().getDerivedDerivedKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "derived", lv_derived_4_0 != null, "derived");
                    				

                    }


                    }
                    break;

            }

            // InternalMosumo.g:4187:3: ( (lv_containment_5_0= 'containment' ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==93) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalMosumo.g:4188:4: (lv_containment_5_0= 'containment' )
                    {
                    // InternalMosumo.g:4188:4: (lv_containment_5_0= 'containment' )
                    // InternalMosumo.g:4189:5: lv_containment_5_0= 'containment'
                    {
                    lv_containment_5_0=(Token)match(input,93,FOLLOW_114); 

                    					newLeafNode(lv_containment_5_0, grammarAccess.getEReferenceAccess().getContainmentContainmentKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "containment", lv_containment_5_0 != null, "containment");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,94,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getEReferenceAccess().getEReferenceKeyword_6());
            		
            // InternalMosumo.g:4205:3: ( (lv_name_7_0= ruleEString ) )
            // InternalMosumo.g:4206:4: (lv_name_7_0= ruleEString )
            {
            // InternalMosumo.g:4206:4: (lv_name_7_0= ruleEString )
            // InternalMosumo.g:4207:5: lv_name_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEReferenceAccess().getNameEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEReferenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_7_0,
            						"at.jku.mosumo.lang.Mosumo.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,12,FOLLOW_115); 

            			newLeafNode(otherlv_8, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMosumo.g:4228:3: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==75) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalMosumo.g:4229:4: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,75,FOLLOW_30); 

                    				newLeafNode(otherlv_9, grammarAccess.getEReferenceAccess().getOrderedKeyword_9_0());
                    			
                    // InternalMosumo.g:4233:4: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // InternalMosumo.g:4234:5: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // InternalMosumo.g:4234:5: (lv_ordered_10_0= ruleEBoolean )
                    // InternalMosumo.g:4235:6: lv_ordered_10_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getOrderedEBooleanParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_116);
                    lv_ordered_10_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"ordered",
                    							lv_ordered_10_0,
                    							"at.jku.mosumo.lang.Mosumo.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:4253:3: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==76) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalMosumo.g:4254:4: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,76,FOLLOW_30); 

                    				newLeafNode(otherlv_11, grammarAccess.getEReferenceAccess().getUniqueKeyword_10_0());
                    			
                    // InternalMosumo.g:4258:4: ( (lv_unique_12_0= ruleEBoolean ) )
                    // InternalMosumo.g:4259:5: (lv_unique_12_0= ruleEBoolean )
                    {
                    // InternalMosumo.g:4259:5: (lv_unique_12_0= ruleEBoolean )
                    // InternalMosumo.g:4260:6: lv_unique_12_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getUniqueEBooleanParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_117);
                    lv_unique_12_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"unique",
                    							lv_unique_12_0,
                    							"at.jku.mosumo.lang.Mosumo.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:4278:3: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==77) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalMosumo.g:4279:4: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,77,FOLLOW_33); 

                    				newLeafNode(otherlv_13, grammarAccess.getEReferenceAccess().getLowerBoundKeyword_11_0());
                    			
                    // InternalMosumo.g:4283:4: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // InternalMosumo.g:4284:5: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // InternalMosumo.g:4284:5: (lv_lowerBound_14_0= ruleEInt )
                    // InternalMosumo.g:4285:6: lv_lowerBound_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getLowerBoundEIntParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_118);
                    lv_lowerBound_14_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_14_0,
                    							"at.jku.mosumo.lang.Mosumo.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:4303:3: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==78) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalMosumo.g:4304:4: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,78,FOLLOW_33); 

                    				newLeafNode(otherlv_15, grammarAccess.getEReferenceAccess().getUpperBoundKeyword_12_0());
                    			
                    // InternalMosumo.g:4308:4: ( (lv_upperBound_16_0= ruleEInt ) )
                    // InternalMosumo.g:4309:5: (lv_upperBound_16_0= ruleEInt )
                    {
                    // InternalMosumo.g:4309:5: (lv_upperBound_16_0= ruleEInt )
                    // InternalMosumo.g:4310:6: lv_upperBound_16_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getUpperBoundEIntParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_119);
                    lv_upperBound_16_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_16_0,
                    							"at.jku.mosumo.lang.Mosumo.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:4328:3: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==91) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalMosumo.g:4329:4: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,91,FOLLOW_30); 

                    				newLeafNode(otherlv_17, grammarAccess.getEReferenceAccess().getChangeableKeyword_13_0());
                    			
                    // InternalMosumo.g:4333:4: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // InternalMosumo.g:4334:5: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // InternalMosumo.g:4334:5: (lv_changeable_18_0= ruleEBoolean )
                    // InternalMosumo.g:4335:6: lv_changeable_18_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getChangeableEBooleanParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_120);
                    lv_changeable_18_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"changeable",
                    							lv_changeable_18_0,
                    							"at.jku.mosumo.lang.Mosumo.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:4353:3: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==92) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalMosumo.g:4354:4: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,92,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getEReferenceAccess().getDefaultValueLiteralKeyword_14_0());
                    			
                    // InternalMosumo.g:4358:4: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // InternalMosumo.g:4359:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // InternalMosumo.g:4359:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    // InternalMosumo.g:4360:6: lv_defaultValueLiteral_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_121);
                    lv_defaultValueLiteral_20_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"defaultValueLiteral",
                    							lv_defaultValueLiteral_20_0,
                    							"at.jku.mosumo.lang.Mosumo.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:4378:3: (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==95) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalMosumo.g:4379:4: otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    {
                    otherlv_21=(Token)match(input,95,FOLLOW_30); 

                    				newLeafNode(otherlv_21, grammarAccess.getEReferenceAccess().getResolveProxiesKeyword_15_0());
                    			
                    // InternalMosumo.g:4383:4: ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    // InternalMosumo.g:4384:5: (lv_resolveProxies_22_0= ruleEBoolean )
                    {
                    // InternalMosumo.g:4384:5: (lv_resolveProxies_22_0= ruleEBoolean )
                    // InternalMosumo.g:4385:6: lv_resolveProxies_22_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getResolveProxiesEBooleanParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_122);
                    lv_resolveProxies_22_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"resolveProxies",
                    							lv_resolveProxies_22_0,
                    							"at.jku.mosumo.lang.Mosumo.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:4403:3: (otherlv_23= 'eType' ( ( ruleEString ) ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==79) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalMosumo.g:4404:4: otherlv_23= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_23=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getEReferenceAccess().getETypeKeyword_16_0());
                    			
                    // InternalMosumo.g:4408:4: ( ( ruleEString ) )
                    // InternalMosumo.g:4409:5: ( ruleEString )
                    {
                    // InternalMosumo.g:4409:5: ( ruleEString )
                    // InternalMosumo.g:4410:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getETypeEClassifierCrossReference_16_1_0());
                    					
                    pushFollow(FOLLOW_123);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:4425:3: (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==96) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalMosumo.g:4426:4: otherlv_25= 'eOpposite' ( ( ruleEString ) )
                    {
                    otherlv_25=(Token)match(input,96,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getEReferenceAccess().getEOppositeKeyword_17_0());
                    			
                    // InternalMosumo.g:4430:4: ( ( ruleEString ) )
                    // InternalMosumo.g:4431:5: ( ruleEString )
                    {
                    // InternalMosumo.g:4431:5: ( ruleEString )
                    // InternalMosumo.g:4432:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEOppositeEReferenceCrossReference_17_1_0());
                    					
                    pushFollow(FOLLOW_124);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:4447:3: (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==97) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalMosumo.g:4448:4: otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')'
                    {
                    otherlv_27=(Token)match(input,97,FOLLOW_38); 

                    				newLeafNode(otherlv_27, grammarAccess.getEReferenceAccess().getEKeysKeyword_18_0());
                    			
                    otherlv_28=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_28, grammarAccess.getEReferenceAccess().getLeftParenthesisKeyword_18_1());
                    			
                    // InternalMosumo.g:4456:4: ( ( ruleEString ) )
                    // InternalMosumo.g:4457:5: ( ruleEString )
                    {
                    // InternalMosumo.g:4457:5: ( ruleEString )
                    // InternalMosumo.g:4458:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_2_0());
                    					
                    pushFollow(FOLLOW_39);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:4472:4: (otherlv_30= ',' ( ( ruleEString ) ) )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==18) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // InternalMosumo.g:4473:5: otherlv_30= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_30=(Token)match(input,18,FOLLOW_3); 

                    	    					newLeafNode(otherlv_30, grammarAccess.getEReferenceAccess().getCommaKeyword_18_3_0());
                    	    				
                    	    // InternalMosumo.g:4477:5: ( ( ruleEString ) )
                    	    // InternalMosumo.g:4478:6: ( ruleEString )
                    	    {
                    	    // InternalMosumo.g:4478:6: ( ruleEString )
                    	    // InternalMosumo.g:4479:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEReferenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_39);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop135;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,45,FOLLOW_97); 

                    				newLeafNode(otherlv_32, grammarAccess.getEReferenceAccess().getRightParenthesisKeyword_18_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:4499:3: (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==27) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalMosumo.g:4500:4: otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_33, grammarAccess.getEReferenceAccess().getEAnnotationsKeyword_19_0());
                    			
                    otherlv_34=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_34, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_19_1());
                    			
                    // InternalMosumo.g:4508:4: ( (lv_eAnnotations_35_0= ruleEAnnotation ) )
                    // InternalMosumo.g:4509:5: (lv_eAnnotations_35_0= ruleEAnnotation )
                    {
                    // InternalMosumo.g:4509:5: (lv_eAnnotations_35_0= ruleEAnnotation )
                    // InternalMosumo.g:4510:6: lv_eAnnotations_35_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEAnnotationsEAnnotationParserRuleCall_19_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eAnnotations_35_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_35_0,
                    							"at.jku.mosumo.lang.Mosumo.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:4527:4: (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )*
                    loop137:
                    do {
                        int alt137=2;
                        int LA137_0 = input.LA(1);

                        if ( (LA137_0==18) ) {
                            alt137=1;
                        }


                        switch (alt137) {
                    	case 1 :
                    	    // InternalMosumo.g:4528:5: otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_36=(Token)match(input,18,FOLLOW_21); 

                    	    					newLeafNode(otherlv_36, grammarAccess.getEReferenceAccess().getCommaKeyword_19_3_0());
                    	    				
                    	    // InternalMosumo.g:4532:5: ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    // InternalMosumo.g:4533:6: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    {
                    	    // InternalMosumo.g:4533:6: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    // InternalMosumo.g:4534:7: lv_eAnnotations_37_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEReferenceAccess().getEAnnotationsEAnnotationParserRuleCall_19_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eAnnotations_37_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_37_0,
                    	    								"at.jku.mosumo.lang.Mosumo.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop137;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,19,FOLLOW_98); 

                    				newLeafNode(otherlv_38, grammarAccess.getEReferenceAccess().getRightCurlyBracketKeyword_19_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:4557:3: (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==81) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalMosumo.g:4558:4: otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    {
                    otherlv_39=(Token)match(input,81,FOLLOW_49); 

                    				newLeafNode(otherlv_39, grammarAccess.getEReferenceAccess().getEGenericTypeKeyword_20_0());
                    			
                    // InternalMosumo.g:4562:4: ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    // InternalMosumo.g:4563:5: (lv_eGenericType_40_0= ruleEGenericType )
                    {
                    // InternalMosumo.g:4563:5: (lv_eGenericType_40_0= ruleEGenericType )
                    // InternalMosumo.g:4564:6: lv_eGenericType_40_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEGenericTypeEGenericTypeParserRuleCall_20_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eGenericType_40_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"eGenericType",
                    							lv_eGenericType_40_0,
                    							"at.jku.mosumo.lang.Mosumo.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_41=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_41, grammarAccess.getEReferenceAccess().getRightCurlyBracketKeyword_21());
            		

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
    // $ANTLR end "ruleEReference"


    // $ANTLR start "entryRuleEEnumLiteral"
    // InternalMosumo.g:4590:1: entryRuleEEnumLiteral returns [EObject current=null] : iv_ruleEEnumLiteral= ruleEEnumLiteral EOF ;
    public final EObject entryRuleEEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnumLiteral = null;


        try {
            // InternalMosumo.g:4590:53: (iv_ruleEEnumLiteral= ruleEEnumLiteral EOF )
            // InternalMosumo.g:4591:2: iv_ruleEEnumLiteral= ruleEEnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getEEnumLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEEnumLiteral=ruleEEnumLiteral();

            state._fsp--;

             current =iv_ruleEEnumLiteral; 
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
    // $ANTLR end "entryRuleEEnumLiteral"


    // $ANTLR start "ruleEEnumLiteral"
    // InternalMosumo.g:4597:1: ruleEEnumLiteral returns [EObject current=null] : ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleEEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_literal_7_0 = null;

        EObject lv_eAnnotations_10_0 = null;

        EObject lv_eAnnotations_12_0 = null;



        	enterRule();

        try {
            // InternalMosumo.g:4603:2: ( ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalMosumo.g:4604:2: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalMosumo.g:4604:2: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalMosumo.g:4605:3: () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalMosumo.g:4605:3: ()
            // InternalMosumo.g:4606:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEEnumLiteralAccess().getEEnumLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,98,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEEnumLiteralAccess().getEEnumLiteralKeyword_1());
            		
            // InternalMosumo.g:4616:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMosumo.g:4617:4: (lv_name_2_0= ruleEString )
            {
            // InternalMosumo.g:4617:4: (lv_name_2_0= ruleEString )
            // InternalMosumo.g:4618:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEEnumLiteralAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"at.jku.mosumo.lang.Mosumo.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_125); 

            			newLeafNode(otherlv_3, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMosumo.g:4639:3: (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==50) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalMosumo.g:4640:4: otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_33); 

                    				newLeafNode(otherlv_4, grammarAccess.getEEnumLiteralAccess().getValueKeyword_4_0());
                    			
                    // InternalMosumo.g:4644:4: ( (lv_value_5_0= ruleEInt ) )
                    // InternalMosumo.g:4645:5: (lv_value_5_0= ruleEInt )
                    {
                    // InternalMosumo.g:4645:5: (lv_value_5_0= ruleEInt )
                    // InternalMosumo.g:4646:6: lv_value_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEEnumLiteralAccess().getValueEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_126);
                    lv_value_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"at.jku.mosumo.lang.Mosumo.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:4664:3: (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==99) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalMosumo.g:4665:4: otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,99,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEEnumLiteralAccess().getLiteralKeyword_5_0());
                    			
                    // InternalMosumo.g:4669:4: ( (lv_literal_7_0= ruleEString ) )
                    // InternalMosumo.g:4670:5: (lv_literal_7_0= ruleEString )
                    {
                    // InternalMosumo.g:4670:5: (lv_literal_7_0= ruleEString )
                    // InternalMosumo.g:4671:6: lv_literal_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumLiteralAccess().getLiteralEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_127);
                    lv_literal_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    						}
                    						set(
                    							current,
                    							"literal",
                    							lv_literal_7_0,
                    							"at.jku.mosumo.lang.Mosumo.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:4689:3: (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==27) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalMosumo.g:4690:4: otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEEnumLiteralAccess().getEAnnotationsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalMosumo.g:4698:4: ( (lv_eAnnotations_10_0= ruleEAnnotation ) )
                    // InternalMosumo.g:4699:5: (lv_eAnnotations_10_0= ruleEAnnotation )
                    {
                    // InternalMosumo.g:4699:5: (lv_eAnnotations_10_0= ruleEAnnotation )
                    // InternalMosumo.g:4700:6: lv_eAnnotations_10_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEEnumLiteralAccess().getEAnnotationsEAnnotationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_eAnnotations_10_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_10_0,
                    							"at.jku.mosumo.lang.Mosumo.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:4717:4: (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )*
                    loop142:
                    do {
                        int alt142=2;
                        int LA142_0 = input.LA(1);

                        if ( (LA142_0==18) ) {
                            alt142=1;
                        }


                        switch (alt142) {
                    	case 1 :
                    	    // InternalMosumo.g:4718:5: otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,18,FOLLOW_21); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getEEnumLiteralAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMosumo.g:4722:5: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    // InternalMosumo.g:4723:6: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    {
                    	    // InternalMosumo.g:4723:6: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    // InternalMosumo.g:4724:7: lv_eAnnotations_12_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEEnumLiteralAccess().getEAnnotationsEAnnotationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_eAnnotations_12_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_12_0,
                    	    								"at.jku.mosumo.lang.Mosumo.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop142;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_13, grammarAccess.getEEnumLiteralAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getEEnumLiteralAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleEEnumLiteral"


    // $ANTLR start "entryRuleMOAgent"
    // InternalMosumo.g:4755:1: entryRuleMOAgent returns [EObject current=null] : iv_ruleMOAgent= ruleMOAgent EOF ;
    public final EObject entryRuleMOAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMOAgent = null;


        try {
            // InternalMosumo.g:4755:48: (iv_ruleMOAgent= ruleMOAgent EOF )
            // InternalMosumo.g:4756:2: iv_ruleMOAgent= ruleMOAgent EOF
            {
             newCompositeNode(grammarAccess.getMOAgentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMOAgent=ruleMOAgent();

            state._fsp--;

             current =iv_ruleMOAgent; 
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
    // $ANTLR end "entryRuleMOAgent"


    // $ANTLR start "ruleMOAgent"
    // InternalMosumo.g:4762:1: ruleMOAgent returns [EObject current=null] : ( () otherlv_1= 'MOAgent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )? (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )? (otherlv_8= 'eClass' ( ( ruleEString ) ) )? (otherlv_10= 'server' ( ( ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleMOElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleMOElement ) ) )* otherlv_17= '}' )? (otherlv_18= 'derivedproperties' otherlv_19= '{' ( (lv_derivedproperties_20_0= ruleDerivedProperty ) ) (otherlv_21= ',' ( (lv_derivedproperties_22_0= ruleDerivedProperty ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleMOAgent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_topic_5_0 = null;

        AntlrDatatypeRuleToken lv_sync_7_0 = null;

        EObject lv_elements_14_0 = null;

        EObject lv_elements_16_0 = null;

        EObject lv_derivedproperties_20_0 = null;

        EObject lv_derivedproperties_22_0 = null;



        	enterRule();

        try {
            // InternalMosumo.g:4768:2: ( ( () otherlv_1= 'MOAgent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )? (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )? (otherlv_8= 'eClass' ( ( ruleEString ) ) )? (otherlv_10= 'server' ( ( ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleMOElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleMOElement ) ) )* otherlv_17= '}' )? (otherlv_18= 'derivedproperties' otherlv_19= '{' ( (lv_derivedproperties_20_0= ruleDerivedProperty ) ) (otherlv_21= ',' ( (lv_derivedproperties_22_0= ruleDerivedProperty ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalMosumo.g:4769:2: ( () otherlv_1= 'MOAgent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )? (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )? (otherlv_8= 'eClass' ( ( ruleEString ) ) )? (otherlv_10= 'server' ( ( ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleMOElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleMOElement ) ) )* otherlv_17= '}' )? (otherlv_18= 'derivedproperties' otherlv_19= '{' ( (lv_derivedproperties_20_0= ruleDerivedProperty ) ) (otherlv_21= ',' ( (lv_derivedproperties_22_0= ruleDerivedProperty ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalMosumo.g:4769:2: ( () otherlv_1= 'MOAgent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )? (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )? (otherlv_8= 'eClass' ( ( ruleEString ) ) )? (otherlv_10= 'server' ( ( ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleMOElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleMOElement ) ) )* otherlv_17= '}' )? (otherlv_18= 'derivedproperties' otherlv_19= '{' ( (lv_derivedproperties_20_0= ruleDerivedProperty ) ) (otherlv_21= ',' ( (lv_derivedproperties_22_0= ruleDerivedProperty ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalMosumo.g:4770:3: () otherlv_1= 'MOAgent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )? (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )? (otherlv_8= 'eClass' ( ( ruleEString ) ) )? (otherlv_10= 'server' ( ( ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleMOElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleMOElement ) ) )* otherlv_17= '}' )? (otherlv_18= 'derivedproperties' otherlv_19= '{' ( (lv_derivedproperties_20_0= ruleDerivedProperty ) ) (otherlv_21= ',' ( (lv_derivedproperties_22_0= ruleDerivedProperty ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalMosumo.g:4770:3: ()
            // InternalMosumo.g:4771:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMOAgentAccess().getMOAgentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,100,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMOAgentAccess().getMOAgentKeyword_1());
            		
            // InternalMosumo.g:4781:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMosumo.g:4782:4: (lv_name_2_0= ruleEString )
            {
            // InternalMosumo.g:4782:4: (lv_name_2_0= ruleEString )
            // InternalMosumo.g:4783:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMOAgentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMOAgentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"at.jku.mosumo.lang.Mosumo.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_128); 

            			newLeafNode(otherlv_3, grammarAccess.getMOAgentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMosumo.g:4804:3: (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==101) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalMosumo.g:4805:4: otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,101,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMOAgentAccess().getTopicKeyword_4_0());
                    			
                    // InternalMosumo.g:4809:4: ( (lv_topic_5_0= ruleEString ) )
                    // InternalMosumo.g:4810:5: (lv_topic_5_0= ruleEString )
                    {
                    // InternalMosumo.g:4810:5: (lv_topic_5_0= ruleEString )
                    // InternalMosumo.g:4811:6: lv_topic_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMOAgentAccess().getTopicEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_129);
                    lv_topic_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMOAgentRule());
                    						}
                    						set(
                    							current,
                    							"topic",
                    							lv_topic_5_0,
                    							"at.jku.mosumo.lang.Mosumo.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:4829:3: (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==102) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalMosumo.g:4830:4: otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,102,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getMOAgentAccess().getSyncKeyword_5_0());
                    			
                    // InternalMosumo.g:4834:4: ( (lv_sync_7_0= ruleEBoolean ) )
                    // InternalMosumo.g:4835:5: (lv_sync_7_0= ruleEBoolean )
                    {
                    // InternalMosumo.g:4835:5: (lv_sync_7_0= ruleEBoolean )
                    // InternalMosumo.g:4836:6: lv_sync_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getMOAgentAccess().getSyncEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_130);
                    lv_sync_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMOAgentRule());
                    						}
                    						set(
                    							current,
                    							"sync",
                    							lv_sync_7_0,
                    							"at.jku.mosumo.lang.Mosumo.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:4854:3: (otherlv_8= 'eClass' ( ( ruleEString ) ) )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==31) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalMosumo.g:4855:4: otherlv_8= 'eClass' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getMOAgentAccess().getEClassKeyword_6_0());
                    			
                    // InternalMosumo.g:4859:4: ( ( ruleEString ) )
                    // InternalMosumo.g:4860:5: ( ruleEString )
                    {
                    // InternalMosumo.g:4860:5: ( ruleEString )
                    // InternalMosumo.g:4861:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMOAgentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMOAgentAccess().getEClassEClassCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_131);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:4876:3: (otherlv_10= 'server' ( ( ruleEString ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==103) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalMosumo.g:4877:4: otherlv_10= 'server' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,103,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getMOAgentAccess().getServerKeyword_7_0());
                    			
                    // InternalMosumo.g:4881:4: ( ( ruleEString ) )
                    // InternalMosumo.g:4882:5: ( ruleEString )
                    {
                    // InternalMosumo.g:4882:5: ( ruleEString )
                    // InternalMosumo.g:4883:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMOAgentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMOAgentAccess().getServerServerCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_132);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:4898:3: (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleMOElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleMOElement ) ) )* otherlv_17= '}' )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==104) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalMosumo.g:4899:4: otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleMOElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleMOElement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,104,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getMOAgentAccess().getElementsKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_133); 

                    				newLeafNode(otherlv_13, grammarAccess.getMOAgentAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalMosumo.g:4907:4: ( (lv_elements_14_0= ruleMOElement ) )
                    // InternalMosumo.g:4908:5: (lv_elements_14_0= ruleMOElement )
                    {
                    // InternalMosumo.g:4908:5: (lv_elements_14_0= ruleMOElement )
                    // InternalMosumo.g:4909:6: lv_elements_14_0= ruleMOElement
                    {

                    						newCompositeNode(grammarAccess.getMOAgentAccess().getElementsMOElementParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_elements_14_0=ruleMOElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMOAgentRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_14_0,
                    							"at.jku.mosumo.lang.Mosumo.MOElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:4926:4: (otherlv_15= ',' ( (lv_elements_16_0= ruleMOElement ) ) )*
                    loop148:
                    do {
                        int alt148=2;
                        int LA148_0 = input.LA(1);

                        if ( (LA148_0==18) ) {
                            alt148=1;
                        }


                        switch (alt148) {
                    	case 1 :
                    	    // InternalMosumo.g:4927:5: otherlv_15= ',' ( (lv_elements_16_0= ruleMOElement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,18,FOLLOW_133); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getMOAgentAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalMosumo.g:4931:5: ( (lv_elements_16_0= ruleMOElement ) )
                    	    // InternalMosumo.g:4932:6: (lv_elements_16_0= ruleMOElement )
                    	    {
                    	    // InternalMosumo.g:4932:6: (lv_elements_16_0= ruleMOElement )
                    	    // InternalMosumo.g:4933:7: lv_elements_16_0= ruleMOElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getMOAgentAccess().getElementsMOElementParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_elements_16_0=ruleMOElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMOAgentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_16_0,
                    	    								"at.jku.mosumo.lang.Mosumo.MOElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop148;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_134); 

                    				newLeafNode(otherlv_17, grammarAccess.getMOAgentAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalMosumo.g:4956:3: (otherlv_18= 'derivedproperties' otherlv_19= '{' ( (lv_derivedproperties_20_0= ruleDerivedProperty ) ) (otherlv_21= ',' ( (lv_derivedproperties_22_0= ruleDerivedProperty ) ) )* otherlv_23= '}' )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==105) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalMosumo.g:4957:4: otherlv_18= 'derivedproperties' otherlv_19= '{' ( (lv_derivedproperties_20_0= ruleDerivedProperty ) ) (otherlv_21= ',' ( (lv_derivedproperties_22_0= ruleDerivedProperty ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,105,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getMOAgentAccess().getDerivedpropertiesKeyword_9_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_135); 

                    				newLeafNode(otherlv_19, grammarAccess.getMOAgentAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalMosumo.g:4965:4: ( (lv_derivedproperties_20_0= ruleDerivedProperty ) )
                    // InternalMosumo.g:4966:5: (lv_derivedproperties_20_0= ruleDerivedProperty )
                    {
                    // InternalMosumo.g:4966:5: (lv_derivedproperties_20_0= ruleDerivedProperty )
                    // InternalMosumo.g:4967:6: lv_derivedproperties_20_0= ruleDerivedProperty
                    {

                    						newCompositeNode(grammarAccess.getMOAgentAccess().getDerivedpropertiesDerivedPropertyParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_derivedproperties_20_0=ruleDerivedProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMOAgentRule());
                    						}
                    						add(
                    							current,
                    							"derivedproperties",
                    							lv_derivedproperties_20_0,
                    							"at.jku.mosumo.lang.Mosumo.DerivedProperty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:4984:4: (otherlv_21= ',' ( (lv_derivedproperties_22_0= ruleDerivedProperty ) ) )*
                    loop150:
                    do {
                        int alt150=2;
                        int LA150_0 = input.LA(1);

                        if ( (LA150_0==18) ) {
                            alt150=1;
                        }


                        switch (alt150) {
                    	case 1 :
                    	    // InternalMosumo.g:4985:5: otherlv_21= ',' ( (lv_derivedproperties_22_0= ruleDerivedProperty ) )
                    	    {
                    	    otherlv_21=(Token)match(input,18,FOLLOW_135); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getMOAgentAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMosumo.g:4989:5: ( (lv_derivedproperties_22_0= ruleDerivedProperty ) )
                    	    // InternalMosumo.g:4990:6: (lv_derivedproperties_22_0= ruleDerivedProperty )
                    	    {
                    	    // InternalMosumo.g:4990:6: (lv_derivedproperties_22_0= ruleDerivedProperty )
                    	    // InternalMosumo.g:4991:7: lv_derivedproperties_22_0= ruleDerivedProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getMOAgentAccess().getDerivedpropertiesDerivedPropertyParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_derivedproperties_22_0=ruleDerivedProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMOAgentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"derivedproperties",
                    	    								lv_derivedproperties_22_0,
                    	    								"at.jku.mosumo.lang.Mosumo.DerivedProperty");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop150;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_23, grammarAccess.getMOAgentAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getMOAgentAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleMOAgent"


    // $ANTLR start "entryRuleDerivedProperty"
    // InternalMosumo.g:5022:1: entryRuleDerivedProperty returns [EObject current=null] : iv_ruleDerivedProperty= ruleDerivedProperty EOF ;
    public final EObject entryRuleDerivedProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedProperty = null;


        try {
            // InternalMosumo.g:5022:56: (iv_ruleDerivedProperty= ruleDerivedProperty EOF )
            // InternalMosumo.g:5023:2: iv_ruleDerivedProperty= ruleDerivedProperty EOF
            {
             newCompositeNode(grammarAccess.getDerivedPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDerivedProperty=ruleDerivedProperty();

            state._fsp--;

             current =iv_ruleDerivedProperty; 
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
    // $ANTLR end "entryRuleDerivedProperty"


    // $ANTLR start "ruleDerivedProperty"
    // InternalMosumo.g:5029:1: ruleDerivedProperty returns [EObject current=null] : ( () otherlv_1= 'DerivedProperty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )? (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )? (otherlv_8= 'eClass' ( ( ruleEString ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleDerivedProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_topic_5_0 = null;

        AntlrDatatypeRuleToken lv_sync_7_0 = null;



        	enterRule();

        try {
            // InternalMosumo.g:5035:2: ( ( () otherlv_1= 'DerivedProperty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )? (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )? (otherlv_8= 'eClass' ( ( ruleEString ) ) )? otherlv_10= '}' ) )
            // InternalMosumo.g:5036:2: ( () otherlv_1= 'DerivedProperty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )? (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )? (otherlv_8= 'eClass' ( ( ruleEString ) ) )? otherlv_10= '}' )
            {
            // InternalMosumo.g:5036:2: ( () otherlv_1= 'DerivedProperty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )? (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )? (otherlv_8= 'eClass' ( ( ruleEString ) ) )? otherlv_10= '}' )
            // InternalMosumo.g:5037:3: () otherlv_1= 'DerivedProperty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )? (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )? (otherlv_8= 'eClass' ( ( ruleEString ) ) )? otherlv_10= '}'
            {
            // InternalMosumo.g:5037:3: ()
            // InternalMosumo.g:5038:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDerivedPropertyAccess().getDerivedPropertyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,106,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDerivedPropertyAccess().getDerivedPropertyKeyword_1());
            		
            // InternalMosumo.g:5048:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMosumo.g:5049:4: (lv_name_2_0= ruleEString )
            {
            // InternalMosumo.g:5049:4: (lv_name_2_0= ruleEString )
            // InternalMosumo.g:5050:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDerivedPropertyAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDerivedPropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"at.jku.mosumo.lang.Mosumo.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_136); 

            			newLeafNode(otherlv_3, grammarAccess.getDerivedPropertyAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMosumo.g:5071:3: (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==101) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // InternalMosumo.g:5072:4: otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,101,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getDerivedPropertyAccess().getTopicKeyword_4_0());
                    			
                    // InternalMosumo.g:5076:4: ( (lv_topic_5_0= ruleEString ) )
                    // InternalMosumo.g:5077:5: (lv_topic_5_0= ruleEString )
                    {
                    // InternalMosumo.g:5077:5: (lv_topic_5_0= ruleEString )
                    // InternalMosumo.g:5078:6: lv_topic_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDerivedPropertyAccess().getTopicEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_137);
                    lv_topic_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDerivedPropertyRule());
                    						}
                    						set(
                    							current,
                    							"topic",
                    							lv_topic_5_0,
                    							"at.jku.mosumo.lang.Mosumo.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:5096:3: (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==102) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // InternalMosumo.g:5097:4: otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,102,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getDerivedPropertyAccess().getSyncKeyword_5_0());
                    			
                    // InternalMosumo.g:5101:4: ( (lv_sync_7_0= ruleEBoolean ) )
                    // InternalMosumo.g:5102:5: (lv_sync_7_0= ruleEBoolean )
                    {
                    // InternalMosumo.g:5102:5: (lv_sync_7_0= ruleEBoolean )
                    // InternalMosumo.g:5103:6: lv_sync_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getDerivedPropertyAccess().getSyncEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_138);
                    lv_sync_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDerivedPropertyRule());
                    						}
                    						set(
                    							current,
                    							"sync",
                    							lv_sync_7_0,
                    							"at.jku.mosumo.lang.Mosumo.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:5121:3: (otherlv_8= 'eClass' ( ( ruleEString ) ) )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==31) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // InternalMosumo.g:5122:4: otherlv_8= 'eClass' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getDerivedPropertyAccess().getEClassKeyword_6_0());
                    			
                    // InternalMosumo.g:5126:4: ( ( ruleEString ) )
                    // InternalMosumo.g:5127:5: ( ruleEString )
                    {
                    // InternalMosumo.g:5127:5: ( ruleEString )
                    // InternalMosumo.g:5128:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDerivedPropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDerivedPropertyAccess().getEClassEClassCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDerivedPropertyAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleDerivedProperty"


    // $ANTLR start "entryRuleMOProperty"
    // InternalMosumo.g:5151:1: entryRuleMOProperty returns [EObject current=null] : iv_ruleMOProperty= ruleMOProperty EOF ;
    public final EObject entryRuleMOProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMOProperty = null;


        try {
            // InternalMosumo.g:5151:51: (iv_ruleMOProperty= ruleMOProperty EOF )
            // InternalMosumo.g:5152:2: iv_ruleMOProperty= ruleMOProperty EOF
            {
             newCompositeNode(grammarAccess.getMOPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMOProperty=ruleMOProperty();

            state._fsp--;

             current =iv_ruleMOProperty; 
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
    // $ANTLR end "entryRuleMOProperty"


    // $ANTLR start "ruleMOProperty"
    // InternalMosumo.g:5158:1: ruleMOProperty returns [EObject current=null] : ( () otherlv_1= 'MOProperty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )? (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )? (otherlv_8= 'eClass' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleMOElement ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleMOElement ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleMOProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_topic_5_0 = null;

        AntlrDatatypeRuleToken lv_sync_7_0 = null;

        EObject lv_properties_12_0 = null;

        EObject lv_properties_14_0 = null;



        	enterRule();

        try {
            // InternalMosumo.g:5164:2: ( ( () otherlv_1= 'MOProperty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )? (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )? (otherlv_8= 'eClass' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleMOElement ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleMOElement ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalMosumo.g:5165:2: ( () otherlv_1= 'MOProperty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )? (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )? (otherlv_8= 'eClass' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleMOElement ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleMOElement ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalMosumo.g:5165:2: ( () otherlv_1= 'MOProperty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )? (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )? (otherlv_8= 'eClass' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleMOElement ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleMOElement ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalMosumo.g:5166:3: () otherlv_1= 'MOProperty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )? (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )? (otherlv_8= 'eClass' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleMOElement ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleMOElement ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalMosumo.g:5166:3: ()
            // InternalMosumo.g:5167:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMOPropertyAccess().getMOPropertyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,107,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMOPropertyAccess().getMOPropertyKeyword_1());
            		
            // InternalMosumo.g:5177:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMosumo.g:5178:4: (lv_name_2_0= ruleEString )
            {
            // InternalMosumo.g:5178:4: (lv_name_2_0= ruleEString )
            // InternalMosumo.g:5179:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMOPropertyAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMOPropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"at.jku.mosumo.lang.Mosumo.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_139); 

            			newLeafNode(otherlv_3, grammarAccess.getMOPropertyAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMosumo.g:5200:3: (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==101) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // InternalMosumo.g:5201:4: otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,101,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMOPropertyAccess().getTopicKeyword_4_0());
                    			
                    // InternalMosumo.g:5205:4: ( (lv_topic_5_0= ruleEString ) )
                    // InternalMosumo.g:5206:5: (lv_topic_5_0= ruleEString )
                    {
                    // InternalMosumo.g:5206:5: (lv_topic_5_0= ruleEString )
                    // InternalMosumo.g:5207:6: lv_topic_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMOPropertyAccess().getTopicEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_140);
                    lv_topic_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMOPropertyRule());
                    						}
                    						set(
                    							current,
                    							"topic",
                    							lv_topic_5_0,
                    							"at.jku.mosumo.lang.Mosumo.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:5225:3: (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==102) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // InternalMosumo.g:5226:4: otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,102,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getMOPropertyAccess().getSyncKeyword_5_0());
                    			
                    // InternalMosumo.g:5230:4: ( (lv_sync_7_0= ruleEBoolean ) )
                    // InternalMosumo.g:5231:5: (lv_sync_7_0= ruleEBoolean )
                    {
                    // InternalMosumo.g:5231:5: (lv_sync_7_0= ruleEBoolean )
                    // InternalMosumo.g:5232:6: lv_sync_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getMOPropertyAccess().getSyncEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_141);
                    lv_sync_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMOPropertyRule());
                    						}
                    						set(
                    							current,
                    							"sync",
                    							lv_sync_7_0,
                    							"at.jku.mosumo.lang.Mosumo.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:5250:3: (otherlv_8= 'eClass' ( ( ruleEString ) ) )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==31) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // InternalMosumo.g:5251:4: otherlv_8= 'eClass' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getMOPropertyAccess().getEClassKeyword_6_0());
                    			
                    // InternalMosumo.g:5255:4: ( ( ruleEString ) )
                    // InternalMosumo.g:5256:5: ( ruleEString )
                    {
                    // InternalMosumo.g:5256:5: ( ruleEString )
                    // InternalMosumo.g:5257:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMOPropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMOPropertyAccess().getEClassEClassCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_142);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:5272:3: (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleMOElement ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleMOElement ) ) )* otherlv_15= '}' )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==108) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // InternalMosumo.g:5273:4: otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleMOElement ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleMOElement ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,108,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getMOPropertyAccess().getPropertiesKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_133); 

                    				newLeafNode(otherlv_11, grammarAccess.getMOPropertyAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMosumo.g:5281:4: ( (lv_properties_12_0= ruleMOElement ) )
                    // InternalMosumo.g:5282:5: (lv_properties_12_0= ruleMOElement )
                    {
                    // InternalMosumo.g:5282:5: (lv_properties_12_0= ruleMOElement )
                    // InternalMosumo.g:5283:6: lv_properties_12_0= ruleMOElement
                    {

                    						newCompositeNode(grammarAccess.getMOPropertyAccess().getPropertiesMOElementParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_properties_12_0=ruleMOElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMOPropertyRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_12_0,
                    							"at.jku.mosumo.lang.Mosumo.MOElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:5300:4: (otherlv_13= ',' ( (lv_properties_14_0= ruleMOElement ) ) )*
                    loop158:
                    do {
                        int alt158=2;
                        int LA158_0 = input.LA(1);

                        if ( (LA158_0==18) ) {
                            alt158=1;
                        }


                        switch (alt158) {
                    	case 1 :
                    	    // InternalMosumo.g:5301:5: otherlv_13= ',' ( (lv_properties_14_0= ruleMOElement ) )
                    	    {
                    	    otherlv_13=(Token)match(input,18,FOLLOW_133); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getMOPropertyAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMosumo.g:5305:5: ( (lv_properties_14_0= ruleMOElement ) )
                    	    // InternalMosumo.g:5306:6: (lv_properties_14_0= ruleMOElement )
                    	    {
                    	    // InternalMosumo.g:5306:6: (lv_properties_14_0= ruleMOElement )
                    	    // InternalMosumo.g:5307:7: lv_properties_14_0= ruleMOElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getMOPropertyAccess().getPropertiesMOElementParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_properties_14_0=ruleMOElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMOPropertyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_14_0,
                    	    								"at.jku.mosumo.lang.Mosumo.MOElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop158;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getMOPropertyAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getMOPropertyAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleMOProperty"


    // $ANTLR start "entryRuleMOValue"
    // InternalMosumo.g:5338:1: entryRuleMOValue returns [EObject current=null] : iv_ruleMOValue= ruleMOValue EOF ;
    public final EObject entryRuleMOValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMOValue = null;


        try {
            // InternalMosumo.g:5338:48: (iv_ruleMOValue= ruleMOValue EOF )
            // InternalMosumo.g:5339:2: iv_ruleMOValue= ruleMOValue EOF
            {
             newCompositeNode(grammarAccess.getMOValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMOValue=ruleMOValue();

            state._fsp--;

             current =iv_ruleMOValue; 
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
    // $ANTLR end "entryRuleMOValue"


    // $ANTLR start "ruleMOValue"
    // InternalMosumo.g:5345:1: ruleMOValue returns [EObject current=null] : ( () otherlv_1= 'MOValue' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )? (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )? (otherlv_8= 'eAttribute' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleMOElement ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleMOElement ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleMOValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_topic_5_0 = null;

        AntlrDatatypeRuleToken lv_sync_7_0 = null;

        EObject lv_properties_12_0 = null;

        EObject lv_properties_14_0 = null;



        	enterRule();

        try {
            // InternalMosumo.g:5351:2: ( ( () otherlv_1= 'MOValue' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )? (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )? (otherlv_8= 'eAttribute' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleMOElement ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleMOElement ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalMosumo.g:5352:2: ( () otherlv_1= 'MOValue' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )? (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )? (otherlv_8= 'eAttribute' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleMOElement ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleMOElement ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalMosumo.g:5352:2: ( () otherlv_1= 'MOValue' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )? (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )? (otherlv_8= 'eAttribute' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleMOElement ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleMOElement ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalMosumo.g:5353:3: () otherlv_1= 'MOValue' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )? (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )? (otherlv_8= 'eAttribute' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleMOElement ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleMOElement ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalMosumo.g:5353:3: ()
            // InternalMosumo.g:5354:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMOValueAccess().getMOValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,109,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMOValueAccess().getMOValueKeyword_1());
            		
            // InternalMosumo.g:5364:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMosumo.g:5365:4: (lv_name_2_0= ruleEString )
            {
            // InternalMosumo.g:5365:4: (lv_name_2_0= ruleEString )
            // InternalMosumo.g:5366:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMOValueAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMOValueRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"at.jku.mosumo.lang.Mosumo.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_143); 

            			newLeafNode(otherlv_3, grammarAccess.getMOValueAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMosumo.g:5387:3: (otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) ) )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==101) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // InternalMosumo.g:5388:4: otherlv_4= 'topic' ( (lv_topic_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,101,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMOValueAccess().getTopicKeyword_4_0());
                    			
                    // InternalMosumo.g:5392:4: ( (lv_topic_5_0= ruleEString ) )
                    // InternalMosumo.g:5393:5: (lv_topic_5_0= ruleEString )
                    {
                    // InternalMosumo.g:5393:5: (lv_topic_5_0= ruleEString )
                    // InternalMosumo.g:5394:6: lv_topic_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMOValueAccess().getTopicEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_144);
                    lv_topic_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMOValueRule());
                    						}
                    						set(
                    							current,
                    							"topic",
                    							lv_topic_5_0,
                    							"at.jku.mosumo.lang.Mosumo.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:5412:3: (otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) ) )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==102) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // InternalMosumo.g:5413:4: otherlv_6= 'sync' ( (lv_sync_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,102,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getMOValueAccess().getSyncKeyword_5_0());
                    			
                    // InternalMosumo.g:5417:4: ( (lv_sync_7_0= ruleEBoolean ) )
                    // InternalMosumo.g:5418:5: (lv_sync_7_0= ruleEBoolean )
                    {
                    // InternalMosumo.g:5418:5: (lv_sync_7_0= ruleEBoolean )
                    // InternalMosumo.g:5419:6: lv_sync_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getMOValueAccess().getSyncEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_145);
                    lv_sync_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMOValueRule());
                    						}
                    						set(
                    							current,
                    							"sync",
                    							lv_sync_7_0,
                    							"at.jku.mosumo.lang.Mosumo.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:5437:3: (otherlv_8= 'eAttribute' ( ( ruleEString ) ) )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==110) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // InternalMosumo.g:5438:4: otherlv_8= 'eAttribute' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,110,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getMOValueAccess().getEAttributeKeyword_6_0());
                    			
                    // InternalMosumo.g:5442:4: ( ( ruleEString ) )
                    // InternalMosumo.g:5443:5: ( ruleEString )
                    {
                    // InternalMosumo.g:5443:5: ( ruleEString )
                    // InternalMosumo.g:5444:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMOValueRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMOValueAccess().getEAttributeEAttributeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_142);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMosumo.g:5459:3: (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleMOElement ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleMOElement ) ) )* otherlv_15= '}' )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==108) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // InternalMosumo.g:5460:4: otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleMOElement ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleMOElement ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,108,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getMOValueAccess().getPropertiesKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_133); 

                    				newLeafNode(otherlv_11, grammarAccess.getMOValueAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMosumo.g:5468:4: ( (lv_properties_12_0= ruleMOElement ) )
                    // InternalMosumo.g:5469:5: (lv_properties_12_0= ruleMOElement )
                    {
                    // InternalMosumo.g:5469:5: (lv_properties_12_0= ruleMOElement )
                    // InternalMosumo.g:5470:6: lv_properties_12_0= ruleMOElement
                    {

                    						newCompositeNode(grammarAccess.getMOValueAccess().getPropertiesMOElementParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_properties_12_0=ruleMOElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMOValueRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_12_0,
                    							"at.jku.mosumo.lang.Mosumo.MOElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMosumo.g:5487:4: (otherlv_13= ',' ( (lv_properties_14_0= ruleMOElement ) ) )*
                    loop163:
                    do {
                        int alt163=2;
                        int LA163_0 = input.LA(1);

                        if ( (LA163_0==18) ) {
                            alt163=1;
                        }


                        switch (alt163) {
                    	case 1 :
                    	    // InternalMosumo.g:5488:5: otherlv_13= ',' ( (lv_properties_14_0= ruleMOElement ) )
                    	    {
                    	    otherlv_13=(Token)match(input,18,FOLLOW_133); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getMOValueAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMosumo.g:5492:5: ( (lv_properties_14_0= ruleMOElement ) )
                    	    // InternalMosumo.g:5493:6: (lv_properties_14_0= ruleMOElement )
                    	    {
                    	    // InternalMosumo.g:5493:6: (lv_properties_14_0= ruleMOElement )
                    	    // InternalMosumo.g:5494:7: lv_properties_14_0= ruleMOElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getMOValueAccess().getPropertiesMOElementParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_properties_14_0=ruleMOElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMOValueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_14_0,
                    	    								"at.jku.mosumo.lang.Mosumo.MOElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop163;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getMOValueAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getMOValueAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleMOValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C80000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000003E080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000003C080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000038080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000030080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x01C0000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000180080000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000003C00080000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000003800080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000003000080000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000CC0008080000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000C80008080000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000040000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000C00008080000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000C00000080000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000080000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0006000000080000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000000080000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000008080000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0020000000080000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0xFE00000008080000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0xFC00000008080000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0xF800000008080000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0xF000000008080000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0xF000000000080000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0xE000000000080000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0xC000000000080000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000067E00000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x8000000000080000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x1600000008080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x1400000008080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x1000000008080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x1000000008080000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x1000000000080000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x1600000008080000L,0x000000000000000AL});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x1400000008080000L,0x000000000000000AL});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x1000000008080000L,0x000000000000000AL});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x1000000008080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x1000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000080000L,0x00000000000003E0L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000080000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000380L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000300L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000200L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x1000000008080000L,0x00000000000FF800L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x1000000008080000L,0x00000000000FF000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x1000000008080000L,0x00000000000FE000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x1000000008080000L,0x00000000000FC000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x1000000008080000L,0x00000000000F8000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x1000000008080000L,0x00000000000F0000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x1000000008080000L,0x00000000000E0000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x1000000000080000L,0x00000000000E0000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x1000000000080000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000080000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000080000L,0x0000000000080000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000008080000L,0x000000000002F800L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000008080000L,0x000000000002F000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000008080000L,0x000000000002E000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000008080000L,0x000000000002C000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000008080000L,0x0000000000028000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000008080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000007800000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000000007000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000008080000L,0x000000001802F800L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000008080000L,0x000000001802F000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000008080000L,0x000000001802E000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000008080000L,0x000000001802C000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000008080000L,0x0000000018028000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000008080000L,0x0000000010028000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x0000000061C00000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000000L,0x0000000061800000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x0000000061000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000008080000L,0x000000039802F800L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000008080000L,0x000000039802F000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000008080000L,0x000000039802E000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000008080000L,0x000000039802C000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000008080000L,0x0000000398028000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000008080000L,0x0000000390028000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000008080000L,0x0000000380028000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000008080000L,0x0000000300028000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000008080000L,0x0000000300020000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000008080000L,0x0000000200020000L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0004000008080000L,0x0000000800000000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000008080000L,0x0000000800000000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000080080000L,0x000003E000000000L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000080080000L,0x000003C000000000L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000080080000L,0x0000038000000000L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000080000L,0x0000038000000000L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000080000L,0x0000030000000000L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000000000000L,0x0000280000000000L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0000000000080000L,0x0000020000000000L});
    public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_136 = new BitSet(new long[]{0x0000000080080000L,0x0000006000000000L});
    public static final BitSet FOLLOW_137 = new BitSet(new long[]{0x0000000080080000L,0x0000004000000000L});
    public static final BitSet FOLLOW_138 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_139 = new BitSet(new long[]{0x0000000080080000L,0x0000106000000000L});
    public static final BitSet FOLLOW_140 = new BitSet(new long[]{0x0000000080080000L,0x0000104000000000L});
    public static final BitSet FOLLOW_141 = new BitSet(new long[]{0x0000000080080000L,0x0000100000000000L});
    public static final BitSet FOLLOW_142 = new BitSet(new long[]{0x0000000000080000L,0x0000100000000000L});
    public static final BitSet FOLLOW_143 = new BitSet(new long[]{0x0000000000080000L,0x0000506000000000L});
    public static final BitSet FOLLOW_144 = new BitSet(new long[]{0x0000000000080000L,0x0000504000000000L});
    public static final BitSet FOLLOW_145 = new BitSet(new long[]{0x0000000000080000L,0x0000500000000000L});

}