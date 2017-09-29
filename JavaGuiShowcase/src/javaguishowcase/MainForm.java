/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguishowcase;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This is a JFrame subclass, so it can by definition be shown to the user.
 * @author Stuart
 */
public class MainForm extends JFrame {    
    private Container contentPane;   
    JPanel borderLayoutPanel = new JPanel();
    JPanel flowLayoutPanel = new JPanel();
    JPanel gridLayoutPanel = new JPanel();
    
    private ArrayList<JPanel> layoutContainers = new ArrayList<JPanel>();
    public MainForm()
    {
        // The first thing we want to do when this object is constructed is to
        // set up the form's title and size, right off the bat
        this.setTitle( "Layout Demonstration" );
        this.setSize( 1000, 125 );
        
        // Lets also add some controls to this form's contentPane.
        contentPane = this.getContentPane();
        
        // Lets also, right off the bat, enforce that this form's content pane
        // will use the FlowLayoutPanel layout manager.
        this.setLayout( new FlowLayout() );
        
        // Dont let this form resize by default.
        this.setResizable( false );
        
        // We need this, because without it the closing the application from 
        // say the top right X just closes the form but does not end the process
        // This ends the process on form close.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // This form will have multiple areas on it, each area represented by a JPanel
        // which will contain a diffirent layout manager to demonstrate each layout manager.
        
        
        borderLayoutPanel.setLayout( new BorderLayout() );   
        addControlsToBorderLayoutPanel( borderLayoutPanel );
        
        flowLayoutPanel.setLayout( new FlowLayout() );
        addControlsToFlowLayoutPanel( flowLayoutPanel );
        
        gridLayoutPanel.setLayout( new GridLayout(3,2) );
        addControlsToGridLayoutPanel(gridLayoutPanel);
        
            
        
        // Ok, lets add the showcase of controls to this form, also at construction time
        
        contentPane.add( borderLayoutPanel );
        contentPane.add( flowLayoutPanel );
        contentPane.add( gridLayoutPanel );
        
    }
    
    

    private void addControlsToBorderLayoutPanel(JPanel borderLayoutPanel) 
    {
        borderLayoutPanel.add( new JButton( "Button North" ), BorderLayout.NORTH);
        borderLayoutPanel.add( new JButton( "Button South" ), BorderLayout.SOUTH);
        borderLayoutPanel.add( new JButton( "Button East" ), BorderLayout.EAST);
        borderLayoutPanel.add( new JButton( "Button West" ), BorderLayout.WEST);
        borderLayoutPanel.add( new JButton( "Button Center" ), BorderLayout.CENTER);
        
            
    }

    private void addControlsToFlowLayoutPanel(JPanel flowLayoutPanel) {
        
        flowLayoutPanel.add( new JButton( "JButton") );
        flowLayoutPanel.add( new JButton( "JButton") );
        flowLayoutPanel.add( new JButton( "JButton") );
        flowLayoutPanel.add( new JButton( "JButton") );
        flowLayoutPanel.add( new JButton( "JButton") );
    }

    private void addControlsToGridLayoutPanel(JPanel gridLayoutPanel) {
        
        gridLayoutPanel.add( new JButton( "Button" ));
        gridLayoutPanel.add( new JButton( "Button" ));
        gridLayoutPanel.add( new JButton( "Button" ));
        gridLayoutPanel.add( new JButton( "Button" ));
        gridLayoutPanel.add( new JButton( "Button" ));
        gridLayoutPanel.add( new JButton( "Button" ));
       
    }
    
}
