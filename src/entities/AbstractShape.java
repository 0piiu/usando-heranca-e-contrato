package entities;

import java.awt.Color;

import services.Shapes;

public abstract class AbstractShape implements Shapes { // toda classe que herdar essa classe, tera como implementacao a classe shape, isso ajuda a manter um codigo mais limpo e segur

	private Color color;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
