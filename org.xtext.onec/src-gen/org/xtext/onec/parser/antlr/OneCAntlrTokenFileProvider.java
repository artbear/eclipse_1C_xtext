/*
* generated by Xtext
*/
package org.xtext.onec.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class OneCAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/xtext/onec/parser/antlr/internal/InternalOneCParser.tokens");
	}
}
