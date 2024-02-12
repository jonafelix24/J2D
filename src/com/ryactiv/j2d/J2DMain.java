package com.ryactiv.j2d;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.ryactiv.j2d.areas.AreaAddFrame;
import com.ryactiv.j2d.areas.AreaExclusiveORFrame;
import com.ryactiv.j2d.areas.AreaIntersectFrame;
import com.ryactiv.j2d.areas.AreaSubFrame;
import com.ryactiv.j2d.custom_shape.CustomShapeFrame;

public class J2DMain extends JFrame implements ActionListener {
	
	private JButton btnAlpha;
	private JButton btnTexture;
	private JButton btnClip;
	private JButton btnTransform;
	private JButton btnComposite;
	private JButton btnGeomShapes;
	private JButton btnGeneralPath;
	private JButton btnCustomShape;

	public J2DMain() {
		super("Ejemplos Java2D");
		Container containerPanel = getContentPane();
		containerPanel.setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnAlpha = new JButton("Alpha");
		btnTexture = new JButton("Texture");
		btnClip = new JButton("Clip");
		btnTransform = new JButton("Transform");
		btnComposite = new JButton("Composite");
		btnGeomShapes = new JButton("Geom shapes");
		btnGeneralPath = new JButton("GeneralPath");
		btnCustomShape = new JButton("CustomShape");
		
		containerPanel.add(btnAlpha);
		containerPanel.add(btnTexture);
		containerPanel.add(btnClip);
		containerPanel.add(btnTransform);
		containerPanel.add(btnComposite);
		containerPanel.add(btnGeomShapes);
		containerPanel.add(btnGeneralPath);
		containerPanel.add(btnCustomShape);
		
		btnAlpha.addActionListener(this);
		btnTexture.addActionListener(this);
		btnClip.addActionListener(this);
		btnTransform.addActionListener(this);
		btnComposite.addActionListener(this);
		btnGeomShapes.addActionListener(this);
		btnGeneralPath.addActionListener(this);
		btnCustomShape.addActionListener(this);
		
		JButton btnAreaAdd = new JButton("Area Add");
		containerPanel.add(btnAreaAdd);
		btnAreaAdd.addActionListener(e -> {
		    AreaAddFrame frame = new AreaAddFrame(this);
		    frame.setVisible(true);
		});
		
		JButton btnAreaSub = new JButton("Area Sub");
        containerPanel.add(btnAreaSub);
        btnAreaSub.addActionListener(e -> {
            AreaSubFrame frame = new AreaSubFrame(this);
            frame.setVisible(true);
        });
        
        JButton btnAreaInt = new JButton("Area Intersect");
        containerPanel.add(btnAreaInt);
        btnAreaInt.addActionListener(e -> {
            AreaIntersectFrame frame = new AreaIntersectFrame(this);
            frame.setVisible(true);
        });
        
        JButton btnAreaXor = new JButton("Area XOR");
        containerPanel.add(btnAreaXor);
        btnAreaXor.addActionListener(e -> {
            AreaExclusiveORFrame frame = new AreaExclusiveORFrame(this);
            frame.setVisible(true);
        });
		
		setSize(500, 300);
		setLocationRelativeTo(null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnAlpha)) {
			AlphaFrame alphaFrame = new AlphaFrame(this);
			alphaFrame.setVisible(true);
			return;
		}
		if (e.getSource().equals(btnTexture)) {
			TextureFrame textureFrame = new TextureFrame(this);
			textureFrame.setVisible(true);
			return;
		}
		if (e.getSource().equals(btnClip)) {
			ClipFrame clipFrame = new ClipFrame(this);
			clipFrame.setVisible(true);
			return;
		}
		if (e.getSource().equals(btnTransform)) {
			TransformFrame transformFrame = new TransformFrame(this);
			transformFrame.setVisible(true);
			return;
		}
		if (e.getSource().equals(btnComposite)) {
			CompositeFrame compositeFrame = new CompositeFrame(this);
			compositeFrame.setVisible(true);
			return;
		}
		if (e.getSource().equals(btnGeomShapes)) {
			GeomShapesFrame geomShapesFrame = new GeomShapesFrame(this);
			geomShapesFrame.setVisible(true);
			return;
		}
		if (e.getSource().equals(btnGeneralPath)) {
			GeneralPathFrame generalPathFrame = new GeneralPathFrame(this);
			generalPathFrame.setVisible(true);
			return;
		}
		if (e.getSource().equals(btnCustomShape)) {
            CustomShapeFrame customShapeFrame = new CustomShapeFrame(this);
            customShapeFrame.setVisible(true);
            return;
        }
	}

	public static void main(String[] args) {
		J2DMain frame = new J2DMain();
		frame.setVisible(true);
	}

}
