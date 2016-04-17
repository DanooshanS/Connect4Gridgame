package GIT;

public class Diagonal {
	public static boolean determineDiagonalY(String[] board){
		for (int i = 0; i <= 41; i++){
			
				
			
				if (board[i].equals(" Y")){

				
					if (board[i + 7].equals(" Y")){

				
						if (board[i + 14].equals(" Y")){

			
							if (board[i + 21].equals(" Y")){

								return true;
							}
						}
					}
				} 
			
			
			
			if (board[i].equals(" Y")){

			
				if (board[i - 7].equals(" Y")){

				
					if (board[i - 14].equals(" Y")){

			
						if (board[i - 21].equals(" Y")){

								return true;
						}
					}
				}
			} 
		}
		
		return false;
	}
	public static boolean determineDiagonalR(String[] board){
		for (int i = 0; i <= 41; i++){
		
		
			
		
		if (board[i].equals(" R")){

			
			if (board[i + 7].equals(" R")){

			
				if (board[i + 14].equals(" R")){

		
					if (board[i + 21].equals(" R")){

							return true;
					}
				}
			}
		
		
		
		
		if (board[i].equals(" R")){

		
			if (board[i - 7].equals(" R")){

			
				if (board[i - 14].equals(" R")){

		
					if (board[i - 21].equals(" R")){

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
