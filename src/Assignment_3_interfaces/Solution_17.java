package Assignment_3_interfaces;

import java.awt.*;

public class Solution_17 {
    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
        String getName();
    }
    public static class Fox implements Animal {
        @Override
        public Color getColor() {
            return null;
        }

        @Override
        public String getName() {
            return "Fox.";
        }
    }
    public abstract static class BigFox extends Fox {

    }
}
