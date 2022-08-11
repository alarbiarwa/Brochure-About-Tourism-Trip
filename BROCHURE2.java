/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brochure2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author arwaelarabi
 */
public class BROCHURE2 extends Application {
    
    @Override
    public void start(Stage stage) {
//        الدائرة الكبيرة تمام
     Circle circle = new Circle();
     circle.setCenterX(150); 
     circle.setCenterY(400);
     circle.setRadius(70);
     circle.setStroke(Color.LIGHTSLATEGREY); 
     circle.setStrokeWidth(5);
     circle.setFill(Color.DARKBLUE); 
     Image image_b = new Image("https://almalomat.com/wp-content/uploads/2019/03/10sD8tT.jpg"); 
     ImagePattern radialGradient_b = new ImagePattern(image_b); 
     circle.setFill(radialGradient_b); 
     
//     الدائرة الوسط تمام
     Circle circleA = new Circle();
     circleA.setCenterX(269); 
     circleA.setCenterY(360);
     circleA.setRadius(50);
     circleA.setStroke(Color.LIGHTSLATEGREY);
     circleA.setStrokeWidth(5);
//     circleA.centerYProperty();
//     circleA.centerXProperty();
     Image image = new Image("https://ia.eferrit.com/ia/310a88211940384d-1024x682.jpg"); 
     ImagePattern radialGradient = new ImagePattern(image); 
     circleA.setFill(radialGradient); 
     
//     الدائرة الاصغر تمام
     Circle circleB = new Circle();
     circleB.setCenterX(350); 
     circleB.setCenterY(335);
     circleB.setRadius(30);
     circleB.setStroke(Color.LIGHTSLATEGREY);
     circleB.setStrokeWidth(3);
     Image image_B = new Image("https://www.nature-and-garden.com/wp-content/uploads/sites/4/2017/10/japanese-garden.jpg"); 
     ImagePattern radialGradient_B = new ImagePattern(image_B); 
     circleB.setFill(radialGradient_B); 
     
//             البيضاوي يصورة تمام
      Ellipse ellipse1 = new Ellipse(); 
      ellipse1.setCenterX(330.0f); 
      ellipse1.setCenterY(800.0f); 
      ellipse1.setRadiusX(400.0f); 
      ellipse1.setRadiusY(450.0f); 
      ellipse1.setStroke(Color.LIGHTSLATEGREY); 
//      ellipse1.setFill(Color.DARKTURQUOISE); 
      ellipse1.setStrokeWidth(8);
     Image image_a = new Image("https://i2.wp.com/www.ar-traveler.com/wp-content/uploads/2016/09/%D9%83%D9%8A%D9%88%D8%AA%D9%88-%D8%A7%D9%84%D9%8A%D8%A7%D8%A8%D8%A7%D9%86-Kyoto.jpg?resize=564%2C896&ssl=1"); 
     ImagePattern radialGradient2 = new ImagePattern(image_a); 
     ellipse1.setFill(radialGradient2); 
     
//     البيضاوي اللي فوق:تمام
      Ellipse ellipse = new Ellipse(); 
      ellipse.setCenterX(150.0f); 
      ellipse.setCenterY(90.0f); 
      ellipse.setRadiusX(300.0f); 
      ellipse.setRadiusY(300.0f); 
      ellipse.setStroke(Color.LIGHTSLATEGREY); 
      ellipse.setFill(Color.WHITE); 
      ellipse.setStrokeWidth(8);
       String link2 = "https://image.shutterstock.com/image-illustration/illustration-blue-airplane-icon-260nw-509805037.jpg" ; 
      Image image8 = new Image(link2); 
      ImagePattern radialGradient4 = new ImagePattern(image8, 20, 20, 40, 40, false); 
       ellipse.setFill(radialGradient4); 
      
         
      
//      النص تمام
      Text text = new Text(); 
         text.setText("Fantastic tour in Japan "); 
         text.setX(38); 
         text.setY(35); 
//         text.setFill(Color.BLACK); 
//         text.setFont(Font.loadFont("file:resources/fonts/isadoracyr.ttf", 120));
        text.setFont(Font.font("Calabri", FontWeight.BOLD, FontPosture.REGULAR, 35));
            text.setFill(Color.BLACK);
            text.setStrokeWidth(2);
//           text.setStyle("-fx-font-size: 30px");
            text.setStroke(Color.BLACK);
            text.setUnderline(false);
            text.setStrikethrough(false);
      DropShadow shadow =new DropShadow();
      shadow.setOffsetX(10);
      shadow.setOffsetY(10);
      shadow.setColor(Color.LIGHTSLATEGREY);
      text.setEffect(shadow);
      
//      الطيارة تمام
Image image7 = new Image("https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/120/apple/285/airplane_2708-fe0f.png");
ImageView imageView = new ImageView(image7);
imageView.setX(10);
imageView.setY(460);
imageView.setFitHeight(60); 
imageView.setFitWidth(60);
imageView.setPreserveRatio(true);

     
//     المستطيل اليمن
          Rectangle rectangle = new Rectangle();
          rectangle.setX(210);
          rectangle.setY(90);
          rectangle.setWidth(150);
          rectangle.setHeight(200);
          rectangle.setFill(Color.SKYBLUE);
          rectangle.setStroke(Color.LIGHTSLATEGREY);
          rectangle.setStrokeWidth(3);
//          String link1 = "https://encrypted-tbn1.gstatic.com" 
//         + "/images?q=tbn:ANd9GcRQub4GvEezKMsiIf67U" 
//         + "rOxSzQuQ9zl5ysnjRn87VOC8tAdgmAJjcwZ2qM"; 
//      Image image6 = new Image(link1); 
//      ImagePattern radialGradient5 = new ImagePattern(image6, 20, 20, 40, 40, false); 
//       ellipse.setFill(radialGradient5); 


//  المستطيل الشمال
          Rectangle rectangle_a = new Rectangle();
          rectangle_a.setX(40); //Setting the Properties of the Rectangle
          rectangle_a.setY(90);
          rectangle_a.setWidth(150);
          rectangle_a.setHeight(200);
          rectangle_a.setFill(Color.SKYBLUE);
          rectangle_a.setStroke(Color.LIGHTSLATEGREY);
          rectangle_a.setStrokeWidth(3);
          

//الخط اليمين
          Line line_R = new Line();
          line_R.setStartX(220.0f); 
          line_R.setStartY(130.0f);
          line_R.setEndX(350.0f);
          line_R.setEndY(130.0f);
           line_R.setStroke(Color.LIGHTSLATEGREY);
          line_R.setStrokeWidth(3);
          DropShadow shadow1 =new DropShadow();
      shadow1.setOffsetX(10);
      shadow1.setOffsetY(10);
      shadow1.setColor(Color.LIGHTSLATEGREY);
      line_R.setEffect(shadow1);
          

//الخط الشمال
  Line line_l = new Line();
          line_l.setStartX(50.0f); 
          line_l.setStartY(130.0f);
          line_l.setEndX(180.0f);
          line_l.setEndY(130.0f);
          line_l.setStroke(Color.LIGHTSLATEGREY);
         line_l.setStrokeWidth(3);  
 DropShadow shadow2 =new DropShadow();
      shadow2.setOffsetX(10);
      shadow2.setOffsetY(10);
      shadow2.setColor(Color.LIGHTSLATEGREY);
      line_l.setEffect(shadow2);

//الكلام على اليمين
      
      Text text_a = new Text(); 
         text_a.setText("Offerings\n"); 
         text_a.setX(260); 
         text_a.setY(115); 
//         text.setFill(Color.BLACK); 
//         text.setFont(Font.loadFont("file:resources/fonts/isadoracyr.ttf", 120));
        text_a.setFont(Font.font("Calabri", FontWeight.BOLD, FontPosture.REGULAR, 12));
            text_a.setFill(Color.PALEVIOLETRED);
            text_a.setStrokeWidth(1);
//           text.setStyle("-fx-font-size: 30px");
            text_a.setStroke(Color.PALEVIOLETRED);
            text_a.setUnderline(false);
            text_a.setStrikethrough(false);
      
     
      //الكلام على الشمال
      
       Text text_b = new Text(); 
         text_b.setText("Why Choose Us ?\n"); 
         text_b.setX(60); 
         text_b.setY(115); 
//         text.setFill(Color.BLACK); 
//         text.setFont(Font.loadFont("file:resources/fonts/isadoracyr.ttf", 120));
        text_b.setFont(Font.font("Calabri", FontWeight.BOLD, FontPosture.REGULAR, 12));
            text_b.setFill(Color.PALEVIOLETRED);
            text_b.setStrokeWidth(1);
//           text.setStyle("-fx-font-size: 30px");
            text_b.setStroke(Color.PALEVIOLETRED);
            text_b.setUnderline(false);
            text_b.setStrikethrough(false);
      
      
//            التعداد على اليسار
      Text text_c = new Text(); 
         text_c.setText("\n\n\n.Provides customized\n\n.holiday packages\n\n.Add text here\n\n.Add text here \n\n.Add text here "); 
         text_c.setX(44); 
         text_c.setY(115); 
//         text.setFill(Color.BLACK); 
//         text.setFont(Font.loadFont("file:resources/fonts/isadoracyr.ttf", 120));
        text_c.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12));
            text_c.setFill(Color.BLACK);
            text_c.setStrokeWidth(0.5);
