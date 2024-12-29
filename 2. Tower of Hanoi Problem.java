

class Main {
    public static void main(String[] args) {
       
       HanoiTower ( 3, 'A', 'B', 'C');
       
    }
    
    public static void HanoiTower ( int n, char from_rod, char aux_rod, char to_rod){

        if ( n > 0){
        
             HanoiTower ( n-1, from_rod, to_rod, aux_rod) ;
             System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
             HanoiTower( n-1, aux_rod, from_rod, to_rod);

        }

        

    }
    
}