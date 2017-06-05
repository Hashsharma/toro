/*
 * Copyright (c) 2017 Nam Nguyen, nam@ene.im
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.ene.toro;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author eneim | 6/2/17.
 */

public final class Common {

  @SuppressWarnings("WeakerAccess") static int compare(int x, int y) {
    return (x < y) ? -1 : ((x == y) ? 0 : 1);
  }

  static long max(Long... numbers) {
    List<Long> list = Arrays.asList(numbers);
    return Collections.<Long>max(list);
  }

  static long min(Long... numbers) {
    List<Long> list = Arrays.asList(numbers);
    return Collections.<Long>min(list);
  }

  static Comparator<Player> ORDER_COMPARATOR = new Comparator<Player>() {
    @Override public int compare(Player o1, Player o2) {
      return Common.compare(o1.getPlayOrder(), o2.getPlayOrder());
    }
  };
}
