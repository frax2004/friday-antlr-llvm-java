#include "friday-runtime.h"

typedef struct Vector2 Vector2;

struct Vector2 {
  friday_float x;
  friday_float y;
};

Vector2 _Z7Vector2pl7Vector27Vector2(Vector2 lhs, Vector2 rhs);

Vector2 _Z7Vector2pl7Vector27Vector2(Vector2 lhs, Vector2 rhs) {
  return (Vector2) {
    .x = lhs.x + rhs.x,
    .y = lhs.y + rhs.y
  };
}
