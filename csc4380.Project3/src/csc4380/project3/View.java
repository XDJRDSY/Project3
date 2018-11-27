/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc4380.project3;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.io.IOException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Justin
 */
public class View extends javax.swing.JFrame {
    
    int seatnum, movie;
    String custfname, custlname;
    JButton [] movies = new JButton[5];
    JButton [] movietimes = new JButton[10];
    JButton [][] seats = new JButton [5][10];
    /**
     * Creates new form View
     */
    public View(Model model) throws IOException {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((screen.getWidth() - getWidth()) /4.5);
        int y = (int) ((screen.getHeight() -getHeight()) /4.5);
        setLocation(x, y);
        
        this.setResizable(false);
        
       
        
        initComponents();
        
        
        showtimepanel.setVisible(false);          //sets the visibility of second panel to false until the user selects a movie
        seatpanel.setVisible(false);          //blocks visibility of seat selection panel until user chooses a movie time
        
        createMovieArray();
        
        seatpanel.setLayout(new java.awt.GridLayout(5, 10, 10, 10));
        genSeats();
        addSeats();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameDialog = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        firstName = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        confirmationDialog = new javax.swing.JDialog();
        fnLabel = new javax.swing.JLabel();
        lnLabel = new javax.swing.JLabel();
        tLabel = new javax.swing.JLabel();
        IDLabel = new javax.swing.JLabel();
        mLabel = new javax.swing.JLabel();
        sLabel = new javax.swing.JLabel();
        confirmationDialogTitle = new javax.swing.JLabel();
        fName = new javax.swing.JLabel();
        lName = new javax.swing.JLabel();
        movieTitle = new javax.swing.JLabel();
        timeSlot = new javax.swing.JLabel();
        transID = new javax.swing.JLabel();
        seat = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        moviepanel = new javax.swing.JPanel();
        movie4 = new javax.swing.JButton();
        movie1 = new javax.swing.JButton();
        movie2 = new javax.swing.JButton();
        movie3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        showtimepanel = new javax.swing.JPanel();
        seatpanel = new javax.swing.JPanel();

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Name:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name:");

        confirmButton.setBackground(new java.awt.Color(255, 255, 51));
        confirmButton.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        confirmButton.setText("Confirm");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout nameDialogLayout = new javax.swing.GroupLayout(nameDialog.getContentPane());
        nameDialog.getContentPane().setLayout(nameDialogLayout);
        nameDialogLayout.setHorizontalGroup(
            nameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        nameDialogLayout.setVerticalGroup(
            nameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        confirmationDialog.setBackground(new java.awt.Color(0, 0, 0));

        fnLabel.setBackground(new java.awt.Color(255, 255, 255));
        fnLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        fnLabel.setText("First Name:");

        lnLabel.setBackground(new java.awt.Color(255, 255, 255));
        lnLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lnLabel.setText("Last Name:");

        tLabel.setBackground(new java.awt.Color(255, 255, 255));
        tLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        tLabel.setText("Time:");

        IDLabel.setBackground(new java.awt.Color(255, 255, 255));
        IDLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        IDLabel.setText("Transacation ID:");

        mLabel.setBackground(new java.awt.Color(255, 255, 255));
        mLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        mLabel.setText("Movie:");

        sLabel.setBackground(new java.awt.Color(255, 255, 255));
        sLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        sLabel.setText("Seat:");

        confirmationDialogTitle.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        confirmationDialogTitle.setText("Confirmation Page:");

        fName.setBackground(new java.awt.Color(255, 255, 255));
        fName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        lName.setBackground(new java.awt.Color(255, 255, 255));
        lName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        movieTitle.setBackground(new java.awt.Color(255, 255, 255));
        movieTitle.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        timeSlot.setBackground(new java.awt.Color(255, 255, 255));
        timeSlot.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        transID.setBackground(new java.awt.Color(255, 255, 255));
        transID.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        seat.setBackground(new java.awt.Color(255, 255, 255));
        seat.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        javax.swing.GroupLayout confirmationDialogLayout = new javax.swing.GroupLayout(confirmationDialog.getContentPane());
        confirmationDialog.getContentPane().setLayout(confirmationDialogLayout);
        confirmationDialogLayout.setHorizontalGroup(
            confirmationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmationDialogLayout.createSequentialGroup()
                .addGroup(confirmationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(confirmationDialogLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(confirmationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(confirmationDialogLayout.createSequentialGroup()
                                .addComponent(mLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(movieTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(confirmationDialogLayout.createSequentialGroup()
                                .addComponent(lnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(confirmationDialogLayout.createSequentialGroup()
                                .addComponent(IDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(transID, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(confirmationDialogLayout.createSequentialGroup()
                                .addGroup(confirmationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(confirmationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(confirmationDialogLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(seat, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(timeSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(confirmationDialogLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(fnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmationDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmationDialogTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
        );
        confirmationDialogLayout.setVerticalGroup(
            confirmationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmationDialogLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(confirmationDialogTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(confirmationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(confirmationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movieTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeSlot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movie Manics!");
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        moviepanel.setBackground(new java.awt.Color(0, 0, 0));

        movie4.setText("Movie4");

        movie1.setText("Movie1");

        movie2.setText("Movie2");

        movie3.setText("Movie3");

        javax.swing.GroupLayout moviepanelLayout = new javax.swing.GroupLayout(moviepanel);
        moviepanel.setLayout(moviepanelLayout);
        moviepanelLayout.setHorizontalGroup(
            moviepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moviepanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(moviepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, moviepanelLayout.createSequentialGroup()
                        .addComponent(movie3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(movie4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, moviepanelLayout.createSequentialGroup()
                        .addComponent(movie1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(movie2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
        );
        moviepanelLayout.setVerticalGroup(
            moviepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moviepanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(moviepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movie2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movie1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(moviepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movie3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movie4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(moviepanel);
        jScrollPane1.setWheelScrollingEnabled(true);
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);

        showtimepanel.setBackground(new java.awt.Color(140, 0, 0));
        showtimepanel.setLayout(new javax.swing.BoxLayout(showtimepanel, javax.swing.BoxLayout.LINE_AXIS));
        showtimepanel.setLayout(new javax.swing.BoxLayout(showtimepanel, javax.swing.BoxLayout.Y_AXIS));    //changes the layout so that buttons display vertically instead of horizontally
        jScrollPane3.setViewportView(showtimepanel);
        jScrollPane3.setWheelScrollingEnabled(true);
        jScrollPane3.getVerticalScrollBar().setUnitIncrement(16);   //increase the distance the scroll bar moves

        seatpanel.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout seatpanelLayout = new javax.swing.GroupLayout(seatpanel);
        seatpanel.setLayout(seatpanelLayout);
        seatpanelLayout.setHorizontalGroup(
            seatpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1037, Short.MAX_VALUE)
        );
        seatpanelLayout.setVerticalGroup(
            seatpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(seatpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seatpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setHorizontalScrollBarPolicy(jScrollPane3.HORIZONTAL_SCROLLBAR_NEVER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void createMovieArray()
    {
        movies[0]=movie1;
        movies[1]=movie2;
        movies[2]=movie3;
        movies[3]=movie4;
       
    }
    
    //set the movie title for movie selection panel
    public void setMovieTitle(String title, int x)
    {
        movies[x-1].setFont(new java.awt.Font("Times New Roman", 1, 16));
        movies[x-1].setText(title);
    }
    
    public void addALMovie(ActionListener a)
    {
        for(int i=0; i<4; i++)
        {
            movies[i].addActionListener(a);
            movie = i+1;
        }
    }
    
    //returns which movie the customer clicked on
    public int getMovie()
    {
        return movie;
    }
    
    
    //sets the time selection panel vsibility to true
    public void showTimes()
    {
        showtimepanel.setVisible(true);
        showtimepanel.revalidate();
    }
    
    
    //this method adds the movie times button to the movietime panel. i indicates a button 1-10 to add and the time is a string
    public void addTimes(String time[])
    {
        showtimepanel.removeAll();
        showtimepanel.repaint();
        for(int i=0; i<time.length; i++)
        {
            movietimes[i] = new JButton();
            movietimes[i].setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
            movietimes[i].setPreferredSize(new java.awt.Dimension(478, 50));
            movietimes[i].setText(time[i]);
            movietimes[i].setVisible(true);
            showtimepanel.add(movietimes[i]);
        }
    }

    public void addTimeAL(ActionListener a)
    {
        for(int i=0; i<10; i++)
        {
            if(movietimes[i] != null)
                movietimes[i].addActionListener(a);
        }
    }
    
    
    //displays the seat panel
    public void showSeats(int[][] available)
    {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (available[i][j] == 1)
                    disableSeat(i,j);
                else
                    seats[i][j].setEnabled(true);
            }
        }
        seatpanel.setVisible(true);
    }
    
    
    //generates seats stored in 5x10 array
    public void genSeats()
    {
        char c = 'A';
        
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<10;j++)
            {
                seats[i][j] = new JButton(Character.toString(c)+Integer.toString(j+1));
            }
            c++;
        }
    }
    
    public void disableSeat(int i, int j)
    {
        seats[i][j].setEnabled(false);
    }
    
    //this adds an action listener to the seat buttons. control will respond to this
    public void addALSeats(ActionListener a)
    {
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<10;j++)
            {
                seats[i][j].addActionListener(a);
            }
        }
    }
    
    //adds the seats to the panel
    public void addSeats()
    {
        seatpanel.removeAll();
        seatpanel.revalidate();
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<10;j++)
            {
                seatpanel.add(seats[i][j]);
            }
        }
    }
    
    //this method should be called from control when the seat button is clicked. opens a dialog and asks the user for first and last name
    public void checkout()
    {
        nameDialog.setTitle("Confirmation");
        nameDialog.setLocationRelativeTo(null);
        nameDialog.setPreferredSize(new Dimension(555,414));
        nameDialog.pack();
        nameDialog.setVisible(true);
    }
    
    public void addConfirmAL(ActionListener a)
    {
        confirmButton.addActionListener(a);
        custfname = firstName.getText();
        custlname = lastName.getText();
        
    }
   
    //return customer first name
    public String getfName()
    {
        return custfname;
    }
    
    //return customer last name
    public String getlName()
    {
        return custlname;
    }
    
    
    public void showConfirmation(String fname, String lname, String movie, String time, String chair, String transaction)
    {
        fName.setText(fname);
        lName.setText(lname);
        movieTitle.setText(movie);
        timeSlot.setText(time);
        seat.setText(chair);
        transID.setText(transaction);
        confirmationDialog.pack();
        confirmationDialog.setVisible(true);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDLabel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JDialog confirmationDialog;
    private javax.swing.JLabel confirmationDialogTitle;
    private javax.swing.JLabel fName;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel fnLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lName;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel lnLabel;
    private javax.swing.JLabel mLabel;
    public javax.swing.JButton movie1;
    public javax.swing.JButton movie2;
    public javax.swing.JButton movie3;
    public javax.swing.JButton movie4;
    private javax.swing.JLabel movieTitle;
    private javax.swing.JPanel moviepanel;
    private javax.swing.JDialog nameDialog;
    private javax.swing.JLabel sLabel;
    private javax.swing.JLabel seat;
    private javax.swing.JPanel seatpanel;
    private javax.swing.JPanel showtimepanel;
    private javax.swing.JLabel tLabel;
    private javax.swing.JLabel timeSlot;
    private javax.swing.JLabel transID;
    // End of variables declaration//GEN-END:variables
}