//           text.setStyle("-fx-font-size: 30px");
            text_c.setStroke(Color.BLACK);
            text_c.setUnderline(false);
            text_c.setStrikethrough(false);
//      
//      التعداد على اليمين
      Text text_d = new Text(); 
         text_d.setText("\n\nHotel Stay \n\nFlights \n\nFood \n\nWifi"); 
         text_d.setX(260); 
         text_d.setY(138); 
//         text.setFill(Color.BLACK); 
//         text.setFont(Font.loadFont("file:resources/fonts/isadoracyr.ttf", 120));
        text_d.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12));
            text_d.setFill(Color.BLACK);
            text_d.setStrokeWidth(0.5);
//           text.setStyle("-fx-font-size: 30px");
            text_d.setStroke(Color.BLACK);
            text_d.setUnderline(false);
            text_d.setStrikethrough(false);
            
            
            
            Text text_g = new Text(); 
         text_g.setText("By: Arwa Magdy"); 
         text_g.setX(217); 
         text_g.setY(285); 
//         text.setFill(Color.BLACK); 
//         text.setFont(Font.loadFont("file:resources/fonts/isadoracyr.ttf", 120));
        text_g.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12));
            text_g.setFill(Color.YELLOW);
            text_g.setStrokeWidth(0.1);
