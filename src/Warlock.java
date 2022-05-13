public class Warlock extends Character{
    Warlock(String name, int lvl, int hp, int mp){
        super(name,lvl,hp,mp);
    }
    /**
     * Skills and Regen 
     */
    public void NeckSlash(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Neck Slash (Damage - 5) (Mana cost - 50)");
        int damagePoints = 5 ;
        int manaCost = 50;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void NeckDash(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Neck Dash (Damage - 15) (Mana cost - 50)");
        int damagePoints = 15;
        int manaCost = 50;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void NeckExecution(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Neck Execution (Damage - 80) (Mana cost - 100)");
        int damagePoints = 80;
        int manaCost = 100;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    /**
     * Display character data
     */
    public void display(){
        System.out.println("Warlock: " + super.characterName);
        System.out.println("HealthPoints: " + super.healthPoints);
        System.out.println("ManaPoints: " + super.manaPoints);
        System.out.println("Level " + super.level);
    }
}