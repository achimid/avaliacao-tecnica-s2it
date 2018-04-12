package br.com.lourran;

public class AppUtil {
    private static AppUtil ourInstance = new AppUtil();

    public static AppUtil getInstance() {
        return ourInstance;
    }

    private AppUtil() {
    }

    // Acho que com String a facilidade de manipulacao e maior
    public int interpolate(int a, int b){
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);

        int minLenght;
        String restante = null;
        if(strA.length() > strB.length()){
            minLenght = strB.length();
            restante = strA.substring(minLenght);
        }else{
            minLenght = strA.length();
            restante = strB.substring(minLenght);
        }

        StringBuilder sBuilder = new StringBuilder();
        for(int i = 0; i < minLenght; i++){
            sBuilder.append(strA.charAt(i));
            sBuilder.append(strB.charAt(i));
        }

        int c = Integer.parseInt(sBuilder.toString().concat(restante));
        if(c > 1000000) return -1;

        return c;
    }
}
