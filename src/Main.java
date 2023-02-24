import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static int stonksvolue = 0;
    public static boolean groupmeme = true;
    public static boolean B1Press = false;
    public static boolean B2Press = false;
    public static boolean B3Press = false;
    public static boolean B4Press = false;
    public static boolean B5Press = false;
    public static boolean B6Press = false;
    public static boolean B7Press = false;
    public static boolean B8Press = false;
    public static boolean B9Press = false;
    public static boolean B1NPress = false;
    public static boolean B2NPress = false;
    public static boolean B3NPress = false;
    public static boolean B4NPress = false;
    public static boolean B5NPress = false;
    public static boolean B6NPress = false;
    public static boolean B7NPress = false;
    public static boolean B8NPress = false;
    public static boolean B9NPress = false;
    public static JLabel activplayer1 = new JLabel();
    public static JLabel activplayer2 = new JLabel();
    public static JLabel CreditsLabel = new JLabel();
    public static JButton button1 = new JButton();
    public static JButton button2 = new JButton();
    public static JButton button3 = new JButton();
    public static JButton button4 = new JButton();
    public static JButton button5 = new JButton();
    public static JButton button6 = new JButton();
    public static JButton button7 = new JButton();
    public static JButton button8 = new JButton();
    public static JButton button9 = new JButton();

    public static void main(String[] args) throws IOException {

        JFrame mainframe = new JFrame("Tic Tac Toe");
        JFrame creditsfield = new JFrame();
        JButton reloadbutton = new JButton();
        JButton credits = new JButton("Credits");
        JButton closecredits = new JButton("x");
        JLabel gamename = new JLabel();

        mainframe.setSize(445,700);
        mainframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainframe.getContentPane().setBackground(Color.BLACK);
        mainframe.setLocationRelativeTo(null);
        mainframe.setFocusable(true);
        mainframe.setResizable(true);
        mainframe.setLayout(null);

        creditsfield.setSize(445,410);
        creditsfield.getContentPane().setBackground(Color.BLACK);
        creditsfield.setLocationRelativeTo(null);
        creditsfield.setFocusable(true);
        creditsfield.setResizable(true);
        creditsfield.setLayout(null);

        closecredits.setBackground(Color.black);
        closecredits.setFont(new Font("Arial",Font.PLAIN, 50));
        closecredits.setForeground(Color.WHITE);
        closecredits.setBorder(new LineBorder(Color.white));
        closecredits.setBounds(360, 310, 50, 50);

        credits.setBackground(Color.black);
        credits.setFont(new Font("Arial",Font.PLAIN, 28));
        credits.setForeground(Color.WHITE);
        credits.setBorder(new LineBorder(Color.white));
        credits.setBounds(220, 590, 190, 60);
        credits.addActionListener(e -> {
            creditsfield.setVisible(true);
            creditsfield.add(closecredits);
            closecredits.addActionListener(e1 -> {
                creditsfield.setVisible(false);
            });
            CreditsLabel.setBounds(20, 20, 390, 280);
            CreditsLabel.setBackground(Color.BLACK);
            CreditsLabel.setBorder(new LineBorder(Color.white));
            creditsfield.add(CreditsLabel);
            if(groupmeme) {
                try {
                    CreditsLabel.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/cedits1 (2).jpg")), 390, 280)));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            else {
                try {
                    CreditsLabel.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/cedits2 (1).jpg")), 390, 280)));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        reloadbutton.setBackground(Color.black);
        reloadbutton.setBorder(new LineBorder(Color.white));
        reloadbutton.setBounds(20, 590, 190, 60);
        reloadbutton.setIcon(new ImageIcon(ImageIO.read(new File("Pictures/Reload weiß.png"))));
        reloadbutton.addActionListener(e -> {
            reload();
        });

        playerProfile();

        gamename.setBounds(20, 20,390,80);
        gamename.setBackground(Color.BLACK);
        gamename.setBorder(new LineBorder(Color.BLACK));
        gamename.setIcon(new ImageIcon(ImageIO.read(new File("Pictures/TIC TAC TOE.png"))));

        button1.setBackground(Color.black);
        button1.setBorder(new LineBorder(Color.white));
        button1.setBounds(20,120,130,130);
        button1.addActionListener(e -> {
            if(B1Press || B1NPress) {

            }
            else {
                if (stonksvolue < 10) {
                    if (groupmeme == true) {
                        try {
                            button1.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/Stonks.jpg")), 130, 130)));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    if (groupmeme == false) {
                        try {
                            button1.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/NotStongs.jpg")), 130, 130)));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    if (groupmeme) {
                        groupmeme = false;
                        B1Press = true;
                    } else {
                        groupmeme = true;
                        B1NPress = true;
                    }
                    stonksvolue = stonksvolue + 1;
                    playerProfile();
                    BPress();
                }
            }
        });
        button2.setBackground(Color.black);
        button2.setBorder(new LineBorder(Color.white));
        button2.setBounds(150,120,130,130);
        button2.addActionListener(e -> {
            if(B2Press || B2NPress) {

            }
            else {
                if (stonksvolue < 10) {
                    if (groupmeme == true) {
                        try {
                            button2.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/Stonks.jpg")), 130, 130)));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    if (groupmeme == false) {
                        try {
                            button2.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/NotStongs.jpg")), 130, 130)));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    if (groupmeme) {
                        groupmeme = false;
                        B2Press = true;
                    } else {
                        groupmeme = true;
                        B2NPress = true;
                    }
                    stonksvolue = stonksvolue + 1;
                    playerProfile();
                    BPress();
                }
            }
        });
        button3.setBackground(Color.black);
        button3.setBorder(new LineBorder(Color.white));
        button3.setBounds(280,120,130,130);
        button3.addActionListener(e -> {
            if(B3Press || B3NPress) {

            }
            else {
                if (stonksvolue < 10) {
                    if (groupmeme == true) {
                        try {
                            button3.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/Stonks.jpg")), 130, 130)));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    if (groupmeme == false) {
                        try {
                            button3.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/NotStongs.jpg")), 130, 130)));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    if (groupmeme) {
                        groupmeme = false;
                        B3Press = true;
                    } else {
                        groupmeme = true;
                        B3NPress = true;
                    }
                    stonksvolue = stonksvolue + 1;
                    playerProfile();
                    BPress();
                }
            }
        });
        button4.setBackground(Color.black);
        button4.setBorder(new LineBorder(Color.white));
        button4.setBounds(20,250,130,130);
        button4.addActionListener(e -> {
            if(B4Press || B4NPress) {

            }
            else {
                if (stonksvolue < 10) {
                    if (groupmeme == true) {
                        try {
                            button4.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/Stonks.jpg")), 130, 130)));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    if (groupmeme == false) {
                        try {
                            button4.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/NotStongs.jpg")), 130, 130)));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    if (groupmeme) {
                        groupmeme = false;
                        B4Press = true;
                    } else {
                        groupmeme = true;
                        B4NPress = true;
                    }
                    stonksvolue = stonksvolue + 1;
                    playerProfile();
                    BPress();
                }
            }
        });
        button5.setBackground(Color.black);
        button5.setBorder(new LineBorder(Color.white));
        button5.setBounds(150,250,130,130);
        button5.addActionListener(e -> {
            if(B5Press || B5NPress) {

            }
            else {
                if (stonksvolue < 10) {
                    if (groupmeme == true) {
                        try {
                            button5.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/Stonks.jpg")), 130, 130)));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    if (groupmeme == false) {
                        try {
                            button5.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/NotStongs.jpg")), 130, 130)));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    if (groupmeme) {
                        groupmeme = false;
                        B5Press = true;
                    } else {
                        groupmeme = true;
                        B5NPress = true;
                    }
                    stonksvolue = stonksvolue + 1;
                    playerProfile();
                    BPress();
                }
            }
        });
        button6.setBackground(Color.black);
        button6.setBorder(new LineBorder(Color.white));
        button6.setBounds(280,250,130,130);
        button6.addActionListener(e -> {
            if(B6Press || B6NPress) {

            }
            else {
                if (stonksvolue < 10) {
                    if (groupmeme == true) {
                        try {
                            button6.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/Stonks.jpg")), 130, 130)));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    if (groupmeme == false) {
                        try {
                            button6.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/NotStongs.jpg")), 130, 130)));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    if (groupmeme) {
                        groupmeme = false;
                        B6Press = true;
                    } else {
                        groupmeme = true;
                        B6NPress = true;
                    }
                    stonksvolue = stonksvolue + 1;
                    playerProfile();
                    BPress();
                }
            }
        });
        button7.setBackground(Color.black);
        button7.setBorder(new LineBorder(Color.white));
        button7.setBounds(20,380,130,130);
        button7.addActionListener(e -> {
            if(B7Press || B7NPress) {

            }
            else {
                if (stonksvolue < 10) {
                    if (groupmeme == true) {
                        try {
                            button7.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/Stonks.jpg")), 130, 130)));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    if (groupmeme == false) {
                        try {
                            button7.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/NotStongs.jpg")), 130, 130)));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    if (groupmeme) {
                        groupmeme = false;
                        B7Press = true;
                    } else {
                        groupmeme = true;
                        B7NPress = true;
                    }
                    stonksvolue = stonksvolue + 1;
                    playerProfile();
                    BPress();
                }
            }
        });
        button8.setBackground(Color.black);
        button8.setBorder(new LineBorder(Color.white));
        button8.setBounds(150,380,130,130);
        button8.addActionListener(e -> {
            if(B8Press || B8NPress) {

            }
            else {
                if (stonksvolue < 10) {
                    if (groupmeme == true) {
                        try {
                            button8.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/Stonks.jpg")), 130, 130)));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    if (groupmeme == false) {
                        try {
                            button8.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/NotStongs.jpg")), 130, 130)));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    if (groupmeme) {
                        groupmeme = false;
                        B8Press = true;
                    } else {
                        groupmeme = true;
                        B8NPress = true;
                    }
                    stonksvolue = stonksvolue + 1;
                    playerProfile();
                    BPress();
                }
            }
        });
        button9.setBackground(Color.black);
        button9.setBorder(new LineBorder(Color.white));
        button9.setBounds(280,380,130,130);
        button9.addActionListener(e -> {
            if(B9Press || B9NPress) {

            }
            else {
                if (stonksvolue < 10) {
                    if (groupmeme == true) {
                        try {
                            button9.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/Stonks.jpg")), 130, 130)));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    if (groupmeme == false) {
                        try {
                            button9.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/NotStongs.jpg")), 130, 130)));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    if (groupmeme) {
                        groupmeme = false;
                        B9Press = true;
                    } else {
                        groupmeme = true;
                        B9NPress = true;
                    }
                    stonksvolue = stonksvolue + 1;
                    playerProfile();
                    BPress();
                }
            }
        });

        mainframe.add(credits);
        mainframe.add(reloadbutton);
        mainframe.add(activplayer1);
        mainframe.add(activplayer2);
        mainframe.add(button1);
        mainframe.add(button2);
        mainframe.add(button3);
        mainframe.add(button4);
        mainframe.add(button5);
        mainframe.add(button6);
        mainframe.add(button7);
        mainframe.add(button8);
        mainframe.add(button9);
        mainframe.add(gamename);
        activplayer1.setVisible(true);
        activplayer2.setVisible(true);
        gamename.setVisible(true);
        mainframe.setVisible(true);

    }
    public static void playerProfile() {
        activplayer1.setBounds(20, 520, 190, 60);
        activplayer1.setBackground(Color.BLACK);
        activplayer1.setBorder(new LineBorder(Color.white));
        if (groupmeme) {
            try {
                activplayer1.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/PlayerStonksActive.png")), 190, 60)));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            try {
                activplayer1.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/PlayerStonksPasive.png")), 190, 60)));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (groupmeme) {
            activplayer2.setBounds(220, 520, 190, 60);
            activplayer2.setBackground(Color.BLACK);
            activplayer2.setBorder(new LineBorder(Color.white));
            try {
                activplayer2.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/PlayerNotStonksPassive.png")), 190, 60)));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            try {
                activplayer2.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/PlayerNotStonksActive.png")), 190, 60)));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void BPress() {
        if(groupmeme == false) {
            if((B1Press == true && B2Press == true && B3Press == true) || (B4Press == true && B5Press == true && B6Press == true) || (B7Press == true && B8Press == true && B9Press == true) || (B1Press == true && B4Press == true && B7Press == true) || (B2Press == true && B5Press == true && B8Press == true) || (B3Press == true && B6Press == true && B9Press == true) || (B1Press == true && B5Press == true && B9Press == true) || (B3Press == true && B5Press == true && B7Press == true)) {
                stonksvolue = stonksvolue + 10;
                try {
                    activplayer1.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/PlayerStonksCROWN.png")),190,60)));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {
                    activplayer2.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/PlayerNotStonksLos.png")),190,60)));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        }
        if(groupmeme == true) {
            if((B1NPress == true && B2NPress == true && B3NPress == true) || (B4NPress == true && B5NPress == true && B6NPress == true) || (B7NPress == true && B8NPress == true && B9NPress == true) || (B1NPress == true && B4NPress == true && B7NPress == true) || (B2NPress == true && B5NPress == true && B8NPress == true) || (B3NPress == true && B6NPress == true && B9NPress == true) || (B1NPress == true && B5NPress == true && B9NPress == true) || (B3NPress == true && B5NPress == true && B7NPress == true)) {
                stonksvolue = stonksvolue + 10;
                try {
                    activplayer2.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/PlayerNotStonksCROWN.png")),190,60)));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {
                    activplayer1.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/PlayerStonksLoss.png")),190,60)));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public static void reload() {
        try {
            button1.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/nichts.png")), 130, 130)));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            button2.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/nichts.png")), 130, 130)));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            button3.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/nichts.png")), 130, 130)));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            button4.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/nichts.png")), 130, 130)));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            button5.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/nichts.png")), 130, 130)));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            button6.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/nichts.png")), 130, 130)));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            button7.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/nichts.png")), 130, 130)));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            button8.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/nichts.png")), 130, 130)));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            button9.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/nichts.png")), 130, 130)));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            activplayer1.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/PlayerStonksActive.png")),190,60)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            activplayer2.setIcon(new ImageIcon(resizeImage(ImageIO.read(new File("Pictures/PlayerNotStonksPassive.png")),190,60)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        B1Press = false;
        B1NPress = false;
        B2Press = false;
        B2NPress = false;
        B3Press = false;
        B3NPress = false;
        B4Press = false;
        B4NPress = false;
        B5Press = false;
        B5NPress = false;
        B6Press = false;
        B6NPress = false;
        B7Press = false;
        B7NPress = false;
        B8Press = false;
        B8NPress = false;
        B9Press = false;
        B9NPress = false;


        stonksvolue = stonksvolue - stonksvolue;
    }
    public static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) throws IOException {
        BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = resizedImage.createGraphics();
        graphics2D.drawImage(originalImage, 0, 0, targetWidth, targetHeight, null);
        graphics2D.dispose();
        return resizedImage;
    }
}
