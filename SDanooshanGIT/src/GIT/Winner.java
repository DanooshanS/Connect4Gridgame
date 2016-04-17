package GIT;

public class Winner {
	public static boolean determineVerticalY(String[] board){
			for (int i = 0; i <= 41; i++){
				if (board[1].equals(" Y") || board[6].equals(" Y") || board[12].equals(" Y") || board[18].equals(" Y") || board[24].equals(" Y") || board[30].equals(" Y") || board[36].equals(" Y")){
					return false;
				}
				if (i != 41){
					
				
				if (board[i].equals(" Y")){

					
					if (board[i + 1].equals(" Y")){

					
						if (board[i + 2].equals(" Y")){

				
							if (board[i + 3].equals(" Y")){

									return true;
							}
						}
					}
				} 
				}
				
				
				if (board[i].equals(" Y")){

				
					if (board[i - 1].equals(" Y")){

					
						if (board[i - 2].equals(" Y")){

				
							if (board[i - 3].equals(" Y")){

									return true;
							}
						}
					}
				} 
				
							
			}
				
			
		
		
		
		return false;
	}
	public static boolean determineVerticalR(String[] board){
		for (int i = 0; i <= 41; i++){
			if (board[1].equals(" R") || board[6].equals(" R") || board[12].equals(" R") || board[18].equals(" R") || board[24].equals(" R") || board[30].equals(" R") || board[36].equals(" R")){
				return false;
			}
			if (i != 41){
				
				
				if (board[i].equals(" R")){

				
					if (board[i + 1].equals(" R")){

				
					if (board[i + 2].equals(" R")){

			
						if (board[i + 3].equals(" R")){

								return true;
						}
					}
				}
			} 
			}
			if (board[i].equals(" R")){
				
			
				if (board[i - 1].equals(" R")){
				
				
					if (board[i - 2].equals(" R")){
						
			
						if (board[i - 3].equals(" R")){
								
								return true;
						}
					}
				}
			} 
			
						
		}
				
			


		
	
		return false;
	
	}
	
}

