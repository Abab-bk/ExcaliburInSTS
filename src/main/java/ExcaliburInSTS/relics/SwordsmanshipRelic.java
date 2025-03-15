package ExcaliburInSTS.relics;

import ExcaliburInSTS.CharacterFile;

import static ExcaliburInSTS.ModFile.makeID;

public class SwordsmanshipRelic extends AbstractEasyRelic {
    public static final String ID = makeID("SwordsmanshipRelic");

    public SwordsmanshipRelic() {
        super(ID, RelicTier.STARTER, LandingSound.FLAT, CharacterFile.Enums.ExcaliburColor);
    }
}
