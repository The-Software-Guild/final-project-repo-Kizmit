/* Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas. */

package com.jdm.pokeAPI.entities.moves;
/*
{
  "id": 1,
  "name": "pound",
  "accuracy": 100,
  "effect_chance": null,
  "pp": 35,
  "priority": 0,
  "power": 40,
  "contest_combos": {
    "normal": {
      "use_before": [
        {
          "name": "double-slap",
          "url": "https://pokeapi.co/api/v2/move/3/"
        },
        {
          "name": "headbutt",
          "url": "https://pokeapi.co/api/v2/move/29/"
        },
        {
          "name": "feint-attack",
          "url": "https://pokeapi.co/api/v2/move/185/"
        }
      ],
      "use_after": null
    },
    "super": {
      "use_before": null,
      "use_after": null
    }
  },
  "contest_type": {
    "name": "tough",
    "url": "https://pokeapi.co/api/v2/contest-type/5/"
  },
  "contest_effect": {
    "url": "https://pokeapi.co/api/v2/contest-effect/1/"
  },
  "damage_class": {
    "name": "physical",
    "url": "https://pokeapi.co/api/v2/move-damage-class/2/"
  },
  "effect_entries": [
    {
      "effect": "Inflicts [regular damage]{mechanic:regular-damage}.",
      "short_effect": "Inflicts regular damage with no additional effect.",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "effect_changes": [],
  "generation": {
    "name": "generation-i",
    "url": "https://pokeapi.co/api/v2/generation/1/"
  },
  "meta": {
    "ailment": {
      "name": "none",
      "url": "https://pokeapi.co/api/v2/move-ailment/0/"
    },
    "category": {
      "name": "damage",
      "url": "https://pokeapi.co/api/v2/move-category/0/"
    },
    "min_hits": null,
    "max_hits": null,
    "min_turns": null,
    "max_turns": null,
    "drain": 0,
    "healing": 0,
    "crit_rate": 0,
    "ailment_chance": 0,
    "flinch_chance": 0,
    "stat_chance": 0
  },
  "names": [
    {
      "name": "Pound",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "past_values": [],
  "stat_changes": [],
  "super_contest_effect": {
    "url": "https://pokeapi.co/api/v2/super-contest-effect/5/"
  },
  "target": {
    "name": "selected-pokemon",
    "url": "https://pokeapi.co/api/v2/move-target/10/"
  },
  "type": {
    "name": "normal",
    "url": "https://pokeapi.co/api/v2/type/1/"
  },
  "flavor_text_entries": [
    {
      "flavor_text": "",
      "language": {
        "url": "https://pokeapi.co/api/v2/language/9/",
        "name": "en"
      },
      "version_group": {
        "url": "https://pokeapi.co/api/v2/version-group/3/",
        "name": "gold-silver"
      }
    }
  ]
}
*/

import com.jdm.pokeAPI.entities.contests.ContestEffect;
import com.jdm.pokeAPI.entities.contests.ContestType;
import com.jdm.pokeAPI.entities.contests.SuperContestEffect;
import com.jdm.pokeAPI.entities.games.Generation;
import com.jdm.pokeAPI.entities.pokemon.AbilityEffectChange;
import com.jdm.pokeAPI.entities.pokemon.Type;
import com.jdm.pokeAPI.entities.utility.MachineVersionDetail;
import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import com.jdm.pokeAPI.entities.utility.VerboseEffect;
import java.util.ArrayList;


