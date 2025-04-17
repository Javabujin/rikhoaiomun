/*
 * This source file was generated by the Gradle 'init' task
 */
package org.javabujin.rikhoaiomun;

import java.io.InputStream;
import java.util.Objects;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.javabujin.rikhoaiomun.antlr.generated.RikhoaiomunLexer;
import org.javabujin.rikhoaiomun.antlr.generated.RikhoaiomunParser;

public class App {
    public static void main(String[] args) {
        // Use a logger as to-screen output.
        Logger logger = Logger.getLogger(App.class.getName());

        // Run the lexer on the example input file.
        try {
            // Use the class loader to get the resource as a stream.
            InputStream inputStream = Objects.requireNonNull(
                    App.class.getResourceAsStream("exampleInputs/input1.txt"));

            // Test the input stream.
            CharStream input = CharStreams.fromStream(inputStream);

            // Create a lexer that feeds off of input CharStream
            RikhoaiomunLexer lexer = new RikhoaiomunLexer(input);

            // Create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create a parser that feeds off the tokens buffer
            RikhoaiomunParser parser = new RikhoaiomunParser(tokens);
    
            // Print debug information
            RikhoaiomunParser.SpecificationContext spec = parser.specification();
            logger.info("Specification: " + spec.toStringTree(parser));
            
        } catch (Exception e) {
            logger.info("An error occurred.");
            e.printStackTrace();
        }
    }
}
