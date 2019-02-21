package General;

import org.openqa.selenium.Dimension;

public class basicFlows {
    public static Dimension size;

    public void swipeHorizontal(String swipe){
        size = webDriverFactory.driver.manage().window().getSize();

        //Find swipe start and end point from screen's with and height.
        //Find startx point which is at right side of screen.
        int startx = (int) (size.width * 0.70);
        //Find endx point which is at left side of screen.
        int endx = (int) (size.width * 0.30);
        //Find vertical point where you wants to swipe. It is in middle of screen height.
        int starty = size.height / 2;

        switch (swipe){
            case "Right":
            case "right":
                //Swipe from Right to Left.
                webDriverFactory.driver.swipe(startx, starty, endx, starty, 3000);
                break;
            case "Left":
            case "left":
                //Swipe from Left to Right.
                webDriverFactory.driver.swipe(endx, starty, startx, starty, 3000);
                break;
        }
    }

    public void swipeVertical(String swipe){
        size = webDriverFactory.driver.manage().window().getSize();

        //Find swipe start and end point from screen's with and height.
        //Find starty point which is at bottom side of screen.
        int starty = (int) (size.height * 0.80);
        //Find endy point which is at top side of screen.
        int endy = (int) (size.height * 0.20);
        //Find horizontal point where you wants to swipe. It is in middle of screen width.
        int startx = size.width / 2;

        switch (swipe){
            case "Up":
            case "up":
                //Swipe from Bottom to Top.
                webDriverFactory.driver.swipe(startx, starty, startx, endy, 3000);
                break;
            case "Down":
            case "down":
                //Swipe from Top to Bottom.
                webDriverFactory.driver.swipe(startx, endy, startx, starty, 3000);
                break;
        }
    }

    public void moveBack(){
        webDriverFactory.driver.navigate().back();
    }


}
