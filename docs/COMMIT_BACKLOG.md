# Daily Commit Backlog

A queue of real work for this repo. A scheduled agent takes the **top unchecked item**, does it
properly, verifies it, and commits.

## Rules the daily agent follows

1. **One item per run.** Finish it or leave it uncommitted.
2. **This is submitted coursework / public portfolio.** Changes must be **additive**. Never rewrite
   or "improve" a solution, change an algorithm or its output, reformat submitted source, or rename
   or move submitted files.
3. **Allowed:** README explaining the work, `.gitignore` for junk, environment notes so code runs,
   provenance/licence notes, removing clearly accidental junk (`.DS_Store`, checkpoints, duplicate
   files).
4. **Verify:** confirm no executable file changed, and that every command a README tells a reader
   to run was actually run (or is plainly correct).
5. **No filler.** No whitespace churn, padding, or substance-free docs edits. If nothing honest is
   left, make no commit.
6. **Never fabricate** problem statements, results, grades, or course details. Anything only VB can
   supply stays unchecked and is flagged.
7. Stage named paths only (never `git add -A` / `.`). Conventional commit subject; end the message
   with the Co-Authored-By line. Tick the item and append to the Log in the same commit.

## Audit (2026-11-01)

Repo state as verified: `README.md` (a single `# AAM-AAT` heading), `LICENSE` (MIT, 2025 Viamrsh
Buyyani), and `Explanation/1.java`. Despite the extension, `1.java` is **plain prose, not Java**
(`file` reports ASCII text): a written explanation of a dynamic-programming approach to splitting an
array into two subsets with minimum sum difference (build `dp[i][s]`, take the largest achievable
`s <= total/2`, answer `total - 2*s`, backtrack to recover the subset; O(n*total) time and space).
There is **no code implementing it**, no tests, no data, and no stated problem statement. The
second commit message calls it a "solution", but only the idea is written down.

## Queue

- [ ] **B1 — README.** Replace the bare heading with a short README: what the repo is, an index of
      `Explanation/1.java`, the minimum-subset-difference approach summarised from that file, and an
      honest note that it is a written explanation without runnable code. Do not state the course
      name, assignment number, or expansion of "AAM-AAT" — VB has not supplied them.
- [ ] **B2 — (needs VB) Course context.** Add course name, what AAM/AAT stand for, and the original
      problem statement to the README. Blocked until VB provides them.
- [ ] **B3 — (needs VB, decision) `Explanation/1.java` is prose with a `.java` extension.** This
      misleads editors and GitHub's language stats. Renaming (e.g. to `.md`/`.txt`) alters submitted
      files, so it is left for VB to decide — do not rename automatically.
- [ ] **B4 — (needs VB) Runnable solution.** If a real implementation exists elsewhere, VB can add
      it; the agent must not write one and present it as the submitted work.

## Log
