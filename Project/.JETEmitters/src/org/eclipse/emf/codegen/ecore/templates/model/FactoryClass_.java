package org.eclipse.emf.codegen.ecore.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;

public class FactoryClass_
{
  protected static String nl;
  public static synchronized FactoryClass_ create(String lineSeparator)
  {
    nl = lineSeparator;
    FactoryClass_ result = new FactoryClass_();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**";
  protected final String TEXT_3 = NL + " * ";
  protected final String TEXT_4 = NL + " */";
  protected final String TEXT_5 = NL + "package ";
  protected final String TEXT_6 = ";";
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * The <b>Factory</b> for the model." + NL + " * It provides a create method for each non-abstract class of the model." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_9 = NL + " * @see ";
  protected final String TEXT_10 = NL + " * @generated" + NL + " */";
  protected final String TEXT_11 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model <b>Factory</b>." + NL + " * <!-- end-user-doc -->" + NL + " * @generated" + NL + " */";
  protected final String TEXT_12 = NL + "public class ";
  protected final String TEXT_13 = " extends ";
  protected final String TEXT_14 = " implements ";
  protected final String TEXT_15 = NL + "public interface ";
  protected final String TEXT_16 = NL + "{";
  protected final String TEXT_17 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_18 = " copyright = ";
  protected final String TEXT_19 = NL + "\t/**" + NL + "\t * The singleton instance of the factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_20 = " eINSTANCE = init();" + NL;
  protected final String TEXT_21 = " INSTANCE = ";
  protected final String TEXT_22 = ".eINSTANCE;" + NL;
  protected final String TEXT_23 = " eINSTANCE = ";
  protected final String TEXT_24 = ".init();" + NL;
  protected final String TEXT_25 = NL + "\t/**" + NL + "\t * Creates the default factory implementation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_26 = NL + "\tpublic static ";
  protected final String TEXT_27 = " init()" + NL + "\t{" + NL + "\t\ttry" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_28 = " the";
  protected final String TEXT_29 = " = (";
  protected final String TEXT_30 = ")";
  protected final String TEXT_31 = ".Registry.INSTANCE.getEFactory(";
  protected final String TEXT_32 = ".eNS_URI);" + NL + "\t\t\tif (the";
  protected final String TEXT_33 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\treturn the";
  protected final String TEXT_34 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tcatch (Exception exception)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_35 = ".INSTANCE.log(exception);" + NL + "\t\t}" + NL + "\t\treturn new ";
  protected final String TEXT_36 = "();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Creates an instance of the factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_37 = "()" + NL + "\t{" + NL + "\t\tsuper();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_38 = NL + "\t@Override";
  protected final String TEXT_39 = NL + "\tpublic EObject create(EClass eClass)" + NL + "\t{" + NL + "\t\tswitch (eClass.getClassifierID())" + NL + "\t\t{";
  protected final String TEXT_40 = NL + "\t\t\tcase ";
  protected final String TEXT_41 = ".";
  protected final String TEXT_42 = ": return ";
  protected final String TEXT_43 = "create";
  protected final String TEXT_44 = "();";
  protected final String TEXT_45 = NL + "\t\t\tdefault:" + NL + "\t\t\t\tthrow new IllegalArgumentException(\"The class '\" + eClass.getName() + \"' is not a valid classifier\");";
  protected final String TEXT_46 = NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_47 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_48 = NL + "\tpublic Object createFromString(";
  protected final String TEXT_49 = " eDataType, String initialValue)" + NL + "\t{" + NL + "\t\tswitch (eDataType.getClassifierID())" + NL + "\t\t{";
  protected final String TEXT_50 = ":" + NL + "\t\t\t\treturn create";
  protected final String TEXT_51 = "FromString(eDataType, initialValue);";
  protected final String TEXT_52 = NL + "\t\t\tdefault:" + NL + "\t\t\t\tthrow new IllegalArgumentException(\"The datatype '\" + eDataType.getName() + \"' is not a valid classifier\");";
  protected final String TEXT_53 = NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_54 = NL + "\tpublic String convertToString(";
  protected final String TEXT_55 = " eDataType, Object instanceValue)" + NL + "\t{" + NL + "\t\tswitch (eDataType.getClassifierID())" + NL + "\t\t{";
  protected final String TEXT_56 = ":" + NL + "\t\t\t\treturn convert";
  protected final String TEXT_57 = "ToString(eDataType, instanceValue);";
  protected final String TEXT_58 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_59 = " create";
  protected final String TEXT_60 = "()" + NL + "\t{" + NL + "\t\tthrow new UnsupportedOperationException(\"Cannot invoke element creation on a model type\");" + NL + "\t}" + NL;
  protected final String TEXT_61 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_62 = NL + "\tpublic ";
  protected final String TEXT_63 = "(";
  protected final String TEXT_64 = "final ";
  protected final String TEXT_65 = "String ";
  protected final String TEXT_66 = "it";
  protected final String TEXT_67 = "literal";
  protected final String TEXT_68 = ")" + NL + "\t{";
  protected final String TEXT_69 = NL + "\t\t";
  protected final String TEXT_70 = " result = ";
  protected final String TEXT_71 = ".get(literal);" + NL + "\t\tif (result == null) throw new IllegalArgumentException(\"The value '\" + literal + \"' is not a valid enumerator of '\" + ";
  protected final String TEXT_72 = ".getName() + \"'\");";
  protected final String TEXT_73 = NL + "\t\treturn result;";
  protected final String TEXT_74 = NL + "\t\treturn new ";
  protected final String TEXT_75 = "(create";
  protected final String TEXT_76 = "(literal));";
  protected final String TEXT_77 = NL + "\t\treturn create";
  protected final String TEXT_78 = "(literal);";
  protected final String TEXT_79 = ".create";
  protected final String TEXT_80 = NL + "\t\treturn ";
  protected final String TEXT_81 = ".createFromString(";
  protected final String TEXT_82 = ", literal);";
  protected final String TEXT_83 = NL + "\t\tif (literal == null) return null;" + NL + "\t\t";
  protected final String TEXT_84 = " result = new ";
  protected final String TEXT_85 = "<";
  protected final String TEXT_86 = ">";
  protected final String TEXT_87 = NL + "\t\tfor (";
  protected final String TEXT_88 = " stringTokenizer = new ";
  protected final String TEXT_89 = "(literal); stringTokenizer.hasMoreTokens(); )";
  protected final String TEXT_90 = NL + "\t\tfor (String item : split(literal))";
  protected final String TEXT_91 = NL + "\t\t{";
  protected final String TEXT_92 = NL + "\t\t\tString item = stringTokenizer.nextToken();";
  protected final String TEXT_93 = NL + "\t\t\tresult.add(create";
  protected final String TEXT_94 = "(item));";
  protected final String TEXT_95 = "FromString(";
  protected final String TEXT_96 = ", item));";
  protected final String TEXT_97 = NL + "\t\t\tresult.add(";
  protected final String TEXT_98 = NL + "\t\t}" + NL + "\t\treturn result;";
  protected final String TEXT_99 = NL + "\t\tif (literal == null) return ";
  protected final String TEXT_100 = ";" + NL + "\t\t";
  protected final String TEXT_101 = ";" + NL + "\t\tRuntimeException exception = null;";
  protected final String TEXT_102 = NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_103 = NL + "\t\t\tresult = create";
  protected final String TEXT_104 = NL + "\t\t\tresult = (";
  protected final String TEXT_105 = ")create";
  protected final String TEXT_106 = NL + "\t\t\tresult = ";
  protected final String TEXT_107 = NL + "\t\t\tif (";
  protected final String TEXT_108 = "result != null && ";
  protected final String TEXT_109 = ".INSTANCE.validate(";
  protected final String TEXT_110 = ", ";
  protected final String TEXT_111 = "new ";
  protected final String TEXT_112 = "(result)";
  protected final String TEXT_113 = "result";
  protected final String TEXT_114 = ", null, null))" + NL + "\t\t\t{" + NL + "\t\t\t\treturn result;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tcatch (RuntimeException e)" + NL + "\t\t{" + NL + "\t\t\texception = e;" + NL + "\t\t}";
  protected final String TEXT_115 = NL + "\t\tif (";
  protected final String TEXT_116 = "result != null || ";
  protected final String TEXT_117 = "exception == null) return result;" + NL + "    " + NL + "\t\tthrow exception;";
  protected final String TEXT_118 = NL + "\t\treturn (";
  protected final String TEXT_119 = ")super.createFromString(literal);";
  protected final String TEXT_120 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new ";
  protected final String TEXT_121 = NL + "\t\treturn ((";
  protected final String TEXT_122 = ")super.createFromString(";
  protected final String TEXT_123 = ", literal)).";
  protected final String TEXT_124 = "super.createFromString(";
  protected final String TEXT_125 = NL + "\t}" + NL;
  protected final String TEXT_126 = " eDataType, String initialValue)" + NL + "\t{";
  protected final String TEXT_127 = "(initialValue);";
  protected final String TEXT_128 = ".get(initialValue);" + NL + "\t\tif (result == null) throw new IllegalArgumentException(\"The value '\" + initialValue + \"' is not a valid enumerator of '\" + eDataType.getName() + \"'\");";
  protected final String TEXT_129 = ", initialValue);";
  protected final String TEXT_130 = NL + "\t\tif (initialValue == null) return null;" + NL + "\t\t";
  protected final String TEXT_131 = "(initialValue); stringTokenizer.hasMoreTokens(); )";
  protected final String TEXT_132 = NL + "\t\tfor (String item : split(initialValue))";
  protected final String TEXT_133 = "(initialValue));";
  protected final String TEXT_134 = " result = null;" + NL + "\t\tRuntimeException exception = null;";
  protected final String TEXT_135 = NL + "\t\t\tif (result != null && ";
  protected final String TEXT_136 = ".INSTANCE.validate(eDataType, result, null, null))" + NL + "\t\t\t{" + NL + "\t\t\t\treturn result;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tcatch (RuntimeException e)" + NL + "\t\t{" + NL + "\t\t\texception = e;" + NL + "\t\t}";
  protected final String TEXT_137 = NL + "\t\tif (result != null || exception == null) return result;" + NL + "    " + NL + "\t\tthrow exception;";
  protected final String TEXT_138 = "super.createFromString(initialValue);";
  protected final String TEXT_139 = "super.createFromString(eDataType, initialValue);";
  protected final String TEXT_140 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic String convert";
  protected final String TEXT_141 = " ";
  protected final String TEXT_142 = "instanceValue";
  protected final String TEXT_143 = NL + "\t\treturn instanceValue == null ? null : instanceValue.toString();";
  protected final String TEXT_144 = NL + "\t\treturn instanceValue == null ? null : convert";
  protected final String TEXT_145 = "(instanceValue";
  protected final String TEXT_146 = "()";
  protected final String TEXT_147 = ");";
  protected final String TEXT_148 = NL + "\t\treturn convert";
  protected final String TEXT_149 = "(instanceValue);";
  protected final String TEXT_150 = ".convert";
  protected final String TEXT_151 = ".convertToString(";
  protected final String TEXT_152 = ", instanceValue);";
  protected final String TEXT_153 = NL + "\t\tif (instanceValue == null) return null;" + NL + "\t\tif (instanceValue.isEmpty()) return \"\";" + NL + "\t\t";
  protected final String TEXT_154 = " i = instanceValue.iterator(); i.hasNext(); )";
  protected final String TEXT_155 = " item : instanceValue)";
  protected final String TEXT_156 = NL + "\t\t\tresult.append(convert";
  protected final String TEXT_157 = "((";
  protected final String TEXT_158 = "));";
  protected final String TEXT_159 = "ToString(";
  protected final String TEXT_160 = NL + "\t\t\tresult.append(";
  protected final String TEXT_161 = NL + "\t\t\tresult.append(' ');" + NL + "\t\t}" + NL + "\t\treturn result.substring(0, result.length() - 1);";
  protected final String TEXT_162 = NL + "\t\tif (instanceValue == null) return null;";
  protected final String TEXT_163 = ".isInstance(instanceValue))" + NL + "\t\t{" + NL + "\t\t\ttry" + NL + "\t\t\t{";
  protected final String TEXT_164 = NL + "\t\t\t\tString value = convert";
  protected final String TEXT_165 = "(((";
  protected final String TEXT_166 = ")instanceValue).";
  protected final String TEXT_167 = "());";
  protected final String TEXT_168 = ")instanceValue);";
  protected final String TEXT_169 = NL + "\t\t\t\tString value = ";
  protected final String TEXT_170 = NL + "\t\t\t\tif (value != null) return value;" + NL + "\t\t\t}" + NL + "\t\t\tcatch (Exception e)" + NL + "\t\t\t{" + NL + "\t\t\t\t// Keep trying other member types until all have failed." + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_171 = NL + "\t\t\tString value = convert";
  protected final String TEXT_172 = "(instanceValue)";
  protected final String TEXT_173 = NL + "\t\t\tString value = ";
  protected final String TEXT_174 = NL + "\t\t\tif (value != null) return value;" + NL + "\t\t}" + NL + "\t\tcatch (Exception e)" + NL + "\t\t{" + NL + "\t\t\t// Keep trying other member types until all have failed." + NL + "\t\t}";
  protected final String TEXT_175 = NL + "\t\tthrow new IllegalArgumentException(\"Invalid value: '\"+instanceValue+\"' for datatype :\"+";
  protected final String TEXT_176 = ".getName());";
  protected final String TEXT_177 = NL + "\t\treturn super.convertToString(instanceValue);";
  protected final String TEXT_178 = NL + "\t\treturn super.convertToString(";
  protected final String TEXT_179 = ", new ";
  protected final String TEXT_180 = "(instanceValue));";
  protected final String TEXT_181 = NL + "\tpublic String convert";
  protected final String TEXT_182 = " eDataType, Object instanceValue)" + NL + "\t{";
  protected final String TEXT_183 = NL + "\t\tif (instanceValue == null) return null;" + NL + "\t\t";
  protected final String TEXT_184 = " list = (";
  protected final String TEXT_185 = ")instanceValue;" + NL + "\t\tif (list.isEmpty()) return \"\";" + NL + "\t\t";
  protected final String TEXT_186 = " i = list.iterator(); i.hasNext(); )";
  protected final String TEXT_187 = " item : list)";
  protected final String TEXT_188 = ")instanceValue)";
  protected final String TEXT_189 = NL + "\t\tthrow new IllegalArgumentException(\"Invalid value: '\"+instanceValue+\"' for datatype :\"+eDataType.getName());";
  protected final String TEXT_190 = ")instanceValue";
  protected final String TEXT_191 = ").";
  protected final String TEXT_192 = NL + "\t\treturn super.convertToString(eDataType, instanceValue);";
  protected final String TEXT_193 = NL + "\t/**" + NL + "\t * Returns a new object of class '<em>";
  protected final String TEXT_194 = "</em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return a new object of class '<em>";
  protected final String TEXT_195 = "</em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_196 = "();" + NL;
  protected final String TEXT_197 = NL + "\t/**" + NL + "\t * Returns an instance of data type '<em>";
  protected final String TEXT_198 = "</em>' corresponding the given literal." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param literal a literal of the data type." + NL + "\t * @return a new instance value of the data type." + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_199 = "(String literal);" + NL + "" + NL + "\t/**" + NL + "\t * Returns a literal representation of an instance of data type '<em>";
  protected final String TEXT_200 = "</em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param instanceValue an instance value of the data type." + NL + "\t * @return a literal representation of the instance value." + NL + "\t * @generated" + NL + "\t */" + NL + "\tString convert";
  protected final String TEXT_201 = " instanceValue);" + NL;
  protected final String TEXT_202 = NL + "\t/**" + NL + "\t * Returns the package supported by this factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return the package supported by this factory." + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_203 = " get";
  protected final String TEXT_204 = "()" + NL + "\t{" + NL + "\t\treturn (";
  protected final String TEXT_205 = ")getEPackage();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @deprecated" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_206 = NL + "\t@Deprecated";
  protected final String TEXT_207 = " getPackage()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_208 = ".eINSTANCE;" + NL + "\t}" + NL;
  protected final String TEXT_209 = NL + "} //";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * Copyright (c) 2002-2010 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */

    GenPackage genPackage = (GenPackage)((Object[])argument)[0]; GenModel genModel=genPackage.getGenModel(); /* Trick to import java.util.* without warnings */Iterator.class.getName();
    boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]);
    String publicStaticFinalFlag = isImplementation ? "public static final " : "";
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    }}
    stringBuffer.append(TEXT_4);
    if (isInterface || genModel.isSuppressInterfaces()) {
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genPackage.getReflectionPackageName());
    stringBuffer.append(TEXT_6);
    } else {
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_7);
    if (isImplementation) {
    genModel.addPseudoImport("org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container");
    genModel.addPseudoImport("org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container.Dynamic");
    genModel.addImport("org.eclipse.emf.ecore.EClass");
    genModel.addImport("org.eclipse.emf.ecore.EObject");
    if (!genPackage.hasJavaLangConflict() && !genPackage.hasInterfaceImplConflict() && !genPackage.getClassPackageName().equals(genPackage.getInterfacePackageName())) genModel.addImport(genPackage.getInterfacePackageName() + ".*");
    }
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_7);
    if (isInterface) {
    stringBuffer.append(TEXT_8);
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    }
    stringBuffer.append(TEXT_10);
    } else {
    stringBuffer.append(TEXT_11);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genPackage.getFactoryClassName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.EFactoryImpl"));
    if (!genModel.isSuppressInterfaces()) {
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genPackage.getImportedFactoryInterfaceName());
    }
    } else {
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genPackage.getFactoryInterfaceName());
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EFactory"));
    }
    }
    stringBuffer.append(TEXT_16);
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_17);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_7);
    }
    if (isImplementation && (genModel.isSuppressEMFMetaData() || genModel.isSuppressInterfaces())) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genPackage.getFactoryClassName());
    stringBuffer.append(TEXT_20);
    }
    if (isInterface && genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genPackage.getFactoryInterfaceName());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genPackage.getQualifiedFactoryClassName());
    stringBuffer.append(TEXT_22);
    } else if (isInterface && !genModel.isSuppressInterfaces()) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genPackage.getFactoryInterfaceName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genPackage.getQualifiedFactoryClassName());
    stringBuffer.append(TEXT_24);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_25);
    String factoryType = genModel.isSuppressEMFMetaData() ? genPackage.getFactoryClassName() : genPackage.getImportedFactoryInterfaceName();
    stringBuffer.append(TEXT_26);
    stringBuffer.append(factoryType);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(factoryType);
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genPackage.getFactoryName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(factoryType);
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EPackage"));
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genPackage.getPackageInterfaceName());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genPackage.getFactoryName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genPackage.getFactoryName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(genPackage.getImportedFactoryClassName());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genPackage.getFactoryClassName());
    stringBuffer.append(TEXT_37);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_38);
    }
    stringBuffer.append(TEXT_39);
    for (GenClass genClass : genPackage.getGenClasses()) {
    if (!genClass.isAbstract()) {
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genClass.getClassifierID());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(!genClass.isEObjectExtension() ? "(EObject)" : "" );
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_44);
    }
    }
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_46);
    if (!genPackage.getAllGenDataTypes().isEmpty()) {
    stringBuffer.append(TEXT_47);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_38);
    }
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EDataType"));
    stringBuffer.append(TEXT_49);
    for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
    if (genDataType.isSerializable()) {
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genDataType.getClassifierID());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_51);
    }
    }
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_53);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_38);
    }
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EDataType"));
    stringBuffer.append(TEXT_55);
    for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
    if (genDataType.isSerializable()) {
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genDataType.getClassifierID());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_57);
    }
    }
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_46);
    }
    for (GenClass genClass : genPackage.getGenClasses()) {
    if (!genClass.isAbstract()) {
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genClass.getTypeParameters());
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(genClass.getInterfaceTypeArguments());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_60);
    }
    }
    for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
    if (genDataType.isSerializable()) {
    if (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody()) { String eDataType = genDataType.getQualifiedClassifierAccessor();
    stringBuffer.append(TEXT_47);
    if (genModel.useGenerics() && genDataType.isUncheckedCast() && !genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genDataType.getImportedParameterizedInstanceClassName());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_63);
    if (genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_64);
    }
    stringBuffer.append(TEXT_65);
    if (genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_66);
    } else {
    stringBuffer.append(TEXT_67);
    }
    stringBuffer.append(TEXT_68);
    if (genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genDataType.getCreatorBody(genModel.getIndentation(stringBuffer)));
    } else if (genDataType instanceof GenEnum) {
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genDataType.getImportedInstanceClassName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genDataType.getImportedInstanceClassName());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(genModel.getNonNLS(3));
    stringBuffer.append(TEXT_73);
    } else if (genDataType.getBaseType() != null) { GenDataType genBaseType = genDataType.getBaseType(); boolean isPrimitiveConversion = !genDataType.isPrimitiveType() && genBaseType.isPrimitiveType();
    if (genBaseType.getGenPackage() == genPackage) {
    if (isPrimitiveConversion && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_76);
    } else {
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_78);
    }
    } else if (genBaseType.getGenPackage().isDataTypeConverters()) {
    if (isPrimitiveConversion && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_76);
    } else {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_78);
    }
    } else {
    stringBuffer.append(TEXT_80);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_30);
    }
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_82);
    }
    } else if (genDataType.getItemType() != null) { GenDataType genItemType = genDataType.getItemType(); 
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genDataType.getImportedParameterizedInstanceClassName());
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genModel.getImportedName("java.util.ArrayList"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_85);
    stringBuffer.append(genItemType.getObjectType().getImportedParameterizedInstanceClassName());
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_44);
    if (genModel.getRuntimeVersion().getValue() < GenRuntimeVersion.EMF26_VALUE) {
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genModel.getImportedName("java.util.StringTokenizer"));
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genModel.getImportedName("java.util.StringTokenizer"));
    stringBuffer.append(TEXT_89);
    } else {
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(TEXT_91);
    if (genModel.getRuntimeVersion().getValue() < GenRuntimeVersion.EMF26_VALUE) {
    stringBuffer.append(TEXT_92);
    }
    if (genItemType.getGenPackage() == genPackage) {
    if (genPackage.isDataTypeConverters()) { genItemType = genItemType.getObjectType();
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_94);
    } else {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_96);
    }
    } else {
    if (genItemType.getGenPackage().isDataTypeConverters()) { genItemType = genItemType.getObjectType();
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_94);
    } else {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_96);
    }
    }
    stringBuffer.append(TEXT_98);
    } else if (!genDataType.getMemberTypes().isEmpty()) {
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genDataType.getStaticValue(null));
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genDataType.getImportedInstanceClassName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genDataType.getStaticValue(null));
    stringBuffer.append(TEXT_101);
    for (GenDataType genMemberType : genDataType.getMemberTypes()) {
    stringBuffer.append(TEXT_102);
    if (genMemberType.getGenPackage() == genPackage) {
    if (genPackage.isDataTypeConverters()) { if (!genDataType.isPrimitiveType()) genMemberType = genMemberType.getObjectType();
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_78);
    } else {
    stringBuffer.append(TEXT_104);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_82);
    }
    } else {
    if (genPackage.isDataTypeConverters()) { if (!genDataType.isPrimitiveType()) genMemberType = genMemberType.getObjectType();
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_78);
    } else {
    stringBuffer.append(TEXT_104);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_82);
    }
    }
    stringBuffer.append(TEXT_107);
    if (!genDataType.isPrimitiveType()) {
    stringBuffer.append(TEXT_108);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.Diagnostician"));
    stringBuffer.append(TEXT_109);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_110);
    if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_111);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_112);
    } else {
    stringBuffer.append(TEXT_113);
    }
    stringBuffer.append(TEXT_114);
    }
    stringBuffer.append(TEXT_115);
    if (!genDataType.isPrimitiveType()) {
    stringBuffer.append(TEXT_116);
    }
    stringBuffer.append(TEXT_117);
    } else if (!genDataType.hasConversionDelegate() && genModel.useGenerics() && (genDataType.isArrayType() || !genDataType.getEcoreDataType().getETypeParameters().isEmpty() || genDataType.getEcoreDataType().getInstanceTypeName().contains("<"))) {
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_119);
    } else if (!genDataType.hasConversionDelegate() && genDataType.isArrayType()) {
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genModel.getImportedName("java.lang.UnsupportedOperationException"));
    stringBuffer.append(TEXT_44);
    } else if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_122);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genDataType.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_44);
    } else {
    stringBuffer.append(TEXT_80);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_30);
    }
    stringBuffer.append(TEXT_124);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_82);
    }
    stringBuffer.append(TEXT_125);
    }
    stringBuffer.append(TEXT_47);
    if (!genPackage.isDataTypeConverters() && genModel.useGenerics() && genDataType.isUncheckedCast() && !genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EDataType"));
    stringBuffer.append(TEXT_126);
    if (genDataType instanceof GenEnum) {
    if (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_127);
    } else {
    stringBuffer.append(TEXT_69);
    stringBuffer.append(((GenEnum)genDataType).getImportedInstanceClassName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(((GenEnum)genDataType).getImportedInstanceClassName());
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(genModel.getNonNLS(3));
    stringBuffer.append(TEXT_73);
    }
    } else if (genDataType.getBaseType() != null) { GenDataType genBaseType = genDataType.getBaseType(); 
    if (genBaseType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_80);
    if (!genDataType.getObjectInstanceClassName().equals(genBaseType.getObjectInstanceClassName())) {
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_30);
    }
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_129);
    } else {
    stringBuffer.append(TEXT_80);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_30);
    }
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_129);
    }
    } else if (genDataType.getItemType() != null) { GenDataType genItemType = genDataType.getItemType(); 
    if (genPackage.isDataTypeConverters()) {
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_127);
    } else {
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genModel.getImportedName("java.util.ArrayList"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_85);
    stringBuffer.append(genItemType.getObjectType().getImportedParameterizedInstanceClassName());
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_44);
    if (genModel.getRuntimeVersion().getValue() < GenRuntimeVersion.EMF26_VALUE) {
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genModel.getImportedName("java.util.StringTokenizer"));
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genModel.getImportedName("java.util.StringTokenizer"));
    stringBuffer.append(TEXT_131);
    } else {
    stringBuffer.append(TEXT_132);
    }
    stringBuffer.append(TEXT_91);
    if (genModel.getRuntimeVersion().getValue() < GenRuntimeVersion.EMF26_VALUE) {
    stringBuffer.append(TEXT_92);
    }
    if (genItemType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_96);
    } else {
    stringBuffer.append(TEXT_97);
    if (!genItemType.isObjectType()) {
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genItemType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_30);
    }
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_96);
    }
    stringBuffer.append(TEXT_98);
    }
    } else if (!genDataType.getMemberTypes().isEmpty()) {
    if (genPackage.isDataTypeConverters()) {
    if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_133);
    } else {
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_127);
    }
    } else {
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_134);
    for (GenDataType genMemberType : genDataType.getMemberTypes()) {
    stringBuffer.append(TEXT_102);
    if (genMemberType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_106);
    if (!genDataType.isObjectType() && !genDataType.getObjectInstanceClassName().equals(genMemberType.getObjectInstanceClassName())) {
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_30);
    }
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_129);
    } else {
    stringBuffer.append(TEXT_106);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_30);
    }
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_129);
    }
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.Diagnostician"));
    stringBuffer.append(TEXT_136);
    }
    stringBuffer.append(TEXT_137);
    }
    } else if (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_127);
    } else if (!genDataType.hasConversionDelegate() && genModel.useGenerics() && (genDataType.isArrayType() || !genDataType.getEcoreDataType().getETypeParameters().isEmpty() || genDataType.getEcoreDataType().getInstanceTypeName().contains("<"))) {
    stringBuffer.append(TEXT_80);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_30);
    }
    stringBuffer.append(TEXT_138);
    } else if (!genDataType.hasConversionDelegate() && genDataType.isArrayType()) {
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genModel.getImportedName("java.lang.UnsupportedOperationException"));
    stringBuffer.append(TEXT_44);
    } else {
    stringBuffer.append(TEXT_80);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_30);
    }
    stringBuffer.append(TEXT_139);
    }
    stringBuffer.append(TEXT_125);
    if (genPackage.isDataTypeConverters() || genDataType.hasConverterBody()) { String eDataType = genDataType.getQualifiedClassifierAccessor();
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_63);
    if (genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_64);
    }
    stringBuffer.append(genDataType.getImportedBoundedWildcardInstanceClassName());
    stringBuffer.append(TEXT_141);
    if (genDataType.hasConverterBody()) {
    stringBuffer.append(TEXT_66);
    } else {
    stringBuffer.append(TEXT_142);
    }
    stringBuffer.append(TEXT_68);
    if (genDataType.hasConverterBody()) {
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genDataType.getConverterBody(genModel.getIndentation(stringBuffer)));
    } else if (genDataType instanceof GenEnum) {
    stringBuffer.append(TEXT_143);
    } else if (genDataType.getBaseType() != null) { GenDataType genBaseType = genDataType.getBaseType(); boolean isPrimitiveConversion = !genDataType.isPrimitiveType() && genBaseType.isPrimitiveType();
    if (genBaseType.getGenPackage() == genPackage) {
    if (isPrimitiveConversion) {
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_145);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genBaseType.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_146);
    }
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_149);
    }
    } else if (genBaseType.getGenPackage().isDataTypeConverters()) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedFactoryInstanceAccessor());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_149);
    } else {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_152);
    }
    } else if (genDataType.getItemType() != null) { GenDataType genItemType = genDataType.getItemType(); 
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genModel.getImportedName("java.lang.StringBuffer"));
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genModel.getImportedName("java.lang.StringBuffer"));
    stringBuffer.append(TEXT_44);
    String item; if (!genModel.useGenerics()) { item = "i.next()"; 
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_154);
    } else { item = "item";
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genModel.getImportedName("java.lang.Object"));
    stringBuffer.append(TEXT_155);
    }
    stringBuffer.append(TEXT_91);
    if (genItemType.getGenPackage() == genPackage) {
    if (genPackage.isDataTypeConverters()) { genItemType = genItemType.getObjectType();
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genItemType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_158);
    } else {
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_158);
    }
    } else {
    if (genItemType.getGenPackage().isDataTypeConverters()) { genItemType = genItemType.getObjectType();
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genItemType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_158);
    } else {
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_158);
    }
    }
    stringBuffer.append(TEXT_161);
    } else if (!genDataType.getMemberTypes().isEmpty()) {
    if (!genDataType.isPrimitiveType()) {
    stringBuffer.append(TEXT_162);
    for (GenDataType genMemberType : genDataType.getMemberTypes()) {
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_163);
    if (genMemberType.getGenPackage() == genPackage) {
    if (genPackage.isDataTypeConverters()) {
    if (genMemberType.getQualifiedInstanceClassName().equals(genDataType.getQualifiedInstanceClassName())) {
    stringBuffer.append(TEXT_164);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_149);
    } else if (genMemberType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_164);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genMemberType.getObjectType().getImportedInstanceClassName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genMemberType.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_167);
    } else {
    stringBuffer.append(TEXT_164);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genMemberType.getObjectType().getImportedBoundedWildcardInstanceClassName());
    stringBuffer.append(TEXT_168);
    }
    } else {
    stringBuffer.append(TEXT_164);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_152);
    }
    } else {
    if (genMemberType.getGenPackage().isDataTypeConverters()) { genMemberType = genMemberType.getObjectType();
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genMemberType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_168);
    } else {
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_152);
    }
    }
    stringBuffer.append(TEXT_170);
    }
    } else {
    for (GenDataType genMemberType : genDataType.getMemberTypes()) {
    stringBuffer.append(TEXT_102);
    if (genMemberType.getGenPackage() == genPackage) {
    if (genPackage.isDataTypeConverters()) {
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_149);
    } else {
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_110);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_111);
    stringBuffer.append(genMemberType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_172);
    } else {
    stringBuffer.append(TEXT_142);
    }
    stringBuffer.append(TEXT_147);
    }
    } else {
    if (genMemberType.getGenPackage().isDataTypeConverters()) {
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_149);
    } else {
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_110);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_111);
    stringBuffer.append(genMemberType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_172);
    } else {
    stringBuffer.append(TEXT_142);
    }
    stringBuffer.append(TEXT_147);
    }
    }
    stringBuffer.append(TEXT_174);
    }
    }
    stringBuffer.append(TEXT_175);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_176);
    } else if (!genDataType.hasConversionDelegate() && genModel.useGenerics() && (genDataType.isArrayType() || !genDataType.getEcoreDataType().getETypeParameters().isEmpty() || genDataType.getEcoreDataType().getInstanceTypeName().contains("<"))) {
    stringBuffer.append(TEXT_177);
    } else if (!genDataType.hasConversionDelegate() && genDataType.isArrayType()) {
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genModel.getImportedName("java.lang.UnsupportedOperationException"));
    stringBuffer.append(TEXT_44);
    } else if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_178);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_180);
    } else {
    stringBuffer.append(TEXT_178);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_152);
    }
    stringBuffer.append(TEXT_125);
    }
    stringBuffer.append(TEXT_47);
    if (genModel.useGenerics() && (genDataType.getItemType() != null || genDataType.isUncheckedCast()) && (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody())) {
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EDataType"));
    stringBuffer.append(TEXT_182);
    if (genDataType instanceof GenEnum) {
    if (genPackage.isDataTypeConverters() || genDataType.hasConverterBody()) {
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genDataType.getImportedInstanceClassName());
    stringBuffer.append(TEXT_168);
    } else {
    stringBuffer.append(TEXT_143);
    }
    } else if (genDataType.getBaseType() != null) { GenDataType genBaseType = genDataType.getBaseType(); 
    if (genBaseType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_152);
    } else {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_152);
    }
    } else if (genDataType.getItemType() != null) { GenDataType genItemType = genDataType.getItemType(); 
    if (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genDataType.getImportedBoundedWildcardInstanceClassName());
    stringBuffer.append(TEXT_168);
    } else { final String singleWildcard = genModel.useGenerics() ? "<?>" : "";
    stringBuffer.append(TEXT_183);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_185);
    stringBuffer.append(genModel.getImportedName("java.lang.StringBuffer"));
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genModel.getImportedName("java.lang.StringBuffer"));
    stringBuffer.append(TEXT_44);
    String item; if (!genModel.useGenerics()) { item = "i.next()"; 
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_186);
    } else { item = "item";
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genModel.getImportedName("java.lang.Object"));
    stringBuffer.append(TEXT_187);
    }
    stringBuffer.append(TEXT_91);
    if (genItemType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_158);
    } else {
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_158);
    }
    stringBuffer.append(TEXT_161);
    }
    } else if (!genDataType.getMemberTypes().isEmpty()) {
    if (genPackage.isDataTypeConverters() || genDataType.hasConverterBody()) {
    if (genDataType.isPrimitiveType()) {
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_188);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genDataType.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_146);
    }
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_149);
    }
    } else {
    stringBuffer.append(TEXT_162);
    for (GenDataType genMemberType : genDataType.getMemberTypes()) {
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_163);
    if (genMemberType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_164);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_152);
    } else {
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_152);
    }
    stringBuffer.append(TEXT_170);
    }
    stringBuffer.append(TEXT_189);
    }
    } else if (genPackage.isDataTypeConverters() || genDataType.hasConverterBody()) {
    if (genDataType.isPrimitiveType()) {
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_63);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_63);
    }
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_190);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_191);
    stringBuffer.append(genDataType.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_146);
    }
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genDataType.getImportedBoundedWildcardInstanceClassName());
    stringBuffer.append(TEXT_168);
    }
    } else if (!genDataType.hasConversionDelegate() && genModel.useGenerics() && (genDataType.isArrayType() || !genDataType.getEcoreDataType().getETypeParameters().isEmpty() || genDataType.getEcoreDataType().getInstanceTypeName().contains("<"))) {
    stringBuffer.append(TEXT_177);
    } else if (!genDataType.hasConversionDelegate() && genDataType.isArrayType()) {
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genModel.getImportedName("java.lang.UnsupportedOperationException"));
    stringBuffer.append(TEXT_44);
    } else {
    stringBuffer.append(TEXT_192);
    }
    stringBuffer.append(TEXT_125);
    }
    }
    } else {
    for (GenClass genClass : genPackage.getGenClasses()) {
    if (genClass.hasFactoryInterfaceCreateMethod()) {
    stringBuffer.append(TEXT_193);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_194);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_195);
    stringBuffer.append(genClass.getTypeParameters());
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(genClass.getInterfaceTypeArguments());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_196);
    }
    }
    if (genPackage.isDataTypeConverters()) {
    for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
    if (genDataType.isSerializable()) {
    stringBuffer.append(TEXT_197);
    stringBuffer.append(genDataType.getFormattedName());
    stringBuffer.append(TEXT_198);
    stringBuffer.append(genDataType.getImportedParameterizedInstanceClassName());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genDataType.getFormattedName());
    stringBuffer.append(TEXT_200);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genDataType.getImportedBoundedWildcardInstanceClassName());
    stringBuffer.append(TEXT_201);
    }
    }
    }
    }
    if (!isImplementation && !genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_202);
    stringBuffer.append(genPackage.getPackageInterfaceName());
    stringBuffer.append(TEXT_203);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_196);
    } else if (isImplementation) {
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_203);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_204);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_205);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_206);
    }
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_207);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_208);
    }
    stringBuffer.append(TEXT_209);
    stringBuffer.append(isInterface ? genPackage.getFactoryInterfaceName() : genPackage.getFactoryClassName());
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_7);
    return stringBuffer.toString();
  }
}
