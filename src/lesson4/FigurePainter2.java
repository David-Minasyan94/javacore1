package lesson4;

public class FigurePainter2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > 0; j--) {
                System.out.print(i < j ?" ":"*" );
            }

            System.out.println( );


        }
    }
}

