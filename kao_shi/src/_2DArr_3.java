public class _2DArr_3 {
    public static void main(String[] args) {
        boolean[][] blArr = {{true,false,true},{false, true, false}};
        char[][] chrArr = new char[blArr.length][blArr[0].length];
        for (int i = 0; i < blArr.length; i++) {
            for (int j = 0; j < blArr[0].length; j++) {
                if(blArr[i][j]) chrArr[i][j] = 't';
                else chrArr[i][j] = 'f';
                System.out.print(chrArr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
