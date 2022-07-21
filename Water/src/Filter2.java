

/**
 *
 * @author Amadi Senarath
 */
public class Filter2 {
        
    static Array filter;
    static Array data;

    Filter2(int x, int y) {
        filter = new Array(x,y);
        data = new Array(x,y);
    }

    // 2D array defining filter
    static class Array {

        double[][] data;
        int width;
        int height;

        // Constructor of a node in linked list
        Array(int x, int y) {
            width = x;
            height = y;
            data = new double[height][width];
        }

        // Print 2D array
        void print() {
            if (this.data != null) {
                for(int i = 0; i < this.height; i++) {
                    for(int j = 0; j < this.width; j++) {
                        System.out.print(this.data[i][j] + "\t");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("No data");
            }
        }

    }

    // Print filter and data
    void printFilter() {
        if (this.data != null && this.filter != null) {
            for(int i = 0; i < this.filter.height; i++) {
                System.out.print("  ");
                for(int j = 0; j < this.filter.width; j++) {
                    System.out.print((int)this.filter.data[i][j] + " ");
                }
                System.out.print("|\t");
                for(int j = 0; j < this.data.width; j++) {
                    System.out.print(this.data.data[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("No data");
        }
    }

    // Remove holes in the filter
    void removeHoles(int x, int y) {
        if (this.data != null && this.filter != null) {
            this.filter.data[this.filter.height - y][x - 1] = 1;
        } else {
            System.out.println("No data");
        }
    }

    // Add water to the filter
    void addWater(int x) {
        if (this.data != null && this.filter != null) {
            this.data.data[0][x - 1] = 100;
        } else {
            System.out.println("No data");
        }
    }



    // Drain water from the filter part 2
    double drainWater2() {
        if (this.data != null && this.filter != null) {
            this.printFilter();
            System.out.println("---------------------------------------------");
            for(int i = 0; i < this.filter.height - 1; i++) {
                for(int j = 0; j < this.filter.width; j++) {
                    if (this.data.data[i][j] != 0) {
                        if (this.filter.data[i][j] != 0 || this.filter.data[i+1][j] != 0) {
                            if (j-1 >= 0) {
                                for (int k = j - 1; k >=0 ; k--) {
                                    if (this.filter.data[i+1][k] == 0) {
                                        this.data.data[i+1][k] += this.data.data[i][j]/2;
                                        break;
                                    }
                                }
                            }
                            if (j+1 < this.filter.width) {
                                for (int k = j + 1; k < this.filter.width ; k++) {
                                    if (this.filter.data[i+1][k] == 0) {
                                        this.data.data[i+1][k] += this.data.data[i][j]/2;
                                        break;
                                    }
                                }
                            }
                        } else {
                            this.data.data[i+1][j] += this.data.data[i][j];
                        }
                        this.data.data[i][j] = 0;
                    }
                }
                this.printFilter();
                System.out.println("---------------------------------------------");
            }

            double sum = 0;
            for(int j = 0; j < this.filter.width; j++) {
                if (this.data.data[this.filter.height - 1][j] != 0) {
                    if (this.filter.data[this.filter.height - 1][j] != 0) {
                        if (j-1 >= 0)
                            sum += this.data.data[this.filter.height - 1][j]/2;
                        if (j+1 < this.filter.width)
                            sum += this.data.data[this.filter.height - 1][j]/2;
                    } else {
                        sum += this.data.data[this.filter.height - 1][j];
                    }
                }
            }
            return sum;

        } else {
            System.out.println("No data");
            return 0;
        }
    }
        
    public static void main(String[] args) {
        Filter2 myFilter = new Filter2(7,7);

        // Configure filter
        myFilter.removeHoles(1,3);
        myFilter.removeHoles(1,6);
        myFilter.removeHoles(2,3);
        myFilter.removeHoles(3,3);
        myFilter.removeHoles(3,5);
        myFilter.removeHoles(4,5);
        myFilter.removeHoles(5,5);
        myFilter.removeHoles(6,3);
        myFilter.removeHoles(7,2);
        myFilter.addWater(4);
        
        // Print configurations
        System.out.println("Configuration:");
        myFilter.printFilter();
        System.out.println();

        // Calculate
        System.out.println("---------------------------------------------");
        System.out.println("-- Drain ------------------------------------");
        System.out.println("---------------------------------------------");
        double remainingWater = myFilter.drainWater2();
        System.out.println("---------------------------------------------");

        // Print final output
        System.out.println();
        System.out.println("Remaining water: "+remainingWater);

    }
}
