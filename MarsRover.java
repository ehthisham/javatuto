Class MarsRover{

	int xCord,yCord;
	char direction;
	MarsRover(int x,int y,char d){
		xCord = x;
		yCord = y;
		direction = d;		
	}  
	public String getPosition(){
		String[] position;
		position = new String[3]
		d = getDirection();
		cord[] = getCoordinates();
		position[0] = toString(this.x);
		position[1] = toString(this.y);
		position[2] = d;
		return(position);
	}
	public void execute(String instructions)
		for(j = 0;j < instruction.length(); j++){
			switch (instruction.charAt(j){
				case 'M': 
					move();
					break;
				case 'L':
					rotateLeft();
					break;
				case 'R':
					rotateRight();
					break;
			}
		}
		
	}
	
	private String getDirection(){
		d = this.direction;
		return d;
	}
	private getCoordinates(){
		int[] cord;
		cord = new int[2];
		cord[0] = this.x; 
		cord[1] = this.y; 
		return (cord);
	}
	private move(){
		d = getDirection();
		switch (d){
			case 'N':
				this.y+=1;
				break;
			case 'S':
				this.y-=1;
				break;
			case 'E':
				this.x+=1;
				break;
			case 'W':
				this.x-=1;
				break;
		}
	}
	private rotateLeft(){
		d = getDirection();
		switch(d){
			case 'N':
				this.d = 'W';
				break;
			case 'W':
				this.d = 'S';
				break;
			case 'S':
				this.d = 'E';
				break;
			case 'E':
				this.d = 'N';
				break;
		}	
	}
	private rotateRight(){
		d = getDirection();
		switch(d){
			case 'N':
				this.d = 'E';
				break;
			case 'E':
				this.d = 'S';
				break;
			case 'S':
				this.d = 'W';
				break;
			case 'W':
				this.d = 'N';
				break;
		}
	}
}
