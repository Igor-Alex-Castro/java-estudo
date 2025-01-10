package entities;

public class Champion {
	
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	
	public Champion() {
		
	}
	
	public Champion(String name, int life, int attack, int armor) {
		super();
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	//A --> DANDO DE OUTRO B
	public void takeDamage( Champion other  ) {
		int newLife = this.life - other.getAttack() + this.armor;
	
		if(this.armor >= other.getAttack()) {
				this.life -=  1;	
		}else {
			this.life = newLife;
		}
			
		if(newLife < 0) {
			this.life = 0;
		}

		
	}
	
	public String status() {
		return getName() + ": " + this.life;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getLife() {
		return life;
	}

	public int getAttack() {
		return attack;
	}
	
}
