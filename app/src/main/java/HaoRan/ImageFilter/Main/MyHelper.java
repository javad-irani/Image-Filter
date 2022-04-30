package HaoRan.ImageFilter.Main;

import android.content.Context;

public class MyHelper {

    private Context context;

    public MyHelper(Context _context) {

        this.context = _context;

    }

    public static String setMessage(int position) {

        String mess = "";

        switch (position) {
            case 0:
                mess = "video filter 1";
                break;
            case 1:
                mess = "video filter 2";
                break;
            case 2:
                mess = "video filter 3";
                break;
            case 3:
                mess = "video filter 4";
                break;
            case 4:
                mess = "tile reflection filter 1";
                break;
            case 5:
                mess = "tile reflection filter 2";
                break;
            case 6:
                mess = "fill pattern filter";
                break;
            case 7:
                mess = "fill pattern filter 1";
                break;
            case 8:
                mess = "mirror filter 1";
                break;
            case 9:
                mess = "mirror filter 2";
                break;
            case 10:
                mess = "ycb cr linear filter";
                break;
            case 11:
                mess = "ycb cr linear filter 2";
                break;
            case 12:
                mess = "texture filter";
                break;
            case 13:
                mess = "texture filter 1";
                break;
            case 14:
                mess = "texture filter 2";
                break;
            case 15:
                mess = "texture filter 3";
                break;
            case 16:
                mess = "texture filter 4";
                break;
            case 17:
                mess = "hsl modify filter";
                break;
            case 18:
                mess = "hsl modify filter 0";
                break;
            case 19:
                mess = "hsl modify filter 1";
                break;
            case 20:
                mess = "hsl modify filter 2";
                break;
            case 21:
                mess = "hsl modify filter 3";
                break;
            case 22:
                mess = "hsl modify filter 4";
                break;
            case 23:
                mess = "hsl modify filter 5";
                break;
            case 24:
                mess = "hsl modify filter 6";
                break;
            case 25:
                mess = "hsl modify filter 7";
                break;
            case 26:
                mess = "zoom blur filter";
                break;
            case 27:
                mess = "thread grid filter";
                break;
            case 28:
                mess = "color tone filter";
                break;
            case 29:
                mess = "color tone filter 2";
                break;
            case 30:
                mess = "color tone filter 3";
                break;
            case 31:
                mess = "color tone filter 4";
                break;
            case 32:
                mess = "soft glow filter";
                break;
            case 33:
                mess = "tile reflection filter";
                break;
            case 34:
                mess = "blind filter 1";
                break;
            case 35:
                mess = "blind filter 2";
                break;
            case 36:
                mess = "raise frame filter";
                break;
            case 37:
                mess = "shift filter";
                break;
            case 38:
                mess = "wave filter";
                break;
            case 39:
                mess = "bulge filter";
                break;
            case 40:
                mess = "twist filter";
                break;
            case 41:
                mess = "ripple filter";
                break;
            case 42:
                mess = "illusion filter";
                break;
            case 43:
                mess = "supernova filter";
                break;
            case 44:
                mess = "lens flare filter";
                break;
            case 45:
                mess = "posterize filter";
                break;
            case 46:
                mess = "gamma filter";
                break;
            case 47:
                mess = "sharp filter";
                break;
            case 48:
                mess = "ComicFilter";
                break;
            case 49:
                mess = "Gradient Scene";
                break;
            case 50:
                mess = "Gradient Scene 1";
                break;
            case 51:
                mess = "Gradient Scene 2";
                break;
            case 52:
                mess = "Gradient Scene 3";
                break;
            case 53:
                mess = "Film Filter";
                break;
            case 54:
                mess = "Focus Filter";
                break;
            case 55:
                mess = "Clean Glass Filter";
                break;
            case 56:
                mess = "Paint Border Filter green";
                break;
            case 57:
                mess = "Paint Border Filter yellow";
                break;
            case 58:
                mess = "Paint Border Filter blue";
                break;
            case 59:
                mess = "Lomo Filter";
                break;
            case 60:
                mess = "Invert Filter";
                break;
            case 61:
                mess = "Black White Filter";
                break;
            case 62:
                mess = "Edge Filter";
                break;
            case 63:
                mess = "Pixelate Filter";
                break;
            case 64:
                mess = "Neon Filter";
                break;
            case 65:
                mess = "Big Brother Filter";
                break;
            case 66:
                mess = "Monitor Filter";
                break;
            case 67:
                mess = "Relief Filter";
                break;
            case 68:
                mess = "Bright Contrast Filter";
                break;
            case 69:
                mess = "Saturation Modify Filter";
                break;
            case 70:
                mess = "Threshold Filter";
                break;
            case 71:
                mess = "Noise Filter";
                break;
            case 72:
                mess = "Banner Filter true";
                break;
            case 73:
                mess = "Banner Filter false";
                break;
            case 74:
                mess = "Rect Matrix Filter";
                break;
            case 75:
                mess = "Block Print Filter";
                break;
            case 76:
                mess = "Brick Filter";
                break;
            case 77:
                mess = "Gaussian Blur Filter";
                break;
            case 78:
                mess = "Light Filter";
                break;
            case 79:
                mess = "Mist Filter";
                break;
            case 80:
                mess = "Mosaic Filter";
                break;
            case 81:
                mess = "Oil Paint Filter";
                break;
            case 82:
                mess = "Radial Distortion Filter";
                break;
            case 83:
                mess = "Reflection Filter";
                break;
            case 84:
                mess = "Reflection Filter";
                break;
            case 85:
                mess = "Saturation Modify Filter";
                break;
            case 86:
                mess = "Smash Color Filter";
                break;
            case 87:
                mess = "Tint Filter";
                break;
            case 88:
                mess = "Vignette Filter";
                break;
            case 89:
                mess = "Auto Adjust Filter";
                break;
            case 90:
                mess = "Color Quantize Filter";
                break;
            case 91:
                mess = "Water Wave Filter";
                break;
            case 92:
                mess = "Vintage Filter";
                break;
            case 93:
                mess = "Old Photo Filter";
                break;
            case 94:
                mess = "Sepia Filter";
                break;

            case 95:
                mess = "Rain Bow Filter";
                break;
            case 96:
                mess = "Feather Filter";
                break;
            case 97:
                mess = "XRadiation Filter";
                break;
            case 98:
                mess = "Night Vision Filter";
                break;
        }

        return mess;

    }

}
