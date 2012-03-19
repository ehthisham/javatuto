class MarsRover{

	int xCord,yCord;
	char direction;
	MarsRover(int x,int y,char d){
		xCord = x;
		yCord = y;
		direction = d;		
	}  
	public String getPosition(){
		String position = xCord+ " " +yCord+ " "+ direction;
		return(position);
	}
	public void execute(String instructions){
		
		for(int j = 0;j < instructions.length(); j++){
			switch (instructions.charAt(j)){
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
	
	private void move(){
		switch (this.direction){
			case 'N':
				this.yCord+=1;
				break;
			case 'S':
				this.yCord-=1;
				break;
			case 'E':
				this.xCord+=1;
				break;
			case 'W':
				this.xCord-=1;
				break;
		}
	}
	private void rotateLeft(){

		switch(this.direction){
			case 'N':
				this.direction = 'W';
				break;
			case 'W':
				this.direction = 'S';
				break;
			case 'S':
				this.direction = 'E';
				break;
			case 'E':
				this.direction = 'N';
				break;
		}	
	}
	private void rotateRight(){

		switch(this.direction){
			case 'N':
				this.direction = 'E';
				break;
			case 'E':
				this.direction = 'S';
				break;
			case 'S':
				this.direction = 'W';
				break;
			case 'W':
				this.direction = 'N';
				break;
		}
	}
}