public class Move extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The percent value of how likely this move is to be successful.
	private int accuracy;

	// The percent value of how likely it is this moves effect will happen.
	private int effect_chance;

	// Power points. The number of times this move can be used.
	private int pp;

	// A value between -8 and 8. Sets the order in which moves are executed during battle. See Bulbapedia for greater detail.
	private int priority;

	// The base power of this move with a value of 0 if it does not have a base power.
	private int power;

	// A detail of normal and super contest combos that require this move.
	private ContestComboSets contest_combos;

	// The type of appeal this move gives a Pokémon when used in a contest.
	private ContestType contest_type;

	// The effect the move has when used in a contest.
	private ContestEffect contest_effect;

	// The type of damage the move inflicts on the target, e.g. physical.
	private MoveDamageClass damage_class;

	// The effect of this move listed in different languages.
	private ArrayList<VerboseEffect> effect_entries;

	// The list of previous effects this move has had across version groups of the games.
	private ArrayList<AbilityEffectChange> effect_changes;

	// The flavor text of this move listed in different languages.
	private ArrayList<MoveFlavorText> flavor_text_entries;

	// The generation in which this move was introduced.
	private Generation generation;

	// A list of the machines that teach this move.
	private ArrayList<MachineVersionDetail> machines;

	// Metadata about this move
	private MoveMetaData meta;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// A list of move resource value changes across version groups of the game.
	private ArrayList<PastMoveStatValues> past_values;

	// A list of stats this moves effects and how much it effects them.
	private ArrayList<MoveStatChange> stat_changes;

	// The effect the move has when used in a super contest.
	private SuperContestEffect super_contest_effect;

	// The type of target that will receive the effects of the attack.
	private MoveTarget target;

	// The elemental type of this move.
	private Type type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getEffect_chance() {
        return effect_chance;
    }

    public void setEffect_chance(int effect_chance) {
        this.effect_chance = effect_chance;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public ContestComboSets getContest_combos() {
        return contest_combos;
    }

    public void setContest_combos(ContestComboSets contest_combos) {
        this.contest_combos = contest_combos;
    }

    public ContestType getContest_type() {
        return contest_type;
    }

    public void setContest_type(ContestType contest_type) {
        this.contest_type = contest_type;
    }

    public ContestEffect getContest_effect() {
        return contest_effect;
    }

    public void setContest_effect(ContestEffect contest_effect) {
        this.contest_effect = contest_effect;
    }

    public MoveDamageClass getDamage_class() {
        return damage_class;
    }

    public void setDamage_class(MoveDamageClass damage_class) {
        this.damage_class = damage_class;
    }

    public ArrayList<VerboseEffect> getEffect_entries() {
        return effect_entries;
    }

    public void setEffect_entries(ArrayList<VerboseEffect> effect_entries) {
        this.effect_entries = effect_entries;
    }

    public ArrayList<AbilityEffectChange> getEffect_changes() {
        return effect_changes;
    }

    public void setEffect_changes(ArrayList<AbilityEffectChange> effect_changes) {
        this.effect_changes = effect_changes;
    }

    public ArrayList<MoveFlavorText> getFlavor_text_entries() {
        return flavor_text_entries;
    }

    public void setFlavor_text_entries(ArrayList<MoveFlavorText> flavor_text_entries) {
        this.flavor_text_entries = flavor_text_entries;
    }

    public Generation getGeneration() {
        return generation;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    public ArrayList<MachineVersionDetail> getMachines() {
        return machines;
    }

    public void setMachines(ArrayList<MachineVersionDetail> machines) {
        this.machines = machines;
    }

    public MoveMetaData getMeta() {
        return meta;
    }

    public void setMeta(MoveMetaData meta) {
        this.meta = meta;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

    public ArrayList<PastMoveStatValues> getPast_values() {
        return past_values;
    }

    public void setPast_values(ArrayList<PastMoveStatValues> past_values) {
        this.past_values = past_values;
    }

    public ArrayList<MoveStatChange> getStat_changes() {
        return stat_changes;
    }

    public void setStat_changes(ArrayList<MoveStatChange> stat_changes) {
        this.stat_changes = stat_changes;
    }

    public SuperContestEffect getSuper_contest_effect() {
        return super_contest_effect;
    }

    public void setSuper_contest_effect(SuperContestEffect super_contest_effect) {
        this.super_contest_effect = super_contest_effect;
    }

    public MoveTarget getTarget() {
        return target;
    }

    public void setTarget(MoveTarget target) {
        this.target = target;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

	
}