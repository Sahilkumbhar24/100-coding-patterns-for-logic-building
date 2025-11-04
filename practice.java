
public class Practice { //Happy Diwali Everyone
    public static void main(String[] args) {
        /*Pattern 1
          *****
          *****
          *****
          *****
          *****
         
        int n = 5;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        /*Pattern 2
         * 11111
         * 22222
         * 33333
         * 44444
         * 55555
         
        int n = 5;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        */
        /*Pattern 3
         * 12345
         * 12345
         * 12345
         * 12345
         * 12345
         
        int n = 5;
        for(int i =1 ;i<=n;i++){
            for(int j =1 ;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/
        /*Pattern 4
         * ABCDE
         * ABCDE
         * ABCDE
         * ABCDE
         * ABCDE
         
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j =1 ;j<=n;j++){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
            */
        /*Pattern 5
          *
          **
          ***
          ****
          *****
         
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*Pattern 6
         *****
         ****
         ***
         **
         *
         
        int n = 5;
        for(int i =1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        /* Pattern 7
        5
        44
        333
        2222
        11111
        
        int n = 5;
        for(int i =n;i>=1;i--){
            for(int j =i;j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        } */
       /*Pattern 8
        1
        12
        123
        1234
        12345

        
        int n = 5;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/
        /*Pattern 9
         1
         21
         321
         4321
         54321
         
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j =i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }*/
        /* Pattern No. 10
        5
        54
        543
        5432
        54321
         
        int n = 5;
        for(int i = n;i>=1;i--){
            for(int j = 5;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
            */
        /*Pattern No.11
         5
         45
         345
         2345
         12345
         
        int n = 5;
        for(int i=n;i>=1;i-- ){
            for(int j=i;j<=n;j++ ){
                System.out.print(j);
            }
            System.out.println();
        } */
       /*Pattern No. 12
       A
       BB
       CCC
       DDDD
       EEEEE
        
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j =i;j>=1;j--){
                System.out.print((char)(i+64));
            }
            System.out.println();
        }*/
        /*Pattern No. 13
         e
         dd
         ccc
         bbbb
         aaaaa
         
        int n = 5;
        for(int i = n;i>=1;i--){
            for(int j = i;j<=n;j++){
                System.out.print((char)(i+96));
            }
            System.out.println();
        }*/
        /*Pattern No. 14 
        54321
        5432
        543
        54
        5
        
        int n =5;
        for(int i = 1;i<=n;i++){
            for(int j = n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }*/
        /*Pattern  No.15
        1
        21
        321
        4321
        54321
        
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }    */
        /*Pattern No. 16
        5
        54
        543
        5432
        54321   
        int n = 5;
        for(int i = n ;i>=1;i--){
            for(int j = n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }    */
        /*Pattern No. 17
        54321
        4321
        321
        21
        1
         
        int n =5;
        for(int i = n;i>=1;i--){
            for(int j = i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }*/
        /*Pattern No.18
        eeeee
        dddd
        ccc
        bb
        a
         
        int n = 5;
        for(int i = 5;i>=1;i--){
            for(int j = i;j>=1;j--){
                System.out.print((char)(i+96));
            }
            System.out.println();
        }*/
        /*Pattern No.19
        E
        ED
        EDC
        EDCB
        EDCBA
         
        int n = 5;
        for(int i=n;i>=1;i--){
            for(int j = n;j>=i;j--){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }*/

        /*Pattern No.20
             *
            **
           ***
          ****
         *****
         
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*Pattern No.21
        *****
         ****
          ***
           **
            *
         
        int n = 5;
        for(int i =1;i<=n;i++){
            for(int j = i;j>1;j--){
                System.out.print(" ");
            }
            for(int j = i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*Pattern No.22
             1
            21
           321
          4321
         54321
         
        int n = 5;
        for(int i =1;i<=n;i++){
            for(int j =i;j<n;j++){
                System.out.print(" ");
            }
            for(int j = i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }*/
        /*Pattern No.23
         54321
          4321
           321
            21
             1
         
        int n = 5;
        for(int i = n;i>=1;i--){
            for(int j = i;j<n;j++){
                System.out.print(" ");
            }
            for(int j = i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }*/
        /*Pattern No.24 
              5
             45
            345
           2345
          12345    
        
        int n = 5;
        for(int i =n;i>=1;i--){
            for(int j = i;j>1;j--){
                System.out.print(" ");
            }
            for(int j = i;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/
        /*Pattern No.25
        ABCDE
         ABCD
          ABC
           AB
            A
         
        int n = 5;
        for(int i = n;i>=1;i--){
            for(int j = i;j<n;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }*/

        // Lets start from where we left yesterday------------------------------

        /*Pattern No. 26
             1
            22
           333
          4444
         55555   
         
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = i;j<n;j++){
                System.out.print(" ");
            }
            for(int j = i;j>=1;j--){
                System.out.print(i);
            }
            System.out.println();
        }*/
        /*Pattern No. 27
         * 11111
         *  2222
         *   333
         *    22 
         *     1
        
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = i;j>1;j--){
                System.out.print(" ");
            }
            for(int j = i;j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        } */
       /*Pattern no. 28
             5
            44
           333
          2222
         11111    
        
        int n = 5;
        for(int i = n;i>=1;i--){
            for(int j = i;j>1;j--){
                System.out.print(" ");
            }
            for(int j = i;j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        }*/
        /*Pattern No. 29
         * 55555
         *  4444
         *   333
         *    22
         *     1
         
        int n = 5;
        for(int i = n;i>=1;i--){
            for(int j = i;j<5;j++){
                System.out.print(" ");
            }
            for(int j = i;j>=1;j--){
                System.out.print(i);
            }
            System.out.println();
        }*/
        /*Pattern No.30
         * 12345
         *  1234
         *   123
         *    12
         *     1
         
        int n =5;
        for(int i =n;i>=1;i--){
            for(int j = i;j<n;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/
        /*Pattern No. 31
         *      1
         *     21
         *    321
         *   4321
         *  54321
         
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = i;j<n;j++){
                System.out.print(" ");
            }
            for(int j = i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }*/
        /*Pattern No. 32
         *     5
         *    54
         *   543
         *  5432
         * 54321
         
        int n = 5;
        for(int i = n;i>=1;i--){
            for(int j =i;j>1;j--){
                System.out.print(" ");
            }
            for(int j = n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }*/
        /*Pattern No. 33
         * 54321
         *  5432
         *   543
         *    54
         *     5
         *
        int n=5;
        for(int i = 1;i<=n;i++){
            for(int j =i;j>1;j--){
                System.out.print(" ");
            }
            for(int j =n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }*/
        /*Pattern No. 34
         * 12345
         *  1234
         *   123
         *    12
         *     1
         *
        int n = 5;
        for(int i=n;i>=1;i--){
            for(int j =i;j<n;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/
        /*Pattern No. 35
         *      A
         *     BB
         *    CCC
         *   DDDD
         *  EEEEE
         *
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = i;j<n;j++){
                System.out.print(" ");
            }
            for(int j = i;j>=1;j--){
                System.out.print((char)(i+64));
            }
            System.out.println();
        }*/
        /*Pattern No. 36
         * AAAAA
         *  BBBB
         *   CCC
         *    DD
         *     E
         *
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = i;j>1;j--){
                System.out.print(" ");
            }
            for(int j = i;j<=n;j++){
                System.out.print((char)(i+64));
            }
            System.out.println();
        }*/
        /*Pattern No. 37 
         *      e
         *     dd
         *    ccc
         *   bbbb
         *  aaaaa
        *
        int n  =5;
        for(int i = n;i>=1;i--){
            for(int j = i;j>1;j--){
                System.out.print(" ");
            }
            for(int j = i;j<=n;j++){
                System.out.print((char)(i+96));
            }
            System.out.println();



        }*/
        /*Pattern No.38
        eeeee
         dddd
          ccc
           bb
            a
        *
        int n = 5;
        for(int i = n;i>=1;i--){
            for(int j = i;j<n;j++){
                System.out.print(" ");
            }
            for(int j = i;j>=1;j--){
                System.out.print((char)(i+96));
            }
            System.out.println();
        }*/
        /*Pattern No. 39
             A
            AB
           ABC
          ABCD
         ABCDE
        *
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = i;j<n;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }*/
        /*Pattern no.40
             a
            ba
           cba
          dcba
         edcba
        *
        int n =5;
        for(int i = 1;i<=n;i++){
            for(int j =i;j<n;j++){
                System.out.print(" ");
            }
            for(int j = i;j>=1;j--){
                System.out.print((char)(j+96));
            }
            System.out.println();
        }*/
        /*Pattern No. 41
        abcde 
         bcde
          cde
           de
            e
        *
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = i;j>1;j--){
                System.out.print(" ");
            }
            for(int j = i;j<=n;j++){
                System.out.print((char)(j+96));
            }
            System.out.println();
        }*/
        /*Pattern No. 42
             E
            ED
           EDC
          EDCB
         EDCBA
        *
        int n =5;
        for(int i = n;i>=1;i--){
            for(int j = i;j>1;j--){
                System.out.print(" ");
            }
            for(int j = n;j>=i;j--){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }*/
        /*Pattern No. 43
        EDCBA
         EDCB
          EDC
           ED
            E
        *
        int n = 5;
        for(int i =1;i<=n;i++){
            for(int j = i;j>1;j--){
                System.out.print(" ");
            }
            for(int j = n;j>=i;j--){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }*/
        /*Patter No. 44
             e
            de
           cde
          bcde
         abcde
        *
        int n = 5;
        for(int i = n;i>=1;i--){
            for(int j = i;j>1;j--){
                System.out.print(" ");
            }
            for(int j = i;j<=n;j++){
                System.out.print((char)(j+96));
            }
            System.out.println();
        }*/
        /*Pattern No. 45
        edcba
         dcba
          cba
           ba
            a
        *
        int n = 5;
        for(int i = n;i>=1;i--){
            for(int j = i;j<n;j++){
                System.out.print(" ");
            }
            for(int j = i;j>=1;j--){
                System.out.print((char)(j+96));
            }
            System.out.println();
        }*/
        /*Pattern No.46
        1
        2 3
        4 5 6
        7 8 9  10
        11 12 12 14 15
        *
        int n =5;
        int count = 1;
        for(int i= 1;i<=n;i++){
            for(int j =i;j>=1;j--){
                System.out.print(count+"\t");
                count++;
            }
            System.out.println();
        }*/
        /*Pattern No.47
        15
        14  13
        12  11  10
        9   8   7   6
        5   4   3   2   1
        *
        int n =5;
        int count = n*(n+1)/2;
        for(int i = 1;i<=n;i++){
            for(int j = i;j>=1;j--){
                System.out.print(count+"\t");
                count--;
            }
            System.out.println();
        }*/
        /*Pattern No.48
        1
        3   2
        6   5   4
        10  9   8   7
        15  14  13  12  11
         
        int n = 5;
        int count = 1;
        for(int i = 1;i<=n;i++){
            int c = count;
            for(int j = i;j>=1;j--){
                System.out.print(c+"\t");
                c--;
            }
            System.out.println();
            count+=i+1;
        }*/
        /*Pattern No.49
        15
        13  14
        10  11  12  
        6   7   8   9
        1   2   3   4   5
         *
        int n = 5;
        int count = n*(n+1)/2;
        for(int i = 1;i<=n;i++){
            int c = count;
            for(int j = i;j>=1;j--){
                System.out.print(c+"\t");
                c++;
            }
            System.out.println();
            count-=i+1;
        }*/
        /*Pattern No. 50
         1
         2  6
         3  7   10
         4  8   11  13
         5  9   12  14  15
         *
        int n = 5;
        int count = 1;
        for(int i=n;i>=1;i-- ){
            int c= count;
            for(int j=n;j>=i;j-- ){
                System.out.print(c+"\t");
                c+=j-1;
            }
            System.out.println();
            count++;
        }*/

        //Welcome to Day 3 of Solving 100 Patterns Questions in Java

        //Today we are continue from where we left yeterday

        /*Pattern No. 51
         5
         4  9
         3  8   12
         2  7   11  14
         1  6   10  13  15
         
        int n = 5;
        int count=n;
        for(int i =n;i>=1;i--){
            int c= count;
            for(int j = n;j>=i;j--){
                System.out.print(c+"\t");
                c+=j;
            }
            System.out.println();
            count--;
            
        }*/
        /*Pattern No. 52
        15
        14  10
        13  9   6
        12  8   5   3
        11  7   4   2   1
         
        int n = 5;
        int count=n*(n+1)/2;
        for(int i =n;i>=1;i--){
            int c = count;
            for(int j = n;j>=i;j--){
                System.out.print(c+"\t");
                c-=j-1;
            }
            System.out.println();
            count--;
        }*/
        /*Pattern No. 53
        11
        12  7
        13  8   4   
        14  9   5   2
        15  10  6   3   1

        int n =5;
        int count = (n*(n-1)/2)+1;
        for(int i =n;i>=1;i--){
            int c = count;
            for(int j = n;j>=i;j--){
                System.out.print(c+"\t");
                c-=j;
            }
            System.out.println();
            count++;
        }*/
        /*Pattern No.54
        1
        6   2
        10  7   3
        13  11  8   4   
        15  14  12  9   5
         
        int n = 5;
        int count=1;
        for(int i = n;i>=1;i--){
            int c = count;
            for(int j= i;j<=n;j++){
                System.out.print(c+"\t");
                c-=j;
            }
            System.out.println();
            count+=i;
        }*/
        /*Pattern No.55
        5
        9   4
        12  8   3
        14  11  7   2
        15  13  10  6   1
         
        int n =5;
        int count=n;
        for(int i = n;i>=1;i--){
            int c=count;
            for(int j = i;j<=n;j++){
                System.out.print(c+"\t");
                c-=j+1;
            }
            System.out.println();
            count+=i-1;
        }*/
        /*Pattern No. 56
        11
        7   12
        4   8   13
        2   5   9   14
        1   3   6   10  15
         
        int n =5;
        int count = (n*(n-1)/2)+1;
        for(int i =n;i>=1;i--){
            int c= count;
            for(int j = i;j<=n;j++){
                System.out.print(c+"\t");
                c+=j+1;
            }
            System.out.println();
            count-=i-1;
        }*/
        /*Pattern No. 57
        15
        10  14
        6   9   13
        3   5   8   12
        1   2   4   7   11
         
        int n = 5;
        int count=n*(n+1)/2;
        for(int i = n;i>=1;i--){
            int c= count;
            for(int j = i;j<=n;j++){
                System.out.print(c+"\t");
                c+=j;
            }
            System.out.println();
            count-=i;
        }*/
        /*Pattern No.58
        1   6   10  13  15
        2   7   11  14
        3   8   12
        4   9
        5
         
        int n = 5;
        int count = 1;
        for(int i = 1;i<=n;i++){
            int c=count;
            for(int j =n;j>=i;j--){
                System.out.print(c+"\t");
                c+=j;
            }
            System.out.println();
            count++;
        }*/
        /*Pattern No. 59
        1   2   3   4   5
        6   7   8   9
        10  11  12
        13  14
        15
         
        int n = 5;
        int count = 1;
        for(int i =n;i>=1;i--){
            for(int j =i;j>=1;j--){
                System.out.print(count+"\t");
                count++;
            }
            System.out.println();
        }*/

        /*Pattern No.60
        1   3   6   10  15
        2   5   9   14
        4   8   13
        7   12
        11
         
        int n = 5;
        int count=1;
        for(int i = 1;i<=n;i++){
            int c=count;
            for(int j =i;j<=n;j++){
                System.out.print(c+"\t");
                c+=j+1;
            }
            System.out.println();
            count+=i;
        }*/
        /*Pattern No.61
        15  14  13  12  11
        10  9   8   7
        6   5   4
        3   2
        1
         
        int n = 5;
        int count=n*(n+1)/2;
        for(int i =n;i>=1;i--){
            int c = count;
            for(int j = i;j>=1;j--){
                System.out.print(c+"\t");
                c--;
            }
            System.out.println();
            count-=i;
        }*/
        /*Pattern No.62
        5   9   12  14  15
        4   8   11  13
        3   7   10
        2   6
        1
         
        int n = 5;
        int count=n;
        for(int i =1;i<=n;i++){
            int c = count;
            for(int j = n;j>=i;j--){
                System.out.print(c+"\t");
                c+=j-1;
            }
            System.out.println();
            count--;
        }*/
        /*Pattern No.63
        1   2   4   7   11
        3   5   8   12
        6   9   13
        10  14  
        15
         
        int n = 5;
        int count=1;
        for(int i = 1;i<=n;i++){
            int c = count;
            for(int j = i;j<=n;j++){
                System.out.print(c+"\t");
                c+=j;
            }
            System.out.println();
            count+=i+1;
        }*/
        /*Pattern No.64
        5   4   3   2   1
        9   8   7   6
        12  11  10
        14  13
        15
         
        int n = 5;
        int count = n;
        for(int i =n;i>=1;i--){
            int c = count;
            for(int j = i;j>=1;j--){
                System.out.print(c+"\t");
                c--;
            }
            System.out.println();
            count+=i-1;
        }*/
        /*Pattern No.65
        11  7   4   2   1
        12  8   5   3
        13  9   6
        14  10
        15
         
        int n = 5;
        int count =(n*(n-1)/2)+1;
        for(int i = 1;i<=n;i++){
            int c = count;
            for(int j = n;j>=i;j--){
                System.out.print(c+"\t");
                c-=j-1;
            }
            System.out.println();
            count++;
        }*/
        /*Pattern No.66
        15  14  12  9   5
        13  11  8   4
        10  7   3
        6   2
        1
         
        int n = 5;
        int count=n*(n+1)/2;
        for(int i = 1;i<=n;i++){
            int c = count;
            for(int j = i;j<=n;j++){
                System.out.print(c+"\t");
                c-=j;
            }
            System.out.println();
            count-=i+1;
        }*/
        /*Pattern No.67
        11  12  13  14  15
        7   8   9   10
        4   5   6
        2   3
        1
         
        int n = 5;
        int count=(n*(n-1)/2)+1;
        for(int i =n;i>=1;i--){
            int c=count;
            for(int j =i;j>=1;j--){
                System.out.print(c+"\t");
                c++;
            }
            System.out.println();
            count-=i-1;
        }*/
        /*Pattern No.68
        15  10  6   3   1
        14  9   5   2
        13  8   4
        12  7
        11
         
        int n = 5;
        int count =n*(n+1)/2;
        for(int i = 1;i<=n;i++){
            int c= count;
            for(int j = n;j>=i;j--){
                System.out.print(c+"\t");
                c-=j;
            }
            System.out.println();
            count--;
        }*/
        /*Pattern  No.69
        15  13  10  6   1
        14  11  7   2
        12  8   3
        9   4
        5
         
        int n = 5;
        int count = n*(n+1)/2;
        for(int i =1;i<=n;i++){
            int c = count;
            for(int j = i;j<=n;j++){
                System.out.print(c+"\t");
                c-=j+1;
            }
            System.out.println();
            count-=i;
        }*/
        /*Pattern No.70
                            1
                        6   2
                    10  7   3
                13  11  8   4
            15  14  12  9   5        
         
        int n = 5;
        int count = 1;
        for(int i = n;i>=1;i--){
            int c= count;
            for(int j = i;j>1;j--){
                System.out.print("\t");
            }
            for(int j = i;j<=n;j++){
                System.out.print(c+"\t");
                c-=j;
            }
            System.out.println();
            count+=i;
        }*/
        /*Pattern No.71
                        11
                    12  7
                13  8   4
            14  9   5   2
        15  10  6   3   1        
         
        int n = 5;
        int count = (n*(n-1)/2)+1;
        for(int i = n;i>=1;i--){
            int c= count;
            for(int j =i;j>1;j--){
                System.out.print("\t");
            }
            for(int j = n;j>=i;j--){
                System.out.print(c+"\t");
                c-=j;
            }
            System.out.println();
            count++;
        }*/

        /*Pattern No.72
                        1
                    2   3
                4   5   6
            7   8   9   10
        11  12  13  14  15
         
        int n = 5;
        int count=1;
        for(int i = 1;i<=n;i++){
            int c = count;
            for(int j=i;j<n;j++){
                System.out.print("\t");
            }
            for(int j = i;j>=1;j--){
                System.out.print(c+"\t");
                c++;
            }
            System.out.println();
            count+=i;
        }*/

        //Welcome to Day 4 of 100 Patterns solving
        
        
        
        /*Pattern No.73
                        1
                    2   6
                3   7   10
            4   8   11  13
        5   9   12  14  15
         
        int n =5;
        int count=1;
        for(int i =n;i>=1;i-- ){
            int c=count;
            for(int j =i;j>1;j--){
                System.out.print("\t");
            }
            for(int j =n;j>=i;j-- ){
                System.out.print(c+"\t");
                c+=j-1;
            }
            System.out.println();
            count++;
        }*/
        /*Pattern No. 74
                        11
                    7   12
                4   8   13
            2   5   9   14
        1   3   6   10  15
         
        int n = 5;
        int count=(n*(n-1)/2)+1;
        for(int i =n;i>=1;i-- ){
            int c = count;
            for(int j = i;j>1;j--){
                System.out.print("\t");
            }
            for(int j = i;j<=n;j++){
                System.out.print(c+"\t");
                c+=j+1;
            }
            System.out.println();
            count-=i-1;
        }*/

        /*Pattern No.75
                        15
                    14  13
                12  11  10
            9   8   7   6
        5   4   3   2   1
         
        int n = 5;
        int count =n*(n+1)/2;
        for(int i =1;i<=n;i++ ){
            int c= count;
            for(int j = i;j<n;j++){
                System.out.print("\t");
            }
            for(int j=i;j>=1;j--){
                System.out.print(c+"\t");
                c--;
            }
            System.out.println();
            count-=i;
        }*/
        /*Pattern No. 76
                        5
                    4   9
                3   8   12
            2   7   11  14
        1   6   10  13  15
         
        int n = 5;
        int count = n;
        for(int i = n;i>=1;i--){
            int c = count;
            for(int j = i;j>1;j--){
                System.out.print("\t");
            }
            for(int j = n;j>=i;j--){
                System.out.print(c+"\t");
                c+=j;

            }
            System.out.println();
            count--;
        }*/
        /*Pattern No.77
                        15
                    13  14
                10  11  12
            6   7   8   9
        1   2   3   4   5
         
        int n =5;
        int count = n*(n+1)/2;
        for(int i = 1;i<=n;i++){
            int c = count;
            for(int j = i;j<n;j++){
                System.out.print("\t");
            }
            for(int j = i;j>=1;j--){
                System.out.print(c+"\t");
                c++;
            }
            System.out.println();
            count-=i+1;
        }*/
        /*Pattern No.78
                        15
                    10  14
                6   9   13
            3   5   8   12
        1   2   4   7   11
         
        int n = 5;
        int count = n*(n+1)/2;
        for(int i =n;i>=1;i--){
            int c = count ;
            for(int j = i;j>1;j--){
                System.out.print("\t");
            }
            for(int j =i;j<=n;j++){
                System.out.print(c+"\t");
                c+=j;
            }
            System.out.println("\t");
            count-=i;
        }*/
        /*Pattern No.79
                        1
                    3   2
                6   5   4
            10  9   8   7
        15  14  13  12  11
         
        int n =5 ;
        int count = 1;
        for(int i =1;i<=n;i++ ){
            int c = count ;
            for(int j=i;j<n;j++){
                System.out.print("\t");
            }
            for(int j =i;j>=1;j-- ){
                System.out.print(c+"\t");
                c--;
            }
            System.out.println();
            count+=i+1;
        }*/
        /*Pattern No.80
                        15
                    14  10
                13  9   6
            12  8   5   3
        11  7   4   2   1
         
        int n = 5;
        int count =n*(n+1)/2;
        for(int i=n;i>=1;i--){
            int c = count;
            for(int j = i;j>1;j--){
                System.out.print("\t");
            }
            for(int j =n;j>=i;j--){
                System.out.print(c+"\t");
                c-=j-1;
            }
            System.out.println();
            count--;
        }*/
        /*pattern No 81
                        5
                    9   4
                12  8   3
            14  11  7   2
        15  13  10  6   1
         
        int n = 5;
        int count =n;
        for(int i = n;i>=1;i--){
            int c = count;
            for(int j = i;j>1;j--){
                System.out.print("\t");
            }
            for(int j = i;j<=n;j++){
                System.out.print(c+"\t");
                c-=j+1;
            }
            System.out.println();
            count+=i-1;
        }*/



        /*Pattern No.82
        Ao  Bn  Cm  Dl  Ek
        Fj  Gi  Hh  Ig
        Jf  Ke  Ld
        Mc  Nb
        Oa
         
        int n = 5;
        int count1=1;
        int count2=n*(n+1)/2;
        for(int i =n;i>=1;i--){
            int c1=count1;
            int c2=count2;
            for(int j =i;j>=1;j--){
                System.out.print((char)(c1+64));
                System.out.print((char)(c2+96)+"\t");
                c1++;
                c2--;
            }
            System.out.println();
            count1+=i;
            count2-=i;
        }*/


        /*Pattern No.83
        Ao
        Fn  Bj
        Jm  Gi  Cf
        Ml  Kh  He  Dc
        Ok  Ng  Ld  Ib  Ea
         
        int n=5;
        int count1=1;
        int count2=n*(n+1)/2;
        for(int i=n;i>=1;i--){
            int c1=count1;
            int c2=count2;
            for(int j=i,j1=n;j<=n || j1>=i;j++,j1--){
                System.out.print((char)(c1+64));
                System.out.print((char)(c2+96)+"\t");
                c1-=j;
                c2-=j1-1;
            }
            System.out.println();
            count1+=i;
            count2--;
        }*/

        //Welcome to Day 5 of Solving 100 Java Patterns 


        /*Pattern No.84
        Aa  Cf  Fj  Jm  Oo
        Bb  Eg  Ik  Nn
        Dc  Hh  Mi
        Gd  Li
        Ke
         
        int n = 5;
        int count1= 1;
        int count2=1;
        for(int i=1;i<=n;i++ ){
            int c1= count1;
            int c2 = count2;
            for(int j=i,j1=n;j<=n;j++,j1--){
                System.out.print((char)(c1+64));
                System.out.print((char)(c2+96)+"\t");
                c1+=j+1;
                c2+=j1;
            }
            System.out.println();
            count1+=i;
            count2++;
        }*/
        /*Pattern No.85
        AO  FM  JJ  MF  OA           
            BN  GK  KG  NB                      
                CL  HH  LC                          
                    DI  ID                             
                        EE                                     
        
        int n = 5;
        int count1=1;
        int count2=n*(n+1)/2;
        for(int i =1;i<=n;i++ ){
            int c1 =count1;
            int c2 = count2;
            for(int j =i;j>1;j--){
                System.out.print("\t");
            }
            for(int j = n,j1=i;j>=i;j--,j1++){
                System.out.print((char)(c1+64));
                System.out.print((char)(c2+64)+"\t");
                c1+=j;
                c2-=j1+1;
            }
            System.out.println();
            count1++;
            count2-=i;
        }*/
        /*Pattern No.86
        OO  NJ  LF  IC  EA
        MN  KI  HE  DB
        JM  GH  CD
        FL  BG
        AK  
         
        int n=5;
        int count1=n*(n+1)/2;
        int count2=n*(n+1)/2;
        for(int i =1;i<=n;i++ ){
            int c1=count1;
            int c2= count2;
            for(int j =n,j1=i;j>=i;j--,j1++){
                System.out.print((char)(c1+64));
                System.out.print((char)(c2+64)+"\t");
                c1-=j1;
                c2-=j;
            }
            System.out.println();
            count1-=i+1;

            count2--;
        }*/
        /*Pattern NO.87
                        EO     ->>>>>                           5 15
                    IJ  DN                               910    4 14
                LF  HI  CM                        12 6   8 9    3 13
            NC  KE  GH  BL                 14 3   11 5   7 8    2 12
        OA  MB  JD  FG  AK        15 1     13 2   10 4   6 7    1 11
         
        //this technique is easier for more understanding the pattern
        int n = 5;
        int count1 = n;
        int count2 = n*(n+1)/2;
        for(int i = n;i>=1;i-- ){
            int c1 = count1;
            int c2 = count2;
            for(int j = i;j>1;j--){ //for loop for spaces
                System.out.print("\t");
            }
            for(int j =i;j<=n;j++){
                System.out.print((char)(c1+64));
                System.out.print((char)(c2+64)+"\t");
                c1-=j+1;
                c2+=j;
            }
            System.out.println();
            count1+=i-1;
            count2-=i;
        }*/
        /*Pattern No.88
                        OA  ---->>>>                                    15 1
                    JC  NB                                      10 3    14 2
                FF  IE  MD                              6 6     9  5    13 4
            CJ  EI  HH  LG                      3 10    5 9     8  8    12 7 
        AO  BN  DM  GL  KK              1 15    2 14    4 13    7  12   11 11
         
        int n = 5;
        int count1 = n*(n+1)/2;
        int count2=1;
        for(int i = n,i1=1;i>=1 || i1<=n ;i--,i1++ ){
            int c1=count1;
            int c2=count2;
            for(int j =i;j>1;j--){
                System.out.print("\t");
            }
            for(int j =i;j<=n;j++){
                System.out.print((char)(c1+64));
                System.out.print((char)(c2+64)+"\t");
                c1+=j;
                c2--;
            }
            System.out.println();
            count1-=i;
            count2+=i1+1;
        }*/
        /*Pattern No.89
        Ea  Db  Cd  Bg  Ak
        Ic  He  Gh  Fl
        Lf  Ki  Jm
        Nj  Mn
        Oo
         
        int n = 5;
        int count1=n;
        int count2=1;
        for(int i =n,i1=1;i>=1;i--,i1++){
            int c1=count1;
            int c2=count2;
            for(int j =i,j1=i1;j>=1;j--,j1++){
                System.out.print((char)(c1+64));
                System.out.print((char)(c2+96)+"\t");
                c1--;
                c2+=j1;
            }
            System.out.println();
            count1+=i-1;
            count2+=i1+1;
        }*/
        /*Pattern No 90
        EE  DI  CL  BN  AO
        ID  HH  GK  FM
        LC  KG  JJ
        NB  MF
        OA 
         
        int n = 5;
        int count1=n;
        int count2=n;
        for(int i =1,i1=n;i<=n;i++,i1-- ){
            int c1= count1;
            int c2= count2;
            for(int j =n;j>=i;j--){
                System.out.print((char)(c1+64));
                System.out.print((char)(c2+64)+"\t");
                c1--;
                c2+=j-1;
            }
            System.out.println();
            count1+=i1-1;
            count2--;
        }*/


        //Welcome To Diwali Night Livestream
        //Lets code

        /*Pattern No. 91 
        A
        BC
        DEF
        GHIJ
        KLMNO
        
        int n = 5;
        int count=1;
        for(int i = 1;i<=n;i++){
            for(int j = i;j>=1;j--){
                System.out.print((char)(count+64));
                count++;
            }
            System.out.println();
        }*/
        /*Pattern No.92
        O
        NM
        LKJ
        IHGF
        EDCBA
         
        int n = 5;
        int count = n*(n+1)/2;
        for(int i =1;i<=n;i++){
            for(int j = i;j>=1;j--){
                System.out.print((char)(count+64));
                count--;
            }
            System.out.println();
        }*/
        /*Pattern No.93
        ABCDE
        FGHI
        JKL
        MN
        O
         
        int n = 5;
        int count=1;
        for(int i =n ;i>=1;i--){
            int c = count;
            for(int j=i;j>=1;j--){
                System.out.print((char)(c+64));
                c++;
            }
            System.out.println();
            count+=i;
        }*/
        /*Pattern No.94
        ONMLK
        JIHG
        FED
        CB
        A
         
        int n = 5;
        int count = n*(n+1)/2;
        for(int i = n;i>=1;i--){
            int c = count;
            for(int j = i;j>=1;j--){
                System.out.print((char)(c+64));
                c--;

            }
            System.out.println();
            count-=i;
        }*/
        /*Pattern No. 95
        A
        CB
        FED
        JIHG
        ONMLK
         
        int n =5 ;
        int count=1;
        for(int i = 1;i<=n;i++){
            int c= count;
            for(int j = i;j>=1;j--){
                System.out.print((char)(c+64));
                c--;
            }
            System.out.println();
            count+=i+1;
        }*/
        /*Pattern no.96
        EDCBA
        IHGF
        LKJ
        NM
        O
         
        int n = 5;
        int count=n;
        for(int i = n;i>=1;i--){
            int c=count;
            for(int j = i;j>=1;j--){
                System.out.print((char)(c+64));
                c--;
            }
            System.out.println();
            count+=i-1;
        }*/
        /*Pattern no.97
        A           ->>    1
        BF                 26
        CGJ                37 10
        DHKM               48 11 13
        EILNO              59 12 14 15
         
        int n = 5;
        int count = 1;
        for(int i=n;i>=1;i--){
            int c = count;
            for(int j = n;j>=i;j--){
                System.out.print((char)(c+64));
                c+=j-1;
            }
            System.out.println();
            count++;
        }*/
        /*Pattern No. 98
        E               -->>>   5
        DI                      4 9
        CHL                     3 8 12
        BGKN                    2 7 11 14
        AFJMO                   1 6 10 13 15
         
        int n = 5;
        int count= n;
        for(int i =n;i>=1;i-- ){
            int c = count;
            for(int j =n;j>=i;j-- ){
                System.out.print((char)(c+64));
                c+=j;

            }
            System.out.println();
            count--;
        }*/
        /*Pattern No. 99 
        1
        22
        333
        4444
        55555
        4444
        333
        22
        1
        
        int n = 5;
        for(int i = 1;i<=(n*2)-1;i++){
            if(i<=n){
                for(int j = i;j>=1;j--){
                    System.out.print(i);
                }
            }else{
                for(int j = i;j<=(n*2)-1;j++){
                    System.out.print((n*2)-i);
                }
            }
            System.out.println();
        }*/


        /* Pattern No. 100
        *****
        ****
        ***
        **
        *
        **
        ***
        ****
        *****
         
        int n = 5;
        for(int i = 1;i<=(n*2)-1;i++){
            if(i<=n){
                for(int j =i;j<=n;j++){
                    System.out.print("*");
                }
            }else{
                for(int j = i;j>=n;j--){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        */

        /* Thank You all for watching this whole 100 Patterns series
        
         * Don't forget to Like , Share & Subscribe 
         * 
         * & Happy Diwali To All of You
         * 
         * 
         * Good Night 
         */

        /*
        *
        **
        ***
        ****
        *****       
         */
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
}

