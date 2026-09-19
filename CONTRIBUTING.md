# Contributing

Thanks for improving this Spring Boot and microservices learning repository.

## Good contributions

Useful contributions include:

- correcting outdated Spring Boot, Spring Cloud, or Java guidance;
- improving examples so they compile and run;
- adding focused tests;
- fixing documentation errors or broken links; and
- adding small, self-contained learning examples.

## Before opening a pull request

1. Search existing issues and pull requests to avoid duplicate work.
2. Create a focused branch with one clear purpose.
3. Run `mvn verify` locally for Java changes.
4. Keep secrets, passwords, tokens, and private URLs out of commits.
5. Explain what changed, why it matters, and how you tested it.

## Pull request expectations

- Keep each PR small and easy to review.
- Add or update tests when behaviour changes.
- Preserve compatibility with the repository's Java 8 baseline unless the PR explicitly upgrades it.
- Do not include generated build output such as `target/`.

## Reporting security issues

Do not open a public issue for a suspected vulnerability or exposed credential. Follow the guidance in [SECURITY.md](SECURITY.md).
