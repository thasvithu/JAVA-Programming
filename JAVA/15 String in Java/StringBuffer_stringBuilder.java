// StringBuffer stringBuilder in java 2023.06.02

public class StringBuffer_stringBuilder {
    public static void main(String args[]){
        StringBuffer buffer = new StringBuffer("Vithusan");
        System.out.println(buffer);

        buffer.append(" Niranjala");
        System.out.println(buffer);

        buffer.insert(0, "Hello ");
        System.out.println(buffer);

        buffer.replace(5,8,"@@@");
        System.out.println(buffer);

        buffer.delete(5,7);
        System.out.println(buffer);

        buffer.reverse();
        System.out.println(buffer);    
        
        System.out.println(buffer.length());    

        System.out.println(buffer.charAt(6));  

        System.out.println(buffer.substring(4, 7));   
        
        buffer.setCharAt(0, 'X');
        System.out.println(buffer);

        StringBuffer newBuffer = new StringBuffer();
        System.out.println(newBuffer.capacity()); // default 16
        newBuffer.append("Hello java");
        System.out.println(newBuffer.capacity()); // now 16
        newBuffer.append("Java is my favourite");
        System.out.println(newBuffer.capacity()); // now(16*2)+2=34 i.e (oldcapacity*2)+2

    }
}


/* 
StringBuffer and StringBuilder are two classes in Java that provide methods to manipulate strings, such as append, insert, delete, and replace. 
They are similar to String, but they are mutable, which means that their values can be changed without creating new objects.

The main difference between StringBuffer and StringBuilder is that StringBuffer is synchronized and StringBuilder is not. 
This means that StringBuffer is thread-safe and can be used in multithreaded environments, while StringBuilder is not thread-safe and should be used only in single-threaded contexts.

Another difference is that StringBuilder is faster than StringBuffer because it does not have the overhead of synchronization. 
However, the difference in performance is usually very small and may not be noticeable in most cases. 
StringBuilder is recommended to use when there is no need for thread safety.

Both StringBuffer and StringBuilder are compatible with the String class and provide methods to convert between them.

// create a StringBuffer from a String
StringBuffer sb = new StringBuffer("Hello");

// create a StringBuilder from a String
StringBuilder sbd = new StringBuilder("World");

// convert a StringBuffer to a String
String s1 = sb.toString();

// convert a StringBuilder to a String
String s2 = sbd.toString();
*/