//           text.setStyle("-fx-font-size: 30px");
            text_g.setStroke(Color.YELLOW);
            text_g.setUnderline(false);
            text_g.setStrikethrough(false);
      
      //الصور على اليمين
            
      Image image9 = new Image("https://freepngimg.com/thumb/hotel/33311-6-hotel-transparent-background.png");
ImageView imageView9 = new ImageView(image9);
imageView9.setX(220);
imageView9.setY(143);
imageView9.setFitHeight(30); 
imageView9.setFitWidth(30);
imageView9.setPreserveRatio(true);

Image image10 = new Image("https://www.pngkey.com/png/full/131-1313525_airplane-icon-images-transparent-background-aeroplane-icon.png");
ImageView imageView10 = new ImageView(image10);
imageView10.setX(220);
imageView10.setY(175);
imageView10.setFitHeight(25); 
imageView10.setFitWidth(25);
imageView10.setPreserveRatio(true);
//
//
Image image11 = new Image("https://www.pinclipart.com/picdir/big/56-568144_our-specialities-transparent-transparent-background-food-icon-png.png");
ImageView imageView11 = new ImageView(image11);
imageView11.setX(220);
imageView11.setY(210);
imageView11.setFitHeight(25); 
imageView11.setFitWidth(25);
imageView11.setPreserveRatio(true);


Image image12 = new Image("https://www.pngkey.com/png/full/274-2748155_wifi-icon-bandwidth-icon-png.png");
ImageView imageView12 = new ImageView(image12);
imageView12.setX(220);
imageView12.setY(240);
imageView12.setFitHeight(25); 
imageView12.setFitWidth(25);
imageView12.setPreserveRatio(true);







     

         Group root = new Group(ellipse,ellipse1,circleA,circle,circleB,imageView,rectangle,rectangle_a,text,line_l,line_R,text_a,text_b,text_c,text_d,imageView9,imageView10,imageView11,imageView12,text_g); 
        Scene scene = new Scene(root, 400, 600);
       
         
        
        stage.setTitle("Brochure About Tourism Trip");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
