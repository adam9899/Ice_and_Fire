package com.github.alexthe666.iceandfire;

public class IafConfig {
    public static boolean customMainMenu = true;
    public static boolean useVanillaFont = false;
    public static boolean logCascadingWorldGen = false;
    public static boolean generateSilverOre = true;
    public static boolean generateCopperOre = true;
    public static boolean generateSapphireOre = true;
    public static boolean generateAmythestOre = true;
    public static boolean generateDragonSkeletons = true;
    public static int generateDragonSkeletonChance = 300;
    public static int worldGenDistance = 300;
    public static boolean generateDragonDens = true;
    public static int generateDragonDenChance = 180;
    public static boolean generateDragonRoosts = true;
    public static int generateDragonRoostChance = 360;
    public static int dragonDenGoldAmount = 4;
    public static boolean generateSnowVillages = true;
    public static int generateSnowVillageChance = 100;
    public static int dangerousWorldGenDistanceLimit = 200;
    public static int[] dragonBlacklistedDimensions = new int[]{1, -1};
    public static int[] dragonWhitelistedDimensions = new int[]{0};
    public static boolean useDimensionBlackList = true;
    public static int[] structureBlacklistedDimensions = new int[]{1, -1};
    public static int[] structureWhitelistedDimensions = new int[]{0};
    public static String[] blacklistedBreakBlocks = new String[0];
    public static String[] noDropBreakBlocks = new String[]{"minecraft:stone", "minecraft:dirt", "minecraft:grass"};
    public static boolean blacklistBreakBlocksIsWhiteList = false;
    public static boolean spawnGlaciers = true;
    public static int glacierSpawnChance = 4;
    public static int oreToStoneRatioForDragonCaves = 45;
    public static int dragonEggTime = 7200;
    public static int dragonGriefing = 0;
    public static boolean tamedDragonGriefing = true;
    public static int dragonFlapNoiseDistance = 4;
    public static int dragonFluteDistance = 8;
    public static int dragonHealth = 500;
    public static int dragonAttackDamage = 17;
    public static double dragonAttackDamageFire = 2F;
    public static double dragonAttackDamageIce = 2.5F;
    public static double dragonAttackDamageLightning = 3.5F;
    public static int maxDragonFlight = 128;
    public static int dragonGoldSearchLength = 30;
    public static boolean canDragonsDespawn = true;
    public static boolean doDragonsSleep = true;
    public static boolean dragonDigWhenStuck = true;
    public static int dragonBreakBlockCooldown = 5;
    public static boolean dragonDropSkull = true;
    public static boolean dragonDropHeart = true;
    public static boolean dragonDropBlood = true;
    public static int dragonTargetSearchLength = 128;
    public static int dragonWanderFromHomeDistance = 40;
    public static int dragonHungerTickRate = 3000;
    public static boolean spawnHippogryphs = true;
    public static int hippogryphSpawnRate = 2;
    public static boolean spawnGorgons = true;
    public static int spawnGorgonsChance = 75;
    public static double gorgonMaxHealth = 100D;
    public static boolean spawnPixies = true;
    public static int spawnPixiesChance = 60;
    public static int pixieVillageSize = 5;
    public static boolean pixiesStealItems = true;
    public static boolean generateCyclopsCaves = true;
    public static boolean generateWanderingCyclops = true;
    public static int spawnWanderingCyclopsChance = 900;
    public static int spawnCyclopsCaveChance = 170;
    public static int cyclopesSheepSearchLength = 17;
    public static double cyclopsMaxHealth = 150;
    public static double cyclopsAttackStrength = 15;
    public static double cyclopsBiteStrength = 40;
    public static boolean cyclopsGriefing = true;
    public static double sirenMaxHealth = 50D;
    public static boolean generateSirenIslands = true;
    public static boolean sirenShader = true;
    public static int sirenMaxSingTime = 12000;
    public static int sirenTimeBetweenSongs = 2000;
    public static int generateSirenChance = 300;
    public static boolean spawnHippocampus = true;
    public static int hippocampusSpawnChance = 70;
    public static int deathWormTargetSearchLength = 64;
    public static double deathWormMaxHealth = 10D;
    public static double deathWormAttackStrength = 3D;
    public static boolean spawnDeathWorm = true;
    public static boolean deathWormAttackMonsters = true;
    public static int deathWormSpawnRate = 2;
    public static int deathWormSpawnCheckChance = 3;
    public static int cockatriceChickenSearchLength = 32;
    public static int cockatriceEggChance = 30;
    public static double cockatriceMaxHealth = 40.0D;
    public static boolean chickensLayRottenEggs = true;
    public static boolean spawnCockatrices = true;
    public static int cockatriceSpawnRate = 4;
    public static int cockatriceSpawnCheckChance = 0;
    public static int stymphalianBirdTargetSearchLength = 64;
    public static int stymphalianBirdFeatherDropChance = 25;
    public static float stymphalianBirdFeatherAttackStength = 1F;
    public static int stymphalianBirdFlockLength = 40;
    public static int stymphalianBirdFlightHeight = 80;
    public static boolean spawnStymphalianBirds = true;
    public static boolean stymphalianBirdsOreDictDrops = true;
    public static boolean stympahlianBirdAttackAnimals = false;
    public static int stymphalianBirdSpawnChance = 100;
    public static boolean spawnTrolls = true;
    public static int trollSpawnRate = 60;
    public static int trollSpawnCheckChance = 1;
    public static boolean trollsDropWeapon = true;
    public static double trollMaxHealth = 50;
    public static double trollAttackStrength = 10;
    public static boolean villagersFearDragons = true;
    public static boolean animalsFearDragons = true;
    public static boolean generateMyrmexColonies = true;
    public static int myrmexPregnantTicks = 2500;
    public static int myrmexEggTicks = 3000;
    public static int myrmexLarvaTicks = 35000;
    public static int myrmexColonyGenChance = 150;
    public static int myrmexColonySize = 80;
    public static double myrmexBaseAttackStrength = 3.0D;
    public static boolean experimentalPathFinder;
    public static boolean spawnAmphitheres = true;
    public static int amphithereSpawnRate = 5;
    public static float amphithereVillagerSearchLength = 64;
    public static int amphithereTameTime = 400;
    public static float amphithereFlightSpeed = 1.75F;
    public static double amphithereMaxHealth = 50D;
    public static double amphithereAttackStrength = 7D;
    public static boolean spawnSeaSerpents = true;
    public static int seaSerpentSpawnChance = 200;
    public static boolean seaSerpentGriefing = true;
    public static double seaSerpentBaseHealth = 20D;
    public static double seaSerpentAttackStrength = 4D;
    public static double dragonsteelBaseDamage = 25F;
    public static int dragonsteelBaseArmor = 12;
    public static int dragonsteelBaseDurability = 8000;
    public static boolean spawnStructuresOnSuperflat = true;
    public static boolean dragonMovedWronglyFix = false;
    public static int dreadlandsDimensionId = -12;
    public static boolean weezerTinkers = true;
    public static double dragonBlockBreakingDropChance = 0.1D;
    public static boolean completeDragonPathfinding = false;
    public static boolean dragonAuto3rdPerson = true;
    public static double dreadQueenMaxHealth = 750;
    public static boolean generateMausoleums = true;
    public static int generateMausoleumChance = 30;
    public static boolean spawnLiches = true;
    public static int lichSpawnRate = 2;
    public static double hydraMaxHealth = 250D;
    public static boolean generateHydraCaves = true;
    public static int generateHydraChance = 200;
    public static boolean explosiveDragonBreath = false;
    public static float weezerTinkersDisarmChance = 0.2F;
    public static boolean chunkLoadSummonCrystal = true;

}
