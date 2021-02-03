package others;

public class StringBuffer_StringBuilder {
	//StringBuffer is synchronized i.e. thread safe. StringBuffer is less efficient.It means two threads
	//can't call the methods of StringBuffer simultaneously.Time taken by StringBuffer: 3ms
	//StringBuilder is non-synchronized i.e. not thread safe. StringBuilder is more efficient.
	//Time taken by StringBuilder: 1ms
    public static void main(String[] args){  
        long startTime = System.currentTimeMillis();  
        StringBuffer sb = new StringBuffer("Java");
        for (int i=0; i<10000; i++){  
            sb.append("Tpoint");  
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
        startTime = System.currentTimeMillis();  
        StringBuilder sb2 = new StringBuilder("Java");  
        for (int i=0; i<10000; i++){  
            sb2.append("Tpoint");  
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
    }  
}
