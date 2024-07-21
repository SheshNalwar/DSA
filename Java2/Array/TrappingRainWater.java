public class TrappingRainWater {
    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 5, 2, 6, 2, 3 };
        rainWater(height);
    }

    static void rainWater(int blocks[]) {
        int water = 0;
        for (int i = 1; i < blocks.length - 1; i++) {
            int left_max = 0;
            for (int j = 0; j <= i; j++) {
                if (blocks[j] > left_max) {
                    left_max = blocks[j];
                }
            }
            int right_max = 0;
            for (int j = i; j < blocks.length; j++) {
                if (blocks[j] > right_max) {
                    right_max = blocks[j];
                }
            }
            int water_level = Math.min(left_max, right_max);
            int trapped_water = water_level - blocks[i];
            if (trapped_water > 0) {
                water += trapped_water;
            }
        }
        System.out.println(water);
    }
}
