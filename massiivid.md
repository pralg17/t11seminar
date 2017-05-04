java massiivide loomine ja kasutamine

massiivi loomise võimalused:
[] 									:: märgib, et tegemist on massiiviga
int, double, float, String, Object	:: erinevad massiivide andmetüübiud

int[] myIntArray = new int[3];		:: kolme liikmelise massiivi loomine
int[] myIntArray = {1,2,3};			:: kolme liikmelise massiivi loomine koos liikmete väärtustamisega
int[] myIntArray = new int[]{1,2,3};

mitmedimensioonilise loomine:
int[][] num = new int[5][2];		:: 5x2 liikmest koosnev massiiv