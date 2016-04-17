package GIT;

public class WinnerHorizontal {
	public static boolean determineHorizontalY(String[] board){
		for (int i = 0; i <= 41; i++){
			if (i <= 23){
				
			
				if (board[i].equals(" Y")){

				
					if (board[i + 6].equals(" Y")){

				
						if (board[i + 12].equals(" Y")){

			
							if (board[i + 18].equals(" Y")){

								return true;
							}
						}
					}
				} 
			}
			
			if (i >= 24){
			if (board[i].equals(" Y")){

			
				if (board[i - 6].equals(" Y")){

				
					if (board[i - 12].equals(" Y")){

			
						if (board[i - 18].equals(" Y")){

								return true;
						}
					}
				}
			} 
		}
		}
		return false;
	}
	public static boolean determineHorizontalR(String[] board){
		for (int i = 0; i <= 41; i++){
		
		if (i <= 23){
			
		
		if (board[i].equals(" R")){

			
			if (board[i + 6].equals(" R")){

			
				if (board[i + 12].equals(" R")){

		
					if (board[i + 18].equals(" R")){

							return true;
					}
				}
			}
		} 
		}
		
		if (i >= 24){
		if (board[i].equals(" R")){

		
			if (board[i - 6].equals(" R")){

			
				if (board[i - 12].equals(" R")){

		
					if (board[i - 18].equals(" R")){

							return true;
					}
				}
			}
		} 
		}
		}
		
		return false;
	}
	
}
		
	


