package game;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable{
    @FXML GridPane gamePane;
    @FXML ImageView cover;
    @FXML ImageView topLeft;
    @FXML ImageView topMid;
    @FXML ImageView topRight;
    @FXML ImageView midLeft;
    @FXML ImageView midMid;
    @FXML ImageView midRight;
    @FXML ImageView botLeft;
    @FXML ImageView botMid;
    @FXML ImageView botRight;
    @FXML Label winner;

    String topL = "blank", topM = "blank", topR = "blank", midL = "blank", midM = "blank", midR = "blank", botL = "blank", botM = "blank", botR = "blank";

    String turn = "x";

    String won = "no";

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        topLeft.setImage(new Image("images/blankImage.png"));
        topMid.setImage(new Image("images/blankImage.png"));
        topRight.setImage(new Image("images/blankImage.png"));
        midLeft.setImage(new Image("images/blankImage.png"));
        midMid.setImage(new Image("images/blankImage.png"));
        midRight.setImage(new Image("images/blankImage.png"));
        botLeft.setImage(new Image("images/blankImage.png"));
        botMid.setImage(new Image("images/blankImage.png"));
        botRight.setImage(new Image("images/blankImage.png"));
    }

    public void CheckWon(){
        //Left column win
        if (topL.equals("x") && midL.equals("x") && botL.equals("x")){
            won = "x";
        }
        else if(topL.equals("y") && midL.equals("y") && botL.equals("y")){
            won = "y";
        }

        //Middle column win
        else if(topM.equals("x") && midM.equals("x") && botM.equals("x")){
            won = "x";
        }
        else if(topM.equals("y") && midM.equals("y") && botM.equals("y")){
            won = "y";
        }

        //Right column win
        else if(topR.equals("x") && midR.equals("x") && botR.equals("x")){
            won = "x";
        }
        else if(topR.equals("y") && midR.equals("y") && botR.equals("y")){
            won = "y";
        }

        //Top row win
        else if(topL.equals("x") && topM.equals("x") && topR.equals("x")){
            won = "x";
        }
        else if(topL.equals("y") && topM.equals("y") && topR.equals("y")){
            won = "y";
        }

        //Mid row win
        else if(midL.equals("x") && midM.equals("x") && midR.equals("x")){
            won = "x";
        }
        else if(midL.equals("y") && midM.equals("y") && midR.equals("y")){
            won = "y";
        }

        //Bot row win
        else if(botL.equals("x") && botM.equals("x") && botR.equals("x")){
            won = "x";
        }
        else if(botL.equals("y") && botM.equals("y") && botR.equals("y")){
            won = "y";
        }

        //Diagonal win topL to botR
        else if(topL.equals("x") && midM.equals("x") && botR.equals("x")){
            won = "x";
        }
        else if(topL.equals("y") && midM.equals("y") && botR.equals("y")){
            won = "y";
        }

        //Diagonal win topR to botL
        else if(topR.equals("x") && midM.equals("x") && botL.equals("x")){
            won = "x";
        }
        else if(topR.equals("y") && midM.equals("y") && botL.equals("y")){
            won = "y";
        }
        //Draw
        else{
            if (!topL.equals("blank") && !topM.equals("blank") && !topR.equals("blank") && !midL.equals("blank") && !midM.equals("blank") && !midR.equals("blank") && !botL.equals("blank") && !botM.equals("blank") && !botR.equals("blank")){
                gamePane.setOpacity(.4);
                cover.setDisable(false);
                winner.setDisable(false);
                winner.setText("Draw!");
            }
        }
    }

    public void Won(){
        if(won.equals("x")){
            gamePane.setOpacity(.4);
            cover.setDisable(false);
            winner.setDisable(false);
            winner.setText("X wins!");
        }
        else{
            gamePane.setOpacity(.4);
            cover.setDisable(false);
            winner.setDisable(false);
            winner.setText("O Wins!");
        }
    }

    public void ClickTopL(){
        if(turn.equals("x")){
            if (topL.equals("blank")){
                topL = "x";
                topLeft.setImage(new Image("images/X.jpg"));
                CheckWon();
                if(won.equals("x") || won.equals("y")){
                    Won();
                }
                else{
                    turn = "y";
                }
            }
        }
        else{
            if (topL.equals("blank")){
                topL = "y";
                topLeft.setImage(new Image("images/O.jpg"));
                CheckWon();
                if(won.equals("x") || won.equals("y")){
                    Won();
                }
                else{
                    turn = "x";
                }
            }

        }
    }

    public void ClickTopM(){
        if(turn.equals("x")){
            if (topM.equals("blank")){
                topM = "x";
                topMid.setImage(new Image("images/X.jpg"));
                CheckWon();
                if(won.equals("x") || won.equals("y")){
                    Won();
                }
                else{
                    turn = "y";
                }
            }
        }
        else{
            if (topM.equals("blank")){
                topM = "y";
                topMid.setImage(new Image("images/O.jpg"));
                CheckWon();
                if(won.equals("x") || won.equals("y")){
                    Won();
                }
                else{
                    turn = "x";
                }
            }

        }
    }

    public void ClickTopR(){
        if(turn.equals("x")){
            if (topR.equals("blank")){
                topR = "x";
                topRight.setImage(new Image("images/X.jpg"));
                CheckWon();
                if(won.equals("x") || won.equals("y")){
                    Won();
                }
                else{
                    turn = "y";
                }
            }
        }
        else{
            if (topR.equals("blank")){
                topR = "y";
                topRight.setImage(new Image("images/O.jpg"));
                CheckWon();
                if(won.equals("x") || won.equals("y")){
                    Won();
                }
                else{
                    turn = "x";
                }
            }

        }
    }

    public void ClickMidL(){
        if(turn.equals("x")){
            if (midL.equals("blank")){
                midL = "x";
                midLeft.setImage(new Image("images/X.jpg"));
                CheckWon();
                if(won.equals("x") || won.equals("y")){
                    Won();
                }
                else{
                    turn = "y";
                }
            }
        }
        else{
            if (midL.equals("blank")){
                midL = "y";
                midLeft.setImage(new Image("images/O.jpg"));
                CheckWon();
                if(won.equals("x") || won.equals("y")){
                    Won();
                }
                else{
                    turn = "x";
                }
            }

        }
    }

    public void ClickMidM(){
        if(turn.equals("x")){
            if (midM.equals("blank")){
                midM = "x";
                midMid.setImage(new Image("images/X.jpg"));
                CheckWon();
                if(won.equals("x") || won.equals("y")){
                    Won();
                }
                else{
                    turn = "y";
                }
            }
        }
        else{
            if (midM.equals("blank")){
                midM = "y";
                midMid.setImage(new Image("images/O.jpg"));
                CheckWon();
                if(won.equals("x") || won.equals("y")){
                    Won();
                }
                else{
                    turn = "x";
                }
            }

        }
    }

    public void ClickMidR(){
        if(turn.equals("x")){
            if (midR.equals("blank")){
                midR = "x";
                midRight.setImage(new Image("images/X.jpg"));
                CheckWon();
                if(won.equals("x") || won.equals("y")){
                    Won();
                }
                else{
                    turn = "y";
                }
            }
        }
        else{
            if (midR.equals("blank")){
                midR = "y";
                midRight.setImage(new Image("images/O.jpg"));
                CheckWon();
                if(won.equals("x") || won.equals("y")){
                    Won();
                }
                else{
                    turn = "x";
                }
            }

        }
    }

    public void ClickBotL(){
        if(turn.equals("x")){
            if (botL.equals("blank")){
                botL = "x";
                botLeft.setImage(new Image("images/X.jpg"));
                CheckWon();
                if(won.equals("x") || won.equals("y")){
                    Won();
                }
                else{
                    turn = "y";
                }
            }
        }
        else{
            if (botL.equals("blank")){
                botL = "y";
                botLeft.setImage(new Image("images/O.jpg"));
                CheckWon();
                if(won.equals("x") || won.equals("y")){
                    Won();
                }
                else{
                    turn = "x";
                }
            }

        }
    }

    public void ClickBotM(){
        if(turn.equals("x")){
            if (botM.equals("blank")){
                botM = "x";
                botMid.setImage(new Image("images/X.jpg"));
                CheckWon();
                if(won.equals("x") || won.equals("y")){
                    Won();
                }
                else{
                    turn = "y";
                }
            }
        }
        else{
            if (botM.equals("blank")){
                botM = "y";
                botMid.setImage(new Image("images/O.jpg"));
                CheckWon();
                if(won.equals("x") || won.equals("y")){
                    Won();
                }
                else{
                    turn = "x";
                }
            }

        }

    }

    public void ClickBotR(){
        if(turn.equals("x")){
            if (botR.equals("blank")){
                botR = "x";
                botRight.setImage(new Image("images/X.jpg"));
                CheckWon();
                if(won.equals("x") || won.equals("y")){
                    Won();
                }
                else{
                    turn = "y";
                }
            }
        }
        else{
            if (botR.equals("blank")){
                botR = "y";
                botRight.setImage(new Image("images/O.jpg"));
                CheckWon();
                if(won.equals("x") || won.equals("y")){
                    Won();
                }
                else{
                    turn = "x";
                }
            }

        }
    }
}
