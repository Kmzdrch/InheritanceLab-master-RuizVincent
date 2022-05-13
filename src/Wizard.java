public class Wizard extends Character{
    Wizard(String name, int lvl, int hp, int mp){
        super(name,lvl,hp,mp);
    }
    public void ThunderBreath(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Thunder Breath (Damage - 30)(Mana Cost - 50)");
        int damagePoints = 30;
        int manaCost = 50;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void FireBreath(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Fire Breath (Damage - 30)(Mana Cost - 50)");
        int damagePoints = 30;
        int manaCost = 50;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void UnstopabbleBreath(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Unstopabble Breath (Damage - 40)(Mana Cost - 100)");
        int damagePoints = 40;
        int manaCost = 100;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void cure(){
        super.healthPoints += 50;
        System.out.println("Healing Over Here");
    }
    /**
     * Display character data
     */
    public void display(){
        System.out.println("Wizard: " + super.characterName);
        System.out.println("HealthPoints: " + super.healthPoints);
        System.out.println("ManaPoints: " + super.manaPoints);
        System.out.println("Level " + super.level);
    }
}