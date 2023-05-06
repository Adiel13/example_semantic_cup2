package udv.compi;

import java.io.StringReader;

/**
 * Hello world!
 *
 */
public class app 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World Semantic 2!" );
        String entrada = "7,50,3,2,45,22,35,98,200";
        Scanner lex = new Scanner(new StringReader(entrada));
        Parser sintax = new Parser(lex);
        
        sintax.parse();
        
    }
}
