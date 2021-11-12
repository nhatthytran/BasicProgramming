package school;

public class GiaiMa_kiemtra {
    public static String giaima(String inputString,int cols){
        int numrows=inputString.length()/cols;
        String result="";
        char[][] arr2D=new char[numrows][cols];
        for(int i=0;i< arr2D.length*arr2D[0].length;i++){
            int row=i/arr2D.length;
            int col=i% arr2D.length;
            arr2D[col][row]=inputString.charAt(i);
        }
        for(int i=0;i<arr2D.length*arr2D[0].length;i++){
            int row=i/arr2D[0].length;
            int col=i%arr2D[0].length;
            result+=arr2D[row][col];

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(giaima("Isn-ttau-md--e-",5));
    }
}
