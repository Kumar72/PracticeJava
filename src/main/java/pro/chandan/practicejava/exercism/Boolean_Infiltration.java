package pro.chandan.practicejava.exercism;

public class Boolean_Infiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return prisonerIsAwake || knightIsAwake || archerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (!knightIsAwake && !archerIsAwake && prisonerIsAwake) || (!archerIsAwake && petDogIsPresent);
    }
}

class BooleanInfiltrationTest {
    public static void main(String[] args) {
        boolean knightIsAwake = true;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = false;
        System.out.println(
                Boolean_Infiltration.canFastAttack(knightIsAwake)
        );
        System.out.println(
                Boolean_Infiltration.canSpy(knightIsAwake,archerIsAwake,prisonerIsAwake)
        );
        System.out.println(
                Boolean_Infiltration.canSignalPrisoner(archerIsAwake,prisonerIsAwake)
        );
        System.out.println(
                Boolean_Infiltration.canFreePrisoner(knightIsAwake,archerIsAwake,prisonerIsAwake,petDogIsPresent)
        );

    }
}
