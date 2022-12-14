public class Board {
    private Shape[][] list;
    private int boardSize;

    public Board(int boardSize){
        this.boardSize = boardSize;

        this.list = new Shape[boardSize][boardSize];
    }

    public boolean add(Shape shape, int x, int y){
        try {
            if (this.list[x][y] == null){
                    this.list[x][y] = shape;
                return true;
            }

            return false;
        }catch (Exception ex){
            throw new IndexOutOfBoundsException(String.format("%s %d,%d %s %d", "Position" ,x,y, "is not available on a board of size", boardSize));
        }

    }

    public Shape remove(int x, int y){
        try{
            if (list[x][y] != null){

                Shape opslaan = this.list[x][y];

                this.list[x][y] = null;
                return opslaan;
            }

        }catch (Exception ex){
            throw new IndexOutOfBoundsException(String.format("%s %d,%d %s %d", "Position" ,x,y, "is not available on a board of size", boardSize));
        }
        return null;
    }

    public Double getShapesArea(){

        double totalArea = 0;

        // not me trying to do everything manually here hehehe
//        for (int i = 0; i < boardSize; i++) {
//            for (int j = 0; j < boardSize; j++) {
//                if (list[i][j] != null) {
//                    if (list[i][j] instanceof Circle) {
//                        totalArea += Math.PI * ((Circle) list[i][j]).radius * ((Circle) list[i][j]).radius;
//                    }
//                    totalArea += ((Rectangle) list[i][j]).width * ((Rectangle) list[i][j]).length;
//
//                }
//            }
//        }
            for (int i = 0; i < list.length; i++) {
                for (int j = 0; j < list[i].length; j++) {
                    if (list[i][j] != null){
                        totalArea += list[i][j].getArea();
                    }
                }
            }
        return totalArea;
    }

    public Shape[][] getGrid(){
        return list;
    }
}
