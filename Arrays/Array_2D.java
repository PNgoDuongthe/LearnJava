package Arrays;

public class Array_2D {
    public static void main(String[] args) {
        String[][] numbers = new String[3][3];
        numbers[0][0] ="one";
        numbers[0][1]="two";
        numbers[0][2]="three";
        numbers[1][0]="four";
        numbers[1][1]="five";
        numbers[1][2]="six";
        numbers[2][0]="seven";
        numbers[2][1]="eight";
        numbers[2][2]="nine";
        for(int i =0;i<=numbers.length;i++)
        {
            System.out.println();
            for(int j =0;j<numbers[i].length;j++)
            {
                System.out.print(numbers[i][j]+" ");

            }
        }

    }
}
