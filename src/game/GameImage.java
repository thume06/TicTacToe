package game;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GameImage extends ImageView {
    private String image;

    public GameImage(String n){
        image = n;
    }

    public String getImageName(){
        return image;
    }

    public void setImageName(String n){
        image = n;
    }
}
