import java.util.*;
import java.awt.*;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author t00618738
 */
public class Photo {
private String photo_title;
private int imageX;
private int imageY;
private Image photo_image;
private double scaleX = 1.0;
private double scaleY = 1.0;


    /**
     *
     * @param phototitle
     */
public Photo(String phototitle){

if (null != phototitle)// bunch of IF statements here
    switch (phototitle) {
        case "Background 1":{
            URL imgUrl = Application.class.getResource("images/background_room_1.png");
            ImageIcon imgIcon = new ImageIcon(imgUrl);
            photo_image = imgIcon.getImage();
            photo_title = "Background 1";
                break;
            }
        case "Background 2":{
            URL imgUrl = Application.class.getResource("images/background_room_3.jpg");
            ImageIcon imgIcon = new ImageIcon(imgUrl);
            photo_image = imgIcon.getImage();
            photo_title = "Background 2";
                break;
            }
        case "Bed":{
            URL imgUrl = Application.class.getResource("images/Bed.png");
            ImageIcon imgIcon = new ImageIcon(imgUrl);
            photo_image = imgIcon.getImage();
            photo_title = "Bed";
                break;
            }
        case "Chair":{
            URL imgUrl = Application.class.getResource("images/chair.png");
            ImageIcon imgIcon = new ImageIcon(imgUrl);
            photo_image = imgIcon.getImage();
            photo_title = "Chair";
                break;
            }
        case "Chair 2":{
            URL imgUrl = Application.class.getResource("images/char_2.png");
            ImageIcon imgIcon = new ImageIcon(imgUrl);
            photo_image = imgIcon.getImage();
            photo_title = "Chair 2";
                break;
            }
        case "Desk":{
            URL imgUrl = Application.class.getResource("images/desk.png");
            ImageIcon imgIcon = new ImageIcon(imgUrl);
            photo_image = imgIcon.getImage();
            photo_title = "Desk";
                break;
            }
        case "Dining Table":{
            URL imgUrl = Application.class.getResource("images/dining_table.png");
            ImageIcon imgIcon = new ImageIcon(imgUrl);
            photo_image = imgIcon.getImage();
            photo_title = "Dining Table";
                break;
            }
        case "Dog":{
            URL imgUrl = Application.class.getResource("images/dog.png");
            ImageIcon imgIcon = new ImageIcon(imgUrl);
            photo_image = imgIcon.getImage();
            photo_title = "Dog";
                break;
            }
        case "Lamp":{
            URL imgUrl = Application.class.getResource("images/lamp.png");
            ImageIcon imgIcon = new ImageIcon(imgUrl);
            photo_image = imgIcon.getImage();
            photo_title = "Lamp";
                break;
            }
        case "Lamp 2":{
            URL imgUrl = Application.class.getResource("images/lamp_2.png");
            ImageIcon imgIcon = new ImageIcon(imgUrl);
            photo_image = imgIcon.getImage();
            photo_title = "Lamp 2";
                break;
            }
        case "Plant":{
            URL imgUrl = Application.class.getResource("images/plant.png");
            ImageIcon imgIcon = new ImageIcon(imgUrl);
            photo_image = imgIcon.getImage();
            photo_title = "Plant 1";
                break;
            }
        case "Plant 2":{
            URL imgUrl = Application.class.getResource("images/plant_2.png");
            ImageIcon imgIcon = new ImageIcon(imgUrl);
            photo_image = imgIcon.getImage();
            photo_title = "Plant 2";
                break;
            }
        case "Table":{
            URL imgUrl = Application.class.getResource("images/table.png");
            ImageIcon imgIcon = new ImageIcon(imgUrl);
            photo_image = imgIcon.getImage();
            photo_title = "Table";
                break;
            }
        default:
            break;
    }
}    
public String getPhoto(){
    return photo_title;
}
public void displayPhoto(Graphics g){
    g.drawImage(photo_image, imageX, imageY, ((int)(photo_image.getWidth(null)*scaleX)), ((int)(photo_image.getHeight(null)*scaleY)), null);  
}
public void setImageX(int x){
    imageX = x;
}
public void setImageY(int y){
     imageY = y;
}

public int returnheight(){
    return photo_image.getHeight(null);
}
public int returnwidth(){
    return photo_image.getWidth(null);
}

public int getImageX(){
    return imageX;
}
public int getImageY(){
    return imageY;
}
}

